package Per;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import RE.DAO_PerMember;
import RE.Main01;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PerDelAccount05 { // È¸¿ø Å»Åð

	private JFrame frame;
	private JPasswordField txt_pw;
	private JButton btn_Cancel;
	private JTextField txt_id;

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

		txt_pw = new JPasswordField();
		txt_pw.setBounds(114, 100, 173, 21);
		panel.add(txt_pw);

		JButton btn_Del = new JButton("\uD0C8\uD1F4");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_PerMember daopm = new DAO_PerMember();
				
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				int cnt = daopm.del(id, pw);
				if (cnt > 0) {
					int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE);

					if (n== JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
						frame.dispose();
						Main01.main(null);
						
					} else {
						frame.dispose();
						PerResearchPage.main(null);
						System.exit(0);
						

					}
				}

				
				}
			}
		);
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
		
		txt_id = new JTextField();
		txt_id.setBounds(114, 57, 173, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);
	}
}
