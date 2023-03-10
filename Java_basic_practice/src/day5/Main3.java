package day5;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		/*--------------------------------------------------------------------------------*/

		// 배열은 원시타입, Object타입 다 가능함.
		// Object타입은 초기값이 null로 된다.
//		int[] a = new int[5]; // 배열 5개가 만들어짐. 초기값은 0
//		int[] b = { 1, 2, 3, 4, 5 }; // 5개 만들어짐. 초기값들은 지정된 상태
//		String c[] = new String[5]; // 5개 만들어짐. 초기값은 null
//		Integer d[] = new Integer[5]; // 5개 만들어짐, 초기값 null

		/*--------------------------------------------------------------------------------*/
		// 컬렉션 | 배열의 갯수를 모름. 가변배열 ...
		ArrayList<Integer> e = new ArrayList<Integer>(); // e 라는 행렬 추가
		e.add(100);
		e.add(200);
		e.add(300);
		e.add(400);
		System.out.println(e); // 배열 [] 상태로 출력하기
		e.remove(2); // 3번째 항목 삭제하기
		System.out.println(e.size()); // 배열 크기 출력하기
		System.out.println(e); // 그상태로 배열 [] 출력

		// 배열 출력하기
		for (int i = 0; i < e.size(); i++) { // 0 1 2
			System.out.println(e.get(i)); // 배열 항목들을 하나하나 줄바꿈 출력
		}
		// 역순으로 출력하기
		for (int i = e.size() - 1; i >= 0; i--) { // 2 1 0
			System.out.println(e.get(i)); // 다시 하나하나 줄바꿔서 출력
		}

	}
}
