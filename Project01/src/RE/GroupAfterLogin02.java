package RE;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupAfterLogin02 { // 관리자가 로그인시 보이는 화면


	private JFrame frame;
	private JTextField txt_Search;
	JRadioButton rd_Celeb;
	JRadioButton rd_Uni;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupAfterLogin02 window = new GroupAfterLogin02();
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
	public GroupAfterLogin02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 241);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_Enroll = new JButton("\uC8FC\uB9C9\uB4F1\uB85D");
		btn_Enroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GroupStoreEnroll02.main(null);	
			}
		});
		btn_Enroll.setBounds(40, 37, 97, 23);
		panel.add(btn_Enroll);
		
		JButton btn_Modi = new JButton("\uC8FC\uB9C9\uC218\uC815");
		btn_Modi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GroupStoreModi03.main(null);
			}
		});
		btn_Modi.setBounds(149, 37, 97, 23);
		panel.add(btn_Modi);
		
		rd_Uni = new JRadioButton("Uni");
		rd_Uni.setBounds(91, 87, 89, 23);
		panel.add(rd_Uni);
		
		rd_Celeb = new JRadioButton("Celeb");
		rd_Celeb.setBounds(197, 87, 121, 23);
		panel.add(rd_Celeb);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rd_Uni);
		group.add(rd_Celeb);
		
		txt_Search = new JTextField();
		txt_Search.setText("Search");
		txt_Search.setBounds(133, 127, 116, 21);
		panel.add(txt_Search);
		txt_Search.setColumns(10);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				researchPage.main(null);	
				
			}
		});
		btn_Search.setBounds(133, 174, 97, 23);
		panel.add(btn_Search);
		
		JButton btn_Del = new JButton("\uC815\uBCF4 \uC0AD\uC81C");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn_Del.isSelected()) {
					JOptionPane.showMessageDialog(null, btn_Del.getText(), "확인", JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		});
		btn_Del.setBounds(258, 37, 97, 23);
		panel.add(btn_Del);
	}

}
