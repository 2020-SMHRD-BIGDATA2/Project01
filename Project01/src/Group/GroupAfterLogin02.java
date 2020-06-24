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

import RE.MMVO;
import RE.Main01;
import RE.PMVO;

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

	public JFrame frame;
	private JTextField text_Search;
	private JRadioButton rd_Uni;
	private JRadioButton rd_Celeb;
	MMVO vo;
	JLabel lbl_image ;
	private JLabel lbl_txt_Search;
	private JLabel lbl_home;
	private JLabel lbl_return;

	public void setMMVO(MMVO vo) {
		this.vo = vo;
		//lbl_info2.setText(vo.getUniName() + "-" + vo.getMajorName() + "님 환영합니다.");

	}

	public GroupAfterLogin02() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/*
		 * 이미지경로
		 */

		URL url = this.getClass().getResource("../image/GroupAfterLogin_0.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		

		// panel.add(lbl_image);

		/*
		 * */

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lbl_txt_Search = new JLabel("\uAC80\uC0C9\uC5B4\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694");
		lbl_txt_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Search.setVisible(false);
			}
		});
		lbl_txt_Search.setBounds(261, 366, 282, 46);
		panel.add(lbl_txt_Search);
		
		
		JLabel lbl_Enroll = new JLabel("");
		lbl_Enroll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				GroupStoreEnroll02.main(null);
			}
		});
		lbl_Enroll.setBounds(144, 161, 110, 40);
		panel.add(lbl_Enroll);

		JLabel lbl_Modified = new JLabel("");
		lbl_Modified.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				GroupStoreModi03.main(null);
			}
		});
		lbl_Modified.setBounds(341, 161, 110, 40);
		panel.add(lbl_Modified);

		JLabel lbl_Delete = new JLabel("");
		lbl_Delete.setBounds(542, 161, 110, 40);
		panel.add(lbl_Delete);

		text_Search = new JTextField();
		text_Search.setFont(new Font("굴림", Font.PLAIN, 20));
		text_Search.setBounds(257, 366, 286, 46);
		panel.add(text_Search);
		text_Search.setColumns(10);
		text_Search.setBorder(null);

		JLabel lbl_Search = new JLabel("");
		lbl_Search.setBounds(322, 444, 144, 40);
		panel.add(lbl_Search);

		rd_Uni = new JRadioButton("");
		rd_Uni.setBounds(243, 285, 21, 21);
		panel.add(rd_Uni);

		Color bg = new Color(27, 38, 44);
		rd_Uni.setBackground(Color.WHITE);

		rd_Celeb = new JRadioButton("");
		rd_Celeb.setBounds(465, 285, 21, 21);
		panel.add(rd_Celeb);

		rd_Celeb.setBackground(Color.WHITE);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);
		
		lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(74, 535, 57, 66);
		panel.add(lbl_home);
		
		lbl_return = new JLabel("");
		lbl_return.setBounds(652, 546, 57, 55);
		panel.add(lbl_return);
		


	}
}
