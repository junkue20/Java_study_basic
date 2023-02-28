package day5;

import java.util.ArrayList;

import cls.Book;

public class Main6 {

	public static void main(String[] args) {

		// 책을 여러권 보관 가변 길이 배열
		ArrayList<Book> list = new ArrayList<>(); // 제너릭 클래스 사용, Book에 들어갈 빈 list 행렬 생성

		for (int i = 0; i < 3; i++) { // 책 세권을
			Book book = Input.inputBookData(); // 넣는창 소환
			list.add(book); // 세권의 정보를 한번에 list 행렬에 압축하기
		}

		Output.printBooklist(list); // 출력 요청하기

	}

}
