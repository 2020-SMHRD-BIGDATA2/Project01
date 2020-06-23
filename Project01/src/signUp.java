import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signUp {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_idNo;
	private JPasswordField txt_pw;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblIdNo;
	private JButton btn_complete;

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
		
		JPanel panel = new	 JPanel();
		panel.setBounds(12, 10, 857, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAE40\uCD95\uC81C \uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(337, 90, 200, 41);
		panel.add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setBounds(337, 154, 200, 40);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(337, 254, 200, 40);
		panel.add(txt_name);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(337, 305, 200, 40);
		panel.add(txt_phone);
		
		txt_idNo = new JTextField();
		txt_idNo.setColumns(10);
		txt_idNo.setBounds(337, 355, 200, 40);
		panel.add(txt_idNo);
		
		btn_complete = new JButton("\uAC00\uC785\uC644\uB8CC");
		btn_complete.setBounds(337, 421, 200, 41);
		panel.add(btn_complete);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(337, 204, 200, 42);
		panel.add(txt_pw);
		
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
		
		lblName = new JLabel("\uC774\uB984");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblName.setBounds(241, 254, 84, 41);
		panel.add(lblName);
		
		lblPhone = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPhone.setBounds(241, 305, 84, 41);
		panel.add(lblPhone);
		
		lblIdNo = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblIdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdNo.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblIdNo.setBounds(204, 355, 121, 41);
		panel.add(lblIdNo);
		
		JButton btn_home = new JButton("\uD648\uC73C\uB85C");
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//È¨À¸·Î µ¹¾Æ°¡±â
				frame.dispose();
				MainBeforelogin.main(null);
			}
		});
		btn_home.setBounds(337, 472, 200, 41);
		panel.add(btn_home);
	}
}
