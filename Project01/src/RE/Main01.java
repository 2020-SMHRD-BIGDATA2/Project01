package RE;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main01 { // 김축제 메인 화면(시작화면)

	private JFrame frame;
	private JTextField txt_serch;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btn_Search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main01 window = new Main01();
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
	public Main01() {
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
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ChoiceLogin.main(null);
			}
		});
		btn_login.setBounds(624, 10, 200, 40);
		panel.add(btn_login);
		
		JButton btn_signup = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ChoiceJoin.main(null);	
			}
		});
		btn_signup.setBounds(624, 60, 200, 40);
		panel.add(btn_signup);
		
		txt_serch = new JTextField();
		txt_serch.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		txt_serch.setBounds(624, 170, 155, 40);
		panel.add(txt_serch);
		txt_serch.setColumns(10);
		
		JList list = new JList();
		list.setBounds(624, 220, 200, 368);
		panel.add(list);
		
		textField_1 = new JTextField();
		textField_1.setText("\uAD11\uACE0 \uC904...............................................");
		textField_1.setBounds(12, 10, 575, 27);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("\uAE40\uCD95\uC81C \uBA54\uC778");
		textField_2.setBounds(12, 60, 575, 528);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		btn_Search = new JButton("\uAC80\uC0C9");
		btn_Search.setBounds(773, 170, 51, 40);
		panel.add(btn_Search);
	}

}
