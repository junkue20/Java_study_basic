package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//		List<Map<String, Object>> list1 = tDB.selectTitaniListMap();
//		for (Map<String, Object> map : list1) {
//			System.out.println(map.get("name"));
//		}
		/*----------------------------------------------------------*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("조회 가능한 코드는 C, Q, S 세가지 입니다.");
//		System.out.print("조회하고자 하는 항구의 코드를 입력해주세요. : ");
//
//		String code = sc.next();
//		List<Titanic> list = tDB.selectTitanicEmbarkedList(code);
//		if (code.equals("C")) {
//			code = "Cherbourg";
//		} else if (code.equals("Q")) {
//			code = "Queenstown";
//		} else if (code.equals("S")) {
//			code = "Southampton";
//		}
//		for (Titanic t : list) {
//			System.out.println(t.getName());
//			System.out.println();
//		}
//		if (list.isEmpty()) {
//			System.out.println("Error!! 입력값을 확인해주세요.");
//		}
//		System.out.println("----------------------------");
//		System.out.println("[ " + code + " ]" + " 항구 출발 승객명단");
//		System.out.println("----------------------------");
//		sc.close();
//		/*----------------------------------------------------------*/
		List<Titanic> list = tDB.selectTitanicList();
		
		Print print = new Print();
		print.printPClassSurvived(list);
		
		

	}
}
