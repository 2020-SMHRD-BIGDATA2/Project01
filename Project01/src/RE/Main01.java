package RE;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Group.GroupJoin;
import Group.GroupLogin01;
import Per.PerJoin;
import Per.PerLogin02;

import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.Color;

public class Main01 { // 김축제 메인 화면(시작화면)

   private JFrame frame;
   private FontMake fm = new FontMake();
   private JRadioButton rd_Per;
   private JRadioButton rd_Group;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main01 window = new Main01();
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
   public Main01() {
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

//      String path = "C:\\Users\\SMHRD\\git\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\Project01\\src\\image\\Main.png";
//      Image image = new ImageIcon(path).getImage();
      
      
      URL url = this.getClass().getResource("../image/Main_1.png");
      String path = url.getPath();
      Image image = new ImageIcon(path).getImage();

      JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
      lbl_image.setBounds(12, 10, 760, 666);
      frame.getContentPane().add(lbl_image);

      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      fm.fontChange(ge);

      JPanel panel = new JPanel();
      panel.setBounds(12, 10, 760, 668);
      frame.getContentPane().add(panel);
      panel.setLayout(null);

      JRadioButton rd_Group = new JRadioButton("");
      rd_Group.setBackground(Color.WHITE);
      rd_Group.setBounds(585, 105, 22, 23);
      panel.add(rd_Group);

      // 라디오 버튼 둘중 하나만 선택 할 수 있도록 버튼을 그룹화
      ButtonGroup group = new ButtonGroup();
      group.add(rd_Group);

      JLabel lbl_Login = new JLabel("");
      lbl_Login.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            if (rd_Per.isSelected()) {
               frame.dispose();
               PerLogin02.main(null);
            } else {
               frame.dispose();
               GroupLogin01.main(null);
            }

         }
      });
      lbl_Login.setBounds(479, 150, 180, 37);
      panel.add(lbl_Login);

      JLabel lbl_Join = new JLabel("");
      lbl_Join.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {

            if (rd_Per.isSelected()) {
               frame.dispose();
               PerJoin.main(null);
            } else {
               frame.dispose();
               GroupJoin.main(null);
            }

         }
      });
      lbl_Join.setBounds(478, 204, 181, 37);
      panel.add(lbl_Join);

      rd_Per = new JRadioButton("");
      rd_Per.setBackground(Color.WHITE);
      rd_Per.setBounds(479, 105, 21, 23);
      panel.add(rd_Per);
      rd_Per.setSelected(true);
      group.add(rd_Per);

   }
}