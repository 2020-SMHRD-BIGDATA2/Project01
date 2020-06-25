package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GroupStoreEnroll02 { // �ָ� ��� ȭ��
	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_location;
	private JTextField txt_Menu1;
	private JTextField txt_Price1;
	private JTextField txt_Menu2;
	private JTextField txt_Price2;
	private JTextField txt_Menu3;
	private JButton btn_Complete;
	private JButton btn_Cancel;
	private JLabel lbl_image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupStoreEnroll02 window = new GroupStoreEnroll02();
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
	public GroupStoreEnroll02() {
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
		/*
		 * �̹������
		 */

		URL url = this.getClass().getResource("../image/GroupStoreEnroll.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_name = new JTextField();
		txt_name.setBounds(79, 10, 116, 21);
		txt_name.setText("\uC8FC\uB9C9 \uC774\uB984");
		panel.add(txt_name);
		txt_name.setColumns(10);

		txt_location = new JTextField();
		txt_location.setBounds(79, 41, 116, 21);
		txt_location.setText("\uC8FC\uB9C9 \uC704\uCE58");
		txt_location.setColumns(10);
		panel.add(txt_location);

		txt_Menu1 = new JTextField();
		txt_Menu1.setBounds(79, 134, 116, 21);
		txt_Menu1.setText("\uBA54\uB2741");
		panel.add(txt_Menu1);
		txt_Menu1.setColumns(10);

		txt_Price1 = new JTextField();
		txt_Price1.setBounds(207, 134, 116, 21);
		txt_Price1.setText("\uAE08\uC561");
		panel.add(txt_Price1);
		txt_Price1.setColumns(10);

		txt_Menu2 = new JTextField();
		txt_Menu2.setBounds(79, 165, 116, 21);
		txt_Menu2.setText("\uBA54\uB2742");
		txt_Menu2.setColumns(10);
		panel.add(txt_Menu2);

		txt_Price2 = new JTextField();
		txt_Price2.setBounds(207, 165, 116, 21);
		txt_Price2.setText("\uAE08\uC561");
		txt_Price2.setColumns(10);
		panel.add(txt_Price2);

		txt_Menu3 = new JTextField();
		txt_Menu3.setBounds(79, 192, 116, 21);
		txt_Menu3.setText("\uBA54\uB2743");
		txt_Menu3.setColumns(10);
		panel.add(txt_Menu3);

		JTextField txt_Price3 = new JTextField();
		txt_Price3.setBounds(207, 192, 116, 21);
		txt_Price3.setText("\uAE08\uC561");
		txt_Price3.setColumns(10);
		panel.add(txt_Price3);

		JComboBox cmb_open = new JComboBox();
		cmb_open.setBounds(79, 103, 116, 21);
		panel.add(cmb_open);

		JComboBox cmb_close = new JComboBox();
		cmb_close.setBounds(207, 103, 116, 21);
		panel.add(cmb_close);

		JComboBox cmb_Seats = new JComboBox();
		cmb_Seats.setBounds(79, 72, 116, 21);
		panel.add(cmb_Seats);

		btn_Complete = new JButton("\uC644\uB8CC");
		btn_Complete.setBounds(239, 40, 97, 23);
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "�ָ��� ��ϵǾ����ϴ�.");
				
				frame.dispose();
				GroupAfterLogin02 ga = new GroupAfterLogin02(); //main�� �����ϱ� �����ڷ� �ҷ����� ��
			}
		});
		panel.add(btn_Complete);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.setBounds(239, 70, 97, 23);
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int n = JOptionPane.showConfirmDialog(null, "����� ����Ͻðڽ��ϱ�", "Ȯ��", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n== JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "��ҵǾ����ϴ�.");
					frame.dispose();
					GroupAfterLogin02 ga = new GroupAfterLogin02();
					
				}
				
				
				
			}
		});
		panel.add(btn_Cancel);
		
		
		  JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
	      lbl_image.setBounds(0, 0, 772, 676);
	      panel.add(lbl_image);
	}
}
