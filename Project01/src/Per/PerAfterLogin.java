package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import java.net.URL;

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
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		URL url = this.getClass().getResource("../image/PerAfterLogin12.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_Search = new JTextField();
		txt_Search.setText("Search");
		txt_Search.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Search.setBounds(249, 371, 227, 63);
		panel.add(txt_Search);
		txt_Search.setColumns(10);

		rd_Uni = new JRadioButton("");
		rd_Uni.setBounds(216, 302, 21, 23);
		panel.add(rd_Uni);

		rd_Celeb = new JRadioButton("");
		rd_Celeb.setBounds(413, 302, 21, 23);
		panel.add(rd_Celeb);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);

		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
//				PerResearchPage.main(null);
			}
		});
		lblHome.setBounds(619, 499, 68, 75);
		panel.add(lblHome);

		JLabel lblBooking = new JLabel("New label");
		lblBooking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				PerBookStore.main(null);
			}
		});
		lblBooking.setBounds(198, 219, 170, 37);
		panel.add(lblBooking);

		JLabel lblCancel = new JLabel("New label");
		lblCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {



			}
		});
		lblCancel.setBounds(398, 219, 170, 37);
		panel.add(lblCancel);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.setBounds(475, 371, 51, 63);
		panel.add(lblSearch);
	}
}
