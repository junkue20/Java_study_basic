import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int n = Integer.getInteger(str.nextToken()); // 배열 길이 첫줄 입력
		int[] arr = new int[n];

		str = new StringTokenizer(br.readLine(), " "); // 입력값 초기화 

		for (int i = 0; i < arr.length; i++) { // 과목 점수 입력
			arr[i] = Integer.getInteger(str.nextToken()); // 이후에 첫번째 행렬에 3개가 한꺼번에 들어가는 문제가 발생할 수 있음.
		}
		
		int max = 0;
		for (int i = 0; i< arr.length; i++) { // 최대값 
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		
		
	}
}