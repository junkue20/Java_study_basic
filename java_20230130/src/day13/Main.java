package day13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			ChatClient chat = new ChatClient(); // 서버접속
			chat.setSubscribe(); // 구독설정

			Scanner sc = new Scanner(System.in); // 내용입력
			while (true) { // 무한반복
				System.out.print("보낼 메세지 입력 : ");
				String msg = sc.nextLine();
				if (msg.equals("나가기")) {
					break; // 반복문 탈출
				}
				chat.sendMessage("/pknu/class303/all", msg);
				Thread.sleep(200); // 0.2초 기다림

			}
			sc.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
