import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StoreModi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreModi window = new StoreModi();
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
	public StoreModi() {
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
		
		textField = new JTextField();
		textField.setBounds(116, 27, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 60, 116, 21);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 162, 116, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(244, 162, 116, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 195, 116, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(244, 193, 116, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 137, 116, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(244, 137, 116, 21);
		panel.add(textField_7);
	}

}
