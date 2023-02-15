package day13;

import java.util.Scanner;

import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		try {
			ChatClient chat = new ChatClient(); // 서버접속
			chat.setSubscribe(); // 구독설정

			Scanner sc = new Scanner(System.in); // 내용입력
			while (true) { // 무한반복
				System.out.print("보낼 메세지 입력 : ");
				String msg = sc.nextLine();
				if (msg.equals("exit")) {
					break; // 반복문 탈출
				}

				// ex)가나다
				JSONObject jobj = new JSONObject();
				jobj.put("name", msg);
				jobj.put("content", "내용들...");
				jobj.put("price", 1111);
				jobj.put("quantity", 1234);

				// {"name":"입력내용", "type":1}
				// {"name" : "물품명", "content" : "물품내용", "price":1234, "quantity":1234};

				
				// JSONOBject = > String => byte[] ~~~byte[] => String=>
				chat.sendMessage("/pknu/class303/id209", jobj.toString());
				Thread.sleep(200); // 0.2초 기다림

			}
			sc.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
