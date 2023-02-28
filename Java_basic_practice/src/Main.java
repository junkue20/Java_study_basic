import java.util.Scanner;

public class Main {// 빈칸수 별수 : 4 1 ,3 2, 2 3, 1 4, 0 5

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for (int i = 1; i <= line; i++) { // 1~ (5)층까지 반복
			for (int j = line; j > i; j--) { // j(line)가 i의 값보다 미만일시 반복문 stop (쉽게말해 i층)
				System.out.print(" "); // 빈칸을 출력
			}
			for (int j = 1; j <= i; j++) { //  i층과 동일한 갯수의 별이 찍히도록 설정.
				System.out.print("*");
			}
			System.out.println();
			System.err.println();
		}
	}
}