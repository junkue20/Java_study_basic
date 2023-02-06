package day6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 복습 : lombok을 썻다는건 아래에 생성되었다는 뜻
public class Exam1 {

	// 클래스의 변수
	private int age = 1;

	// 생성자 = > 외부(Main)에서 클래스를 생성할 때 초기값으로 셋팅용.
	public Exam1() {
		super();
	}

	// 외부에서 들어오는 값을 'this.' 을 이용해 받아서 변수에 저장할 수 있게 함!
	public Exam1(int age) {
		super();
		this.age = age;
	}

	// 메소드, getter, setter, toString 도 메소드.
	// public 리턴타입 메소드명 ( 외부로부터 넘겨받는 값 == 파라미터 ){
	public void printAge() {
		
		System.out.println( this.age * 2);
	}

}
