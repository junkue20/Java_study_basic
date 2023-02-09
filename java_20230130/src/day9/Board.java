package day9;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Board {

	private long brdNo = 0L;
	private String brdTitle = "";
	private String brdContent = "";
	private String brdWriter = "";
	private long brdHit = 100L;
	private Date brdDate = null;
	
	private int replyCount = 0; // 답글개수를 보관할 변수
	private List<Long> replyNolist = null;

}
