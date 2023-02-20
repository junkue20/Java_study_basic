import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int sumM = sc.nextInt();
		int sumH = (M + sumM) / 60;
		if ((M + sumM) >= 60) { // 만일 분이 60분을 넘어가게되면
			H = (H + sumH); // 추가된만큼 시간 변경
			M = (M + sumM) % 60; // 나머지 분 설정
			if ((H + sumH) >= 24) { // if 24시가 넘어간 시간? 
				H -= 24; // 
			} 
			System.out.println(H + " " + M);
		} else
			System.out.println((H + sumH) + " " + (M + sumM));
	}
}
