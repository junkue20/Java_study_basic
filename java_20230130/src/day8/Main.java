package day8;

import day8.frame.BookInsertFrame;
import day8.frame.BookSelectListFrame;
import day8.frame.BookSelectListPageFrame;

public class Main {

	// 화면을 실행시키는 역활만 수행
	public static void main(String[] args) {

		// 책 추가하기
		new BookInsertFrame();

		// 책 전체조회
		new BookSelectListFrame();

		// 책 10개씩조회
		new BookSelectListPageFrame();
		
		// 책 삭제하기
		
		
		// 책 삭제하기
		
		
		// 책 수정하기
		
		
		// 책 1권 조회 // 반환타입
		
		
		// n 이상의 가격에 해당하는 책 조회
		
		
		// 분류에 해당하는 항목만 조회

	}
}

/*----------------------------------------------------------------------------*/
// Object[] rowData 방식
//String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜"};
//DefaultTableModel model_1 = new DefaultTableModel(colume, 0);
//List<Book> list = bookDB.selectBookList();
//for (Book book : list) {
//	String[] data = { book.getNo() + "", book.getTitle(), book.getAuthor(), book.getPrice() + "",
//			book.getCate() + "", book.getDate() + "", };
//
//	model_1.addRow(data);
//}
//
//table.setModel(model_1);
/*----------------------------------------------------------------------------*/
