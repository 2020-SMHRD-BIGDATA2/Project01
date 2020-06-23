package Group;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import RE.Main01;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

			}
		});
		btn_Search.setBounds(133, 174, 97, 23);
		panel.add(btn_Search);

		JButton btn_Del = new JButton("\uC815\uBCF4 \uC0AD\uC81C");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				if (btn_Del.isSelected()) {
//					JOptionPane.showMessageDialog(null, btn_Del.getText(), "확인", JOptionPane.INFORMATION_MESSAGE);
//					
				int n = JOptionPane.showConfirmDialog(null, "정보를 삭제하시겠습니까", "확인", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "정보삭제가 완료되었습니다.");
					frame.dispose();
					GroupAfterLogin02.main(null);

				} else {

//						System.exit(0);

//					}
//					
				}
			}

		});
		btn_Del.setBounds(258, 37, 97, 23);
		panel.add(btn_Del);

		JLabel lblNewLabel = new JLabel("\uD648\uC73C\uB85C");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frame.dispose();
				Main01.main(null);

			}
		});
		lblNewLabel.setBounds(353, 226, 57, 15);
		panel.add(lblNewLabel);
	}

}
