package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 5명의 학생의 국어점수를 보관하고 처리할 클래스
@Setter
@Getter
@ToString
public class KorScore {

	private String[] student = new String[5];
	private int[] score = new int[5];

	//학생들의 점수 합계를 구해주는 메소드
	public int sumScore() {
	 int sum = 0;
	 
	 return sum;
	}
	// setter, getter, toString 메소드가 존재함
	
}
