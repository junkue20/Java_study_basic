package day12;

import java.util.List;
import java.util.Map;

import day11.Titanic;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		TitanicDB tDB = new TitanicDBImpl();
		/*----------------------------------------------------------*/

		// 메소드 호출 및 결과 받기
//		List<Titanic> list 
//			= tDB.selectTitanicList();
//		for(Titanic t : list) {
//			System.out.println(t.getName());
//		}
//		
//		// 웹화면에서 출력불가능함.
//		System.out.println(list.toString());
//		
//		// 리스트 타입은 반복문을 출력
//		for(Titanic t : list) {
//			System.out.println(t.getName());
//	}

		/*----------------------------------------------------------*/
		List<Map<String, Object>> list1 = tDB.selectTitaniListMap();
		for (Map<String, Object> map : list1) {
			System.out.println(map.get("name"));
		}

	}
}
