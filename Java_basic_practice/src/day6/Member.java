package day6;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// ** 일반적으로 Member타입으로 사용하는 클래스는 [getter/setter, ToString, 생성자] 가 전부이다
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String id = null; // 아이디
	private String password = null;
	private String name = null;
	private int age = 0;
	private String phone = null; // 000-0000-0000
	private String role = null; // 권한설정 고객은(C), 판매자는 (S)
	private Date regdate = null;
}
