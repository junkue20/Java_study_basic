package day7;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Frame1 extends JFrame {

	public Frame1() throws HeadlessException {
		super();// 부모의 생성자 호출
		// windowbuild를 이용해서 드래그하면 자동으로 코드가 생성되는 툴

		// swing 실습때 "2줄 넣으세요" 했던 그 두줄.
		this.setSize(300, 500);
		this.setVisible(true);
	}

}
