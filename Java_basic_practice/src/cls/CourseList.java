package cls;
// 등록된 교과목 목록을 저장하는 클래스

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CourseList {

	// 10개를 보관할 수 있는 배열
	// 배열은 반드시 개수가 필요함.
	private Course[] courseArray = new Course[10];
	private int idx = 0; // 배열 내부의 개수를 저장하는 변수

	// 등록된 교과목의 교수정보 중에서 교수명과 교수방을 출력하는 메소드
	public void printProfessorNameAndRoom() {
		for (int i = 0; i < idx; i++) { // 등록되어있는 교과목 배열 가져오기
			Professor professor = this.courseArray[i].getProfessor(); // Professor 클래스 들고오기
			System.out.println("교수명 : " + professor.getName());
			System.out.println("교수방 : " + professor.getRoom());
		}

	}

	// 등록된 교과목의 교수정보를 출력
	public void printProfessor() {
		for (int i = 0; i < idx; i++) { // 등록되어있는 교과목 배열 가져오기
			Professor professor = this.courseArray[i].getProfessor(); // Professor 클래스 들고오기
			System.out.println(professor.toString());
		}
	}
	// 과목을 한개씩 등록 할 수 있는 메소드

	public void insertCourse(Course course) {
		if (this.idx < this.courseArray.length) {
			// idx는 현재 추가된 갯수 < 배열 전체의 갯수
			this.courseArray[idx] = course; // 배열 0부터 순차적으로 과목을 등록 (10개뿐임)
			this.idx++;
		} else {
			System.out.println("등록 불가");// 배열 최대치 10을 넘어갈 경우 등록불가 표출.
		}
	}

	// 추가된 과목 전체 내용 출력
	public void printCourse() {
		for (int i = 0; i < idx; i++) {
			System.out.println(this.courseArray[i].toString());
		}
	}

	// 마지막에 추가한 과목 삭제하는 메소드
	public void deleteCourse() {
		if (idx == this.courseArray.length) { // if idx값이 최대치 일때,
			idx--; // 마지막 내용 삭제

		}
	}

	// 과목중에서 전달받는 학점에 해당하는 과목 조회
	// ex) 3을 전달하면 3학점에 해당하는 과목만
	public void findCourse(Course credit) {

		for (int i = 0; i < idx; i++) {
			if (this.courseArray[i] == credit) {
				System.out.println(this.courseArray[i].toString());
			}

		}
	}
}
