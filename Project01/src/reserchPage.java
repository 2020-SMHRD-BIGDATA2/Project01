import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTabbedPane;

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
		txt_serch.setBounds(12, 11, 200, 40);
		panel.add(txt_serch);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 61, 833, 527);
		panel.add(tabbedPane);
		
		JTabbedPane tab_post = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("\uCD95\uC81C\uD3EC\uC2A4\uD130", null, tab_post, null);
		
		JTabbedPane tab_schedule = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("\uCD95\uC81C\uC77C\uC815", null, tab_schedule, null);
		
		JTabbedPane tab_lineup = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("\uB77C\uC778\uC5C5", null, tab_lineup, null);
		
		JTabbedPane tab_list = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("\uC8FC\uB9C9\uB9AC\uC2A4\uD2B8", null, tab_list, null);
		
		JTabbedPane tab_taxiBoard = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("\uD0DD\uC2DC\uAC8C\uC2DC\uD310", null, tab_taxiBoard, null);
	}
}
