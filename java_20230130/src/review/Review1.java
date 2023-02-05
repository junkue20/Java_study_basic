package review;

public class Review1 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		try {
		System.out.println(divide(a, b));	     // 실행하려는 코드
		}
		catch (ArithmeticException e) {     // 예외 발생시 실행되는 코드
			e.printStackTrace();     // 오류 메세지 출력
		}
	}

	public static int divide(int a, int b) {
		if (b == 1) {
			throw new ArithmeticException("나눌 수 없습니다.");
			
		}
		return a / b;
	}
}

/*     오늘 집가서 pull 되어있나 꼭 확인해볼 것!       */