package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import RE.DAO_Manager;
import RE.DAO_PerMember;
import RE.MMVO;
import RE.Main01;
import RE.PMVO;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.event.AncestorListener;

import Per.PerJoin;
import Per.PerResearchPage;

import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GroupLogin01 { // 관리자 로그인 화면

	public JFrame frame;
	private JTextField txt_id;
	private JPasswordField passwordField;
	static MMVO vo;
	JLabel lbl_image;
	private JLabel lbl_join;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupLogin01 window = new GroupLogin01();
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
	public GroupLogin01() {
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

		URL url = this.getClass().getResource("../image/GroupLogin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_id.setBounds(181, 229, 413, 52);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
		passwordField.setBounds(181, 303, 413, 52);
		panel.add(passwordField);
		passwordField.setBorder(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(194, 376, 400, 52);
		panel.add(lblNewLabel);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = passwordField.getText();
				
	
				DAO_Manager daomgr = new DAO_Manager();
				vo = daomgr.login(id, pw);

				if (vo != null) {
					JOptionPane.showMessageDialog(null,
							"로그인 성공!! " + vo.getUniName() + "-" + vo.getMajorName() + "님 환영합니다!", "정보",
							JOptionPane.INFORMATION_MESSAGE);
					GroupAfterLogin02 grouagterlogin = new GroupAfterLogin02();
					frame.dispose();
					grouagterlogin.setMMVO(vo);
					grouagterlogin.frame.setVisible(true);

//					researchPage.setPMVO(vo);
//					researchPage.frame.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}

				// 로그인 성공여부 판별
				// 로그인 실패시에는 null
				// 로그인 성공시에는 객체를 가져온다
				// MMVO vo = daomgr.login(id, pw);

				if (daomgr != null) {
//					JOptionPane.showMessageDialog(null, "로그인 성공!! " + daomgr.getPER_major() + "님 환영합니다!", "정보",
//							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();

					// GroupAfterLogin01.setPMVO(vo);
					// researchPage.frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		btn_login.setBounds(333, 376, 116, 23);
		panel.add(btn_login);
		
		lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				GroupJoin.main(null);

			}
		});
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		lbl_join = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lbl_join.setBounds(463, 438, 132, 42);
		panel.add(lbl_join);
		// panel.add(lbl_image);
	}
}
