package Per;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.table.TableModel;

import RE.DAO_Show;
import RE.Main01;
import RE.PMVO;

import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextField;

public class celeb {

	public JFrame frame;
	private JLabel lbl_image;
	private ArrayList<DAO_Show> list2;
	private ArrayList<String> list;
	private PMVO vo;
	private JLabel lbl_info;
	private JLabel lbl_Star;
	private String ffff;
	
	public void setPMVO(PMVO vo) {
		this.vo = vo;
		System.out.println(vo.getPER_ID());
		lbl_info.setForeground(new Color(255, 255, 255));
		lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					celeb window = new celeb();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
////--------------------넣어야할 것------------------------------------------------------------------------------------------------///////
	public void setList(ArrayList<DAO_Show> list2) {
		this.list2 = list2;

	}
	
	public void setText(String text) {
		ffff = text;
	}

//	public void setList(ArrayList<String> list) {
//		this.list = list;
//		String[] value = new String[list.size()];
//		for (int i = 0; i < value.length; i++) {
//			value[i] = list.get(i);
//		}
////--------------------넣어야할 것------------------------------------------------------------------------------------------------///////

	/**
	 * Create the application.
	 */
	public celeb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		URL url = this.getClass().getResource("../image/Cel_update.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		String colName[] = { "이름", "분야", "학교", "날짜" };
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		JTable table_list = new JTable(new DefaultTableModel(
				new Object[][] { { "PSY", "Singer", "AUniv", "20.12.32" }, { "HOT", "Singer", "BUniv", "20.12.33" },
						{ "SES", "Singer", "CUniv", "20.12.34" }, },
				new String[] { "\uC774\uB984", "\uBD84\uC57C", "\uD559\uAD50", "\uB0A0\uC790" }));

//		JScrollPane scrollPane_list = new JScrollPane(); // ScrollPane에 table 삽입 잊지말기!
//		scrollPane_list.setBounds(12, 42, 697, 380);

//		JFrame frame = new JFrame("Table Test");
//		frame.setPreferredSize(new Dimension(500, 400));
//		frame.setLocation(500, 400);

		JScrollPane scrollPane = new JScrollPane(table_list);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(93, 172, 598, 352);
		panel.add(scrollPane);

		lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));

		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(75, 525, 57, 61);
		panel.add(lbl_home);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				PerAfterLogin back = new PerAfterLogin();
				// PerResearchPage.setList(list);
				back.frame.setVisible(true);
			}
		});
		lblNewLabel.setBounds(654, 534, 57, 50);
		panel.add(lblNewLabel);

		lbl_info = new JLabel("New label");
		lbl_info.setBounds(524, 108, 167, 27);
		panel.add(lbl_info);

		lbl_Star = new JLabel("Star");
		lbl_Star.setBounds(75, 120, 220, 27);
		lbl_Star.setText(ffff);
		panel.add(lbl_Star);
		
		lbl_image.setFont(new Font("굴림", Font.PLAIN, 16));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		

	}
}
