package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditProfessorFrame extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public EditProfessorFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("정보수정하기");
		lblNewLabel_3.setBounds(110, 29, 72, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("교수 코드  :");
		lblNewLabel.setBounds(52, 68, 71, 15);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 65, 116, 21);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 109, 116, 21);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 151, 116, 21);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("변경하기");
		btnNewButton.setBounds(26, 197, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(161, 197, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("교수 이름  :");
		lblNewLabel_4.setBounds(52, 112, 71, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("교수실  :");
		lblNewLabel_4_1.setBounds(68, 154, 71, 15);
		getContentPane().add(lblNewLabel_4_1);
		
		this.setSize(302, 280);
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

}
