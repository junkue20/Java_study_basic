package review;

import java.util.Scanner;

//  킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 주어짐. (1 1 2 2 2 8)
//  이보다 많거나 적으면 몇개 오차인지 출력할 것.
public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 5; i++) { // 1번째부터 6번째까지 수를 입력받음 (반복문)
			int[] chess = {sc.nextInt()}; // 스캔

			System.out.print(chess[0] - 1);
			System.out.print(chess[1] - 1);
			System.out.print(chess[2] - 2);
			System.out.print(chess[3] - 2);
			System.out.print(chess[4] - 2);
			System.out.print(chess[5] - 8);
		}

	}
}