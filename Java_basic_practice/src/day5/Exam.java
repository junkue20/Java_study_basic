package day5;


// Student, Book

// 제너릭 클래스
public class Exam<T> {

//  private int a = 14;
//  private String b = null; 
//  변수명에 타입을 고정하는 위의 방식들은 직접 필요한만큼 더 만들어야함.

//  타입을 설정한다음에 클래스로 사용하겠다. (<T>는 정해져 있지 않음! -> T는 Main2.java에서 직접 정할 예정.)
	
	private T element; // <T>를 그대로 받음

	// public 반환타입
	public T getElement() { // @Getter
		return element;
	}

	public void setElement(T element) { // @Setter
		this.element = element;
	}
	
}
