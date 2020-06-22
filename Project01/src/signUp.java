import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class signUp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblPw_1;
	private JLabel lblPw_2;
	private JLabel lblPw_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp window = new signUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 857, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAE40\uCD95\uC81C \uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(337, 90, 200, 41);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(337, 205, 200, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(337, 254, 200, 40);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(337, 305, 200, 40);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(337, 355, 200, 40);
		panel.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("\uAC00\uC785 \uC644\uB8CC");
		btnNewButton_1.setBounds(337, 421, 200, 41);
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(337, 152, 200, 42);
		panel.add(passwordField);
		
		lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId.setBounds(241, 152, 84, 41);
		panel.add(lblId);
		
		lblPw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw.setBounds(241, 205, 84, 41);
		panel.add(lblPw);
		
		lblPw_1 = new JLabel("\uC774\uB984");
		lblPw_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw_1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw_1.setBounds(241, 254, 84, 41);
		panel.add(lblPw_1);
		
		lblPw_2 = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		lblPw_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw_2.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw_2.setBounds(241, 305, 84, 41);
		panel.add(lblPw_2);
		
		lblPw_3 = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblPw_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw_3.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw_3.setBounds(204, 355, 121, 41);
		panel.add(lblPw_3);
	}
}
