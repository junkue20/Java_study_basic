package day8;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import day8.Book;
import day8.BookDB;
import day8.BookDBImpl;

public class BookSelectListFrame extends JDialog {

	private BookDB bookDB = new BookDBImpl(); // DB연결 필요한 컬렉션 객체 생성 완료됨.
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public BookSelectListFrame() {
		// 전체 레이아웃 BoardLayout
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		//중앙의 Table 위
		table = new JTable();
		
		// Object[]
		String[] colume = {  "번호", "제목", "저자", "가격", "분류", "날짜" };
		DefaultTableModel model = new DefaultTableModel(colume, 0);

		List<Book> list = bookDB.selectBookList();
		for( Book book : list ) {
			String[] data = {  
				book.getNo()+"",
				book.getTitle(),
				book.getAuthor(),
				book.getPrice()+"",
				book.getCate() +"",
				book.getDate() +"",
			};
			model.addRow(data);
		}
		table.setModel(model);
		
		JScrollPane jScrollPane = new JScrollPane(table);
		getContentPane().add(jScrollPane, BorderLayout.CENTER);
		
		this.setSize(600, 500);
		this.setVisible(true);
	}

}