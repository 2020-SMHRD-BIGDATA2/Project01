import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class reservationDrink {

	private JFrame frame;
	private JTextField txt_menu;
	private JTextField txt_seat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservationDrink window = new reservationDrink();
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
	public reservationDrink() {
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
		
		JLabel lblNewLabel = new JLabel("\uAE40\uCD95\uC81C \uC8FC\uB9C9\uC608\uC57D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(332, 112, 200, 41);
		panel.add(lblNewLabel);
		
		JLabel lblGroup = new JLabel("\uC8FC\uB9C9\uB9AC\uC2A4\uD2B8");
		lblGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGroup.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblGroup.setBounds(236, 187, 84, 41);
		panel.add(lblGroup);
		
		txt_menu = new JTextField();
		txt_menu.setColumns(10);
		txt_menu.setBounds(332, 275, 200, 40);
		panel.add(txt_menu);
		
		JLabel lblMenu = new JLabel("\uBA54\uB274");
		lblMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMenu.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblMenu.setBounds(236, 273, 84, 41);
		panel.add(lblMenu);
		
		JLabel lblSeat = new JLabel("\uC608\uC57D\uC790\uC218");
		lblSeat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeat.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblSeat.setBounds(236, 355, 84, 41);
		panel.add(lblSeat);
		
		txt_seat = new JTextField();
		txt_seat.setColumns(10);
		txt_seat.setBounds(332, 357, 200, 40);
		panel.add(txt_seat);
		
		JButton btn_complete = new JButton("\uC608\uC57D\uC644\uB8CC");
		btn_complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_complete.setBounds(333, 429, 200, 41);
		panel.add(btn_complete);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(332, 188, 200, 41);
		panel.add(comboBox);
	}
}
