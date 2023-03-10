package main2;

import java.util.Date;

import cls.Course;
import cls.Professor;
import cls.Register;
import cls.Student;

public class Main4 {

	public static void main(String[] args) {

		// 1. 학생등록
		Student student = new Student(1952312, "박준규", 4, new Date());
		
		// 2. 교수등록
		Professor professor = new Professor(10100, "신용권", "R-303호", new Date());
		
		// 3. 과목등록
		Course course = new Course();
		course.setCode(3333);
		course.setCredit(3);
		course.setName("박준규");
		course.setDate(new Date());
		course.setProfessor(professor);

		// 4. 수강신청(1개만)
		Register register = new Register();
		register.setCode(1952312);
		register.setCourse(course);
		register.setStudent(student);
		register.setDate(new Date());
		System.out.println();

		// 5. 수강신청 내역 출력(1개만)
		System.out.println(register.toString());
	}

}
