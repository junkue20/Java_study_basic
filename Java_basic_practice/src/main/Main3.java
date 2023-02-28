package main;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); //키보드로 숫자 입력정수(13)
		int num1 = scanner.nextInt(); //키보드로 숫자 입력정수(13)
		scanner.close();
		
		int i;  //반복문용 변수
		// 문제1) 두개의 숫자를 입력받아서 범위 만큼 출력(같은 숫자는 없음)
		// ex) 3 7  => 3 4 5 6 7
		// ex) 8 2  => 2 3 4 5 6 7 8
		
		if( num < num1 ) {
			for(i=num; i<=num1; i++) {
				System.out.print(i + " ");
			}
		}
		else if (num > num1){
			for(i=num1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	
		// i++ => i = i + 1
		// i+=2  => i = i + 2
		// for(임시변수=초기값; 임수변수를 이용한 조건; 임시변수의 변화(1씩증가) )
		for(i=1; i<=num; i+=2) { // 1, 2, 3, 4
			System.out.print( i + ",");
		}
		System.out.println();
		for(i=num; i>=1; i-- ) {
			System.out.print( i + ",");
		}
		
		//이 위치의 i값은? 4
		
	}
}

