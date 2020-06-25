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
import RE.DBmethod;
import RE.PMVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

public class PerAfterLogin { // ����ȸ�� �α��� �� �˻�ȭ��(�ʿ���� ȭ��)

	public JFrame frame;
	private JTextField txt_Search;
	JRadioButton rd_Uni;
	JRadioButton rd_Celeb;
	private PMVO vo;
	private JLabel lbl_info;
	public DBmethod dbm;
////--------------------�־���� ��------------------------------------------------------------------------------------------------///////
	static String uni_name;
	static String celeb_name;
////--------------------�־���� ��------------------------------------------------------------------------------------------------///////
	/**
	 * Launch the application.
	 */
	public void setPMVO(PMVO vo) {
		this.vo = vo;
		lbl_info.setText(vo.getPER_NAME() + "�� ȯ���մϴ�.");
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

		URL url = this.getClass().getResource("../image/PerAfterLogin12.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_Search = new JTextField();
		txt_Search.setText("Search");
		txt_Search.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Search.setBounds(262, 382, 227, 63);
		panel.add(txt_Search);
		txt_Search.setColumns(10);

		rd_Uni = new JRadioButton("");
		rd_Uni.setBounds(216, 302, 21, 23);
		panel.add(rd_Uni);

		rd_Celeb = new JRadioButton("");
		rd_Celeb.setBounds(413, 302, 21, 23);
		panel.add(rd_Celeb);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);

		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
//				PerResearchPage.main(null);
			}
		});
		lblHome.setBounds(619, 499, 68, 75);
		panel.add(lblHome);

		JLabel lblBooking = new JLabel("New label");
		lblBooking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				PerBookStore.main(null);
			}
		});
		lblBooking.setBounds(208, 230, 170, 37);
		panel.add(lblBooking);

		JLabel lblCancel = new JLabel("New label");
		lblCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			////--------------------�־���� ��------------------------------------------------------------------------------------------------///////
				DAO_PerMember dao = new DAO_PerMember();
		
				int cnt = 0;
				if (cnt > 0) {
					int n = JOptionPane.showConfirmDialog(null, "���������� ������� �ʾҽ��ϴ�\n���� ����ϰڽ��ϱ�", "Ȯ��",
							JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "����� ���������� �������� �ʽ��ϴ�.");
				}

			}
		////--------------------�־���� ��------------------------------------------------------------------------------------------------///////
		});
		lblCancel.setBounds(413, 230, 170, 37);
		panel.add(lblCancel);

		JLabel lblSearch = new JLabel("");
		lblSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
////--------------------�־���� ��------------------------------------------------------------------------------------------------///////
				boolean rd_uni = rd_Uni.isSelected();
				if (rd_uni) {
					uni_name = txt_Search.getText();
					DAO_Manager dao = new DAO_Manager();
					ArrayList<String> list = dao.getUni_name(uni_name);

					frame.dispose();
					PerResearchPage PerResearchPage = new PerResearchPage();
					PerResearchPage.setList(list);
					PerResearchPage.frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "�˻� �о߸� �������ּ���!");
				}
				
				boolean rd_celeb = rd_Celeb.isSelected();
				if (rd_celeb) {
					celeb_name = txt_Search.getText();
					DAO_Manager dao = new DAO_Manager();
					ArrayList<DAO_Show> list2 = dao.getCeleb_name(celeb_name);
					
					frame.dispose();
					PerResearchCeleb PerResearchCeleb = new PerResearchCeleb();
					PerResearchCeleb.setList(list2);
					PerResearchCeleb.frame.setVisible(true);
					
					
				}
				
				
				
				
////--------------------�־���� ��------------------------------------------------------------------------------------------------///////

			}
		});
		lblSearch.setBounds(481, 382, 51, 63);
		panel.add(lblSearch);

		lbl_info = new JLabel();
		lbl_info.setBounds(455, 131, 57, 15);
		lbl_info.setText(PerLogin02.vo.getPER_NAME());
		panel.add(lbl_info);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(475, 131, 57, 15);
		panel.add(lblNewLabel);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);

	}




}
