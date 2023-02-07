package day7;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Parents {
	
	private String name = null; //클래스로 되어있는것들은 문자, 숫자 모두 null로 지정가능
	private int age = 0;
	private Integer age1 = null;

	public Parents() {
		super();
		
	}
	public void work() {
		System.out.println("parent work");
	}
	public void study() {
		System.out.println("parent study");
	}
}
