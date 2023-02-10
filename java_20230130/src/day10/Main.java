package day10;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*--------------------------------------------------------------*/

		// DB연결과 컬렉션 선택 된 상황 ( DB연동 및 컬렉션 연결 )
		MemberDB mDB = new MemberDBImpl();
		AddressDB aDB = new AddressDBImpl();

		/*--------------------------------------------------------------*/

		// map실습
		// 배열과 다른점 : 순차적으로 데이터가 추가되지 않는다.
		// 키를 통해서 데이터를 꺼냄.
		// 키는 고유해야 함. 같은것은 존재할 수 없음.
//		Map<String, Object> map = new HashMap</* 앞의 Map<>과 똑같은 타입 */>();
//		map.put("id", "abc");
//		map.put("name", "가나다");
//		map.put("age", 21);
//
//		// 키는 고유한 값이기 때문에 뒤쪽에 데이터를 같은 키의 데이터를넣게되면 마지막 데이터로 수정이 됨!
//		map.put("name", "나다라");
//
//		// (key, value)의 형식. Document도 같은 형식이다. ex) doc.append("_id", doc.get ~)
//		
//		
//		// -------------------------------------------------------------------------------
//		String id = (String) map.get("id"); // 꺼낸 value가 'Object'이기 떄문에 형변환 필요 (String)
//		String name = (String) map.get("name");
//		int age = (int) map.get("age");
//		// -------------넣는값은 아무 값이나 넣을 수 있지만 뺄때는 형변환이 필요함----------------
//
//		
//		System.out.println(id);
//		System.out.println(name); // "가나다"가 아니라 "나다라"로 출력이 됨.
//		System.out.println(age);		

		/*---------------------회원정보 넣기-----------------------------------------------*/

//		//빈 map 객체를 생성
//		Map<String, Object> map = new HashMap<>();
//		map.put("_id", "ccc5");
//		map.put("password", "ccc1");
//		map.put("name", "이름1");
//		map.put("phone", "010");
//		map.put("role", "C");
//		map.put("age", 16);
//		map.put("regdate", new Date());
//		
//		int ret = mDB.insertMemberMap(map);
//		System.out.println(ret);

		/*---------------------회원정보 한개 불러오기-----------------------------------------------*/

//		Map<String, Object> map = mDB.selectMemberMapOne("ccc1");
//		System.out.println("아이디 => " + map.get("_id"));
//		System.out.println("비밀번호 => " + map.get("password"));
//		System.out.println("이름 => " + map.get("name"));
//		System.out.println("전화번호 => " + map.get("phone"));
//		System.out.println("권한 => " + map.get("role"));
//		System.out.println("나이 => " + map.get("age"));
//		System.out.println("등록일자 => " + map.get("regdate"));
//		System.out.println("------------------------------");

		/*----------------------회원정보 전체 불러오기 -------------------------------------------*/

//		List<Map<String, Object>> list = mDB.selectMemberMapList();
//		for (Map<String, Object> map : list) {
//			System.out.println("아이디 => " + map.get("_id"));
//			System.out.println("비밀번호 => " + map.get("password"));
//			System.out.println("이름 => " + map.get("name"));
//			System.out.println("전화번호 => " + map.get("phone"));
//			System.out.println("권한 => " + map.get("role"));
//			System.out.println("나이 => " + map.get("age"));
//			System.out.println("등록일자 => " + map.get("regdate"));
//			System.out.println("└----------------------------------------┘");
//			System.out.println();
//		}

		/*---------------------- 회원별 주소 생성하기 -------------------------------------------*/

//		AddressTable address = new AddressTable();
//		MemberTable member = new MemberTable();
//
//		member.setId("ccc2");
//
//		address.setAddress("가나다");
//		address.setPostcode("123123");
//		address.setRegdate(new Date());
//		address.setMemberid(member);
//		
//		int test = aDB.insertAddress(address);
//		System.out.println(test);

		/*---------------------- 회원별 주소 생성하기 (맵 사용)-------------------------------------------*/

//		Map<String, Object> map = new HashMap<>();
//		MemberTable member = new MemberTable();
//		
//		map.put("_id", 10009);
//		map.put("address", "부산시");
//		map.put("postcode", "1233321");
//		map.put("regdate", new Date());
//		map.put("memberid", member.getId());  // 뭐가 문제일까
//		
//		int ret = aDB.insertAddressMap(map);
//		System.out.println(ret);

		/*---------------------- 주소 한개 불러오기-------------------------------------------*/

//		Scanner sc = new Scanner(System.in);
//		System.out.print("주소 정보를 조회할 값을 입력해주세요. : ");
//
//		// 아이디 입력받고 -> 아이디_id와 memberId 일치하는 주소값 연결 ->
//		AddressTable address = aDB.selectAddressOne(sc.nextLong()); // 해당 번호의 글 불러오기
//
//		if (address != null) {
//			System.out.println("┌---------------------------------------┐");
//			System.out.println("주소_ID => " + address.getCode()); // 굳이 안불러와도 될 것 같음!
//			System.out.println("주소 => " + address.getAddress());
//			System.out.println("우편번호 => " + address.getPostcode());
//			System.out.println("등록일자 => " + address.getRegdate());
//			System.out.println("회원아이디 정보 => " + address.getMemberid());
//			System.out.println("└---------------------------------------┘");
//		} else {
//			System.out.println("등록된 회원의 주소 정보를 찾을 수 없습니다.");
//		}
//		sc.close();

		/*---------------------- 회원ID 입력하고 주소값 받기-------------------------------------------*/
		
		Scanner sc = new Scanner(System.in);
		MemberTable member = new MemberTable();
		
		System.out.print("주소 정보를 조회할 값을 입력해주세요. : ");
		member.setId(sc.next());
	
		List<AddressTable> list = aDB.selectAddressOneForId(member);
		for (AddressTable address : list) {
			if (address != null) {
				System.out.println("┌---------------------------------------┐");
				System.out.println("주소_ID => " + address.getCode()); // 굳이 안불러와도 될 것 같음!
				System.out.println("주소 => " + address.getAddress());
				System.out.println("우편번호 => " + address.getPostcode());
				System.out.println("등록일자 => " + address.getRegdate());
				System.out.println("회원아이디 정보 => " + address.getMemberid());
				System.out.println("└---------------------------------------┘");
			}
			else {
				System.out.println("회원의 주소정보가 존재하지 않습니다.");
			}sc.close();
		}

		/*---------------------- 주소 여러개 불러오기-------------------------------------------*/

//		AddressDB addressDB = new AddressDBImpl();
//		MemberTable member = new MemberTable();
//		
//		member.setId("ccc1");
//		
//		List<AddressTable> list = addressDB.selectAddressList(member);
//		
//		for (AddressTable one : list) {
//			System.out.println("┌---------------------------------------┐");
//			System.out.println("주소_ID => " + one.getCode());
//			System.out.println("주소 => " + one.getAddress());
//			System.out.println("우편번호 => " + one.getPostcode());
//			System.out.println("등록일자 => " + one.getRegdate());
//			System.out.println("└---------------------------------------┘");
//		}
		

		
		/*-----------------------------------------------------------------------------*/

	}

}
