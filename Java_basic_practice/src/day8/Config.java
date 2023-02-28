package day8;

// 환경설정과 관련된 속성 정보를 보관하는 클래스 Properties
// 외부에서 사용하기위해 public, 고유값으로 지정하기 위해 static을 사용
public class Config {

	// 서버 접속정보
	public static final String URL = "mongodb://id209:pw209@1.234.5.158:37017/db209";

	// 데이터베이스 명칭
		public static final String DBNAME = "db209";
		
		
	// 사용할 수 있는 정보
	public static final int MAX = 10000;
	// 게시글의 숫자를 10개
	public static final int BOARDMAX = 10;

	

	// 답글 컬렉션 명칭 (테이블)
	public static final String REPLYCOL = "replies";
	// 시퀀스용 컬렉션 명칭(테이블)
	public static final String RESEQUENCECOL = "sequence";
	public static final String MEMBERCOL = "members";
	public static final String ADDRESSOL = "adresses";
	public static final String TITANICCOL = "titanic passengers";
	public static final String ITEMCOL = "items";
	public static final String BOARDCOL = "boards";

	// 채팅용 서버정보
	public static final String BROKER    = "tcp://1.234.5.158:11883";
	public static final String CONNECTID = "ds606";
	public static final String CONNECTPW = "ds606";
}
