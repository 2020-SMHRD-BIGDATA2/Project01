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
	MMVO vo;
	JLabel lbl_image;
	private JLabel lbl_home;
	private JLabel lbl_return;

	public void setMMVO(MMVO vo) {
		this.vo = vo;
		// lbl_info2.setText(vo.getUniName() + "-" + vo.getMajorName() + "님 환영합니다.");

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

		URL url = this.getClass().getResource("../image/GroupAfterLoginFinal_01.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

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
		lbl_Enroll.setBounds(121, 330, 267, 113);
		panel.add(lbl_Enroll);

		Color bg = new Color(27, 38, 44);

		ButtonGroup group = new ButtonGroup();

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
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_return.setBounds(664, 546, 45, 55);
		panel.add(lbl_return);

	}
}
