package day10;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

public class Main {

	public static void main(String[] args) {
		/*--------------------------------------------------------------*/

		// DB연결과 컬렉션 선택 된 상황 ( DB연동 및 컬렉션 연결 )
		MemberDB mDB = new MemberDBImpl();

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

		List<Map<String, Object>> list = mDB.selectMemberMapList();
		for (Map<String, Object> map : list) {
			System.out.println("아이디 => " + map.get("_id"));
			System.out.println("비밀번호 => " + map.get("password"));
			System.out.println("이름 => " + map.get("name"));
			System.out.println("전화번호 => " + map.get("phone"));
			System.out.println("권한 => " + map.get("role"));
			System.out.println("나이 => " + map.get("age"));
			System.out.println("등록일자 => " + map.get("regdate"));
			System.out.println("└----------------------------------------┘");
			System.out.println();
		}
	}

}
