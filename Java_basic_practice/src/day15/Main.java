package day15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		/*----------------------------------------------*/
//
		Print print = new Print();
//
//		// 문제 1)
//		print.gugudan(3);
//
//		// 문제 2)
//		List<Long> list = new ArrayList<>();
//
//		list.add(1L);
//		list.add(2L);
//		list.add(3L);
//
//		long a = print.sum(list);
//		System.out.println(a);
//
//		// 문제 3)
//		List<Double> list1 = new ArrayList<>();
//		list1.add(1.2d);
//		list1.add(2.2d);
//
//		Map<String, Object> map = print.sumAvg(list1);
//		System.out.println(map.get("합한값"));
//		System.out.println(map.get("평균값"));

		/*----------------------------------------------*/

//		System.out.println("세권 추가");
//		List<Book> list = new ArrayList<>();
//		
//		for (int i =0; i<3; i++) {
//			Book book = new Book();
//			book.setCode(i+1);
//			book.setTitle("자바배우기"+(i+1));
//			book.setAuthor("가나다");
//			book.setPrice(1200);	

//			list.add(book);
//		}
//		System.out.println(list);
//		
//		
//		
//		System.out.println();
//		long num1 = 1010L;
//		System.out.println("가격"+ num1+ "원 이상");
//		List<Book> b = print.queryPrice(list, num1);
//		System.out.println(b.toString());
//		
//		
//		System.out.println();
//		System.out.println("가격 일의자리가 0인것만 조회");
//		List<Map<String, Object>> c1 = print.queryPriceMap(list);
//		
//		System.out.println(c1.toString());

		/*----------------------------------------------*/

		BookStore bookstore = new BookStore();

		// 책 추가
		System.out.println("책 추가");
		int ret = 0;
		for (int i = 0; i < 5; i++) {
			Book book = new Book();
			book.setCode(i + 1);
			book.setTitle("자바배우기" + (i + 1));
			book.setAuthor("가나다");
			book.setPrice(1200);
		ret = bookstore.addBook(book);

		}
		System.out.println(ret);
		bookstore.showBooklist();

		System.out.println();
//--------------------------------------------------------------
		// 책 삭제
		System.out.println("책 삭제");
		Book book1 = new Book();
		book1.setCode(1);
		book1.setTitle("자바배우기1");
		book1.setAuthor("가나다");
		book1.setPrice(1200);
		int ret1 = bookstore.removeBook(book1);
		System.out.println(ret1);
		bookstore.showBooklist();

		System.out.println();

//--------------------------------------------------------------
		// 책제목 포함
		System.out.println("책 제목 포함");
		String title = "자바";
		List<Book> list = bookstore.searchBook(title);
		System.out.println(list);
		System.out.println();

//--------------------------------------------------------------
		// 가격보다 큰것만 검색
		long price = 1100;
		System.out.println(price + "원 보다 가격이 큰 책들");
		List<Book> list1 =  bookstore.searchBookPrice(price);
		System.out.println(list1);

	}

}
