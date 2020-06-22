import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class reserchPage {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reserchPage window = new reserchPage();
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
	public reserchPage() {
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
		
		textField = new JTextField();
		textField.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		textField.setColumns(10);
		textField.setBounds(12, 10, 200, 40);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("\uCD95\uC81C\uD3EC\uC2A4\uD130");
		btnNewButton.setBounds(22, 60, 150, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCD95\uC81C\uC77C\uC815");
		btnNewButton_1.setBounds(184, 60, 150, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB77C\uC778\uC5C5");
		btnNewButton_2.setBounds(346, 60, 150, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC8FC\uB9C9\uB9AC\uC2A4\uD2B8");
		btnNewButton_3.setBounds(508, 60, 150, 40);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(302, 143, 270, 400);
		panel.add(panel_1);
		
		JButton btnNewButton_3_1 = new JButton("\uD0DD\uC2DC\uAC8C\uC2DC\uD310");
		btnNewButton_3_1.setBounds(669, 60, 150, 40);
		panel.add(btnNewButton_3_1);
	}

}
