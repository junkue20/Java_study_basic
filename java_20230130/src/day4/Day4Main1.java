package day4;

import java.util.Date;

public class Day4Main1 {

	public static void main(String[] args) {

		//1. 객체 생성 (값 세팅)
		MemberTable obj = new MemberTable("id", "Pw", "123준규", 
				"010-1234-1233", "C", new Date());
		
		// 현재 클래스 값 확인용도\
		System.out.println(obj.toString());
		
		
		//2. 세팅된 이름값이 유효한지 확인하기
	    boolean result = obj.invalidName();
	    System.out.println(result);
	    
		//3. 휴대폰 번호 길이가 맞는지 확인하는 메소드 만들기
	    boolean result1 = obj.invalidPhone();
	    System.out.println(result1);
	    
	    //4. 권한정보가 C나 S로만 되어있는지 확인하기
	    boolean result2 = obj.invalidRole();
	    System.out.println(result2);
	    
	    //5. 연락처 '-' 빼고 출력하기
	    String ret = obj.changePhone();
	    		System.out.println(ret);
	    		
	    		
	    //
	    		

	    		
	}

}
