package day7;

import java.util.Date;

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
	private long brdHit = 0L;
	private Date brdDate = null;

}
