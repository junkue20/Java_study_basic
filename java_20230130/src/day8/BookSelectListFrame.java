package day8;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BookSelectListFrame extends JDialog {

	private BookDB bookDB = new BookDBImpl(); // DB연결 필요한 컬렉션 객체 생성 완료됨.
	private static final long serialVersionUID = 1L;
	private JTable table;

	public BookSelectListFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		table = new JTable();

/*----------------------------------------------------------------------------*/
        // Object[] rowData 방식
//		String[] colume = {"번호", "제목", "저자", "가격", "분류", "날짜"};
//		DefaultTableModel model_1 = new DefaultTableModel(colume, 0);
//		List<Book> list = bookDB.selectBookList();
//		for (Book book : list) {
//			String[] data = { book.getNo() + "", book.getTitle(), book.getAuthor(), book.getPrice() + "",
//					book.getCate() + "", book.getDate() + "", };
//
//			model_1.addRow(data);
//		}
//
//		table.setModel(model_1);
/*----------------------------------------------------------------------------*/

		
		// Vector == ArrayList와 같음
        // Vector<?> rowData 방식
		Vector<String> vector = new Vector<>();
		vector.add("번호");
		vector.add("제목");
		vector.add("저자");
		vector.add("가격");
		vector.add("분류");
		vector.add("날짜");
		DefaultTableModel model = new DefaultTableModel(vector, 0);
		
		List<Book> list = bookDB.selectBookList();
		for (Book book : list) {
			String[] data = { book.getNo() + "", book.getTitle(), book.getAuthor(), book.getPrice() + "",
					book.getCate() + "", book.getDate() + "", };

			model.addRow(data);
		}

		table.setModel(model);
/*----------------------------------------------------------------------------*/

		JScrollPane jScrollPane = new JScrollPane(table);
		getContentPane().add(jScrollPane, BorderLayout.CENTER);

		this.setSize(500, 400);
		this.setVisible(true);
	}

}
