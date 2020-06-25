package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.DAO_Store;

import RE.Main01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;

public class GroupStoreEnroll02 { // 주막 등록 화면

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_location;
	private JTextField txt_Menu1;
	private JTextField txt_Price1;
	private JTextField txt_Menu2;
	private JTextField txt_Price2;
	private JTextField txt_Menu3;
	private JButton btn_Complete;
	private JButton btn_Cancel;
	private JLabel lbl_image;
	private JLabel lbl_txt_name;
	private JLabel lbl_txt_location;
	private JLabel lbl_txt_Menu1;
	private JLabel lbl_txt_Menu2;
	private JLabel lbl_txt_Menu3;
	private JLabel lbl_txt_Price1;
	private JLabel lbl_txt_Price2;
	private JLabel lbl_txt_Price3;
	private JLabel lbl_home;
	private DAO_Store daostore = new DAO_Store();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupStoreEnroll02 window = new GroupStoreEnroll02();
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
	public GroupStoreEnroll02() {
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

		URL url = this.getClass().getResource("../image/GroupStroeEnroll_0.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		/*
		 * 이미지경로
		 */
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lbl_txt_name = new JLabel("\uC8FC\uB9C9 \uC774\uB984");
		lbl_txt_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_name.setVisible(false);
			}
		});
		lbl_txt_name.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_name.setBounds(210, 141, 154, 38);
		panel.add(lbl_txt_name);

		lbl_txt_location = new JLabel("\uC8FC\uB9C9 \uC704\uCE58");
		lbl_txt_location.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_location.setVisible(false);
			}
		});
		lbl_txt_location.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_location.setBounds(212, 200, 154, 36);
		panel.add(lbl_txt_location);

		lbl_txt_Menu1 = new JLabel("\uBA54\uB274 1");
		lbl_txt_Menu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Menu1.setVisible(false);
			}
		});
		lbl_txt_Menu1.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Menu1.setBounds(214, 387, 154, 38);
		panel.add(lbl_txt_Menu1);

		lbl_txt_Menu2 = new JLabel("\uBA54\uB274 2");
		lbl_txt_Menu2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Menu2.setVisible(false);
			}
		});
		lbl_txt_Menu2.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Menu2.setBounds(212, 443, 154, 38);
		panel.add(lbl_txt_Menu2);

		lbl_txt_Menu3 = new JLabel("\uBA54\uB274 3");
		lbl_txt_Menu3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Menu3.setVisible(false);
			}
		});
		lbl_txt_Menu3.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Menu3.setBounds(212, 499, 154, 38);
		panel.add(lbl_txt_Menu3);

		lbl_txt_Price1 = new JLabel("\uAE08\uC561 \uC785\uB825");
		lbl_txt_Price1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Price1.setVisible(false);
			}
		});
		lbl_txt_Price1.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Price1.setBounds(426, 387, 149, 38);
		panel.add(lbl_txt_Price1);

		lbl_txt_Price2 = new JLabel("\uAE08\uC561 \uC785\uB825");
		lbl_txt_Price2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Price2.setVisible(false);
			}
		});
		lbl_txt_Price2.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Price2.setBounds(425, 443, 154, 38);
		panel.add(lbl_txt_Price2);

		lbl_txt_Price3 = new JLabel("\uAE08\uC561 \uC785\uB825");
		lbl_txt_Price3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_txt_Price3.setVisible(false);
			}
		});
		lbl_txt_Price3.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_txt_Price3.setBounds(426, 499, 153, 38);
		panel.add(lbl_txt_Price3);

		txt_name = new JTextField();
		txt_name.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_name.setBounds(210, 141, 154, 38);
		panel.add(txt_name);
		txt_name.setColumns(10);
		txt_name.setBorder(null);
		txt_name.setOpaque(false);

		txt_location = new JTextField();
		txt_location.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_location.setBounds(211, 200, 153, 36);
		txt_location.setColumns(10);
		panel.add(txt_location);
		txt_location.setBorder(null);
		txt_location.setOpaque(false);

		txt_Menu1 = new JTextField();
		txt_Menu1.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Menu1.setBounds(212, 387, 154, 38);
		panel.add(txt_Menu1);
		txt_Menu1.setColumns(10);
		txt_Menu1.setBorder(null);
		txt_Menu1.setOpaque(false);

		txt_Price1 = new JTextField();
		txt_Price1.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Price1.setBounds(426, 387, 149, 38);
		panel.add(txt_Price1);
		txt_Price1.setColumns(10);
		txt_Price1.setBorder(null);
		txt_Price1.setOpaque(false);

		txt_Menu2 = new JTextField();
		txt_Menu2.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Menu2.setBounds(212, 443, 154, 38);
		txt_Menu2.setColumns(10);
		panel.add(txt_Menu2);
		txt_Menu2.setBorder(null);
		txt_Menu2.setOpaque(false);

		txt_Price2 = new JTextField();
		txt_Price2.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Price2.setBounds(426, 443, 149, 38);
		txt_Price2.setColumns(10);
		panel.add(txt_Price2);
		txt_Price2.setBorder(null);
		txt_Price2.setOpaque(false);

		txt_Menu3 = new JTextField();
		txt_Menu3.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Menu3.setBounds(212, 499, 153, 38);
		txt_Menu3.setColumns(10);
		panel.add(txt_Menu3);
		txt_Menu3.setBorder(null);
		txt_Menu3.setOpaque(false);

		JTextField txt_Price3 = new JTextField();
		txt_Price3.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_Price3.setBounds(426, 499, 153, 38);
		txt_Price3.setColumns(10);
		panel.add(txt_Price3);
		txt_Price3.setBorder(null);
		txt_Price3.setOpaque(false);

		JComboBox cmb_date = new JComboBox();
		cmb_date.setModel(new DefaultComboBoxModel(new String[] { "2020-06-25", "2020-06-26", "2020-06-27" }));
		cmb_date.setBounds(210, 336, 189, 30);
		panel.add(cmb_date);

		JComboBox cmb_time = new JComboBox();
		cmb_time.setModel(new DefaultComboBoxModel(new String[] { "18:00", "19:00", "20:00" }));
		cmb_time.setBounds(431, 336, 192, 30);
		panel.add(cmb_time);

		JComboBox cmb_Seats = new JComboBox();
		cmb_Seats.setModel(new DefaultComboBoxModel(new String[] { "5", "10", "15", "20" }));
		cmb_Seats.setBounds(210, 277, 192, 30);
		panel.add(cmb_Seats);

		btn_Complete = new JButton("");
		btn_Complete.setBounds(437, 141, 120, 38);
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String store_name = txt_name.getText();
				String store_location = txt_location.getText();
				int store_tableN = Integer.parseInt((String) cmb_Seats.getSelectedItem());
				String date = (String) cmb_date.getSelectedItem();
				String time = (String) cmb_time.getSelectedItem();
				String menu_name = txt_Menu1.getText();
				int menu_price = Integer.parseInt(txt_Price1.getText()); // 금액을 int로 바꿔올 수 있나? 해결해주세요,,

				int cnt = daostore.insertStore(store_name, store_location, store_tableN, date, time, menu_name,
						menu_price);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "주막이 등록되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "주막 등록이 실패되었습니다.");
				}

				frame.dispose();
				GroupAfterLogin02 ga = new GroupAfterLogin02(); // main이 없으니까 생성자로 불러오는 것
				ga.frame.setVisible(true);

			}
		});
		panel.add(btn_Complete);
		btn_Complete.setBorder(null);
		btn_Complete.setOpaque(false);
		btn_Complete.setContentAreaFilled(false);

		btn_Cancel = new JButton("");
		btn_Cancel.setBounds(437, 200, 120, 36);
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n = JOptionPane.showConfirmDialog(null, "등록을 취소하시겠습니까", "확인", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "취소되었습니다.");
					frame.dispose();

					GroupAfterLogin02 ga = new GroupAfterLogin02();
					ga.frame.setVisible(true);

				}

			}
		});
		panel.add(btn_Cancel);
		btn_Cancel.setBorder(null);
		btn_Cancel.setOpaque(false);
		btn_Cancel.setContentAreaFilled(false);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 772, 676);
		panel.add(lbl_image);

		lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(68, 535, 57, 59);
		panel.add(lbl_home);

		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				GroupAfterLogin02 GroupAfterLogin02 = new GroupAfterLogin02();
				GroupAfterLogin02.frame.setVisible(true);

			}
		});
		lblBack.setBounds(652, 535, 57, 59);
		panel.add(lblBack);

	}
}
