import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException { // 버퍼리더 사용시 반드시 예외처리 필요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " "); // 입력받은 값에서 빈칸을 구분함.

		int N = Integer.parseInt(str.nextToken());
		int X = Integer.parseInt(str.nextToken()); // 차례대로 수열의 길이값 N, X 입력

		str = new StringTokenizer(br.readLine(), " "); // 새로운 값 입력
		
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(str.nextToken()); // 수열 A에 들어가는 값들
			if (X > A[i]) {
				System.out.print(A[i] + " "); // A에서 X보다 작은값들 출력. 
			}
		}
	}
}
