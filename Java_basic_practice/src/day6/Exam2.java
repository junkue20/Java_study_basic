package day6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor // 생성자 역활 (this.를 쓰게해줌.)
@NoArgsConstructor // 생성자 역활 ''
public class Exam2 {

	// (동적)
	private int age = 0;
	// static에서는 별도의 변수를 지정할 수 없기에 처음부터 static을 추가해서 변수를지정해야 함. (정적)
	private static int age1 = 100;

	public void plusAge() {
		// this.age = this.age + 1;
		this.age++;
	}

	// static에서는 변수를 여러개 만들 수 없음
	public static void plusAge1() {
		age1++;
	}

	public void printAge() {
		System.out.println("age = " + this.age);
		System.out.println("age1 = " + age1);
	}

	public void forAge() {
		for (int i = 1; i <= this.age; i++) {
			System.out.print(i + ", ");    // 1, 2, 3,
		}
		System.out.println();
		System.out.println("--------");    // --------
		
		int m = 1;
		while(m <= this.age) {
			System.out.print(m + ", ");    // 1, 2, 3,
			m++;
		}
	}
}
