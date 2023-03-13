import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];

		for (int x = 0; x < N; x++) { // 0 1 2 3 4
			arr1[x] = x + 1;
			arr2[x] = x + 1;
		}
		for (int x = 0; x < M; x++) {
			str = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(str.nextToken()); // 1
			int j = Integer.parseInt(str.nextToken()); // 5

			for (int y = (i - 1); y < (j - 1); y++) {
				arr1[y] = arr2[j - 1 - y];
				if(y>(j-1-y)) {
					break;
				}
			}
			arr2 = arr1;
		}
		for (int x = 0; x < N; x++) {
			System.out.print(arr1[x] + " ");
		}

	}
}