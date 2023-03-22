import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 사탕봉지 갯수
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		// 5키로로 담을 수 있는만큼 담기.
		cnt += n / 5;

		// 만약 3으로 나눌 수 있는 수라면
		if ((n % 5) % 3 == 0) {
			cnt = (n % 5) / 3;
		}

		// 5키로를 담고 남는 나머지는 3키로 봉지로 담기.
		if ((n % 5) != 0) {
			cnt += (n % 5) / 3;

			// 만약 5와 3으로 나누어담을 수 없다면 -1을 출력하도록 설정
			if ((n % 5) % 3 != 0) {
				cnt = (-1);
			}
		}
		System.out.println(cnt);

	}
}
