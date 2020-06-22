import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CarPool {

	private JFrame frame;
	private JTextField txt_Destination;
	private JButton btn_Search;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarPool window = new CarPool();
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
	public CarPool() {
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
		
		txt_Destination = new JTextField();
		txt_Destination.setText("Search");
		txt_Destination.setBounds(34, 35, 116, 21);
		panel.add(txt_Destination);
		txt_Destination.setColumns(10);
		
		btn_Search = new JButton("Search");
		btn_Search.setBounds(156, 34, 97, 23);
		panel.add(btn_Search);
		
		textField = new JTextField();
		textField.setText("\uAC8C\uC2DC \uBAA9\uB85D");
		textField.setBounds(34, 81, 351, 150);
		panel.add(textField);
		textField.setColumns(10);
	}
}
