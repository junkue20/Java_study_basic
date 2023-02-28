package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class EditFrame extends JFrame{
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public EditFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보 수정하기");
		lblNewLabel.setBounds(132, 23, 100, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setBounds(75, 80, 54, 15);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 77, 116, 21);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setBounds(75, 122, 30, 15);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 119, 75, 21);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1_1.setBounds(75, 163, 100, 15);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 160, 116, 21);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("가입구분");
		lblNewLabel_1_1_1_2.setBounds(75, 203, 100, 15);
		getContentPane().add(lblNewLabel_1_1_1_2);
		
		JButton btnNewButton = new JButton("변경하기");
		btnNewButton.setBounds(57, 269, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(200, 269, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("판매자");
		chckbxNewCheckBox.setBounds(189, 195, 61, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("구매자");
		chckbxNewCheckBox_1.setBounds(258, 195, 61, 23);
		getContentPane().add(chckbxNewCheckBox_1);
		
		this.setSize(393, 367);
		getContentPane().setLayout(null);
		this.setVisible(true);
	}

}
