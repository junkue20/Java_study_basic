package review;

import java.util.Scanner;

//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 
//셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력.
public class Review1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
     sc.close();
     
		System.out.print((A+B)%C);
     System.out.print(((A%C) + (B%C))%C);
     System.out.print((A*B)%C);
     System.out.print(((A%C) * (B%C))%C);

		}
	}
