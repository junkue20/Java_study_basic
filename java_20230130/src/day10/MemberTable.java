package day10;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok 사용하기

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberTable {

	private String id = null;
	private String password = null;
	private String name = null;
	private String phone = null;// ex) 010-0000-0000
	private String role = null; // 권한설정 고객은(C), 판매자는 (S)
	private int age = 0;
	private Date regdate = null;

	// 이름의 길이가 유효한지 확인하는 메소드 만들기 (2~4자만 가능)
	public boolean invalidName() {
		boolean ret = false;

		// 2~4자 사이만 true를, 그 이외에는 false를 반환하기
		if (2 <= this.name.length() && this.name.length() <= 4) { // 만약 2~4자 사이면
			return true; // 메소드 종료.
		}
		return ret;

	}

	// 휴대폰 번호 길이가 정확한지 확인하는 메소드만들기
	public boolean invalidPhone() {
		boolean retphone = false;

		if (this.phone.length() == 13) {
			retphone = true;
		}
		return retphone;

	}

	// 권한이 정보가 C와 S로만 되어있는지 확인하는 메소드
	public boolean invalidRole() {
		// 원시타입 int long
		// Long String ...
		boolean retrole = false;

		if (this.role == "C" || this.role == "S") {
			// this.role.equals("C") || this.role.equals("S")로도 가능!
			return true;
		}
		return retrole;
	}

	// id는 길이가 30자 이내만 가능한지 확인하는메소드
	public boolean invaliId() {

		if (this.id.length() <= 30) {
			return true;
		}
		return false;
	}

	// 연락처 정보가 000-0000-0000인데, 00000000000으로 반환하는 메소드 (split사용하기)
	public String changePhone() {
		/// 000 - 0000 - 0000
		// ret[1] => 000
		// ret[2] => 0000
		// ret[3] => 0000
		// ret.length => 3

		String[] ret = this.phone.split("-"); // - 문자만 구분함

//		    System.out.println(ret.length);
		System.out.println(ret[0]);//
		System.out.println(ret[1]);
		System.out.println(ret[2]);

		return (ret[0] + ret[1] + ret[2]);
	}

}