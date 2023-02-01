package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//클래스

@Getter
@Setter
@ToString
public class Item {

	private long no = 0L; // 물품번호
	private String name = null; // 물품명
	private String content = null; // 물품내용
	private int price = 0; // 물품가격
	private long quantity = 0L; // 물품수량
	private Date date = null; // 날짜 ( Date + shift + O )

	// getter / setter / toString()이 추가되어있는것과 같음.

	// 메소드 == 함수 (특정한 기능을 구현)
	public void discountPrice( float per ) {
		this.price = (int) (this.price - (this.price * per));
		// this.price는 현재 지정된 price 값을 계산 후 수정시킴
		// 현재가격에서 per만큼 빼야됨.
		// 변수, 조건문, 반복문, 배열...
	}
	public void checkQuantity (int num) {
		if(this.quantity <= num) { // 물품 수량이 제시하는 갯수보다 작을 경우
			this.quantity = this.quantity + num; // 기존수량 + 제시하는 수량만큼 물품수량 증가
			//
		}
	}
}
