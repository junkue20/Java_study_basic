package day14;

import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class MemberDBImpl implements MemberDB {

	MongoCollection<Document> members = null;

	// ---------------------------------------------------------------------
	// 생성자
	public MemberDBImpl() {

		members = DBconn.getInstance().getCollection(Config.MEMBERCOL);
	}

	// ---------------------------------------------------------------------
	// 회원가입
	@Override
	public int memberJoin(Member member) {
		try {
			Document doc = new Document();
			doc.append("_id", member.getId());
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("age", member.getAge());

			InsertOneResult result = this.members.insertOne(doc);
			if (result.getInsertedId().asString().getValue().equals(doc.get("_id"))) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// ---------------------------------------------------------------------

	// 로그인, 한마디로 입력하는 정보의 값과 같으면 불러오는 것.
	// 1. 아이디를 이용해서 정보를 가져옴. 이후 아이디와 암호가 일치하는지 확인 후 반환.
	// 2. 아이디, 암호를 and필터를 이용해서 조회
	@Override
	public Member memberLogin(Map<String, Object> map) { // 먼저 정보의 값을 받아옴.
		try {
			String id = (String) map.get("_id");
			String pw = (String) map.get("password");
			Bson filter = Filters.eq("_id", id);

			Document doc = this.members.find().filter(filter).first();
			if (doc.getString("_id").equals(id) && doc.getString("password").equals(pw)) {
				// doc를 member객체로 변환 해서
				documentToMember(doc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// ---------------------------------------------------------------------

	// 멤버 정보 불러오기
	@Override
	public Member memberSelectOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			Document doc = this.members.find(filter).first();
			// ㄴ doc에 찾은 정보들을 저장.
			documentToMember(doc);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// ---------------------------------------------------------------------

	// 멤버의 정보 업데이트 (아무 정보나 업데이트 되도록)
	@Override
	public int memberUpdateOne(Member member) {
		try {
			// 변경하고자 하는 항목의 조건
			Bson filter = Filters.eq("_id", member.getId());
			// 변경할 여러 항복들
			Bson update1 = Updates.set("password", member.getPassword());
			Bson update2 = Updates.set("phone", member.getPhone());
			Bson update3 = Updates.set("age", member.getAge());
			Bson update4 = Updates.set("role", member.getRole());
			Bson update5 = Updates.set("name", member.getName());
			// 한번에 묶기
			Bson updates = Updates.combine(update1, update2, update3, update4, update5);
			UpdateResult result = this.members.updateOne(filter, updates);
			if (result.getModifiedCount() == 1) {
				return 1;
			}

			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// ---------------------------------------------------------------------

	// 멤버의 비밀번호 업데이트 (아무 정보나 업데이트 되도록. 단, Map 타입)
	@Override
	public int memberUpdatePwOne(Map<String, Object> map) {
		try {
			String id = (String) map.get("_id"); // 현재 아이디
//			String pw = (String) map.get("password"); // 현재 비번
			String pw1 = (String) map.get("password1"); // 바꿀비번

			// Filters.and()
			Member member = this.memberLogin(map);
			if (member != null) { // 로그인성공
				// q비밀번호 변경
				Bson filter = Filters.eq("_id", id);
				Bson update = Updates.set("password", pw1);
				UpdateResult ret = this.members.updateOne(filter, update);

				if (ret.getModifiedCount() == 1L) {
					return 1;
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// ---------------------------------------------------------------------

	// 멤버의 정보 삭제
	@Override
	public int memberDeleteOne(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.members.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// ---------------------------------------------------------------------

	public void runMessage(int ret) {

		if (ret == 1) {
			System.out.println("성공하였습니다.");
		} else if (ret == 0) {
			System.out.println("실패하였습니다. ");
			System.out.println("중복되거나 누락된 내용을 확인해주세요");
		} else {
			System.out.println("오류발생.");
		}
	}

	// Document를 Member 타입으로 변환하는 메소드
	private Member documentToMember(Document doc) {
		Member member = new Member();
		member.setId(doc.getString("_id"));
		member.setPassword(doc.getString("password"));
		member.setAge(doc.getInteger("age"));
		member.setName(doc.getString("Name"));
		member.setPhone(doc.getString("phone"));
		member.setRole(doc.getString("role"));
		member.setRegdate(doc.getDate("regdate"));
		return member;
	}

}
