/*---------------------------------------------------------*/
// 글번호(long)brdNo, 
// 글제목(String)brdTitle, 
// 글내용(String)brdContent,
// 작성자(String)brdWriter,

// 조회수(long)brdHit,
// 등록일자(Date)brdDate.


//lombok 라이브러리 => 편리성, 연결성
//오라클 라이브러리
// 적절한 타입으로 필요한 항목을 만드세요.

	//getter / setter
	
	//toString으로 만드세요.
	//Main5 생성한 후 게시글 한개를 적절한 내용으로 추가후 출력.
package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Board {
	
	private long brdNo = 0L;
	private long brdHit =0L;
	
	private String brdTitle = "";
	private String brdContent = "";
	private String brdWriter = "";
	Date brdDate = null;
}
/*---------------------------------------------------------*/

