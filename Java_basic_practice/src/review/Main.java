package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException { // Buffer 입출력 사용시 예외처리 필수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 역활
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // System.out.println(); 역활
		StringTokenizer st; // String 역활 (BufferedReader로 받는 모든 입력값들은 String이 default이다.)

		int T;
		T = Integer.parseInt(br.readLine()); // 입력받은 (String)br.readLine() 값을 int값으로 변경

		for (int i = 1; i <= T; i++) { // 1부터 T까지 반복
			st = new StringTokenizer(br.readLine()); // 입력받은 String값 => st에 저장
			bw.write((Integer.parseInt(st.nextToken()) + // 출력하기 ((int)첫 입력값 + (int)둘째값 + 줄바꿈)
					Integer.parseInt(st.nextToken())) + "\n");
		} // T까지 반복

		bw.flush(); // BufferedWriter를 사용한 후에, flush() or close()를 해주어야 한다.
        // close()를 하게되면 출력 스트림을 아예 닫아버리기 때문에 
		// 한번 출력후 다른 것도 출력하고자 한다면 flush()를 사용하면 된다.
	}

}
