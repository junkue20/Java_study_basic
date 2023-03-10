package cls;

//수강과목
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {

	private long code = 100000; // 과목코드
	private String name = null; // 과목명
	private int credit = 0; // 학점
	private Professor professor = null; // 강의교수
	private Date date = null; // 제이터베이스에 자료가 저장되는 시점 기록

	public Course() {
		super();
	}

	public Course(long code, String name, int credit, Professor professor, Date date) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.professor = professor;
		this.date = date;
	}

}
