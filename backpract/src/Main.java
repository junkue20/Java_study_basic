import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int[] A = new int[30];
		for (int i = 0; i < A.length; i++) {
			A[i] = i + 1;
		}

		int[] B = new int[28];
		for (int i = 0; i < B.length-1; i++) {
			B[i] = Integer.parseInt(str.nextToken());
			if(i < 27) {
				str = new StringTokenizer(br.readLine(), " ");
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length-1; i++) {
				if (A[i] == B[j]) {
					A[i] = 0;
				}

			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				System.out.println(A[i]);
			}

		}

	}
}