package 문제풀이;

import java.util.Scanner;

public class Sloveproblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.print(A + B);

		}
	}
}