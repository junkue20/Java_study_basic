package frame;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;


//extends JDialog 상속
public class JoinFrame extends JDialog {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	public JoinFrame() {
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("가입하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(52, 264, 97, 23);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(84, 56, 57, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(84, 95, 57, 15);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(84, 132, 57, 15);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(84, 171, 57, 15);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(150, 53, 104, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 129, 104, 21);
		getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 168, 104, 21);
		getContentPane().add(textField_3);

		JLabel lblNewLabel_3_1 = new JLabel("가입구분");
		lblNewLabel_3_1.setBounds(84, 211, 57, 15);
		getContentPane().add(lblNewLabel_3_1);

		JButton btnNewButton_1 = new JButton("취소하기");
		btnNewButton_1.setBounds(188, 264, 97, 23);
		getContentPane().add(btnNewButton_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("판매자");
		chckbxNewCheckBox.setBounds(150, 207, 61, 23);
		getContentPane().add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("구매자");
		chckbxNewCheckBox_1.setBounds(219, 207, 61, 23);
		getContentPane().add(chckbxNewCheckBox_1);

		JLabel lblNewLabel_4 = new JLabel("회원가입");
		lblNewLabel_4.setBounds(138, 21, 48, 15);
		getContentPane().add(lblNewLabel_4);

		passwordField = new JPasswordField();
		passwordField.setBounds(150, 92, 104, 21);
		getContentPane().add(passwordField);

		this.setModal(true);
		this.setSize(364, 358);
		this.setVisible(true);
	}
}
