package day13;

import java.util.Date;

import lombok.Data;

@Data
public class Item {
	
	private long no = 0L; // 물품번호 _id int64

	private String name = null; // 물품명
	private String content = null; // 물품내용
	private int price = 0; // 물품가격 int32
	private int quantity = 0; // 물품수량 int32
	private Date date = null;

}
