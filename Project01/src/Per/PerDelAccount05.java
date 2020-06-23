package Per;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import RE.Main01;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerDelAccount05 { // È¸¿ø Å»Åð

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
//					°èÁ¤»èÁ¦
				int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n== JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
					frame.dispose();
					Main01.main(null);
					
				} else {
					frame.dispose();
					PerResearchPage.main(null);
//					System.exit(0);
					

//				}
//				
				}
			}
		});
		btn_Del.setBounds(114, 169, 73, 23);
		panel.add(btn_Del);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				PerResearchPage.main(null);
			}
		});
		btn_Cancel.setBounds(214, 169, 73, 23);
		panel.add(btn_Cancel);
	}

}
