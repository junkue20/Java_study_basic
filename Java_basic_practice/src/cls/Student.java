package cls;

//수강정보시스템 만들기

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {

	private int no = 0; // 학번
	private String name = ""; // 이름
	private int grade = 0; // 학년
	private Date date = null; // 등록일자

	// 생성자
	public Student() {
		super();
	}

	// 생성자
	public Student(int no, String name, int grade, Date date) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.date = date;
	}
	
	// 학년을 1씩 증가시키기 ( 4학년까지만 )
	// 학년을 1씩 증가시키는 메소드
	public void plusGrade () {
		this.grade++; // 1 증가시키기
		if(this.grade>4) { // 만약 값이 4보다 크면
			this.grade = 4; // 학년값을 4학년으로 만들기
		}
	}

}
