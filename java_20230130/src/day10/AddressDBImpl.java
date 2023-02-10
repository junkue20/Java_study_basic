package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;

public class AddressDBImpl implements AddressDB {

	private MongoCollection<Document> addresses = null;
	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> members = null;

	// -------------DB 연동 및 컬렉션 연결하기 (생성자)------------------
	public AddressDBImpl() {
		this.addresses = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.ADDRESSOL);
		this.sequence = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.RESEQUENCECOL);
		this.members = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.MEMBERCOL);

	}
	// ----주소추가---------------------------------------

	@Override
	public int insertAddress(AddressTable address) {
		// 여기부분도 반복작업. 나중에 숙달이 된다면 꼭 한번 자동으로 되게 해볼것.
		try {
			Document doc = this.sequence.findOneAndUpdate(Filters.eq("_id", "SEQ_ADDRESS_CODE"), Updates.inc("idx", 1));
			long code = doc.getLong("idx");

			Document saveDoc = new Document().append("_id", code).append("address", address.getAddress())
					.append("postcode", address.getPostcode()).append("regdate", address.getRegdate())
					.append("memberid", address.getMemberid().getId());
			/*********** 회원정보 전체 추가하지 않음. 기본키인 아이디만 추가함!! *************/

			InsertOneResult result = this.addresses.insertOne(saveDoc);
			if (result.getInsertedId().asInt64().getValue() == code) {
				return 1;
			}
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	// --주소추가(맵 사용)------------------------------------------------------------
	@Override
	public int insertAddressMap(Map<String, Object> map) {
		try {
			Document doc = new Document();
			MemberTable member = new MemberTable();
			doc.put("_id", map.get("_id"));
			doc.put("address", map.get("address"));
			doc.put("postcode", map.get("postcode"));
			doc.put("regdate", map.get("regdate"));
			/* 수정필요 */ doc.put("memberid", map.get(member.getId()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	// ---주소 한개조회 (회원 한명)-----------------------------------------------------------

	@Override
	public AddressTable selectAddressOne(long code) {
		try {
			// 강사님 코드
//      	Bson filter  = Filters.eq("_id", code);
//			Document doc = this.addresses.find(filter).first();
//			
//			// Document -> Address로 변환 메소드 (회원정보는 null)
//			Address address = documentToAddress(doc);
//			
//			// members의 컬렉션에서 해당 아이디 정보를 가져와야 됨.
//			Bson filter1 = Filters.eq("_id", doc.getString("memberid") );
//			Document docMember = this.members.find( filter1 ).first();
//			
//			//Document -> Member로 바꾼후
//			Member member = new Member();
//			member.setId( docMember.getString("_id") );
//			member.setName( docMember.getString("name") );
//			member.setPassword( docMember.getString("password") );
//			member.setPhone( docMember.getString("phone") );
//			member.setRegdate( docMember.getDate("regdate") );
//			member.setRole( docMember.getString("role") );
//			address.setMemberid( member );
//			return address;

			// 내가 짠 코드
			Document doc = this.addresses.find(Filters.eq("_id", code)).first();
			if (doc != null) { // Document -> Reply 타입으로 복사한 후 리턴
				AddressTable address = new AddressTable();
				address.setCode(doc.getLong("_id"));
				address.setAddress(doc.getString("address"));
				address.setPostcode(doc.getString("postcode"));
				address.setRegdate(doc.getDate("regdate"));

				String mid = doc.getString("memberid");
				Document docMember = this.members.find(Filters.eq("_id", mid)).first(); // first()가 빠졌었음.

				// ----------------여기까지는 같음-----------------

				MemberTable member = new MemberTable();
				member.setId(docMember.getString("_id"));
				member.setName(docMember.getString("name"));
				member.setPassword(docMember.getString("password"));
				member.setPhone(docMember.getString("phone"));
				member.setRegdate(docMember.getDate("regdate"));
				member.setRole(docMember.getString("role"));
				address.setMemberid(member);
				return address;

			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	// -----주소한개조회(맵
	// 사용)-------------------------------------------------------------

	@Override
	public Map<String, Object> selectAddressMapOne(long code) {

		return null;
	}
	// -------------------------------------------------------------------

	@Override
	public List<AddressTable> selectAddressList(MemberTable member) {
		try {
			// 내가 짠 코드
			// 주소에서 member로 전달되는 해당아이디 주소만 목록조회
			FindIterable<Document> docs = this.addresses.find(Filters.eq("memberid", member.getId()));
			List<AddressTable> list = new ArrayList<>();
			for (Document doc : docs) {
				list.add(documentToAddress(doc));
			}
			if (!list.isEmpty()) {
				return list;
			}
			return null;
			
			// --------------강사님 코드------------- //
			
//			List<AddressTable> list = new ArrayList<>();
//			// 주소에서 member로 전달되는 해당아이디 주소만 목록조회
//			Bson filter = Filters.eq("memberid", member.getId());
//			FindIterable<Document> docs = this.addresses.find(filter);
//			for (Document doc : docs) {
//			// 회원에서 아이디가 일치하는 정보 가져오기
//			
//			Bson filter1 = Filters.eq("_id", member.getId());
//			Document doc1 = this.members.find(filter1).first();
//			System.out.println(doc);
//			System.out.println(doc1);
//			// 회원정보는 아직없음
//			AddressTable address = documentToAddress(doc);
//	  		// set을 이용해서 address객체에 회원정보 추가
//	  		address.setMemberid( documentToMember(doc1) );
//			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
	// ----회원에 해당하는 주소 전체 조회------------------------------------------

	@Override
	public List<Map<String, Object>> selectAddressListMap(MemberTable member) {
		try {
			// n 개의 데이터
			FindIterable<Document> docs = this.addresses.find(Filters.eq("memberid", member.getId()));
			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				list.add((Map<String, Object>) documentToAddress(doc));
			}
			if (!list.isEmpty()) {
				return list;
			}
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
//		try {
//		Document doc = new Document();
//		MemberTable member = new MemberTable();
//		doc.put("_id", map.get("_id"));
//		doc.put("address", map.get("address"));
//		doc.put("postcode", map.get("postcode"));
//		doc.put("regdate", map.get("regdate"));
//		/* 수정필요 */ doc.put("memberid", map.get(member.getId()));
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return 0;
		// 다 보고 지우기!

	}
	// -------------------------------------------------------------------

	// Document -> Address로 변경하는 메소드
	private AddressTable documentToAddress(Document doc) {
		AddressTable address = new AddressTable();
		address.setCode(doc.getLong("_id"));
		address.setAddress(doc.getString("address"));
		address.setPostcode(doc.getString("postcode"));
		address.setRegdate(doc.getDate("regdate"));

		return address;
	}
	
	// -------------------------------------------------------------------

	// Document -> Member로 변경하는 메소드
	private MemberTable documentToMember(Document doc) {
		MemberTable member = new MemberTable();
		member.setId(doc.getString("_id"));
		member.setPassword(doc.getString("password"));
		member.setName(doc.getString("name"));
		member.setPhone(doc.getString("phone"));
		member.setRole(doc.getString("role"));
		member.setAge(doc.getInteger("age"));
		member.setRegdate(doc.getDate("regdate"));
		return member;
	}
	// -------------------------------------------------------------------

	@Override
	public List<AddressTable> selectAddressOneForId(MemberTable member) {
		try {
			// 필터를 설정, Id값을 받아냄
			Bson filter = Filters.eq("memberid", member.getId());
			// 설정된 필터값을 주소항목에 적용, 찾아낸 값을 doc에 저장.
			FindIterable<Document> docs = this.addresses.find(filter);

			// 주소값들을 받기 위한 빈 List 배열 생성.
			List<AddressTable> list = new ArrayList<>();

			// 반복문. docs 전체를 뜻함.
			for (Document doc : docs) {
				AddressTable address = documentToAddress(doc); // 회원 주소정보들이 저장된 docs를 adress값에 하나하나저장.

				// 다시 필터 설정. 이번엔 [회원 id == 주소에 저장된 멤버 id]를 위한 필터
				Bson filterMem = Filters.eq("_id", (docs.first().getString("memberid")));
				// 필터를 적용하여 docMem에 저장.
				Document docMem = this.members.find(filterMem).first();
				// 회원들의 정보를 세팅하기 위한 객체 생성.
				MemberTable member1 = new MemberTable();

				// 아래는 각 항목에 들어갈 내용들.
				member1.setId(docMem.getString("_id"));
				member1.setPassword(docMem.getString("password"));
				member1.setName(docMem.getString("name"));
				member1.setPhone(docMem.getString("phone"));
				member1.setAge(docMem.getInteger("age"));
				member1.setRole(docMem.getString("role"));
				member1.setRegdate(docMem.getDate("regdate"));
				// 마지막으로 멤버들 id까지
				address.setMemberid(member1);

				list.add(address);
			}
			if (!list.isEmpty()) {
				return list;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

//			//	내가 짠 코드
//			 Document idMember = this.members.find(Filters.eq("_id", memberid)).first();
//			/*
//			 * 회원의 ID 입력을 받은 상태.
//			 * 
//			 * 이후 Addressdml _id값이 아래의 필터로 들어가야 함.
//			 */
//			
//			 Document doc = this.addresses.find(Filters.eq("_id", /*주소_id 값 들어가야 함*/)).first();
//			if (doc != null) { // Document -> Reply 타입으로 복사한 후 리턴		
//				AddressTable address = documentToAddress(doc);
//
//				String mid = doc.getString("memberid");
//				 Document docMember = this.members
//						 .find(Filters.eq("_id", mid)).first(); // first()가 빠졌었음.(수정완료)
//				  
//
//				MemberTable member1 = new MemberTable();
//				member1.setId( docMember.getString("_id") );
//				member1.setName( docMember.getString("name") );
//				member1.setPassword( docMember.getString("password") );
//				member1.setPhone( docMember.getString("phone") );
//				member1.setRegdate( docMember.getDate("regdate") );
//				member1.setRole( docMember.getString("role") );
//				address.setMemberid( member1 );
//				return address;
//				
//			}
//			return null;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

}
