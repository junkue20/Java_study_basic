package day6;

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

public class Item {
	private long code = 0; // 물품코드
	private String name = null; // 물품명
	private String content = null; // 물품설명
	private long price = 0; // 물품가격
	private long quantity = 0; // 물품수량
	private Date regdate = new Date(); // 등록일
}