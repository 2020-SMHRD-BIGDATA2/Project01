package Group;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Per.PerLogin02;
import RE.DAO_Manager;
import RE.DAO_PerMember;
import RE.Main01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
//<<<<<<< HEAD
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//=======
import javax.swing.JCheckBox;
import java.awt.Color;
//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

public class GroupJoin { // 관리자 회원가입 화면

   private JFrame frame;
   private JTextField txt_id;
//<<<<<<< HEAD
//=======
   private JPasswordField txt_pw;
//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
   private JTextField txt_Uni;
   private JTextField txt_Major;
//<<<<<<< HEAD
   private JLabel lbl_Join;
   private JPasswordField passwordField;

//=======
   private JButton btn_Cancel;
   private DAO_Manager daomgr = new DAO_Manager();
   private JCheckBox ck_unique;
   private JLabel lbl_txt_id;
   private JLabel lbl_txt_pw;
   private JLabel lbl_txt_Uni;
   private JLabel lbl_txt_Major;
   private JLabel lbl_home;
   private JLabel lbl_return;

//>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
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
      frame.setBounds(100, 100, 800, 729);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      /*
       * 이미지경로
       */

      URL url = this.getClass().getResource("../image/GroupJoin_0.png");
      String path = url.getPath();
      Image image = new ImageIcon(path).getImage();

      /*
       * */
      JPanel panel = new JPanel();
      panel.setBounds(12, 10, 760, 666);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      lbl_txt_id = new JLabel("\uC544\uC774\uB514\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694");
      lbl_txt_id.setFont(new Font("굴림", Font.PLAIN, 15));
      lbl_txt_id.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		lbl_txt_id.setVisible(false);
      	}
      });
      lbl_txt_id.setBounds(163, 179, 462, 55);
      panel.add(lbl_txt_id);
      
      lbl_txt_pw = new JLabel("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694");
      lbl_txt_pw.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		lbl_txt_pw.setVisible(false);
      	}
      });
      lbl_txt_pw.setFont(new Font("굴림", Font.PLAIN, 15));
      lbl_txt_pw.setBounds(166, 272, 459, 61);
      panel.add(lbl_txt_pw);
      
      lbl_txt_Uni = new JLabel("\uB300\uD559\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694");
      lbl_txt_Uni.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		lbl_txt_Uni.setVisible(false);
      	}
      });
      lbl_txt_Uni.setFont(new Font("굴림", Font.PLAIN, 15));
      lbl_txt_Uni.setBounds(166, 360, 459, 57);
      panel.add(lbl_txt_Uni);
      
      lbl_txt_Major = new JLabel("\uC804\uACF5\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694");
      lbl_txt_Major.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		lbl_txt_Major.setVisible(false);
      	}
      });
      lbl_txt_Major.setFont(new Font("굴림", Font.PLAIN, 15));
      lbl_txt_Major.setBounds(163, 439, 459, 55);
      panel.add(lbl_txt_Major);

      txt_id = new JTextField();
      txt_id.setFont(new Font("굴림", Font.PLAIN, 20));
      txt_id.setBounds(163, 179, 462, 55);
      panel.add(txt_id);
      txt_id.setColumns(10);
      txt_id.setBorder(null);

      JButton btn_Complete = new JButton("");
      btn_Complete.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String id = txt_id.getText();
            String pw = txt_pw.getText();
            String uni = txt_Uni.getText();
            String major = txt_Major.getText();
            // System.out.println(id + pw + uni+ major);
            if (ck_unique.isSelected()) {
               int cnt = daomgr.insert(id, pw, uni, major);
               if (cnt > 0) {
                  frame.dispose();
                  GroupLogin01.main(null);
               }
            } else {
               JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요");
            }
         }
      });
      btn_Complete.setBounds(163, 526, 462, 42);
      panel.add(btn_Complete);
      btn_Complete.setBorder(null);
      btn_Complete.setOpaque(false);
      btn_Complete.setContentAreaFilled(false);

      txt_pw = new JPasswordField();
      txt_pw.setFont(new Font("굴림", Font.PLAIN, 20));
      txt_pw.setBounds(163, 272, 462, 61);
      panel.add(txt_pw);
      txt_pw.setBorder(null);
      txt_pw.setOpaque(false);

      txt_Uni = new JTextField();
      txt_Uni.setFont(new Font("굴림", Font.PLAIN, 20));
      txt_Uni.setColumns(10);
      txt_Uni.setBounds(163, 359, 462, 55);
      panel.add(txt_Uni);
      txt_Uni.setBorder(null);

      txt_Major = new JTextField();
      txt_Major.setFont(new Font("굴림", Font.PLAIN, 20));
      txt_Major.setColumns(10);
      txt_Major.setBounds(163, 439, 462, 55);
      panel.add(txt_Major);
      txt_Major.setBorder(null);

      lbl_Join = new JLabel("");
      lbl_Join.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            frame.dispose();
            // 어디로 가야하오
         }
      });
      lbl_Join.setBounds(151, 516, 462, 42);
      panel.add(lbl_Join);

      passwordField = new JPasswordField();
      passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
      passwordField.setBorder(null);

      btn_Cancel = new JButton();
      btn_Cancel.setBounds(220, 208, 97, 23);
      panel.add(btn_Cancel);

      ck_unique = new JCheckBox("");
      ck_unique.setBackground(Color.WHITE);
      ck_unique.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (ck_unique.isSelected()) {
               // 내 DB연결해서 일치하는 정보 있는지 확인하기 위한 dao 객체 생성
               boolean isCheck = daomgr.idCheck(txt_id.getText()); // 개인
               boolean isCheck2 = daomgr.idCheck2(txt_id.getText()); // 단체
               if (isCheck || isCheck2) {
                  JOptionPane.showMessageDialog(null, "중복되는 아이디가 존재합니다.");
                  ck_unique.setSelected(false);
               } else {
                  JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
               }
            }

         }
      });
      ck_unique.setBounds(168, 246, 21, 21);
      panel.add(ck_unique);

     
      
      lbl_home = new JLabel("");
      lbl_home.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		frame.dispose();
      		Main01.main(null);
      	}
      });
      lbl_home.setBounds(71, 588, 57, 68);
      panel.add(lbl_home);
      
      lbl_return = new JLabel("");
      lbl_return.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		frame.dispose();
      		Main01.main(null);
      	}
      });
      lbl_return.setBounds(657, 595, 57, 61);
      panel.add(lbl_return);
      
      JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
      lbl_image.setBounds(12, 10, 760, 666);
      panel.add(lbl_image);
      

      

      

   }
}