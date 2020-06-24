package Per;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import RE.DAO_PerMember;
import RE.Main01;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class PerJoin { // 개인화면 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_snum;
	private JPasswordField txt_pw;
	private DAO_PerMember daopm = new DAO_PerMember();
	private JCheckBox ck_unique;

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
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		URL url = this.getClass().getResource("../image/PerJoin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setText("ID");
		txt_id.setBounds(207, 109, 417, 56);
		panel.add(txt_id);
		txt_id.setColumns(10);

		txt_name = new JTextField();
		txt_name.setText("\uC774\uB984");
		txt_name.setColumns(10);
		txt_name.setBounds(207, 301, 419, 55);
		panel.add(txt_name);

		txt_phone = new JTextField();
		txt_phone.setText("\uD578\uB4DC\uD3F0\uBC88\uD638");
		txt_phone.setColumns(10);
		txt_phone.setBounds(207, 380, 418, 57);
		panel.add(txt_phone);

		txt_snum = new JTextField();
		txt_snum.setText("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		txt_snum.setColumns(10);
		txt_snum.setBounds(207, 460, 417, 56);
		panel.add(txt_snum);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(207, 220, 417, 56);
		panel.add(txt_pw);

//<<<<<<< HEAD
		ck_unique = new JCheckBox("");
//=======

		ck_unique = new JCheckBox("\uC544\uC774\uB514 \uC911\uBCF5\uD655\uC778");
//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
		// action listener....check박스에....달아놓다니....이건...배신이에요...
		// 왜죠,,선생님,,,
		ck_unique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 아이디중복확인
				if (ck_unique.isSelected()) {
					// 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
					boolean isCheck = daopm.idCheck(txt_id.getText()); // 개인
//					boolean isCheck2 = daopm.idCheck2(txt_id.getText()); // 단체
					if (isCheck) {
						JOptionPane.showMessageDialog(null, "중복되는 아이디가 존재합니다.");
						ck_unique.setSelected(false);
					} else {
						JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
					}
				}

			}

		});

		ck_unique.setBounds(204, 179, 21, 23);
		panel.add(ck_unique);

		JLabel lblComplete = new JLabel("");
		lblComplete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				String phone = txt_phone.getText();
				String SecurityNum = txt_snum.getText();

				System.out.println(id + pw + name + phone + SecurityNum);

				if (ck_unique.isSelected()) {
					int cnt = daopm.insert(id, pw, name, phone, SecurityNum);
					System.out.println(cnt);
					if (cnt > 0) {
						System.out.println("a");
						frame.dispose();
						PerLogin02.main(null);

					}
				} else {
					JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요");
				}

			}
		});
		lblComplete.setBounds(209, 553, 185, 34);
		panel.add(lblComplete);

		JLabel lblCancel = new JLabel("");
		lblCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);

			}
		});
		lblCancel.setBounds(411, 552, 185, 34);
		panel.add(lblCancel);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.addMouseListener(new MouseAdapter() {
		});
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
	}
}
