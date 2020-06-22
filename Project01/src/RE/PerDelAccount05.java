package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerDelAccount05 {

	private JFrame frame;
	private JPasswordField txt_pw1;
	private JPasswordField txt_pw2;

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
		
		JButton btn_Del = new JButton("\uD0C8\uD1F4\uD558\uAE30");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_pw1.equals(txt_pw2)) {
					//계정삭제
				}
				
			}
		});
		btn_Del.setBounds(114, 169, 175, 23);
		panel.add(btn_Del);
	}

}
