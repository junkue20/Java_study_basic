package day5;


public class Calc {

	// 변수를 만들지 않음!

	// getter, setter, toString 필요 X
	// 생성자를 만들지 않으면 public Calc(){}

	/* 각각 두 수를 받아서 값을 반환하는 메소드들을 만들기 */

	// 더하기 메소드
	public long sumPlus(long n, int m) {
		long sum = n + m;
		return sum;
	}

	// 빼기 메소드
	public long sumMinus(long n, long m) throws Exception { // 오류가 나면 메인 클래스로 던짐.
		long tmp = n - m;
		return tmp;
	}

	// 나누기 메소드
	public float sumDiv(int n, int m) {
		try {
			float div = (float) n / (float) m; // 정수 / 정수 -> 정수가 나온다

			/* if 이 구간에서 오류가 발생 시 중지 후 catch로 이동 */

			return div;
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			// 오류를 추가할 수 있게 상세히 출력해줌. 개발자를 위해서! 
			return 0.0f;
			// 앞으로 습관적으로 오류를 발견하기 위하여 이러한 catch 함수를 사용할 것! (보통 개발자들은 메인으로 던지는 방식으로 많이 사용)
		}finally {
			System.out.println("오류발생");
		}
		
	}

	// 곱하기 메소드 static 정적 ,(객체를 많이 생성할수록 메모리, 자원을 많이 사용하게 됨)
	public static long sumMul(long n, long m) {
		long tmp = n * m;
		return tmp;

	}
}
