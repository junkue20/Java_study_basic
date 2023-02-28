package day11;

import lombok.Data;

// 주로 사용하는 getter setter toString, 생성자.. 등을 한번에.
@Data
public class Member1 {

	private String id = null;
	private String name = null;
	private int age = 0;
	private float height = 0.0f;
	private float weight = 0.0f;

}
