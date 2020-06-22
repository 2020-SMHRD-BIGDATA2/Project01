import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class InfoModification {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_idNo;
	private JPasswordField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoModification window = new InfoModification();
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
	public InfoModification() {
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
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(341, 111, 200, 41);
		panel.add(lblNewLabel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId.setBounds(251, 175, 84, 41);
		panel.add(lblId);
		
		JLabel lblPw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw.setBounds(251, 224, 84, 41);
		panel.add(lblPw);
		
		JLabel lblName = new JLabel("\uC774\uB984");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblName.setBounds(251, 275, 84, 41);
		panel.add(lblName);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(341, 277, 200, 40);
		panel.add(txt_name);
		
		JLabel lblPhone = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPhone.setBounds(233, 326, 102, 41);
		panel.add(lblPhone);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(341, 326, 200, 40);
		panel.add(txt_phone);
		
		JLabel lblIdNo = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblIdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdNo.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblIdNo.setBounds(201, 377, 134, 41);
		panel.add(lblIdNo);
		
		txt_idNo = new JTextField();
		txt_idNo.setColumns(10);
		txt_idNo.setBounds(341, 376, 200, 40);
		panel.add(txt_idNo);
		
		JButton btn_complete = new JButton("\uC218\uC815\uC644\uB8CC");
		btn_complete.setBounds(341, 442, 200, 41);
		panel.add(btn_complete);
		
		JLabel lblNewLabel_1 = new JLabel("ID \uD45C\uC2DC");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(341, 175, 200, 41);
		panel.add(lblNewLabel_1);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(341, 225, 200, 41);
		panel.add(txt_pw);
	}

}
