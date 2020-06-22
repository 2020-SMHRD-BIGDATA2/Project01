import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class InfoModification {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoModification window = new InfoModification();
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
	public InfoModification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 857, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(341, 111, 200, 41);
		panel.add(lblNewLabel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId.setBounds(251, 175, 84, 41);
		panel.add(lblId);
		
		JLabel lblPw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblPw.setBounds(251, 224, 84, 41);
		panel.add(lblPw);
		
		JLabel lblName = new JLabel("\uC774\uB984");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblName.setBounds(251, 275, 84, 41);
		panel.add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(341, 275, 200, 40);
		panel.add(textField_2);
		
		JLabel lblId_3 = new JLabel("\uD578\uB4DC\uD3F0\uBC88\uD638");
		lblId_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId_3.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId_3.setBounds(233, 326, 102, 41);
		panel.add(lblId_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(341, 326, 200, 40);
		panel.add(textField_3);
		
		JLabel lblId_3_1 = new JLabel("\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638");
		lblId_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblId_3_1.setBounds(201, 377, 134, 41);
		panel.add(lblId_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(341, 376, 200, 40);
		panel.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815 \uC644\uB8CC");
		btnNewButton_1.setBounds(341, 442, 200, 41);
		panel.add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(341, 225, 200, 40);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("ID \uD45C\uC2DC");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(341, 175, 200, 41);
		panel.add(lblNewLabel_1);
	}

}
