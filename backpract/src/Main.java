import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String str = "";
		for (int i = 1; i <= num; i++) {
			str = br.readLine();
			System.out.println(str.substring(1) + str.substring(str.length()));
		}

	}
}