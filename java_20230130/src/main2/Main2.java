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
		Book book = new Book(100, "자바배우기", "저자", 1500, 'B', new Date());		
		
		//서점에 1권의 책 등록
		bookStore.InsertBook(book);
		
		//bookStore.deleteBook();
		
		//문제1) 임의의 책 2권 생성한 후 서점에 등록하기
		bookStore.discountPrice(0.1f);
		
		// 현재까지 등록된 책 조회
		bookStore.selectBook();
		bookStore.pirceQuery(500);
		bookStore.printCate('A');
}
}
