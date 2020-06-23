package RE;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerJoin {

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
	private JButton btn_Cancel;
	private JButton btn_Complete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerJoin window = new PerJoin();
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
	public PerJoin() {
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
		
		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerLogin02.main(null);
			}
		});
		btn_Cancel.setBounds(449, 430, 84, 41);
		panel.add(btn_Cancel);
		
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
		
		btn_Complete = new JButton("\uC644\uB8CC");
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerLogin02.main(null);
			}
		});
		btn_Complete.setBounds(348, 430, 70, 41);
		panel.add(btn_Complete);
	}

}
