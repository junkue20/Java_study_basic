package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

// 수강신청
public class Register {

	private int code = 0; // 과목코드
	private Course course = null; // 신청과목
	private Student student = null; // 신청학생
	private Date date = new Date();

	public Register() {
		super();
	}

	public Register(int code, Course course, Student student, Date date) {
		super();
		this.code = code;
		this.course = course;
		this.student = student;
		this.date = date;
	}

}