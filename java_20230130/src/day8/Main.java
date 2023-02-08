package day8;

import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import day8.frame.BookInsertFrame;
import day8.frame.BookSelectListFrame;
import day8.frame.BookSelectListPageFrame;

public class Main {

	//화면을 실행시키는 역활만 수행 
	public static void main(String[] args) {
		
		// 책 추가하기
//		new BookInsertFrame();
		
		// 책 전체조회 
//		new BookSelectListFrame();
		
		// 책 10개씩조회
		new BookSelectListPageFrame();
		
		
		
		
		
		
		
		
		// 책 한번에 여러권 넣기 (23권)
//		BookDB bookDB = new BookDBImpl();
//		for(int i = 0; i<23; i++) {
//			Book book = new Book();
//			book.setTitle("title");
//			book.setAuthor("author");
//			book.setPrice( Long.parseLong(price) ); // String => long
//			book.setCate( cate.charAt(0) );
//			

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



