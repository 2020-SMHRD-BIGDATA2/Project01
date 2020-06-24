package Group;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Per.PerLogin02;
import RE.DAO_Manager;
import RE.DAO_PerMember;
import RE.Main01;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class GroupJoin { // 관리자 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	private JTextField txt_Uni;
	private JTextField txt_Major;
	private JButton btn_Cancel;
	private DAO_Manager daomgr = new DAO_Manager();
	private JCheckBox ck_unique;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupJoin window = new GroupJoin();
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
	public GroupJoin() {
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
		txt_id.setText("\uC544\uC774\uB514");
		txt_id.setBounds(146, 35, 116, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);

		JButton btn_Complete = new JButton("\uC644\uB8CC");
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String uni = txt_Uni.getText();
				String major = txt_Major.getText();
			//	System.out.println(id + pw + uni+ major);
				if (ck_unique.isSelected()) {
					int cnt = daomgr.insert(id, pw,uni,major);
					if (cnt > 0) {
						frame.dispose();
						PerLogin02.main(null);
					}
				}else {
					JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요");
				}
			}
		});
		btn_Complete.setBounds(119, 208, 97, 23);
		panel.add(btn_Complete);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(146, 73, 116, 21);
		panel.add(txt_pw);

		txt_Uni = new JTextField();
		txt_Uni.setBounds(146, 119, 116, 21);
		panel.add(txt_Uni);
		txt_Uni.setColumns(10);

		txt_Major = new JTextField();
		txt_Major.setBounds(146, 162, 116, 21);
		panel.add(txt_Major);
		txt_Major.setColumns(10);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		btn_Cancel.setBounds(220, 208, 97, 23);
		panel.add(btn_Cancel);
		
		ck_unique = new JCheckBox("\uC911\uBCF5\uCCB4\uD06C");
		ck_unique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ck_unique.isSelected()) {
					// 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
					boolean isCheck = daomgr.idCheck(txt_id.getText()); // 개인
					boolean isCheck2 = daomgr.idCheck2(txt_id.getText()); // 단체
					if (isCheck || isCheck2) {
						JOptionPane.showMessageDialog(null, "중복되는 아이디가 존재합니다.");
						ck_unique.setSelected(false);
					} else {
						JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
					}
				}
				
			}
		});
		ck_unique.setBounds(273, 34, 115, 23);
		panel.add(ck_unique);
	}
}
