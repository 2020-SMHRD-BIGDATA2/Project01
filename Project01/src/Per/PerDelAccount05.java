package Per;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import RE.Main01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		URL url = this.getClass().getResource("../image/PerDelete.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(178, 303, 417, 56);
		panel.add(txt_pw);

		txt_id = new JTextField();
		txt_id.setBounds(178, 231, 416, 55);
		panel.add(txt_id);
		txt_id.setColumns(10);

		JLabel lbl_Del = new JLabel("");
		lbl_Del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				if(txt_pw1.equals(txt_pw2)) {
//				°èÁ¤»èÁ¦
				int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
					frame.dispose();
					Main01.main(null);

				} else {
					frame.dispose();
					PerResearchPage.main(null);
//				System.exit(0);

//			}
//			
				}

			}
		});
		lbl_Del.setBounds(199, 434, 169, 38);
		panel.add(lbl_Del);

		JLabel lbl_Cancel = new JLabel("");
		lbl_Cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				PerResearchPage.main(null);

			}
		});
		lbl_Cancel.setBounds(401, 434, 169, 38);
		panel.add(lbl_Cancel);
	}
}
