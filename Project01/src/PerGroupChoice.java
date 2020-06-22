import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerGroupChoice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerGroupChoice window = new PerGroupChoice();
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
	public PerGroupChoice() {
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
		
		JButton btn_group = new JButton("\uB2E8\uCCB4");
		btn_group.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_group.setBounds(204, 0, 206, 241);
		panel.add(btn_group);
		
		JButton btn_per = new JButton("\uAC1C\uC778");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_per.setBounds(0, 0, 206, 241);
		panel.add(btn_per);
	}

}
