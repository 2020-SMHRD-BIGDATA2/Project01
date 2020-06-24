package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
<<<<<<< HEAD
import javax.swing.JLabel;
=======
import javax.swing.JOptionPane;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
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

public class GroupLogin01 { // 관리자 로그인 화면

	private JFrame frame;
	private JTextField txt_id;
<<<<<<< HEAD
	private JPasswordField passwordField;

=======
	private JPasswordField txt_pw;
	private DAO_Manager daomgr;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
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
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_id.setBounds(181, 229, 413, 52);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(181, 376, 413, 36);
		panel.add(lblNewLabel);
		
<<<<<<< HEAD
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(470, 440, 105, 25);
		panel.add(lblNewLabel_1);
=======
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				daomgr = new DAO_Manager();

				// 로그인 성공여부 판별
				// 로그인 실패시에는 null
				// 로그인 성공시에는 객체를 가져온다
				//MMVO vo = daomgr.login(id, pw);
				

				if (daomgr != null) {
//					JOptionPane.showMessageDialog(null, "로그인 성공!! " + daomgr.getPER_major() + "님 환영합니다!", "정보",
//							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();

					//GroupAfterLogin01.setPMVO(vo);
					//researchPage.frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		btn_login.setBounds(79, 169, 116, 23);
		panel.add(btn_login);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
		passwordField.setBounds(181, 303, 413, 52);
		panel.add(passwordField);
		passwordField.setBorder(null);
	}
}
