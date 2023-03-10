package day4;

import java.util.Date;

import day10.MemberTable;

public class ItemMain {

	public static void main(String[] args) {

		MemberTable obj = new MemberTable("junkue20", "1234", "박준규", "010-3131-1313", "C", 0, new Date());
		Itemtable obj1 = new Itemtable();

		// 수량이 n개 미만이면 n개로 변경하는 메소드
		obj1.addQuantity(100);

		// 가격에서 할인률만큼 빼서 리턴하는 메소드
		obj1.disPrice(0.3f);

		// 총 판매금액을 리턴하는 메소드 (가격 * 수량)
		obj1.totalPrice();

		// 내용이 20자 이상이면 1234567890...으로 변환하는 메소드
        System.out.println(obj1.numContent());
		
		// 이름을 뒤집어서 반환하는 메소드
		obj1.revName();
	}

}
