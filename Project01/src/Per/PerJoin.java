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
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class PerJoin { // 개인화면 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_phone;
	private JTextField txt_snum;
	private JPasswordField txt_pw;
	private DAO_PerMember daopm = new DAO_PerMember();
	private JCheckBox ck_unique;
	private JCheckBox ck_unique_1;
	private JLabel lblNewLabel;
	private JLabel lbl_txt_id;
	private JLabel lbl_txt_pw;
	private JLabel lbl_txt_name;
	private JLabel lbl_txt_phone;
	private JLabel lbl_txt_snum;
	private JLabel lbl_home;

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

		lbl_txt_id = new JLabel("\uC544\uC774\uB514\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_id.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_id.setVisible(false);
			}
		});
		lbl_txt_id.setBounds(165, 128, 458, 57);
		panel.add(lbl_txt_id);
		
		lbl_txt_pw = new JLabel("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_pw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_pw.setVisible(false);
			}
		});
		lbl_txt_pw.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_pw.setBounds(165, 234, 458, 57);
		panel.add(lbl_txt_pw);
		
		lbl_txt_name = new JLabel("\uC774\uB984\uC744 \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_name.setVisible(false);
			}
		});
		lbl_txt_name.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_name.setBounds(165, 301, 458, 63);
		panel.add(lbl_txt_name);
		
		lbl_txt_phone = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_phone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_phone.setVisible(false);
			}
		});
		lbl_txt_phone.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_phone.setBounds(165, 382, 451, 56);
		panel.add(lbl_txt_phone);
		
		lbl_txt_snum = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lbl_txt_snum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_snum.setVisible(false);
			}
		});
		lbl_txt_snum.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_snum.setBounds(165, 460, 458, 56);
		panel.add(lbl_txt_snum);
		
		
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_id.setBounds(165, 128, 459, 57);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);
		txt_id.setOpaque(false);

		txt_name = new JTextField();
		txt_name.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_name.setColumns(10);
		txt_name.setBounds(165, 299, 458, 63);
		panel.add(txt_name);
		txt_name.setBorder(null);
		txt_name.setOpaque(false);
		
		txt_phone = new JTextField();
		txt_phone.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_phone.setColumns(10);
		txt_phone.setBounds(165, 380, 458, 57);
		panel.add(txt_phone);
		txt_phone.setBorder(null);
		txt_phone.setOpaque(false);

		txt_snum = new JTextField();
		txt_snum.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_snum.setColumns(10);
		txt_snum.setBounds(165, 458, 458, 56);
		panel.add(txt_snum);
		txt_snum.setBorder(null);
		txt_snum.setOpaque(false);

		txt_pw = new JPasswordField();
		txt_pw.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_pw.setBounds(165, 232, 458, 57);
		panel.add(txt_pw);
		txt_pw.setBorder(null);
		txt_pw.setOpaque(false);
//<<<<<<< HEAD
		ck_unique = new JCheckBox("");
//=======

		ck_unique_1 = new JCheckBox("\uC544\uC774\uB514 \uC911\uBCF5\uD655\uC778");
		ck_unique_1.setBackground(Color.WHITE);
//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
		// action listener....check박스에....달아놓다니....이건...배신이에요...
		// 왜죠,,선생님,,,
		ck_unique_1.setOpaque(false);
		ck_unique_1.addActionListener(new ActionListener() {
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

		ck_unique_1.setBounds(167, 197, 21, 23);
		panel.add(ck_unique_1);

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
		lblComplete.setBounds(165, 545, 458, 34);
		panel.add(lblComplete);
		
		
		
		
		JLabel lblCancel = new JLabel("");
		lblCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);

			}
		});
		lblCancel.setBounds(653, 608, 62, 34);
		panel.add(lblCancel);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.addMouseListener(new MouseAdapter() {
		});
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		


		
		
		
	
		

	}
}
