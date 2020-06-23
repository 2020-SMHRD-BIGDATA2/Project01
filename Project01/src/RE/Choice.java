package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choice { // 회원가입 시 개인,기업 선택 창

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choice window = new Choice();
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
	public Choice() {
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

		JButton btn_PerJoin = new JButton("\uAC1C\uC778\uD68C\uC6D0\uAC00\uC785");
		btn_PerJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // 개인 회원가입으로 이동

				frame.dispose();
				PerJoin.main(null);

			}
		});
		btn_PerJoin.setBounds(0, 0, 204, 119);
		panel.add(btn_PerJoin);

		JButton btn_GroupJoin = new JButton("\uAE30\uC5C5\uD68C\uC6D0\uAC00\uC785");
		btn_GroupJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 기업 회원가입으로 이동
				
				frame.dispose();
				GroupJoin.main(null);
				
			}
		});
		btn_GroupJoin.setBounds(206, 0, 204, 119);
		panel.add(btn_GroupJoin);
		
		JButton btn_PerLogin = new JButton("\uAC1C\uC778\uB85C\uADF8\uC778");
		btn_PerLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				PerLogin02.main(null);
				
			}
		});
		btn_PerLogin.setBounds(0, 122, 204, 119);
		panel.add(btn_PerLogin);
		
		JButton btn_GroupLogin = new JButton("\uAE30\uC5C5\uB85C\uADF8\uC778");
		btn_GroupLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GroupLogin01.main(null);
				
			}
		});
		btn_GroupLogin.setBounds(206, 122, 204, 119);
		panel.add(btn_GroupLogin);

		JButton button = new JButton("New button");
		button.setBounds(169, 0, -155, 251);
		frame.getContentPane().add(button);
	}

}
