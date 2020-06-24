package Per;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import RE.DAO_PerMember;
import RE.DBmethod;
import RE.PMVO;
import RE.researchPage;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class PerLogin02 { // ����ȸ�� �α��� ȭ��

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerLogin02 window = new PerLogin02();
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
	public PerLogin02() {
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

		URL url = this.getClass().getResource("../image/PerLogin.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(12, 10, 760, 666);
		frame.getContentPane().add(lbl_image);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setHorizontalAlignment(SwingConstants.LEFT);
		txt_id.setBounds(178, 232, 418, 56);
		panel.add(txt_id);
		txt_id.setColumns(10);

		txt_pw = new JPasswordField();
		txt_pw.setToolTipText("pw");
		txt_pw.setHorizontalAlignment(SwingConstants.LEFT);
		txt_pw.setBounds(178, 303, 417, 56);
		panel.add(txt_pw);

		JLabel lblLogin = new JLabel("");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// ���̵�� ��й�ȣ �Էµ� �� ��������
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				// �� DB�����ؼ� ��ġ�ϴ� ���� �ִ��� Ȯ���ϱ� ���� dao ��ü ����
				DAO_PerMember dao = new DAO_PerMember();

				// �α��� �������� �Ǻ�
				// �α��� ���нÿ��� null
				// �α��� �����ÿ��� ��ü�� �����´�
				PMVO vo = dao.login(id, pw);

				if (vo != null) {
					JOptionPane.showMessageDialog(null, "�α��� ����!! " + vo.getPER_NAME() + "�� ȯ���մϴ�!", "����",
							JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					researchPage researchPage = new researchPage();
					researchPage.setPMVO(vo);
					researchPage.frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���", "���", JOptionPane.WARNING_MESSAGE);
				}

				// frame.dispose();
				// researchPage.main(null);

			}
		});
		lblLogin.setBounds(177, 376, 418, 40);
		panel.add(lblLogin);

		JLabel lbl_join = new JLabel("");
		lbl_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				PerJoin.main(null);

			}
		});
		lbl_join.setBounds(469, 437, 110, 32);
		panel.add(lbl_join);

	}
}
