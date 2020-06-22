import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class MainBeforelogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBeforelogin window = new MainBeforelogin();
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
	public MainBeforelogin() {
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
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(624, 10, 200, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.setBounds(624, 60, 200, 40);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		textField.setBounds(624, 170, 200, 40);
		panel.add(textField);
		textField.setColumns(10);
		
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
	}
}
