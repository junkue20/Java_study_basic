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

/*----------------------------------------------------------------------------------------*/

	// 수량이 n개 미만이면 n개로 변경하는 메소드
	public long addQuantity(long n) { // n 개를 입력받음
		if (this.quantity < n) { // if 물품수량이 n개 미만일때,
			this.quantity = n; // 수량을 n개로 지정
			}
		System.out.println(this.quantity);
		
		return this.quantity; // 변경된 수량 반환
	}

	// 가격에 할인율만큼 빼서 리턴하는 메소드
	public float disPrice(float f) { // 할인률을 입력받음. 할인률은 소수점으로 곱해서 float!
		this.price = (long) (this.price - (this.price * f)); // (원가 - 할인값)을 가격에 대입
		System.out.println(this.price); //결과출력
		
		return this.price; // 리턴~
	}

	// 총 판매금액을 리턴하는 메소드 (가격*수량)
	public long totalPrice() {
		return (this.price * this.quantity); // 바로 리턴해버려도 됩니다
	}

	
	 // 내용이 20자 이상이면 ex)12345678901234567890... 으로 변환하는 메소드
	public String numContent() {
		if (this.content.length() >= 20) { // if 내용길이가 20 이상이면~                 
		 return (this.content.substring(0,20)+ "..."); //내용 뒤에 "..." 문자 추가해서 출력
		}
		return this.content; // 아니면 그냥 바로 출력
		}
	

	// 이름을 뒤집어서 반환하는 메소드
	// if해서 i--로 역순 출력
	public void revName() {
		/* 이런 방법도 있다!
		 * 
		 * int i = 0;
		 * String ret = "" ; // 문자를 누적할 변수
		 * for(i=this.name.length()-1; i>=0; i--){
		 *     char tmp = this.name.charAt(i);
		 *      ret += tmp;
		 * }
		 * return ret;
		 */
		StringBuffer rev = new StringBuffer(this.name); // StringBuffer라는 새로운함수에 현재 입력된 이름를 지정해주고
        String reversedName = rev.reverse().toString(); // 'rev'를 .reverse를 활용하여 거꾸로 출력하도록 설정 
     
			System.out.println(reversedName); // 쨘
	}
}
/*----------------------------------------------------------------------------------------*/