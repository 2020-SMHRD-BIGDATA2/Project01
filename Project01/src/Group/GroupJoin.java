package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.Main01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GroupJoin { // 관리자 회원가입 화면

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_Uni;
	private JTextField txt_Major;
	private JLabel lbl_Join;
	private JPasswordField passwordField;

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
		frame.setBounds(100, 100, 800,729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*
		 * 이미지경로
		 */

		URL url = this.getClass().getResource("../image/GroupJoin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);
		// panel.add(lbl_image);

		/*
		 * */
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_id.setBounds(151, 165, 462, 55);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);
		
		txt_Uni = new JTextField();
		txt_Uni.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_Uni.setColumns(10);
		txt_Uni.setBounds(151, 329, 462, 55);
		panel.add(txt_Uni);
		txt_Uni.setBorder(null);
		
		txt_Major = new JTextField();
		txt_Major.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_Major.setColumns(10);
		txt_Major.setBounds(151, 413, 462, 55);
		panel.add(txt_Major);
		txt_Major.setBorder(null);
		
		lbl_Join = new JLabel("");
		lbl_Join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				//어디로 가야하오
			}
		});
		lbl_Join.setBounds(151, 516, 462, 42);
		panel.add(lbl_Join);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
		passwordField.setBounds(151, 249, 462, 55);
		panel.add(passwordField);
		passwordField.setBorder(null);
	}

}
