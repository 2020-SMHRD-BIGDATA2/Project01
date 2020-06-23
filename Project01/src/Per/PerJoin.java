package Per;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import RE.DAO_PerMember;
import RE.Main01;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class PerJoin { // 개인화면 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_snum;
	private JPasswordField txt_pw;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblIdNo;
	private JButton btn_Cancel;
	private JButton btn_Complete;
	private DAO_PerMember daopm = new DAO_PerMember();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerJoin window = new PerJoin();
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
	public PerJoin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 857, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uAE40\uCD95\uC81C \uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel.setBounds(337, 90, 200, 41);
		panel.add(lblNewLabel);

		txt_id = new JTextField();
		txt_id.setBounds(337, 154, 200, 40);
		panel.add(txt_id);
		txt_id.setColumns(10);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(337, 254, 200, 40);
		panel.add(txt_name);

		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(337, 305, 200, 40);
		panel.add(txt_phone);

		txt_snum = new JTextField();
		txt_snum.setColumns(10);
		txt_snum.setBounds(337, 355, 200, 40);
		panel.add(txt_snum);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		btn_Cancel.setBounds(449, 430, 84, 41);
		panel.add(btn_Cancel);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(337, 204, 200, 42);
		panel.add(txt_pw);

		lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("굴림", Font.PLAIN, 17));
		lblId.setBounds(241, 152, 84, 41);
		panel.add(lblId);

		lblPw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("굴림", Font.PLAIN, 17));
		lblPw.setBounds(241, 205, 84, 41);
		panel.add(lblPw);

		lblName = new JLabel("\uC774\uB984");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("굴림", Font.PLAIN, 17));
		lblName.setBounds(241, 254, 84, 41);
		panel.add(lblName);

		lblPhone = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setFont(new Font("굴림", Font.PLAIN, 17));
		lblPhone.setBounds(241, 305, 84, 41);
		panel.add(lblPhone);

		lblIdNo = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblIdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdNo.setFont(new Font("굴림", Font.PLAIN, 17));
		lblIdNo.setBounds(204, 355, 121, 41);
		panel.add(lblIdNo);

		btn_Complete = new JButton("\uC644\uB8CC");
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				String phone = txt_phone.getText();
				String SecurityNum = txt_snum.getText();
				System.out.println(id + pw + name + phone + SecurityNum);
				int cnt = daopm.insert(id, pw, name, phone, SecurityNum);
				if (cnt > 0) {
					frame.dispose();
					PerLogin02.main(null);
				}
			}
		});
		btn_Complete.setBounds(348, 430, 70, 41);
		panel.add(btn_Complete);

		JCheckBox ck_uniche = new JCheckBox("New check box");
		// action listener....check박스에....달아놓다니....이건...배신이에요...
		// 왜죠,,선생님,,,
		ck_uniche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ck_uniche.isSelected()) {
					// 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
					boolean isCheck = daopm.idCheck(txt_id.getText()); // 개인
					boolean isCheck2 = daopm.idCheck2(txt_id.getText()); // 단체
					if (isCheck || isCheck2) {
						JOptionPane.showMessageDialog(null, "중복되는 아이디가 존재합니다.");
						ck_uniche.setSelected(false);
					} else {
						JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
					}
				}
			}

		});

		ck_uniche.setBounds(577, 162, 115, 23);
		panel.add(ck_uniche);
	}
}
