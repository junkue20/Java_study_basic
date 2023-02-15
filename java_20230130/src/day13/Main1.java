package day13;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		ItemDB iDB = new ItemDBImpl();

//		long no[] = {328, 329};
//		int ret = iDB.deleteItemMany(no);
//		
//		System.out.println(ret);
// --------------------------------------------

//		int ret1 = iDB.updateItemOne();
//		Item item = new Item();
//		
//		short ret = 
//		System.out.println(ret1);

// ----------------------------------------------------------------------------------------------------------------

		// 문1) 가격대별 수량 구하기

		// 1 ~ 999 =>
		// 1000 ~ 9999=>
		// 10000
		// 100000 이상

		// 입력받은만큼 불러와서 가격대별로 조건문 걸어서 출력하기?
		List<Item> list = iDB.selectItemList(100);
		int[] i = new int[4];
		System.out.println("----- 문1) 가격대별 수량 구하기 ------");
		System.out.println();
		for (Item item1 : list) {// 불러온 양 만큼 반복문
			if (item1.getPrice() >= 1 && item1.getPrice() <= 999) {
				i[0]++;
			} else if (item1.getPrice() >= 1000 && item1.getPrice() <= 9999) {
				i[1]++;
			} else if (item1.getPrice() >= 10000 && item1.getPrice() <= 99999) {
				i[2]++;
			} else if (item1.getPrice() >= 100000) {
				i[3]++;
			}
		}
		System.out.println("1원 ~ 999원 : " + i[0] + "개");
		System.out.println("1000원 ~ 9999원 : " + i[1] + "개");
		System.out.println("10000원 ~ 99999원 : " + i[2] + "개");
		System.out.println("100000원 이상 : " + i[3] + "개");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println();

// -----------------------------------------------------------------------------------------------------------------

		// 문2) 시간대별 재고수량 합계 (Date to String으로 변환)

		// 0시
		// 1시
		// 2시
		// ~~~
//		// 23시
		SimpleDateFormat hour = new SimpleDateFormat("HH");
		int[] j = new int[24];
		
		System.out.println("----- 문2) 시간대별 재고수량 합계 (Date to String으로 변환) ------");
		System.out.println();
		
		for (Item item2 : list) { // 전체 반복
			String str1 = hour.format(item2.getDate());
			int h = Integer.parseInt(str1);
			j[h]++;
		}

		for (int a = 0; a < j.length; a++) {
			System.out.println(a + "시 재고수량 : " + j[a]);
		}
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.println();

// -----------------------------------------------------------------------------------------------------------------
		// 문3) 재고수량이 1000이상인 것만 가져와서 3자리마다 콤마를 넣어서 출력
		// ex) 물품번호, 이름, 가격, 재고수량
		// 1001, 가나다, 300, 12,343,343
		DecimalFormat com = new DecimalFormat("###,###");
		String str2 = null;
		System.out.println("----- 문3) 재고수량이 1000이상인 것만 가져와서 3자리마다 콤마를 넣어서 출력 ------");
		System.out.println();
		for (Item item3 : list) {
			if (item3.getQuantity() >= 1000) {
				str2 = com.format(item3.getQuantity());
			}
			System.out.println("물품번호 : " + item3.getNo() + "   이름 : " + item3.getName() + "   가격 : " + item3.getPrice()
					+ "   재고수량" + str2);
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");

		// -----------------------------------------------------------------------------------------------------------------

	}
}
