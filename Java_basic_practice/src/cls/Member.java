package cls;

import java.util.Date;

// 내가 원하는 타입을 만듬. 실행하는 클래스 아님!!
// 아이디, 암호, 이메일, 나이, 연락처, 가입일자 (설계상에서 정해지는 항목)
public class Member {

	String userId = ""; // 또는 null로 나타내기도 함
	String userPw = "";
	String userEmail = "";
	int useAge = 0;
	String userPhone = "000-0000-0000"; // 전화번호와 같은 경우 숫자가 아닌 문자가 있으며 , 첫자리 0이 지워지기때문에 문자로 해야함
	Date useDate = null; // 클래스형의 타입을 만들어 놓음

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", useAge=" + useAge
				+ ", userPhone=" + userPhone + ", useDate=" + useDate + "]";
	}

	// 메소드, 함수
	// 1. Main4에서 사용할 수 있다. public
	// 2. 반환타입 문자(String)로 반환해야 함.
	// 3. 메소드명 (Main4에서 전달한 값)
	// public 는 보내는값, public void는 가져오는 값
	// 메소드는 통로역할

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUseAge() {
		return useAge;
	}

	public void setUseAge(int useAge) {
		this.useAge = useAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	// setter <= 누군가에 의해서 값을 저장시키는 역할
	// getter <= 누군가에 의해서 값을 가져가는 역할
}
