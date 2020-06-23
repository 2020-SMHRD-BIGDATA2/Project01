package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupJoin { // 관리자 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw1;
	private JPasswordField txt_emailID;
	private JTextField txt_Uni;
	private JTextField txt_Major;
	private JButton btn_Cancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupJoin window = new GroupJoin();
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
	public GroupJoin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 241);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setText("\uC544\uC774\uB514");
		txt_id.setBounds(146, 35, 116, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);

		JButton btn_Complete = new JButton("\uC644\uB8CC");
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GroupLogin01.main(null);
			}
		});
		btn_Complete.setBounds(119, 208, 97, 23);
		panel.add(btn_Complete);

		txt_pw1 = new JPasswordField();
		txt_pw1.setBounds(146, 73, 116, 21);
		panel.add(txt_pw1);

		txt_emailID = new JPasswordField();
		txt_emailID.setText("");
		txt_emailID.setBounds(146, 104, 116, 21);
		panel.add(txt_emailID);

		txt_Uni = new JTextField();
		txt_Uni.setBounds(146, 137, 116, 21);
		panel.add(txt_Uni);
		txt_Uni.setColumns(10);

		txt_Major = new JTextField();
		txt_Major.setBounds(146, 177, 116, 21);
		panel.add(txt_Major);
		txt_Major.setColumns(10);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		btn_Cancel.setBounds(220, 208, 97, 23);
		panel.add(btn_Cancel);
	}

}
