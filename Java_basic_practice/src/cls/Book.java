package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

//(롬복)getter setter to String은 클래스 변수 지정 이후 마지막에 해야함! ctrl + space

//책번호no, 책제목title, 저자 author, 가격 12000, 분류 cate'A','B','C', 등록일자 date
public class Book {

	// == private Integer no1 = 0;
	private int no = 0; // 책번호no
	private String title = ""; // 책제목title
	private String author = ""; // 저자 author
	private long price = 12000; // 가격 12000
	private char cate = 'A'; // 분류 cate'A','B','C'
	private Date date = null; // 등록일자 date
	

}
