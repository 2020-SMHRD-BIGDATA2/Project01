package RE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ChoiceJoin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoiceJoin window = new ChoiceJoin();
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
	public ChoiceJoin() {
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
		
		JButton btn_Per = new JButton("\uAC1C\uC778");
		btn_Per.setBounds(0, 0, 204, 241);
		panel.add(btn_Per);
		
		JButton btn_Group = new JButton("\uAE30\uC5C5");
		btn_Group.setBounds(206, 0, 204, 241);
		panel.add(btn_Group);
		
		JButton button = new JButton("New button");
		button.setBounds(169, 0, -155, 251);
		frame.getContentPane().add(button);
	}

}
