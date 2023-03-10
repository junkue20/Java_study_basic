package day5;

import java.util.ArrayList;

import cls.Book;
import day10.MemberTable;

//출력을 담당하는 클래스
public class Output {

	// 역시나 변수 x

	// void라 출력만 하고 반환만 하는것임.
	public static void printMember(MemberTable member) { // 외부에서 member 값 받아옴
		System.out.println("===========가입정보===========");
		System.out.println("아이디는 : " + member.getId());
		System.out.println("암호는 : " + member.getPassword());
		System.out.println("이름은 : " + member.getName());
		System.out.println("연락처는 : " + member.getPhone());
		System.out.println("권한은 : " + member.getRole());
		System.out.println("가입일자는 : " + member.getRegdate());
		System.out.println("==========================");

	}

	public static void printBook(Book book) {
		System.out.println("===========책정보===========");
		System.out.println("책번호 : " + book.getNo());
		System.out.println("책제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getAuthor());
		System.out.println("가격 : " + book.getPrice());
		System.out.println("분류 : " + book.getCate());
		System.out.println("가입일자는 : " + book.getDate());
		System.out.println("==========================");

	}

	public static void printBooklist(ArrayList<Book> list) { // list를 입력받고
		for (int i = 0; i < list.size(); i++) { // list의 사이즈만큼 반복
			Book oneBook = list.get(i); // 한권씩 정보 분류 
			printBook(oneBook); // printBook 메소드 수행
		}
	}

}
