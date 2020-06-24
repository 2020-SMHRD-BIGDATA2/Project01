package Group;

import java.awt.Color;
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

import RE.Main01;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GroupAfterLogin02 { // 관리자가 로그인시 보이는 화면

	private JFrame frame;
	private JTextField text_Search;
	private JRadioButton rd_Uni;
	private JRadioButton rd_Celeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupAfterLogin02 window = new GroupAfterLogin02();
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
	public GroupAfterLogin02() {
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

		/*
		 * 이미지경로
		 */

		
		
		
		URL url = this.getClass().getResource("../image/GroupAfterLogin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);
		
		// panel.add(lbl_image);

		/*
		 * */

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Enroll = new JLabel("");
		lbl_Enroll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				GroupStoreEnroll02.main(null);
			}
		});
		lbl_Enroll.setBounds(139, 149, 110, 40);
		panel.add(lbl_Enroll);
		
		JLabel lbl_Modified = new JLabel("");
		lbl_Modified.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				GroupStoreModi03.main(null);
			}
		});
		lbl_Modified.setBounds(333, 149, 110, 40);
		panel.add(lbl_Modified);
		
		JLabel lbl_Delete = new JLabel("");
		lbl_Delete.setBounds(531, 149, 110, 40);
		panel.add(lbl_Delete);
		
		text_Search = new JTextField();
		text_Search.setFont(new Font("굴림", Font.PLAIN, 20));
		text_Search.setBounds(245, 357, 286, 46);
		panel.add(text_Search);
		text_Search.setColumns(10);
		text_Search.setBorder(null);
		
		
		JLabel lbl_Search = new JLabel("New label");
		lbl_Search.setBounds(315, 434, 144, 40);
		panel.add(lbl_Search);
		
		rd_Uni = new JRadioButton("");
		rd_Uni.setBounds(200, 274, 21, 21);
		panel.add(rd_Uni);
		
		Color bg = new Color(27,38,44);
		rd_Uni.setBackground(bg);
		
		
		rd_Celeb = new JRadioButton("");
		rd_Celeb.setBounds(420, 274, 21, 21);
		panel.add(rd_Celeb);
		
		rd_Celeb.setBackground(bg);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);
		
	}
}
