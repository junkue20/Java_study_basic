import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 사탕봉지 갯수 입력
		int n = Integer.parseInt(br.readLine());
		// 봉지 갯수 카운트
		int cnt = 0;

		if ((n % 5) == 0) { // 5키로로 나눌 수 있으면 5키로에 모두 담기
			cnt = n / 5;
		} else if ((n % 5) == 1) { // 5의 배수 + 1 이라면 5키로봉지 하나 빼고 3로봉지 2개 추가
			cnt = n / 5 + 1;
		} else if ((n % 5) == 2 && n >= 12) { // n을 5로 나누었을때 2가 남는다면 (2와 7 제외)
			cnt = n / 5 + 2;
		} else if ((n % 5) == 3) { // 5로 나눈 나머지가 3이라면
			cnt = n / 5 + 1;
		} else if ((n % 5) == 4 && n != 4) {// n을 5로 나누었을때 나머지가 4가 남는다면 (4 제외)
			cnt = n / 5 + 2;
		} else { // 그 외의 모든 경우는 -1로 처리.
			cnt = -1;
		}
		System.out.println(cnt); // 결과값 출력
	}
}
