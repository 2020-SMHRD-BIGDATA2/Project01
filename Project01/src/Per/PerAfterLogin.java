package Per;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PerAfterLogin { // 개인회원 로그인 후 검색화면(필요없는 화면)

	private JFrame frame;
	private JTextField txt_Search;
	JRadioButton rd_Uni;
	JRadioButton rd_Celeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerAfterLogin window = new PerAfterLogin();
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
	public PerAfterLogin() {
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

		rd_Uni = new JRadioButton("Uni");
		rd_Uni.setBounds(123, 66, 61, 23);
		panel.add(rd_Uni);

		rd_Celeb = new JRadioButton("Celeb");
		rd_Celeb.setBounds(194, 66, 121, 23);
		panel.add(rd_Celeb);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);

		JButton btn_Booking = new JButton("\uC8FC\uB9C9 \uC608\uC57D");
		btn_Booking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerBookStore.main(null);
			}
		});
		btn_Booking.setBounds(73, 26, 97, 23);
		panel.add(btn_Booking);

		JButton btn_Cancel = new JButton("\uC608\uC57D \uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn_Cancel.isSelected()) {
					JOptionPane.showMessageDialog(null, btn_Cancel.getText(), "SEX", JOptionPane.INFORMATION_MESSAGE);

				}

			}
		});
		btn_Cancel.setBounds(218, 26, 97, 23);
		panel.add(btn_Cancel);

		JLabel lblNewLabel = new JLabel("\uD648\uC73C\uB85C");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				PerResearchPage.main(null);
			}
		});
		lblNewLabel.setBounds(353, 226, 57, 15);
		panel.add(lblNewLabel);
	}
}
