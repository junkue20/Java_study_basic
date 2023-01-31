package main1;

public class Main1 {

	public static void main(String[] args) {
		
		//원시타입
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 문자형 : char
		// 논리형 : boolean
		/* 8개의 타입이 존재한다. */

		// 클래스형
		// 정수형 : byte, Short, Integer, Long => 클래스로 만들어 놓은것
		// string
		int age = 13;

		//if(조건) age==50, age != 50, age =>50, age<=50
		//if(조건 && 조건) &&and || or ! not
		if( age>=50) {
			System.out.println("50보다 큽니다.");
		}
		else {
			System.out.println("50보다 작습니다.");

		}
		//for, while, do while
		int i=0;//반복문 임시변수
		for(i=1; i<=5; i++) {  // 1 2 3 4 5
			System.out.println(i + "");// 1_2_3_4_5 와 같이 출력
		} 
		
		for(i=1; i<=1000;i++) { // 1 2 3 ... 1000까지
			if(i>=10) {
				break; // 반복문을 강제로 종료시키는 명령어
				// 10일때 종료가 되며, 11일때는 실행이 되지 않는다.
			}
			for(i=1; i<=10;i++) {// 1 2 3 4 5 6 7 8 9 10 출력
				if(i%2==0) { // 짝수일 경우에,
					continue; // 현위치를 기준으로 아래 소스코드는 수행되지 않음
					// 즉, '짝수'를 출력하지 않는다는 이야기임.
					
				}
				System.out.println(i);
			}
		}
	}

}
