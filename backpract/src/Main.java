import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException { // 버퍼리더 사용시 반드시 예외처리 필요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer str = new StringTokenizer(br.readLine(), " "); // 입력받은 값에서 빈칸을 구분함.
//		str = new StringTokenizer(br.readLine(), " "); // 새로운 값 입력

		int[] A = new int[10];
		int cnt = 0;
		boolean bl;

		for (int i = 0; i < 10; i++) {
			A[i] = Integer.parseInt(br.readLine()) % 42; // 10개의 정수값 입력
		}
		for (int i = 0; i < 10; i++) {
			bl = true; // bl값 초기화.
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) { // 조건 : 서로 다른 값이 몇개 있는지 출력 ex) [0,1,0,0,0,2,3,4,3,2]
					bl = false;  
					break; // 비교하려는 A[i]와 같은수가 배열에 존재할 시 반복문 stop. (+ bl값은 cnt의 카운트용.)
				}
			}
			if (bl == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
