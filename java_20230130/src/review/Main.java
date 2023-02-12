package review;

import java.util.Scanner;

// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int piece;
		int[] chessArray = { 1, 1, 2, 2, 2, 8 };
		int[] Answer = new int[6];

		for (int i = 0; i < chessArray.length; i++) {
			piece = sc.nextInt();
			Answer[i] = chessArray[i] - piece;
			System.out.print(Answer[i] + " ");
		}
		
	}
}