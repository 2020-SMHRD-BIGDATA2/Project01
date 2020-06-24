package Group;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
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
import java.awt.event.ActionEvent;

public class GroupLogin01 { // 관리자 로그인 화면

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	private DAO_Manager daomgr;
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 241);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setText("id");
		txt_id.setBounds(129, 57, 116, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(129, 109, 116, 21);
		panel.add(txt_pw);
		
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
		
		JButton btn_join = new JButton("\uCDE8\uC18C");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main01.main(null);
				
			}
		});
		btn_join.setBounds(210, 169, 116, 23);
		panel.add(btn_join);
	}

}
