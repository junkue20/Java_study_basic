package dto;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	
	  private String MEM_NAME; // 아이디(PK)
	  private String MEM_ID; // 비번
	  private String MEM_PW; // 이름
	  private String MEM_PHONE; // 연락처
	  private String MEM_ADDRESS; // 주소
	  private Date MEM_REGDATE = new Date(); // 고객등록일
	  private Long MEM_BLOCK_CHK = 1L; // 블랙리스트 체크(0,1) => default : 0
	  private Long MEM_QUIT_CHK = 1L; // 탈퇴유무확인(0,1) => default : 0
}
