package review;

import java.util.Scanner;

public class Parents {
	public static void main(String[] args) {
		String str = "구슬이";
		String input = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요. : ");
	
		input = sc.next();

		if (input.equals("구슬이") ) {
			System.out.println("준규 여자친구 입니다.");
		} else {
			System.out.println("모르는사람이에용");
		}
		sc.close();
	}

}
