package Per;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.table.TableModel;

import RE.Main01;

import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class celeb {

	private JFrame frame;
	private JLabel lbl_image;
	private JLabel lbl_return;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celeb window = new celeb();
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

		URL url = this.getClass().getResource("../image/Celeb_bg.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();
		

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		String colName[] = { "이름", "분야", "학교", "날자" };
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		JTable table_list = new JTable(new DefaultTableModel(
			new Object[][] {
				{"PSY", "Singer", "AUniv", "20.12.32"},
				{"HOT", "Singer", "BUniv", "20.12.33"},
				{"SES", "Singer", "CUniv", "20.12.34"},
			},
			new String[] {
				"\uC774\uB984", "\uBD84\uC57C", "\uD559\uAD50", "\uB0A0\uC790"
			}
		));
		
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
		lbl_image.setFont(new Font("굴림", Font.PLAIN, 16));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		lbl_return = new JLabel("");
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PerAfterLogin per = new PerAfterLogin();
				per.frame.setVisible(true);
			}
		});
		lbl_return.setBounds(657, 546, 57, 48);
		panel.add(lbl_return);
		
		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(73, 534, 57, 60);
		panel.add(lbl_home);
		
	}
}
