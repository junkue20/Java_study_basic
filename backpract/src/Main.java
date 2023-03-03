import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException { // 버퍼리더 사용시 반드시 예외처리 필요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " "); // 입력받은 값에서 빈칸을 구분함.

		long[] A = new long[9]; // 배열 총 길이, 9칸

		str = new StringTokenizer(br.readLine(), " "); // 새로운 값 입력

		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(str.nextToken()); // 수열 A에 들어가는 값들
		}

		long max = 0;
		for (int i = 0; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
				if (max == A[i]) {
					System.out.println(max);
					System.out.println(A[i]);
				}
			}
		}
	}
}
