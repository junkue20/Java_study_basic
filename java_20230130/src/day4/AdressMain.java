package day4;

import java.util.Date;

public class AdressMain {

	public static void main(String[] args) {

		
		MemberTable obj = new MemberTable("id", "Pw", "123준규", 
				"010-1234-1233", "C", new Date());
		
		AddressTable address = new AddressTable(1000, "busan", "1234", new Date(), obj);
		//값 입력받기
		
		// 우편번호 5자리 확인
		
		
		// 날짜에서 월만 반환해보기
		System.out.println(address.showMonth());
	}

}
