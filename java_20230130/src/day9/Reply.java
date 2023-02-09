package day9;

import java.util.Date;

import day7.Board;
import lombok.Data;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


@Data // 지금까지 썻던 롬복 데이터를 한번에 불러옴! [블로그]
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor

//답글번호 (시퀀스사용), 답글내용, 작성자, 등록일, 원본게시글 정보
public class Reply {

	private long no = 0L;
	private String content = null;
	private String writer = null;
	private Date regdate = null;
	private Board board = null;

}
