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
		
		JLabel lblNewLabel = new JLabel("교수코드");
		lblNewLabel.setBounds(27, 40, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("교수이름");
		lblNewLabel_1.setBounds(27, 80, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("교수실");
		lblNewLabel_2.setBounds(27, 119, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(85, 37, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 77, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 116, 116, 21);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(85, 183, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(247, 183, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		this.setSize(500, 400);
		this.setVisible(true);
	}

}
