package day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
//		
//		//배열은 생성시에 반드시 갯수가 정해져야 한다. ex)5개
//		int[] a = {2,5,1,23,4}; // 5개의 int형 공간이 생성, 위치는 0부터 4까지
//		int[] b = new int[5]; // 5개의 int형 생성됨. 초기화 0으로초기화
//		String[] c = new String[5]; // 5개의 문자타입 생성, 초기화 null
//		
//		b [0] = 12;
//		b [1] = 15;
//		b [2] = 233;
//		
//		// 실제적으로 추가된 개수와 상관없음. 생성할 때 개수일 뿐임.
//		System.out.println(b.length); // 5가 출력됨. 
//		
//		// 제너릭 형태의 => 객체를 생성하면 타입도 설정할 수 있는 클래스
//		// List는 interface, ArrayList는 class이다.
//		List<Integer> arr = new ArrayList<>();
//		List<String> arr1 = new ArrayList<>();
//
//		for(int i = 0; i<3; i++) {
//			arr.add(10 + i); // 10 11 12
//		}
//		arr.size(); // 3이다.
		
		MyListener ml = new MyInter1();
		MyListener m2 = new MyInter2();
//
		Print p = new Print();
		p.action(m2);
		
		new Frame1();
		
		
//		
////		Child1 c1 = new Child1();
//		Child2 c2 = new Child2();
//	
//		c2.work();
//		c2.study();
////		
//		Parents c = new Child2();
//		c.work();
//		c.study();
	}

}
