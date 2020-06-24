package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import RE.DAO_PerMember;
import RE.Main01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class PerDelAccount05 { // È¸¿ø Å»Åð

	private JFrame frame;
	private JPasswordField txt_pw;
	private JTextField txt_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					PerDelAccount05 window = new PerDelAccount05();
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
	public PerDelAccount05() {
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

		URL url = this.getClass().getResource("../image/PerDelAccount05.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_pw = new JPasswordField();
		txt_pw.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		txt_pw.setBounds(191, 352, 417, 53);
		panel.add(txt_pw);
		txt_pw.setBorder(null);
		txt_pw.setOpaque(false);
		
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		txt_id.setBounds(192, 256, 416, 54);
		panel.add(txt_id);
		txt_id.setColumns(10);
		
		txt_id.setBorder(null);
		txt_id.setOpaque(false);

		JLabel lbl_Del = new JLabel("");
		lbl_Del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DAO_PerMember daopm = new DAO_PerMember();

				String id = txt_id.getText();
				String pw = txt_pw.getText();

				int cnt = daopm.del(id, pw);

				if (cnt > 0) {
					int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE);

					if (n == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
						frame.dispose();
						Main01.main(null);

					} else {
						frame.dispose();
						// PerResearchPage.main(null);
						System.exit(0);

					}
				}
			}

		});

		lbl_Del.setBounds(210, 444, 169, 38);
		panel.add(lbl_Del);

		JLabel lbl_Cancel = new JLabel("");
		lbl_Cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				// PerResearchPage.main(null);

			}
		});

		lbl_Cancel.setBounds(410, 444, 169, 38);
		panel.add(lbl_Cancel);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		panel.add(lbl_image);
		
		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_home.setBounds(72, 531, 65, 65);
		panel.add(lbl_home);
		
		JLabel lbl_return = new JLabel("");
		lbl_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Main01.main(null);
			}
		});
		lbl_return.setBounds(659, 552, 57, 44);
		panel.add(lbl_return);
	}
}
