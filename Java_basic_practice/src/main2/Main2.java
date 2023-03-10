package main2;

import java.util.Date;

import cls.Book;
import cls.BookStore;

public class Main2 {

	public static void main(String[] args) {
		// 서점이 생성됨. 책을 100권 보관 할 수 있는 배열 생성
		BookStore bookStore = new BookStore();
		bookStore.setAddress("051-707-7070");
		bookStore.setPhone("부산 남구");

		// 추가하고자 하는 책을 생성
		Book book = new Book(100, "자바배우기", "김철수", 1500, 'B', new Date());
		Book book1 = new Book(10, "파이썬배우기", "김영희", 1500, 'A', new Date());
		// 서점에 랜덤의 두권 책 등록

		// 서점에 책 등록
		bookStore.InsertBook(book);
		bookStore.InsertBook(book1);

		// 마지막으로 등록한 책을 삭제하는 메소드
		// bookStore.deleteBook();

		// 문제1) 등록된 책들의 할인 10% 적용
		bookStore.discountPrice(0.1f);

		// 현재까지 등록된 책 조회
		bookStore.selectBook();

		// 값이 500원 이상인 책들 출력
		bookStore.pirceQuery(500);

		// 책 분류가 B인 책들 모두 출력
		bookStore.printCate('B');
	}
}
