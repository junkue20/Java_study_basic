import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] A = new int[10];
		int cnt = 0;

		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(br.readLine()) % 42;
			if (i == 9) {
				for (int j = 0; j < A.length; j++) {
					if (A[i] != A[j]) {
						cnt++;
					}
				}

			}
		}
		System.out.println(cnt);

	}
}