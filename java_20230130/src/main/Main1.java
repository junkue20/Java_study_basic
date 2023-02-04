package main;

// 클래스의 위치를 추가하기 ctrl + shift + o
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
			// 클래스명 객체명 = new 클래스명(준비물);
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자입력?");
		int a = sc.nextInt(); // nextInt() : int

		System.out.print("두번째 숫자입력?");
		int b = sc.nextInt();

		System.out.print("세번째 숫자입력?");
		int c = sc.nextInt();

		int sum = a + b + c;
		float avg = sum / (float) 3; // 주의) 반드시 실수 변수 1개 이상 필요     

		System.out.println("입력한 세 수의 합은=" + sum);
		System.out.println("입력한 세 수의 평균은=" + avg);

		// 다 사용했음,
		sc.close();
		                                                 
		// 문제1) 숫자 3개를 입력받아서 합과 평균(소수점표시되게)
		
		/*		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("첫번째 숫자를 입력하세요. : ");
		int a = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요. : ");
		int b = scanner.nextInt();
		
		System.out.println("첫번째 숫자를 입력하세요. : ");
		int c = scanner.nextInt();
		
		
		System.out.println("세 수의 합은 : "+ (a + b + c + "입니다.");
		System.out.println("세 수의 평균은 :"+ (float) (a + b + c) / (float) 3 + "입니다.");

		scanner.close(); */
	}
}
