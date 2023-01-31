package main;

public class Exam1 {

	public static void main(String[] args) {
		int num = 5;
		int i = 0; //반복문 임시 변수
		int j = 0;
		
		for(i=1; i<=5; i++) {
			System.out.print("*");
		}
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		
		for(i=1; i<=5; i++) { // 1 2 3 4 5 
			for(j=1; j<=i; j++) { //1 12 123 1234 12345 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
	
		
		for(i=1; i<=5; i++) { // 1 2 3 4 5
			for(j=1; j<=(6-i); j++) { // 12345  1234 123 12 1
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		1 *       (1)
		2 ***     (123) 
		3 *****   (12345) 
		4 ******* (1234567)
		5 *********
		*/
		
		for(i=1; i<=5; i++) { // 1 2 3 4 5
			for(j=1; j<=i*2-1; j++) { // 1 123 12345 1234567 123456789
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제1) 숫자 5를 입력하면 아래 처럼 출력하시오
		// 1 2 3 4 5              4 3 2 1
		for(i=1; i<=5; i++) {
			System.out.print( i + " ");
		}
		
		for(i=4; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 문제2) 숫자 13을 입력하면 3의 배수의 합구하기
		// 3 6 9 12 => 30
		int sum = 0; //합을 구할 변수
		for(i=0; i<=13; i++) { // 0 1 2 3 4 ... 13
			if(i%3 == 0) { // 0 3 6 9 12
				// sum = sum + i; // 0 3 9 18 30
				sum += i;
			}
		}
		System.out.println("합은 = " + sum);
		
		// 문제3) 숫자 10을 입력하면 홀수의 합 짝수의 합 각각 구하기
		// 10  => 1 3 5 7  9 => 25
		// 10  => 2 4 6 8 10 => 30
		int sum1 = 0; // 홀수합 누적 변수
		int sum2 = 0; // 짝수합 누적 변수
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				sum1 = sum1 + i;
			}
			else {
				sum2 += i;
			}
		}
		System.out.println("홀수합 = " + sum1);
		System.out.println("짝수합 = " + sum2);
		
		// 문제4) 숫자 7을 입력하면 구구단 구하기
		// 7*1=7
		// 7*2=14
		// 7*3=21
		for(i=1; i<=9; i++) {
			System.out.println( "7 * " + i + "=" + (7*i) );
		}
	}
	
}