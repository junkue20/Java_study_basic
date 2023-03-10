package main2;

import java.util.Date;
import cls.Item;

public class Main1 {

	public static void main(String[] args) {
		// 배열은 위치번호가 0부터 시작!
		int[] a = new int[5]; // 배열이 5개 생성됨. 초기화 0으로
		int[] b = { 1, 4, 5, 2, 7 }; // 배열이 5개 생성됨 1, 4, 5, 2, 7로 각가 초기화

		String str[] = new String[5]; // 문자열 배열이 5개 생성됨. 초기값은 null로 설정됨

		int i = 0; // 반복문의 임시변수
		for (i = 0; i < b.length; i++) { // 0 1 2 3 4
			System.out.print(b[i] + ","); // 차례대로 출력
		}
		// ctrl + shift + O 로 위치를 지정하여 import 설정.
		Item[] item = new Item[5]; // item 클래스를 배열로 만들 수 있음, Item 배열이 5개 생성, 초기값 null로 지정됨.
		for (i = 0; i < item.length; i++) { // item 0번째부터 4번째까지
			
			// 클래스명 객체명 = new 생성자명==클래스명();
			Item obj = new Item(); // Item 클래스 import
			// item 항목에 들어갈 내용들
			obj.setNo(i);
			obj.setName("물품명" + i);
			obj.setContent("물품내용" + i);
			obj.setPrice(1000 + i);
			obj.setQuantity(100 + i);
			obj.setDate(new Date()); // Ctrl + shift + O로 날짜 import
			
			item[i] = obj; // item 배열 안에 집어넣음.
		}
		for(i=0; i<item.length; i++) { // 0번째부터  item 배열 끝인 4번째까지
			System.out.println(item[i].toString()); // 출력하기
		}
	}

}
