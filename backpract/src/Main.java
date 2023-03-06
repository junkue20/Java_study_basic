import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(str.nextToken());

		for (int i = N - 1; i > 0; i--) {
			N = N * i;
		}
		if (N == 0) {
			N = 1;
		}
		System.out.println(N);
	}
}