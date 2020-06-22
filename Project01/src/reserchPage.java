import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class reserchPage {

	private JFrame frame;
	private JTextField txt_serch;

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
		
		txt_serch = new JTextField();
		txt_serch.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		txt_serch.setColumns(10);
		txt_serch.setBounds(12, 10, 200, 40);
		panel.add(txt_serch);
		
		JButton btn_post = new JButton("\uCD95\uC81C\uD3EC\uC2A4\uD130");
		btn_post.setBounds(22, 60, 150, 40);
		panel.add(btn_post);
		
		JButton btn_schedule = new JButton("\uCD95\uC81C\uC77C\uC815");
		btn_schedule.setBounds(184, 60, 150, 40);
		panel.add(btn_schedule);
		
		JButton btn_lineup = new JButton("\uB77C\uC778\uC5C5");
		btn_lineup.setBounds(346, 60, 150, 40);
		panel.add(btn_lineup);
		
		JButton btn_list = new JButton("\uC8FC\uB9C9\uB9AC\uC2A4\uD2B8");
		btn_list.setBounds(508, 60, 150, 40);
		panel.add(btn_list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(302, 143, 270, 400);
		panel.add(panel_1);
		
		JButton btn_taxiboard = new JButton("\uD0DD\uC2DC\uAC8C\uC2DC\uD310");
		btn_taxiboard.setBounds(669, 60, 150, 40);
		panel.add(btn_taxiboard);
	}

}
