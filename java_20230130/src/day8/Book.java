package day8;

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

// 책번호 no, 책제목 title, 저자 author, 가격 0, 분류 cate 'A','B','C', 등록일자 date
public class Book {

	private int no = 0; // 책번호no
	private String title = ""; // 책제목
	private String author = ""; // 저자
	private long price = 0; // 가격
	private char cate = 'A'; // 분류
	private Date date = null; // 등록일자

}
