package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*--------------------------------------------*/

		// RestClient1 obj = new RestClient1();

		/*--------------------------------------------*/

//		RestClient2 obj2 = new RestClient2();
//		obj2.parseData();

		/*--------------------------------------------*/

//		RestClient7 obj3 = new RestClient7();
////		obj3.parseData();
//		obj3.parseData1(); // parseData1은 List<Score1>의 형태이기때문에 아래와 같이 객체를 지정해줘야 함.
//		// ----------------------------------------
//		List<Member1> list = obj3.parseData1();
//		for (Member1 m : list) { // for (한개 꺼냈을때 타입 m: 리스트변수){
//			System.out.println(m.getId());
//			System.out.println(m.getName());
//			System.out.println(m.getAge());
//			System.out.println(m.getHeight());
//			System.out.println(m.getWeight());
//			System.out.println("------------------");
//		}

		/*--------------------------------------------*/

		RestClient10 obj4 = new RestClient10();
//		obj4.parseData();
//		System.out.println("------------------------");
//		List<Score1> list = obj4.parseData1();
//		for (Score1 s : list) {
//			System.out.println("id : " + s.getId());
//			System.out.println("이름 : " + s.getName());
//			System.out.println("나이 : " + s.getAge());
//			System.out.println("수학점수 : " + s.getMath());
//			System.out.println("영어점수  : " + s.getEng());
//			System.out.println("국어점수 : " + s.getKor());
//			System.out.println("------------------------");
//		 }
		
//		int n = obj4.sumKor();
//		System.out.println(n);

//		int m =obj4.maxEng();
//		System.out.println(m);
//		int[] ret = obj4.sumKorMathEng();
//		System.out.println("국어점수 합계 : " + ret[0] +"영어점수 합계 : " + ret[1] +"수학점수 합계 : " + ret[2]);
//		
		/*--------------------------------------------*/
		
//		List<Map<String, Object>> list = obj4.sumStudent();
//		
//		// 콘솔 디버그용, 실제화면 출력 불가능!!!
//		System.out.println(list.toString());
//		System.out.println("--------------------------");
//		for(Map<String, Object> map : list) {
//			System.out.println("아이디 => " + map.get("id"));
//			System.out.println("이름 => " + map.get("name"));
//			System.out.println("총점 => " + map.get("total"));
//			System.out.println("평균 => " + map.get("avg"));
//			System.out.println("--------------------------");
//
//		}
	}
}
