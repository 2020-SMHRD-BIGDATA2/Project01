package Per;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.DAO_PerMember;
import RE.DAO_Show;
import RE.DAO_Store;
import RE.DAO_Texi;
import RE.Main01;
import RE.PMVO;
import RE.StoreVO;
import RE.TaxiVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

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

import Group.GroupStoreEnroll02;
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
import java.util.ArrayList;

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
	private ArrayList<String> list;
	private PerAfterLogin pal;
	private DAO_Store daostore = new DAO_Store();
	private GroupStoreEnroll02 enroll;
	private JLabel lbl_image;
	private JLabel lblUniv;
	private JLabel lblBack;
	private JLabel lbl_uniname;
	private DAO_Texi daotaxi = new DAO_Texi();

	public void setPMVO(PMVO vo) {
		this.vo = PerLogin02.vo;
		lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
		String[] value = new String[list.size()];
		for (int i = 0; i < value.length; i++) {
			value[i] = list.get(i);
			System.out.println(value[i]);
		}

//		comboBox.setModel(new DefaultComboBoxModel(value));
//      comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));
	}

	public PerResearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		URL url = this.getClass().getResource("../image/PerResearchPage.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		// 이미지입력

		lbl_uniname = new JLabel("");
		lbl_uniname.setBounds(79, 37, 172, 41);
		lbl_uniname.setText(pal.uni_name+" University");
		panel.add(lbl_uniname);

		panel_1 = new JPanel();
		panel_1.setBounds(63, 110, 637, 464);
		panel.add(panel_1);
		panel_1.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 24, 636, 431);
		panel_1.add(tabbedPane);

		panel_3 = new JPanel();
		tabbedPane.addTab("\uCD95\uC81C\uC815\uBCF4", null, panel_3, null);
		panel_3.setLayout(null);

		
		JLabel lbl_post_new = new JLabel("");
		lbl_post_new.setBounds(12, 33, 296, 332);
		panel_3.add(lbl_post_new);
		
		JLabel lbl_line_new = new JLabel("");
		lbl_line_new.setBounds(320, 33, 296, 332);
		panel_3.add(lbl_line_new);

		
	
		
		panel_5 = new JPanel();
		tabbedPane.addTab("주막리스트", null, panel_5, null);

		JButton btn_reserve = new JButton("\uC8FC\uB9C9\uC608\uC57D");
		btn_reserve.setBounds(521, 10, 97, 23);
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PerBookStore.main(null);
			}
		});
		panel_5.setLayout(null);
		panel_5.add(btn_reserve);

		JLabel lbl_post = new JLabel();
		lbl_post.setBounds(3, 55, 287, 329);

		lbl_line = new JLabel();
		lbl_line.setBounds(324, 55, 287, 329);

		ArrayList<StoreVO> list2 = daostore.getinfo();

//		daostore.getStore(store_num, store_n332, uni_name, major_name);

		Object[][] data = new Object[list2.size()][4];
		for (int i = 0; i < list2.size(); i++) {
			data[i][0] = i+1;
			data[i][1] = list2.get(i).getStore_name();
			data[i][2] = list2.get(i).getUni_name();
			data[i][3] = list2.get(i).getMajor_name();
		}

		String colName[] = { "번호", "주막이름", "대학이름", "학과이름" };
		DefaultTableModel model = new DefaultTableModel(data, colName);
		JTable table_list = new JTable(model);

		JScrollPane scrollPane_list = new JScrollPane(table_list); // ScrollPane에 table 삽입 잊지말기!
		scrollPane_list.setBounds(12, 42, 606, 357);

//		JFrame frame = new JFrame("Table Test");
//		frame.setPreferredSize(new Dimension(500, 400));
//		frame.setLocation(500, 400);

		panel_5.add(scrollPane_list);
//		add(scrollPane_list);
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
		btn_Enroll.setBounds(511, 25, 97, 23);
		panel_6.add(btn_Enroll);

		txt_SearchCarpool = new JTextField();
		txt_SearchCarpool.setBounds(33, 11, 270, 21);
		panel_6.add(txt_SearchCarpool);
		txt_SearchCarpool.setColumns(10);

		btn_SearchCarpool = new JButton("\uAC80\uC0C9");
		btn_SearchCarpool.setBounds(315, 10, 97, 23);
		panel_6.add(btn_SearchCarpool);

		panel_7 = new JPanel();
		panel_7.setBounds(12, 58, 607, 337);
		panel_6.add(panel_7);
		panel_7.setLayout(null);

		ArrayList<TaxiVO> taxilist = daotaxi.gettaxiinfo();

//		daostore.getStore(store_num, store_n332, uni_name, major_name);

		Object[][] taxidata = new Object[taxilist.size()][5];
		for (int i = 0; i < taxilist.size(); i++) {
			taxidata[i][0] = i+1;
			taxidata[i][1] = taxilist.get(i).getTaxi_title();
			taxidata[i][2] = taxilist.get(i).getTaxi_sub();
			taxidata[i][3] = taxilist.get(i).getTaxi_date();
			taxidata[i][4] = taxilist.get(i).getPer_id();
		}

		String colBoard[] = { "번호", "제목", "내용", "아이디", "날짜" };
		DefaultTableModel Board = new DefaultTableModel(taxidata, colBoard);
		JTable table_board = new JTable(Board);

//      JScrollPane scrollPane_board = new JScrollPane(table_board); // ScrollPane에 table 삽입 잊지말기!
//      scrollPane_list.setBounds(12, 42, 697, 380);

		scrollPane_board = new JScrollPane(table_board);
		scrollPane_board.setBounds(0, 3, 607, 328);
		panel_7.add(scrollPane_board);
		txt_uni = new JTextField();
//	      lbl_info = new JLabel("name\uB2D8 \uD658\uC601\uD569w JFrame("Table Test");
//	      frame_01.setPreferredSize(new Dimension(500, 400));
//	      frame_01.setLocation(500, 400);
		lbl_info = new JLabel("");

//		JFrame frame_01 = new JFrame("Table Test");
//		frame_01.setPreferredSize(new Dimension(500, 400));
//		frame_01.setLocation(500, 400);

		lbl_info.setBounds(509, 39, 183, 39);
		panel.add(lbl_info);
		// 콤보박스 선택한 글자 가져오는 코드
		
		
		
		if (pal.uni_name.equals("jeonnam")) {

			txt_uni = new JTextField(pal.uni_name + "학교 축제 정보입니다.");
			txt_uni.setBounds(150, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			
			
			
			
			URL url_post = this.getClass().getResource("../univ_image/chen.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post_new.setIcon(new ImageIcon(image_post.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_post_new.setBounds(330, 30, 300, 380);
			URL url_line = this.getClass().getResource("../univ_image/chen_line.jpg");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line_new.setIcon(new ImageIcon(image_line.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_line_new.setBounds(50, 30, 300, 380);

		} else if (pal.uni_name.equals("chosun")) {

			txt_uni = new JTextField(pal.uni_name + "학교 축제 정보입니다.");
			txt_uni.setBounds(220, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			URL url_post = this.getClass().getResource("../univ_image/chosun.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post_new.setIcon(new ImageIcon(image_post.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_post_new.setBounds(330, 30, 300, 380);
			URL url_line = this.getClass().getResource("../univ_image/chosun_line.jpg");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line_new.setIcon(new ImageIcon(image_line.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_line_new.setBounds(50, 30, 300, 380);

		} else if (pal.uni_name.equals("honam")) {

			txt_uni = new JTextField(pal.uni_name + "학교 축제 정보입니다.");
			txt_uni.setBounds(220, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			URL url_post = this.getClass().getResource("../univ_image/ho.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post_new.setIcon(new ImageIcon(image_post.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_post_new.setBounds(330, 30, 300, 380);

			URL url_line = this.getClass().getResource("../univ_image/ho_line.jpg");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line_new.setIcon(new ImageIcon(image_line.getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
			lbl_line_new.setBounds(50, 30, 300, 380);

		} else {
			JOptionPane.showMessageDialog(null, "일치하는 대학교가 없습니다.");
			PerAfterLogin PerAfterLogin = new PerAfterLogin();
			PerAfterLogin.frame.setVisible(true);
		}
		
		
		
		
		
		
		
		
		
//      comboBox.setModel(new DefaultComboBoxModel(
//            new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));
		// JScrollPane scrollPane = new JScrollPane();
		// panel_7.add(scrollPane);

		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				Main01.main(null);

			}
		});

		lblHome.setBounds(63, 584, 57, 54);
		panel.add(lblHome);

		lblUniv = new JLabel("");
		lblUniv.setBounds(70, 61, 99, 35);
		panel.add(lblUniv);
		lblUniv.setVisible(true);

		lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PerAfterLogin p = new PerAfterLogin();
				p.frame.setVisible(true);
			}
		});
		lblBack.setBounds(658, 584, 52, 53);
		panel.add(lblBack);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(1, -1, 760, 666);
		panel.add(lbl_image);

	}
}