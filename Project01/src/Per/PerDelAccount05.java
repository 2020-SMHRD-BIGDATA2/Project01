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
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
<<<<<<< HEAD
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

public class PerDelAccount05 { // È¸¿ø Å»Åð

	private JFrame frame;
	private JPasswordField txt_pw;
<<<<<<< HEAD
	private JButton btn_Cancel;
=======
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
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
<<<<<<< HEAD
		txt_pw.setBounds(114, 100, 173, 21);
		panel.add(txt_pw);
=======
		txt_pw.setBounds(178, 303, 417, 56);
		panel.add(txt_pw);

		txt_id = new JTextField();
		txt_id.setBounds(178, 231, 416, 55);
		panel.add(txt_id);
		txt_id.setColumns(10);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
		JButton btn_Del = new JButton("\uD0C8\uD1F4");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO_PerMember daopm = new DAO_PerMember();
				
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				int cnt = daopm.del(id, pw);
				if (cnt > 0) {
					int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
							JOptionPane.INFORMATION_MESSAGE);
=======
		JLabel lbl_Del = new JLabel("");
		lbl_Del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				if(txt_pw1.equals(txt_pw2)) {
//				°èÁ¤»èÁ¦
				int n = JOptionPane.showConfirmDialog(null, "Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î", "È®ÀÎ", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
					if (n== JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
						frame.dispose();
						Main01.main(null);
						
					} else {
						frame.dispose();
						PerResearchPage.main(null);
						System.exit(0);
						
=======
				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Å»Åð°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
					frame.dispose();
					Main01.main(null);

				} else {
					frame.dispose();
					PerResearchPage.main(null);
//				System.exit(0);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
					}
				}

				
=======
//			}
//			
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
				}

			}
<<<<<<< HEAD
		);
		btn_Del.setBounds(114, 169, 73, 23);
		panel.add(btn_Del);
=======
		});
		lbl_Del.setBounds(199, 434, 169, 38);
		panel.add(lbl_Del);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		JLabel lbl_Cancel = new JLabel("");
		lbl_Cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				frame.dispose();
				PerResearchPage.main(null);

			}
		});
<<<<<<< HEAD
		btn_Cancel.setBounds(214, 169, 73, 23);
		panel.add(btn_Cancel);
		
		txt_id = new JTextField();
		txt_id.setBounds(114, 57, 173, 21);
		panel.add(txt_id);
		txt_id.setColumns(10);
=======
		lbl_Cancel.setBounds(401, 434, 169, 38);
		panel.add(lbl_Cancel);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
	}
}
