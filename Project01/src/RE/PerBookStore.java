package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerBookStore { // 주막예약화면

	private JFrame frame;
	private JComboBox cmb_Tables;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerBookStore window = new PerBookStore();
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
	public PerBookStore() {
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
		
		cmb_Tables = new JComboBox();
		cmb_Tables.setBounds(113, 71, 183, 21);
		panel.add(cmb_Tables);
		
		JComboBox cmb_Enter = new JComboBox();
		cmb_Enter.setBounds(113, 121, 183, 21);
		panel.add(cmb_Enter);
		
		JButton btn_Book = new JButton("\uC608\uC57D \uC644\uB8CC");
		btn_Book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerAfterLogin.main(null);
			}
		});
		btn_Book.setBounds(103, 187, 94, 21);
		panel.add(btn_Book);
		
		JButton btn_Cancel = new JButton("\uC608\uC57D \uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "예약정보가 저장되지 않았습니다\n정말 취소하겠습니까","확인", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				PerAfterLogin.main(null);
			}
		});
		btn_Cancel.setBounds(220, 187, 94, 21);
		panel.add(btn_Cancel);
	}

}
