import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 빈칸을 기준으로 문자 구분
		String[] str = br.readLine().split(" ");
		
		// int형 문자로 두가지 분류
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);

	}
}
