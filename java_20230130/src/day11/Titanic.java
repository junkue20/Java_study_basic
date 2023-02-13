package day11;

import lombok.Data;

@Data
public class Titanic {
	
	private String name = null; // 이름
	private String survived = null; //생존여부	0 = No, 1 = Yes
	private int pclass = 0; // 티켓 등급	1 = 1st, 2 = 2nd, 3 = 3rd
	private String sex = null; // 성별
	private Float age = 0.0f; // 나이
	private int sibsp = 0; // 타이타닉에 탑승한 형제/자매 수
	private int parch = 0; // 타이타닉에 탑승한 부모/자녀 수
	private String ticket = null; // 티켓번호
	private Float fare = 0.0f; // 운임(티켓요금)
	private String cabin = null; // 객실 번호
	private String embarked = "C"; // 탑승한 곳(항구)	C = Cherbourg, Q = Queenstown, S = Southampton
	private int passengerId = 0;
}
