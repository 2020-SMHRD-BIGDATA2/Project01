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

public class reservationDrink {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_group;
	private JTextField txt_menu;
	private JPasswordField txt_pw;
	private JTextField txt_time;
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
		lblNewLabel.setBounds(323, 57, 200, 41);
		panel.add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setColumns(10);
		txt_id.setBounds(333, 108, 200, 40);
		panel.add(txt_id);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId.setBounds(237, 105, 84, 41);
		panel.add(lblId);
		
		JLabel lblPw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw.setBounds(237, 157, 84, 41);
		panel.add(lblPw);
		
		txt_group = new JTextField();
		txt_group.setColumns(10);
		txt_group.setBounds(333, 211, 200, 40);
		panel.add(txt_group);
		
		JLabel lblGroup = new JLabel("\uB2E8\uCCB4\uBC88\uD638");
		lblGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGroup.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblGroup.setBounds(237, 209, 84, 41);
		panel.add(lblGroup);
		
		txt_menu = new JTextField();
		txt_menu.setColumns(10);
		txt_menu.setBounds(333, 263, 200, 40);
		panel.add(txt_menu);
		
		JLabel lblMenu = new JLabel("\uBA54\uB274");
		lblMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMenu.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblMenu.setBounds(237, 261, 84, 41);
		panel.add(lblMenu);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(333, 159, 200, 40);
		panel.add(txt_pw);
		
		JLabel lblTime = new JLabel("\uC6B4\uC601\uC2DC\uAC04");
		lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTime.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblTime.setBounds(237, 313, 84, 41);
		panel.add(lblTime);
		
		txt_time = new JTextField();
		txt_time.setColumns(10);
		txt_time.setBounds(333, 315, 200, 40);
		panel.add(txt_time);
		
		JLabel lblSeat = new JLabel("\uC88C\uC11D\uC218");
		lblSeat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeat.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblSeat.setBounds(237, 364, 84, 41);
		panel.add(lblSeat);
		
		txt_seat = new JTextField();
		txt_seat.setColumns(10);
		txt_seat.setBounds(333, 366, 200, 40);
		panel.add(txt_seat);
		
		JLabel lblLocation = new JLabel("\uC704\uCE58");
		lblLocation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocation.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblLocation.setBounds(237, 415, 84, 41);
		panel.add(lblLocation);
		
		JTextField txt_location = new JTextField();
		txt_location.setColumns(10);
		txt_location.setBounds(333, 417, 200, 40);
		panel.add(txt_location);
		
		JButton btn_complete = new JButton("\uB4F1\uB85D\uC644\uB8CC");
		btn_complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_complete.setBounds(333, 467, 200, 41);
		panel.add(btn_complete);
	}

}
