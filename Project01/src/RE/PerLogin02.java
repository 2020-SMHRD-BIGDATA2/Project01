package RE;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerLogin02 {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerLogin02 window = new PerLogin02();
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
	public PerLogin02() {
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
		txt_id.setBounds(135, 55, 116, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				for (int i = 0; i < array.length; i++) {
//					if(txt_id.equals(obj) && txt_pw.equals(obj)) {
//					
				frame.dispose();
				PerAfterLogin.main(null);
//					}
//				}
			}
		});
		btn_login.setBounds(96, 172, 97, 23);
		panel.add(btn_login);
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerJoin.main(null);
			}
		});
		btn_join.setBounds(222, 172, 97, 23);
		panel.add(btn_join);
		
		txt_pw = new JPasswordField();
		txt_pw.setToolTipText("pw");
		txt_pw.setHorizontalAlignment(SwingConstants.LEFT);
		txt_pw.setBounds(135, 104, 116, 21);
		panel.add(txt_pw);
	}
}
