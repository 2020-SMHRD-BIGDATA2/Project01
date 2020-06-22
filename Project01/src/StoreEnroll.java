import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class StoreEnroll {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_location;
	private JTextField txt_Menu1;
	private JTextField txt_Price1;
	private JTextField txt_Menu2;
	private JTextField txt_Price2;
	private JTextField txt_Menu3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreEnroll window = new StoreEnroll();
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
	public StoreEnroll() {
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
		
		txt_name = new JTextField();
		txt_name.setText("\uC8FC\uB9C9 \uC774\uB984");
		txt_name.setBounds(79, 10, 116, 21);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		txt_location = new JTextField();
		txt_location.setText("\uC8FC\uB9C9 \uC704\uCE58");
		txt_location.setColumns(10);
		txt_location.setBounds(79, 41, 116, 21);
		panel.add(txt_location);
		
		txt_Menu1 = new JTextField();
		txt_Menu1.setText("\uBA54\uB2741");
		txt_Menu1.setBounds(79, 134, 116, 21);
		panel.add(txt_Menu1);
		txt_Menu1.setColumns(10);
		
		txt_Price1 = new JTextField();
		txt_Price1.setText("\uAE08\uC561");
		txt_Price1.setBounds(207, 134, 116, 21);
		panel.add(txt_Price1);
		txt_Price1.setColumns(10);
		
		txt_Menu2 = new JTextField();
		txt_Menu2.setText("\uBA54\uB2742");
		txt_Menu2.setColumns(10);
		txt_Menu2.setBounds(79, 165, 116, 21);
		panel.add(txt_Menu2);
		
		txt_Price2 = new JTextField();
		txt_Price2.setText("\uAE08\uC561");
		txt_Price2.setColumns(10);
		txt_Price2.setBounds(207, 165, 116, 21);
		panel.add(txt_Price2);
		
		txt_Menu3 = new JTextField();
		txt_Menu3.setText("\uBA54\uB2743");
		txt_Menu3.setColumns(10);
		txt_Menu3.setBounds(79, 192, 116, 21);
		panel.add(txt_Menu3);
		
		JTextField txt_Price3 = new JTextField();
		txt_Price3.setText("\uAE08\uC561");
		txt_Price3.setColumns(10);
		txt_Price3.setBounds(207, 192, 116, 21);
		panel.add(txt_Price3);
		
		JComboBox cmb_open = new JComboBox();
		cmb_open.setBounds(79, 103, 116, 21);
		panel.add(cmb_open);
		
		JComboBox cmb_close = new JComboBox();
		cmb_close.setBounds(207, 103, 116, 21);
		panel.add(cmb_close);
		
		JComboBox cmb_Seats = new JComboBox();
		cmb_Seats.setBounds(79, 72, 116, 21);
		panel.add(cmb_Seats);
	}
}
