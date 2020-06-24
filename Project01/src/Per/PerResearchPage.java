package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import RE.Main01;
import oracle.net.aso.e;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class PerResearchPage { // 축제 정보 나오는 화면 (포스터, 일정, 라인업, 주막리스트, 택시풀)

	private JFrame frame;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton btn_Enroll;
	private JTextField txt_SearchCarpool;
	private JButton btn_SearchCarpool;
	private JPanel panel_7;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txt_uni;
	private JLabel lbl_line;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerResearchPage window = new PerResearchPage();
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
	public PerResearchPage() {
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

//      URL url = this.getClass().getResource("../image/PerSearch.png");
//      String path = url.getPath();
//
//      Image image = new ImageIcon(path).getImage();
//
//      JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
//      lbl_image.setBounds(12, 10, 760, 666);
//      frame.getContentPane().add(lbl_image);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBounds(17, 124, 742, 527);
		panel.add(panel_1);
		panel_1.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 730, 461);
		panel_1.add(tabbedPane);

		panel_3 = new JPanel();
		tabbedPane.addTab("\uCD95\uC81C\uC815\uBCF4", null, panel_3, null);
		panel_3.setLayout(null);

		panel_5 = new JPanel();
		tabbedPane.addTab("주막리스트", null, panel_5, null);

		JButton btn_reserve = new JButton("\uC8FC\uB9C9\uC608\uC57D");
		btn_reserve.setBounds(612, 11, 97, 23);
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PerBookStore.main(null);
			}
		});
		panel_5.setLayout(null);
		panel_5.add(btn_reserve);

		JLabel lbl_post = new JLabel();
		lbl_post.setBounds(57, 55, 287, 329);
		panel_3.add(lbl_post);

		lbl_line = new JLabel();
		lbl_line.setBounds(356, 55, 287, 329);
		panel_3.add(lbl_line);

		String colName[] = { "번호", "대학이름", "학과", "주막이름" };
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		JTable table = new JTable(model);

		JScrollPane scrollPane_1 = new JScrollPane(table); // ScrollPane에 table 삽입 잊지말기!
		scrollPane_1.setBounds(12, 42, 697, 380);

		JFrame frame = new JFrame("Table Test");
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setLocation(500, 400);

		panel_5.add(scrollPane_1);
		add(scrollPane_1);

		panel_6 = new JPanel();
		tabbedPane.addTab("\uAC8C\uC2DC\uD310", null, panel_6, null);
		panel_6.setLayout(null);

		btn_Enroll = new JButton("\uAC8C\uC2DC\uAE00 \uB4F1\uB85D");
		btn_Enroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn_Enroll.setBounds(599, 13, 97, 23);
		panel_6.add(btn_Enroll);

		txt_SearchCarpool = new JTextField();
		txt_SearchCarpool.setBounds(33, 11, 270, 21);
		panel_6.add(txt_SearchCarpool);
		txt_SearchCarpool.setColumns(10);

		btn_SearchCarpool = new JButton("\uAC80\uC0C9");
		btn_SearchCarpool.setBounds(315, 10, 97, 23);
		panel_6.add(btn_SearchCarpool);

		panel_7 = new JPanel();
		panel_7.setBounds(33, 58, 661, 364);
		panel_6.add(panel_7);
		panel_7.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(3, 3, 654, 357);
		panel_7.add(scrollPane);

		JLabel lbl_delete = new JLabel("");
		lbl_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				PerDelAccount05.main(null);

			}
		});
		lbl_delete.setBounds(508, 20, 95, 27);
		panel_1.add(lbl_delete);

		JLabel lbl_logout = new JLabel("");
		lbl_logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Main01.main(null);
			}
		});
		lbl_logout.setBounds(630, 19, 92, 26);
		panel_1.add(lbl_logout);

//      String text = (String) comboBox.getSelectedItem();

		txt_uni = new JTextField();
		// txt_uni.setBounds(542, 10, 81, 21);
		// panel_3.add(txt_uni);
		// txt_uni.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(17, 10, 135, 39);
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String text = (String) comboBox.getSelectedItem();
				// 콤보박스 선택한 글자 가져오는 코드
				if (text.equals("고려대")) {

					text = (String) comboBox.getSelectedItem();
					txt_uni = new JTextField(text + "학교 축제 정보입니다.");
					txt_uni.setBounds(220, 10, 300, 30);
					panel_3.add(txt_uni);
					txt_uni.setColumns(10);

					URL url_post = this.getClass().getResource("../univ_image/ko.jpg");
					String path_post = url_post.getPath();
					Image image_post = new ImageIcon(path_post).getImage();
					lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));

					URL url_line = this.getClass().getResource("../univ_image/ko_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));

				} else if (text.equals("한양대")) {

					text = (String) comboBox.getSelectedItem();
					txt_uni = new JTextField(text + "학교 축제 정보입니다.");
					txt_uni.setBounds(220, 10, 300, 30);
					panel_3.add(txt_uni);
					txt_uni.setColumns(10);

					URL url_post = this.getClass().getResource("../univ_image/han.jpg");
					String path_post = url_post.getPath();
					Image image_post = new ImageIcon(path_post).getImage();
					lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));

					URL url_line = this.getClass().getResource("../univ_image/han_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));

				} else if (text.equals("서강대")) {

					text = (String) comboBox.getSelectedItem();
					txt_uni = new JTextField(text + "학교 축제 정보입니다.");
					txt_uni.setBounds(220, 10, 300, 30);
					panel_3.add(txt_uni);
					txt_uni.setColumns(10);

					URL url_post = this.getClass().getResource("../univ_image/seo.jpg");
					String path_post = url_post.getPath();
					Image image_post = new ImageIcon(path_post).getImage();
					lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));

					URL url_line = this.getClass().getResource("../univ_image/seo_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
//                     lbl_line.setBounds(12, 10, 760, 666);
//                      frame.getContentPane().add(lbl_line);

				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));

	}

	private void add(JScrollPane scrollPane_1) {
		// TODO Auto-generated method stub

	}
}