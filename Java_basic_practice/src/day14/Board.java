package day14;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private long no = 0L;
	String title = null;
	String writer = null;
	String content = null;;
	long hit = 0L;
	Date regdate = null;

}
