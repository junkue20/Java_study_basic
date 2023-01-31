package main1;

public class Main2 {

	// 정답은 없음. 해결하면 정답이고, 짧아야 하며 수정을 적게할 수 있어야 함. 게을러야 함.//

	// 변수선언
	public static void main(String[] args) {

		// 배열의 번호는 0부터 시작하여 n번째의 값을 출력하기 위해서는 n-1의 값을 출력시키면 된다.
		// 또한 배열의 인덱스는 0부터이다.

		int i; // 반복문 임시변수
		int[] age = { 1, 2, 4, 5, 12 }; // 나이 변수가 5개 생성.
		// age.length ==> 5가 됨. (갯수가 5개)
		for (i = 0; i < age.length; i++) { // .length는 값의 길이를 구하는 명령어임.
			System.out.println(age[i] + "");

		}
		System.out.println();

		// age 의 값들을 반대로 출력하세요

		for (i = age.length - 1; i >= 0; i--) { // .length는 값의 길이를 구하는 명령어임.
			System.out.println(age[i] + " ");

		}
		System.out.println();
		// 또는

		for (i = 0; i < age.length; i++) { // .length는 값의 길이를 구하는 명령어임.
			System.out.println(age[4 - i] + " ");

		}
		System.out.println();

		// age의 값들의 합과 평균을 구하시오
		int sum = 0;

		for (i = 0; i < age.length; i++) { // .length는 값의 길이를 구하는 명령어임.
			sum += age[i];
		}
		System.out.println("합은=" + sum);
		float avg = (float) sum / (float) age.length; // 실수 / 실수

		System.out.println(sum + "" + avg);

		// age 5개 중에서 짝수만 출력하세요
		int sum1 = 0; // 반복문 임시변수

		for (i = 0; i < age.length; i++) {
			if (age[i] % 2 == 0) {
				sum1 += age[i];
			}
		}
		System.out.println("짝수의 합 = " + sum1);
	}
}
