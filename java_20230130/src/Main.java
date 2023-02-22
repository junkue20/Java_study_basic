import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (1 > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A == 0 && B == 0) {
				break;
			}
			int sum = A + B;
			System.out.println(sum);
		}

	}

}