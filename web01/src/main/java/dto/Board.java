package dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString(exclude = {"regdate"}) // 'regdate'의 정보는 출력되지 않게 하겠다는 뜻.
// 위의 기능을 사용하기 위해서는 지금처럼 어노테이션을 모두 직접 입력해주어야 함.
@NoArgsConstructor
@AllArgsConstructor

public class Board {

	private long no;
	private String title;
	private String content;
	private String writer;
	private long hit;

	private Date regdate;

}
