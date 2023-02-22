import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		while (A == 0 && B == 0) {
			sum = A + B;
		}
		if(A == 0 && B == 0) {
			System.out.println(sum);
		}
	}
}
