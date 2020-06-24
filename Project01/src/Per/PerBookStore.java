package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;

import RE.DAO_PerMember;
import RE.DAO_Store;

import javax.swing.event.AncestorEvent;

public class PerBookStore { // 주막예약화면
	private JComboBox combo_time;
	private JComboBox combo_name;
	private JComboBox combo_table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerBookStore window = new PerBookStore();
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
	public PerBookStore() {
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

		URL url = this.getClass().getResource("../image/PerBook.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_Book = new JLabel("");
		lbl_Book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String time = (String) combo_time.getSelectedItem();
				// int time = Integer.parseInt((String)combo_time.getSelectedItem());
				String name = (String) combo_name.getSelectedItem();
				String table = (String) combo_table.getSelectedItem();

				System.out.println("클릭");
				DAO_Store daobook = new DAO_Store();
				int cnt = daobook.booking(table, time);

				if (cnt > 0) {
					System.out.println("a");
					frame.dispose();
					PerLogin02.main(null);
				} else {

				}
				System.out.println(cnt);
				JOptionPane.showMessageDialog(null, "예약이완료되었습니다.");

				frame.dispose();
				PerAfterLogin.main(null);

			}
		});

		combo_time = new JComboBox();
		combo_time.setModel(new DefaultComboBoxModel(
				new String[] { "17:00~18:00", "18:00~19:00", "19:00~20:00", "20:00~21:00", "21:00~22:00" }));
		combo_time.setBounds(194, 242, 418, 56);
		panel.add(combo_time);

		combo_name = new JComboBox();
		combo_name.setBounds(194, 170, 418, 56);
		panel.add(combo_name);

		combo_table = new JComboBox();
		combo_table.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		combo_table.setBounds(194, 313, 417, 56);
		panel.add(combo_table);
		lbl_Book.setBounds(215, 446, 168, 37);
		panel.add(lbl_Book);

		JLabel lbl_Cancel = new JLabel("");
		lbl_Cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int n = JOptionPane.showConfirmDialog(null, "예약정보가 저장되지 않았습니다\n정말 취소하겠습니까", "확인",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "취소가 완료되었습니다.");
					frame.dispose();
					PerAfterLogin.main(null);

				} else {
				}

			}
		});
		lbl_Cancel.setBounds(416, 446, 168, 37);
		panel.add(lbl_Cancel);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		// panel.add
		panel.add(lbl_image);
	}
}
