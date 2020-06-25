package Per;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.table.TableModel;

import RE.CelebVO;
import RE.DAO_Manager;
import RE.DAO_Show;
import RE.Main01;
import RE.PMVO;

import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextField;

public class celeb {

   public JFrame frame;
   private JLabel lbl_image;
   private ArrayList<DAO_Show> list2;
   private ArrayList<String> list;
   private PMVO vo;
   private JLabel lbl_info;
   private JLabel lbl_Star;
   private String ffff;
   private JScrollPane scrollPane;
   private CelebVO cvo;
   private DAO_Manager daoMgr;
   
   public void setPMVO(PMVO vo) {
      this.vo = vo;
      System.out.println(vo.getPER_ID());
      lbl_info.setForeground(new Color(255, 255, 255));
      lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
      
   }
   
   

//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               celeb window = new celeb();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }
////--------------------넣어야할 것------------------------------------------------------------------------------------------------///////
   public void setList(ArrayList<DAO_Show> list2) {
      this.list2 = list2;

   }
   
   public void setText(String text) {

      
   }

//   public void setList(ArrayList<String> list) {
//      this.list = list;
//      String[] value = new String[list.size()];
//      for (int i = 0; i < value.length; i++) {
//         value[i] = list.get(i);
//      }
////--------------------넣어야할 것------------------------------------------------------------------------------------------------///////

   /**
    * Create the application.
    */
   public celeb(String text) {
      initialize(text);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(String text) {
      frame = new JFrame();
      frame.setBounds(100, 100, 800, 729);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ffff = text;
      
      URL url = this.getClass().getResource("../image/Cel_update.png");
      String path = url.getPath();
      Image image = new ImageIcon(path).getImage();

      JPanel panel = new JPanel();
      panel.setBounds(12, 10, 760, 666);
      frame.getContentPane().add(panel);
      daoMgr = new DAO_Manager();
      ArrayList<CelebVO> Clist = daoMgr.getinfo(ffff);
      Object[][] data = new Object[Clist.size()][4];
      for (int i = 0; i < Clist.size(); i++) {
    	  System.out.println("나 들어옴");
         data[i][0] = i+1;
         data[i][1] = Clist.get(i).getCelebName();
         data[i][2] = Clist.get(i).getCelebJob();
         data[i][3] = Clist.get(i).getUniname();
      }
            
            
      String colName[] = { "번호", "연예인", "직업","학교" };
      DefaultTableModel model = new DefaultTableModel(data, colName);
      panel.setLayout(null);
      JTable table_list = new JTable(data,colName);
      

//      JScrollPane scrollPane_list = new JScrollPane(); // ScrollPane에 table 삽입 잊지말기!
//      scrollPane_list.setBounds(12, 42, 697, 380);

//      JFrame frame = new JFrame("Table Test");
//      frame.setPreferredSize(new Dimension(500, 400));
//      frame.setLocation(500, 400);

      scrollPane = new JScrollPane(table_list);
      scrollPane.setBounds(93, 172, 598, 352);
      scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      panel.add(scrollPane);

      lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
      lbl_image.setBounds(12, 10, 760, 666);

      JLabel lbl_home = new JLabel("");
      lbl_home.setBounds(75, 525, 57, 61);
      lbl_home.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            frame.dispose();
            Main01.main(null);
         }
      });
      panel.add(lbl_home);

      JLabel lbl_back = new JLabel("");
      lbl_back.setBounds(654, 534, 57, 50);
      lbl_back.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            frame.dispose();
            PerAfterLogin back = new PerAfterLogin();
            // PerResearchPage.setList(list);
            back.frame.setVisible(true);
         }
      });
      panel.add(lbl_back);

      lbl_info = new JLabel("");
      lbl_info.setBounds(524, 108, 167, 27);
      panel.add(lbl_info);

      lbl_Star = new JLabel("Star");
      lbl_Star.setForeground(Color.WHITE);
      lbl_Star.setBounds(328, 135, 207, 27);
      lbl_Star.setText(ffff+"님이 공연하는 학교 정보입니다.");
      panel.add(lbl_Star);
      
      lbl_image.setFont(new Font("굴림", Font.PLAIN, 16));
      panel.add(lbl_image);
      
      
   
      
      

   }
}