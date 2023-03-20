import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int sum = 0;
		for (int y = 0; y <n; y++) {
			sum += str.charAt(y)-'0';
		}
		System.out.println(sum);
	}
}
