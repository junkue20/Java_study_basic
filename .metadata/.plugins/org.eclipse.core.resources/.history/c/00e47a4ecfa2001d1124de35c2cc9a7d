package day4;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Itemtable {
	private long code = 0; // 물품코드
	private String name = null; // 물품명
	private String content = null; // 물품설명
	private long price = 0; // 물품가격
	private long quantity = 0; // 물품수량
	private Date regdate = new Date(); // 등록일
	private MemberTable memberid = null; // 판매자

	// 행렬로 총 팔았던 물품들을 저장해야 할것같은데 아닌가

	// 수량이 n개 미만이면 n개로 변경하는 메소드
	public long addQuantity(long n) { // n 개를 입력받음
		if (this.quantity < n) { // if 물품수량이 n개 미만일때,
			this.quantity = n; // 수량을 n개로 지정
			}
		System.out.println(this.quantity);
		
		return this.quantity; // 변경된 수량 반환
	}

	// 가격에 할인율만큼 빼서 리턴하는 메소드
	public float disPrice(float f) { // 할인률을 입력받음
		this.price = (long) (this.price - (this.price * f)); // (원가 - 할인값)을 가격에 대입
		System.out.println(this.price);
		
		return this.price;
	}

	// 총 판매금액을 리턴하는 메소드 (가격*수량)
	public long totalPrice() {
		long total = 0;
		total = (this.price * this.quantity);
		System.out.println(total);
		return total;
	}

	/*
	 * 내용이 20자 이상이면 ex)12345678901234567890... 으로 변환하는 메소드  // 20자 이전까지는 그냥 내용 출력
	 * if문사용,content.length가 >=20 조건 사용                       // 20자 이후에는 ...
	 */ 
	public void numContent() {
		if (this.content.length() < 20) {                  // {1234567890} 행렬을 만든 뒤, 내용이 20자 이상이 넘어가게 되면 글자
		 System.out.println(this.content);
		}
		else {                            
			System.out.println("12345678901234567890...");  // 20자 이상부터는 위의 행렬 + 초과된만큼 "."출력
		}
	}

	// 이름을 뒤집어서 반환하는 메소드
	// if해서 i--로 역순 출력
	public void revName() {
		StringBuffer rev = new StringBuffer(this.name);
        String reversedName = rev.reverse().toString();
     
			System.out.println(reversedName);
	}
}