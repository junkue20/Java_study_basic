/*---------------------------------------------------------*/
// 글번호(long)brdNo, 
// 글제목(String)brdTitle, 
// 글내용(String)brdContent,
// 작성자(String)brdWriter,

// 조회수(long)brdHit,
// 등록일자(Date)brdDate.

// 적절한 타입으로 필요한 항목을 만드세요.

	//getter / setter
	
	//toString으로 만드세요.
	//Main5 생성한 후 게시글 한개를 적절한 내용으로 추가후 출력.
package cls;

import java.util.Date;

	
public class Board {
	long brdNo = 0L;
	String brdTitle = "";
	String brdContent = "";
	String brdWriter = "";
	
	long brdHit = 0L;
	Date brdDate = null;
	
	public long getBrdNo() {
		return brdNo;
	}

	public void setBrdNo(long brdNo) {
		this.brdNo = brdNo;
	}


	public String getBrdTitle() {
		return brdTitle;
	}

	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}

	public String getBrdContent() {
		return brdContent;
	}

	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}

	public String getBrdWriter() {
		return brdWriter;
	}

	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}

	public long getBrdHit() {
		return brdHit;
	}

	public void setBrdHit(long brdHit) {
		this.brdHit = brdHit;
	}

	public Date getBrdDate() {
		return brdDate;
	}

	public void setBrdDate(Date brdDate) {
		this.brdDate = brdDate;
	}

	@Override
	public String toString() {
		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
				+ brdWriter + ", brdHit=" + brdHit + ", brdDate=" + brdDate + "]";
	}
	
	
	
	
}
/*---------------------------------------------------------*/

