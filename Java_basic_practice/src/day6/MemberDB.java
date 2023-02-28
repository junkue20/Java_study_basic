package day6;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

// 기능용 클래스
// 몽고DB 연동

public class MemberDB {
	MongoCollection<Document> collection = null;

	// 변수는 모든 메소드에 사용 가능하기 위해 바깥으로 뺌.

	// 변수 X
	// 생성자
	public MemberDB() {
		// 공통변수가 아니기 때문에 생성자 내부에서만 사용가능한 변수 생성.

		// final 을 붙이면 생성 당시의 값으로 프로그램이 끝날때 까지 유지가 된다. 이유는 바꿀수 없기 때문.
		// mongodb://아이디:비밀번호@주소:포트번호/디비명

		final String url = "mongodb://id209:pw209@1.234.5.158:37017/db209";

		// static클래스를 통해서 접속이 가능함. (import도 해주어야 함.)
		MongoClient client = MongoClients.create(url);
		MongoDatabase db = client.getDatabase("db209");
		this.collection = db.getCollection("members");

	}

	// 이름이 "가나다"인만 조회
	public void printMembersName(String searchName) {
		// 키 또는 필드가 name인 것중에서 searchName과 정확하게 일치하는 필터
		Bson filter = Filters.eq("name", searchName);
		// 2개 있으니 2번 수행
			printAction(filter);
			
		}
	

	// 전체 회원조회 메소드
	public void printMembers() {
		MongoCursor<Document> list = this.collection.find().cursor(); // 반복자
		// 1000 => 500개만 출력(X)
		// 반복자(처음부터 끝까지 전체다 반복할거라고 가정

		/*-------------------------------반복자 반복문----------------------------*/
		// 가져올 데이터가 있나요?? (반복문)
		while (list.hasNext()) { // 그 다음 가져 올 데이터가 있는지?
			Document doc = list.next();
			System.out.println("아이디 =>" + doc.getString("_id"));
			System.out.println("비밀번호 =>" + doc.getString("password"));
			System.out.println("나이 =>" + doc.getInteger("age"));
			System.out.println("------------------------------------");

		}
	}

	// 회원가입 메소드
	public int insertMember(Member member) {
		try { // 정상동작
			Document doc = new Document();
			// 키가 반드시 _id 기본키로 봄. (id는 중복되어 DB에 올라갈 수 없다.)
			doc.append("_id", member.getId());
			doc.append("password", member.getPassword());
			doc.append("name", member.getName());
			doc.append("age", member.getAge());
			doc.append("phone", member.getPhone());
			doc.append("role", member.getRole());
			doc.append("regdate", member.getRegdate());

			InsertOneResult result = this.collection.insertOne(doc);
			System.out.println(result.toString());
			return 1;

		} catch (Exception e) {// 오류가 발생 시 이쪽의 메소드가 수행됨.

			// Exception클래스의 e변수에 오류의 정보(오류 메시지)가 전송되게 됨.
			e.printStackTrace(); // 오류 메세지를 전체적으로 출력해줌. 개발자를 위한 기능

			return -1; // 오류시 보통 -1로 반환함!
		}

	}

	public void printAction(Bson filter) {
		MongoCursor<Document> list = this.collection.find(filter).iterator();
		while (list.hasNext()) {
			Document doc = list.next();
			System.out.println("아이디 =>" + doc.getString("_id"));
			System.out.println("비밀번호 =>" + doc.getString("password"));
			System.out.println("나이 =>" + doc.getInteger("age"));
			System.out.println("------------------------------------");
		}
	}

	/*---------------------문제-------------------------*/

	// 문제1) 고객, 판매자만 조회하는 필터링
	// 조건과 같으면 .eq
	public void printMembersRole(String searchRole) {
		// 키 또는 필드가 name인 것중에서 searchRole과 정확하게 일치하는 필터
		Bson filter = Filters.eq("role", searchRole);
		printAction(filter);

	}

	// 문제2) 나이가 n 이상인 것만 필터링
	// 이상이면 .gte, 이하면 .lte이다. 크면 gt, 작으면 lt[맛있는MongoDB Pg.91]
	public void printMembersAge(Integer n) {
		// 키 또는 필드가 name인 것중에서 searchName과 정확하게 일치하는 필터
		Bson filter = Filters.gte("age", n);

		printAction(filter);
	}

	// 회원정보 수정하기. 이름, 연락처, 나이정보 (암호는 변경 불가능.)
	public int updateMember(Member member) {
		try {
			// 변경하고자 하는 항목의 조건
			/* 2번 */ Bson filter = Filters.eq("_id", member.getId());

			// 변경할 항목들...
			/* 3번 */ Bson update1 = Updates.set("name", member.getName());
			Bson update2 = Updates.set("phone", member.getPhone());
			Bson update3 = Updates.set("age", member.getAge());

			// updateOne (조건, 변경값) => 변경값이 하나의 Bson에만 가능.. combine
			/* 4번 */ Bson update = Updates.combine(update1, update2, update3);

			/* 1번 */ UpdateResult result = this.collection.updateOne(filter, update);
			System.out.println(result.toString());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	public int deleteMember(String id) {
		try {
			Bson filter = Filters.eq("_id", id);
			DeleteResult result = this.collection.deleteOne(filter);
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
}
