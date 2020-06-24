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

public class PerBookStore { // 주막예약화면

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

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_Book = new JLabel("");
		lbl_Book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				JOptionPane.showMessageDialog(null, "예약이완료되었습니다.");

				frame.dispose();
				PerAfterLogin.main(null);

			}
		});
		
		JComboBox combo_time = new JComboBox();
		combo_time.setModel(new DefaultComboBoxModel(new String[] {"17:00~18:00", "18:00~19:00", "19:00~20:00", "20:00~21:00", "21:00~22:00"}));
		combo_time.setBounds(183, 231, 418, 56);
		panel.add(combo_time);
		
		JComboBox combo_name = new JComboBox();
		combo_name.setBounds(183, 159, 418, 56);
		panel.add(combo_name);
		
		JComboBox combo_table = new JComboBox();
		combo_table.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		combo_table.setBounds(184, 302, 417, 56);
		panel.add(combo_table);
		lbl_Book.setBounds(205, 436, 168, 37);
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
		lbl_Cancel.setBounds(405, 436, 168, 37);
		panel.add(lbl_Cancel);
	}
}
