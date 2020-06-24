package Per;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import RE.DAO_PerMember;
import RE.DBmethod;
import RE.Main01;
import RE.PMVO;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.Font;

public class PerLogin02 { // 개인회원 로그인 화면

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	static PMVO vo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerLogin02 window = new PerLogin02();
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
	public PerLogin02() {
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

		URL url = this.getClass().getResource("../image/PerLogin02.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_txt_id = new JLabel("\uC544\uC774\uB514\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_id.setVisible(false);
			}
		});
		lbl_txt_id.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_id.setBounds(192, 239, 413, 54);
		panel.add(lbl_txt_id);
		
		JLabel lbl_txt_pw = new JLabel("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_pw.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_pw.setVisible(false);
			}
		});
		lbl_txt_pw.setBounds(192, 316, 403, 48);
		panel.add(lbl_txt_pw);
		

		txt_id = new JTextField();
		txt_id.setHorizontalAlignment(SwingConstants.LEFT);
		txt_id.setBounds(190, 239, 413, 56);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);
		txt_id.setOpaque(false);

		txt_pw = new JPasswordField();
		txt_pw.setToolTipText("pw");
		txt_pw.setHorizontalAlignment(SwingConstants.LEFT);
		txt_pw.setBounds(191, 308, 417, 56);
		panel.add(txt_pw);
		txt_pw.setBorder(null);
		txt_pw.setOpaque(false);
		
		
		
		JLabel lblLogin = new JLabel("");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// 아이디와 비밀번호 입력된 값 가져오기
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				// 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
				DAO_PerMember dao = new DAO_PerMember();

				// 로그인 성공여부 판별
				// 로그인 실패시에는 null
				// 로그인 성공시에는 객체를 가져온다
				vo = dao.login(id, pw);

				if (vo != null) {
					JOptionPane.showMessageDialog(null, "로그인 성공!! " + vo.getPER_NAME() + "님 환영합니다!", "정보",
							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					PerAfterLogin PerAfterLogin = new PerAfterLogin();
					PerAfterLogin.setPMVO(vo);
					PerAfterLogin.frame.setVisible(true);
					// PerResearchPage.main(null);
//					researchPage.setPMVO(vo);
//					researchPage.frame.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}

//				 frame.dispose();
//				 perresearchPage.main(null);

			}
		});
		lblLogin.setBounds(185, 385, 418, 40);
		panel.add(lblLogin);

		JLabel lbl_join = new JLabel("");
		lbl_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PerJoin.main(null);

			}
		});
		lbl_join.setBounds(483, 442, 110, 32);
		panel.add(lbl_join);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(72, 543, 57, 54);
		panel.add(lbl_home);
		
		JLabel lbl_return = new JLabel("");
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_return.setBounds(659, 543, 57, 54);
		panel.add(lbl_return);
		


	}
}
