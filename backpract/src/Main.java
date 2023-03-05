import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(str.nextToken());
		int[] A = new int[N];

		for (int I = 0; I < N; I++) {
			A[I] = I + 1;
		}

		int M = Integer.parseInt(str.nextToken());

		for (int I = 0; I < M; I++) { // 0부터 M까지 반복
			str = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(str.nextToken());
			int j = Integer.parseInt(str.nextToken());
			
			int k = A[i-1];
			int l = A[j-1];
			A[j-1] = k;
			A[i-1] = l;
			
		}
		for (int I = 0; I < N; I++) {

			System.out.print(A[I] + " ");
		}

	}
}