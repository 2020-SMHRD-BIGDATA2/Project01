import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class PerSearch {

	private JFrame frame;
	private JTextField txt_Search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerSearch window = new PerSearch();
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
	public PerSearch() {
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
		
		txt_Search = new JTextField();
		txt_Search.setText("Search");
		txt_Search.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Search.setBounds(112, 111, 165, 37);
		panel.add(txt_Search);
		txt_Search.setColumns(10);
		
		JButton btn_search = new JButton("search");
		btn_search.setBounds(147, 181, 97, 23);
		panel.add(btn_search);
		
		JRadioButton rd_Uni = new JRadioButton("Uni");
		rd_Uni.setBounds(123, 66, 61, 23);
		panel.add(rd_Uni);
		
		JRadioButton rd_Celeb = new JRadioButton("Celeb");
		rd_Celeb.setBounds(194, 66, 121, 23);
		panel.add(rd_Celeb);
		
		JButton btn_Booking = new JButton("\uC8FC\uB9C9 \uC608\uC57D");
		btn_Booking.setBounds(73, 26, 97, 23);
		panel.add(btn_Booking);
		
		JButton btn_Cancel = new JButton("\uC608\uC57D \uCDE8\uC18C");
		btn_Cancel.setBounds(218, 26, 97, 23);
		panel.add(btn_Cancel);
	}

}
