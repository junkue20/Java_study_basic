package day14;

import java.util.Date;

import lombok.Data;

@Data
public class Member {

	 String id; // 기본키 => 고유값 
	 String password;
	 String name;
	 String phone;
	 String role; // 권한설정 고객은(C), 판매자는 (S)
	 int age;
	 Date regdate;
}
