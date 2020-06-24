package Group;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GroupStoreModi03 { // 주막 등록한 것 수정하는 화면

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btn_Complete;
	private JButton btn_Cancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupStoreModi03 window = new GroupStoreModi03();
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
	public GroupStoreModi03() {
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

		textField = new JTextField();
		textField.setText("\uC8FC\uB9C9\uC774\uB984");
		textField.setBounds(116, 11, 116, 21);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText("\uC8FC\uB9C9\uC704\uCE58");
		textField_1.setColumns(10);
		textField_1.setBounds(116, 44, 116, 21);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 162, 116, 21);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(244, 162, 116, 21);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 195, 116, 21);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(244, 193, 116, 21);
		panel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(116, 137, 116, 21);
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(244, 137, 116, 21);
		panel.add(textField_7);

		JComboBox cmb_ = new JComboBox();
		cmb_.setBounds(116, 75, 116, 21);
		panel.add(cmb_);

		JComboBox cmb_Open = new JComboBox();
		cmb_Open.setBounds(116, 106, 116, 21);
		panel.add(cmb_Open);

		JComboBox cmb_Close = new JComboBox();
		cmb_Close.setBounds(244, 106, 116, 21);
		panel.add(cmb_Close);

		btn_Complete = new JButton("\uD655\uC778");
		btn_Complete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");

				frame.dispose();
				GroupAfterLogin02 ga = new GroupAfterLogin02();
			}
		});
		btn_Complete.setBounds(80, 208, 97, 23);
		panel.add(btn_Complete);

		btn_Cancel = new JButton("\uCDE8\uC18C");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n = JOptionPane.showConfirmDialog(null, "수정을 취소하시겠습니까", "확인", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "취소되었습니다.");
					frame.dispose();
					GroupAfterLogin02 ga = new GroupAfterLogin02();

				}

			}
		});
		btn_Cancel.setBounds(189, 208, 97, 23);
		panel.add(btn_Cancel);
	}

}
