package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerDelAccount05 {

	private JFrame frame;
	private JPasswordField txt_pw1;
	private JPasswordField txt_pw2;
	private JButton btn_Cancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerDelAccount05 window = new PerDelAccount05();
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
	public PerDelAccount05() {
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

		txt_pw1 = new JPasswordField();
		txt_pw1.setBounds(114, 67, 173, 21);
		panel.add(txt_pw1);

		txt_pw2 = new JPasswordField();
		txt_pw2.setBounds(114, 116, 173, 21);
		panel.add(txt_pw2);

		JButton btn_Del = new JButton("\uD0C8\uD1F4");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(txt_pw1.equals(txt_pw2)) {
//					계정삭제
				JOptionPane.showMessageDialog(null, "정말 탈퇴하시겠습니까", "확인", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				Main01.main(null);
//				}
//				
			}
		});
		btn_Del.setBounds(114, 169, 73, 23);
		panel.add(btn_Del);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				researchPage.main(null);
			}
		});
		btn_Cancel.setBounds(214, 169, 73, 23);
		panel.add(btn_Cancel);
	}

}
