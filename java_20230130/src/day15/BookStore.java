package day15;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import lombok.Data;

// 타입
@Data
public class BookStore {

	private String phone;
	private String address;

	private List<Book> list = new ArrayList<>();

	// ----------------------------------------------------------

	// 책 추가
	public int addBook(Book book) {
		try {
			list.add(book);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		}

	}
	// ----------------------------------------------------------

	// 책 삭제
	public int removeBook(Book book) {
		try {
			list.remove(book);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		}
	}
	// ----------------------------------------------------------

	// 책제목이 포함된 것 검색
	public List<Book> searchBook(String title) {
		List<Book> list1 = new ArrayList<>();
		for (Book one : list) {
			one.getTitle();
			if (one.getTitle().contains(title)) {
				list1.add(one);
			}
		}

		return list1;

	}
	// ----------------------------------------------------------

	// 가격보다 큰것만 검색
	public List<Book> searchBookPrice(long price) {
		List<Book> list1 = new ArrayList<>();

		for (Book one : list) {
			one.getPrice();
			if (one.getPrice() > price) {
				list1.add(one);
			}
		}
		return list1;

	}
	// ----------------------------------------------------------
	
	public void showBooklist() {
		System.out.println("현재 책 내용 : " + list);
	}

}
