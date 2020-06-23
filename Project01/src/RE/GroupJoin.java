package RE;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GroupJoin {

	private JFrame frame;
	private JTextField txt_id1;
	private JTextField txt_id2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupJoin window = new GroupJoin();
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
	public GroupJoin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759,541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		//이미지입력
		String path = "C:\\Users\\SMHRD\\git\\Project01\\Project01\\src\\icon\\회원가입.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 759,541);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(144, 466, 388, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GroupLogin01.main(null);
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		// 버튼 투명도
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		
				JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750,660, Image.SCALE_FAST)));
				lbl_image.setBounds(0, 0, 747, 501);
				panel.add(lbl_image);
				
				txt_id1 = new JTextField();
				txt_id1.setText("ID");
				txt_id1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						txt_id1.setText(null);
					}
				});

				txt_id1.setBounds(167, 0, 462, 63);
				panel.add(txt_id1);
				txt_id1.setColumns(10);
				
				
				
				
				
				
				
				
				
		
		
	

//		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(300, 350, Image.SCALE_FAST)));
//		lbl_image.addAncestorListener(new AncestorListener() {
//			public void ancestorAdded(AncestorEvent arg0) {
//			}
//
//			public void ancestorMoved(AncestorEvent arg0) {
//			}
//
//			public void ancestorRemoved(AncestorEvent arg0) {
//			}
//		});
		
		
//		   String path = "C:\\Users\\SMHRD\\Desktop\\java_1\\하나둘셋야\\src\\image\\pay_notime.jpg";
//		      Image image = new ImageIcon(path).getImage();
//		      panel.setLayout(null);
	}
}
