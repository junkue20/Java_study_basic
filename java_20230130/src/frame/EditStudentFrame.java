package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditStudentFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public EditStudentFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번  :");
		lblNewLabel.setBounds(59, 64, 57, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(128, 61, 116, 21);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("이름  :");
		lblNewLabel_1.setBounds(59, 108, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 105, 116, 21);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("학년  :");
		lblNewLabel_2.setBounds(59, 150, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 147, 116, 21);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("변경하기");
		btnNewButton.setBounds(33, 193, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(168, 193, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("정보수정하기");
		lblNewLabel_3.setBounds(117, 25, 72, 15);
		getContentPane().add(lblNewLabel_3);
		
		this.setSize(326, 267);
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

}
