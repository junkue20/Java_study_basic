package day5;

import java.util.Date;
import java.util.Scanner;

import cls.Book;
import day10.MemberTable;

//입력을 담당하는 클래스
public class Input {

	// 변수X
	// 입력받는 기능만

	public static MemberTable inputData() {
		Scanner in = new Scanner(System.in);
		System.out.println("가입정보입력 -> 아이디, 암호, 이름, 연락처, 권한"); // 2 , 3 ,4 ,5 ,6 행렬을 각각 id , pw , name , phone, role에
																// 저장되도록 해야함

		// String의 메소드 중에서 split(), trim()을 이용함.
		String data = in.nextLine(); // 입력받은 값 저장

		/* 문제 ,분할하고 각각의 데이터에 대해서 앞뒤에 공백이 있으면 제거 */

		in.close(); // 입력창 닫기
//		System.out.println(data);
		String[] str = data.split(","); // 입력받은 data에서 ','를 제거하고 행렬str로 지정
		MemberTable member = null; // 아직 객체가 안만들어 졌음.
		if (str.length == 5) { // 입력한 항목이 정확한지 확인함
			member = new MemberTable(str[0].trim(), str[1].trim(), str[2].trim(), str[3].trim(), str[4].trim(),
					0, new Date());
			System.out.println(str[0].trim()); // .trim() 은 공백을 제거해주는 명령어.
			System.out.println(str[1].trim());
			System.out.println(str[2].trim());
			System.out.println(str[3].trim());
			System.out.println(str[4].trim());
		}
		return member;
	}

	public static Book inputBookData() {
		Scanner in = new Scanner(System.in);
		System.out.println("책정보 입력 -> 책번호, 책제목, 저자, 가격, 분류");
		String str = in.nextLine();
		// in.close();

		String[] data = str.split(",");
		Book book = null;
		if (data.length == 5) {

			int no = Integer.parseInt(data[0].trim()); // Integer 타입의 parseInt 메소드 사용
			String title = data[1].trim(); // .trim() 은 공백을 제거해주는 명령어.
			String author = data[2].trim();
			long price = Long.parseLong(data[3].trim());
			char cate = data[4].charAt(0);

			book = new Book(no, title, author, price, cate, new Date());
			
		}
		return book;

	}

}
