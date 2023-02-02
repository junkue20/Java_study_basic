package day4;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class AddressTable {

	private long code = 0;
	private String address = null;
	private String postcode = null;
	private Date regdate = null;
	private MemberTable memberid = null;
	
	/*----------------------------------------------------------------------------------------*/
	
	// 코드는 1000~9999 사이인지 확인
	public boolean invalidCode() {
		if (1000 <= this.code && // .찍어서 안나오면 못쓰는것.
				this.code <= 9999) { // code는 long(실수)이기때문에 length사용 불가
			return true;
		}
		return false;
	}

	
	// 주소는 100자 미만
	public boolean invalidAddress() {
		if (this.address.length() < 100) {
			return true;
		}
		return false;
	}

	
	// 우편번호가 5자리인지 확인
	public void invalidPostcode() {
		String result1 = "우편코드가 5자리입니다.";
	    String result2 = "우편코드가 5자리가 아닙니다.";

		if (this.postcode.length()== 5 ) {
			System.out.println(result1); 
		}
			System.out.println(result2);
	}

	// 날짜에서 년만 반환하기 (문자로)
	public String showYear() {
		SimpleDateFormat year = new SimpleDateFormat("yyyy-MM-dd"); // 날짜를 바꾸기 위해서 다른 클래스가 필요함.
		String str = year.format(regdate); //year에 현재 날자값 저장
		//2023-02-02
		System.out.println(str); // str을 그대로 출력하나,
		return str.substring(0, 4); // substring를 이용하여 구간 출력. 년도만 출력
	}
	// 날짜에서 월만 반환하기 (문자로)
    public String showMonth() {
		SimpleDateFormat month = new SimpleDateFormat("MM");
		String str = month.format(regdate);

		return str;
    }
    
	// 날짜에서 일만 반환하기 (문자로)
    public String showDay() {
		SimpleDateFormat day = new SimpleDateFormat("dd");
		String str = day.format(regdate);

		return str;
    }
}
/*----------------------------------------------------------------------------------------*/
