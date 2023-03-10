package day5;


public class Main1 {
	public static void main(String[] args) {
		// 객체 생성 ( 객체를 만들어야 메소드 접근이 가능, 기능을 사용할 수 있음.)
		// 하지만 객체를 많이 생성할수록 메모리, 자원을 많이 사용하게 됨.

		// 프로그램이 실행될떄 static 메소드가 있는 클래스는 자동으로 1개의 객체를 생성.

		Calc calc = new Calc();
		
		// 더하기
		long ret2 = calc.sumPlus(3, 4);
		System.out.println(ret2);

		// 나누기 + Calc 클래스에서 오류처리
		float ret3 = calc.sumDiv(10, 0);
		System.out.println(ret3);

		// 뺴기 + 오류 던지기
		long ret4;
		try {
			ret4 = calc.sumMinus(10, 1);
			System.out.println(ret4);
		} catch (Exception e) {
			e.printStackTrace();
			
		} // [오류가 올 것이다] 사용하려면 메인 클래스에서 throws Exception도 포함하여야 함!

		// 곱하기
		long ret = Calc.sumMul(3, 4); // static을 이용하였기때문에 Calc calc = new Calc;
		System.out.println(ret); // calc.sumMul (); 와 같은 굳이 길게 만들필요 x (클래스에서 바로 static!)

	}
	// 오류를 던지는것, 자체적으로 오류를 잡는것.

}
