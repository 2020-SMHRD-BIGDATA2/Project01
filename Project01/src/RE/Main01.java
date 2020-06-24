package RE;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Group.GroupJoin;
import Group.GroupLogin01;
import Per.PerJoin;
import Per.PerLogin02;

import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main01 { // 김축제 메인 화면(시작화면)

	private JFrame frame;
	private JTextField txt_serch;
	private FontMake fm = new FontMake();
	private JRadioButton rd_Per;
	private JRadioButton rd_Group;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main01 window = new Main01();
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
	public Main01() {
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

		String path = "C:\\Users\\SMHRD\\git\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\src\\image\\Main.png";
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.fontChange(ge);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_serch = new JTextField();
		txt_serch.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		txt_serch.setBounds(412, 213, 226, 61);
		panel.add(txt_serch);
		txt_serch.setColumns(10);

		JRadioButton rd_Group = new JRadioButton("");
		rd_Group.setBounds(562, 154, 22, 23);
		panel.add(rd_Group);

		// 라디오 버튼 둘중 하나만 선택 할 수 있도록 버튼을 그룹화
		ButtonGroup group = new ButtonGroup();
		group.add(rd_Group);

		JLabel lblLogin = new JLabel("New label");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (rd_Per.isSelected()) {
					frame.dispose();
					PerLogin02.main(null);
				} else {
					frame.dispose();
					GroupLogin01.main(null);
				}

			}
		});
		lblLogin.setBounds(598, 14, 141, 37);
		panel.add(lblLogin);

		JLabel lblJoin = new JLabel("New label");
		lblJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (rd_Per.isSelected()) {
					frame.dispose();
					PerJoin.main(null);
				} else {
					frame.dispose();
					GroupJoin.main(null);
				}

			}
		});
		lblJoin.setBounds(596, 63, 143, 37);
		panel.add(lblJoin);

		rd_Per = new JRadioButton("");
		rd_Per.setBounds(431, 151, 21, 23);
		panel.add(rd_Per);
		rd_Per.setSelected(true);
		group.add(rd_Per);

	}
}
