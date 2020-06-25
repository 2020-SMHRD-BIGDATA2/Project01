package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import RE.DAO_Manager;
import RE.DAO_PerMember;
import RE.DAO_Show;
import RE.Main01;
import RE.PMVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

public class PerAfterLogin { // 개인회원 로그인 후 검색화면(필요없는 화면)

	public JFrame frame;
	private JTextField txt_Search;
	JRadioButton rd_Uni;
	JRadioButton rd_Celeb;
	private PMVO vo;
	private JLabel lbl_return;
	static String uni_name;
	static String celeb_name;

	/**
	 * Launch the application.
	 */
	public void setPMVO(PMVO vo) {
		this.vo = vo;
		// lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
	}

	/**
	 * Create the application.
	 */
	public PerAfterLogin() {
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

		URL url = this.getClass().getResource("../image/PerAfterLogin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_Search = new JTextField();
		txt_Search.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_Search.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Search.setBounds(201, 362, 331, 50);
		panel.add(txt_Search);
		txt_Search.setColumns(10);

		txt_Search.setBorder(null);
		txt_Search.setOpaque(false);

		rd_Uni = new JRadioButton("");
		rd_Uni.setBackground(Color.WHITE);
		rd_Uni.setBounds(221, 282, 21, 23);
		panel.add(rd_Uni);

		rd_Celeb = new JRadioButton("");
		rd_Celeb.setBackground(Color.WHITE);
		rd_Celeb.setBounds(436, 282, 21, 23);
		panel.add(rd_Celeb);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);

		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				Main01.main(null);
			}
		});
		lblHome.setBounds(69, 526, 68, 75);
		panel.add(lblHome);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));

		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);

		JLabel lbl_Search_enter = new JLabel("New label");
		lbl_Search_enter.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				boolean rd_uni = rd_Uni.isSelected();
				boolean rd_celeb = rd_Celeb.isSelected();

				if (rd_uni) {
					uni_name = txt_Search.getText();
					DAO_Manager dao = new DAO_Manager();
					ArrayList<String> list = dao.getUni_name(uni_name);

					frame.dispose();
					PerResearchPage PerResearchPage = new PerResearchPage();
					PerResearchPage.setList(list);
					PerResearchPage.frame.setVisible(true);
				}
				if (rd_celeb) {
					celeb_name = txt_Search.getText();
					// DAO_Manager dao = new DAO_Manager();
					// ArrayList<DAO_Show> list2 = dao.getCeleb_name(celeb_name);

					frame.dispose();
					
					celeb celeb = new celeb(celeb_name);
					celeb.setText(celeb_name);
					celeb.frame.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "검색 분야를 선택해주세요!");
				}

			}
		});

		JLabel lbl_image1 = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));

		lbl_Search_enter.setBounds(534, 362, 51, 50);
		panel.add(lbl_Search_enter);

		lbl_return = new JLabel("");
		lbl_return.setBounds(659, 545, 57, 56);
		panel.add(lbl_return);

		lbl_image1.setBounds(12, 10, 760, 666);
		panel.add(lbl_image1);

	}
}