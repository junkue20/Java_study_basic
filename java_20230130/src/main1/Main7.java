package main1;

import cls.KorScore;

public class Main7 {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 값
		String[] s1 = { "가나다", "마바사", "아자차", "타파하" };
		int[] s2 = { 20, 99, 70, 98, 100 };
		
		// 2. KorScore 클래스로 계산해야하는 데이터를 전송 (setter)
		KorScore obj = new KorScore();
		obj.setStudent(s1);
		obj.setScore(s2);
		
		// 3). 전체 합계를 구하기
		
		// 4. 평균
		
		// 5. 최대점수
		
		// 6. 최소점수
		
		// 7. 90점 이상인 사람이 몇명인지
		
		
		// 8. 확인
		System.out.println(obj.toString());
	}

}
