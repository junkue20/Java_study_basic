package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Professor extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public Professor() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("교수코드 :");
		lblNewLabel.setBounds(58, 36, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("교수이름 :");
		lblNewLabel_1.setBounds(58, 76, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("교수실 :");
		lblNewLabel_2.setBounds(70, 115, 47, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(116, 33, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 73, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 112, 116, 21);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(46, 163, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(168, 163, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		this.setSize(324, 255);
		this.setVisible(true);
	}

}
