package RE;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PerLogin02 { // 개인회원 로그인 화면

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;

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
		frame.setBounds(100, 100, 596, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 556, 570);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setText("\uC544\uC774\uB514");
		txt_id.setBounds(135, 55, 116, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 아이디와 비밀번호 입력된 값 가져오기
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				// 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
				DAO_PerMember dao = new DAO_PerMember();

				// 로그인 성공여부 판별
				// 로그인 실패시에는 null
				// 로그인 성공시에는 객체를 가져온다
				PMVO vo = dao.login(id, pw);

				if (vo != null) {
					JOptionPane.showMessageDialog(null, "로그인 성공!! " + vo.getPER_NAME()+"님 환영합니다!", "정보", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					researchPage researchPage = new researchPage();
					researchPage.setPMVO(vo);
					researchPage.frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}

				//frame.dispose();
				//researchPage.main(null);
			}
		});
		btn_login.setBounds(96, 172, 97, 23);
		panel.add(btn_login);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PerJoin.main(null);
			}
		});
		btn_join.setBounds(222, 172, 97, 23);
		panel.add(btn_join);

		txt_pw = new JPasswordField();
		txt_pw.setToolTipText("pw");
		txt_pw.setHorizontalAlignment(SwingConstants.LEFT);
		txt_pw.setBounds(135, 104, 116, 21);
		panel.add(txt_pw);

	}
}
