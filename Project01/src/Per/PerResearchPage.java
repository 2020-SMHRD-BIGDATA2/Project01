package Per;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.DAO_PerMember;
import RE.Main01;
import RE.PMVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
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

	public JFrame frame;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton btn_Enroll;
	private JTextField txt_SearchCarpool;
	private JButton btn_SearchCarpool;
	private JPanel panel_7;
	private PMVO vo;
	private JLabel lbl_info;
	private JScrollPane scrollPane_board;
	private JTable table;
	private JTextField txt_uni;
	private JLabel lbl_line;

	public void setPMVO(PMVO vo) {
		this.vo = PerLogin02.vo;
		lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
	}

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

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBounds(17, 124, 742, 527);
		panel.add(panel_1);
		panel_1.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 730, 493);
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
		JTable table_list = new JTable(new DefaultTableModel(
			new Object[][] {
				{"1", "\uC804\uB0A8\uB300", "\uAE30\uACC4\uACF5\uD559\uACFC", "F=ma"},
			},
			new String[] {
				"\uBC88\uD638", "\uB300\uD559\uC774\uB984", "\uD559\uACFC", "\uC8FC\uB9C9\uC774\uB984"
			}
		));

		JScrollPane scrollPane_list = new JScrollPane(table_list); // ScrollPane에 table 삽입 잊지말기!
		scrollPane_list.setBounds(12, 42, 697, 380);

		JFrame frame = new JFrame("Table Test");
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setLocation(500, 400);

		panel_5.add(scrollPane_list);
		add(scrollPane_list);
//      JScrollPane scrollPane_1 = new JScrollPane();
//      scrollPane_1.setBounds(814, 42, -807, 380);
//      panel_5.add(scrollPane_1);

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

		String colBoard[] = { "번호", "제목", "내용", "날자", "아이디" };
		DefaultTableModel Board = new DefaultTableModel(colBoard, 0);
		JTable table_board = new JTable(new DefaultTableModel(
			new Object[][] {
				{"1", "\uD0DD\uC2DC", "\uC6B4\uC554\uB3D9", "20.06.24", "jhs"},
			},
			new String[] {
				"\uBC88\uD638", "\uC81C\uBAA9", "\uB0B4\uC6A9", "\uB0A0\uC790", "\uC544\uC774\uB514"
			}
		));

//		JScrollPane scrollPane_board = new JScrollPane(table_board); // ScrollPane에 table 삽입 잊지말기!
//		scrollPane_list.setBounds(12, 42, 697, 380);

		scrollPane_board = new JScrollPane(table_board);
		scrollPane_board.setBounds(3, 3, 654, 357);
		panel_7.add(scrollPane_board);
		txt_uni = new JTextField();
		lbl_info = new JLabel("name\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");

		JFrame frame_01 = new JFrame("Table Test");
		frame_01.setPreferredSize(new Dimension(500, 400));
		frame_01.setLocation(500, 400);

		lbl_info.setBounds(437, 10, 288, 39);
		panel.add(lbl_info);

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
					lbl_post.setBounds(380, 50, 300, 400);
					URL url_line = this.getClass().getResource("../univ_image/ko_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
					lbl_line.setBounds(50, 50, 300, 400);
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
					lbl_post.setBounds(380, 50, 300, 400);
					URL url_line = this.getClass().getResource("../univ_image/han_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
					lbl_line.setBounds(50, 50, 300, 400);
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
					lbl_post.setBounds(380, 50, 300, 400);

					URL url_line = this.getClass().getResource("../univ_image/seo_line.png");
					String path_line = url_line.getPath();
					Image image_line = new ImageIcon(path_line).getImage();
					lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
					lbl_line.setBounds(50, 50, 300, 400);

				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));
		// JScrollPane scrollPane = new JScrollPane();
		// panel_7.add(scrollPane);

		JLabel lbl_delete = new JLabel("");
		lbl_delete.setBounds(534, 48, 95, 27);
		panel.add(lbl_delete);

		JLabel lbl_logout = new JLabel("");
		lbl_logout.setBounds(656, 47, 92, 26);
		panel.add(lbl_logout);
		lbl_logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Main01.main(null);
			}
		});
		lbl_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				PerDelAccount05.main(null);

			}
		});

	}

	private void add(JScrollPane scrollPane_1) {
		// TODO Auto-generated method stub

	}
}