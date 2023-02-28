package main;

import java.util.Scanner;

// ctrl + shift + f 자동 정렬
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자입력?");
		int a = sc.nextInt(); // nextInt() : int

		// = => 값을 넣음

		// == => 같으냐?
		// != => 같지않느냐?
		// && AND
		// || OR   
		if (a % 5 == 0) {
			System.out.println("입력한 값은 5의배수");
		} else {
			System.out.println("입력한 값은 5의배수 아님");
		}
		
		// 100~90 A     90 <= a변수  &&   a의변수 <= 100
		// 89~80 B
		// 79~70 C
		// 나머지 D
		if ( 90 <= a && a<= 100) {
			System.out.println("A");
		}
		else if(80 <= a && a<= 89 ) {
			System.out.println("B");
		}
		else if(70 <= a && a<= 79 ) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}

		// 입력받은 숫자 a가 짝수 인지 홀수 인지 확인
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		// 입력받은 숫자가 3, 5, 3 5인지 확인
		// ex) 15 => 3 5
		// ex)  5 => 5
		
		if(a % 5 == 0) {
			System.out.println("5");
		}
		else if( (a%3==0) && (a%5==0) ) { // if(a%15==0)
			System.out.println("3 5");
		}
		else if(a % 3 == 0) {
			System.out.println("3");
		}

		sc.close();
	}

}