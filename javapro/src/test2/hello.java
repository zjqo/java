package test2;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class hello extends JFrame{
	JLayeredPane pane = new JLayeredPane();  // 分层网格
	JLabel label;
	JPanel panel1 = new JPanel();
	JTextField field1 = new JTextField();
////	JTextField field2 = new JTextField();
    JButton Land = new JButton("登陆");
////	JButton register = new JButton("注册");
	ImageIcon image;
	public hello() {
		image = new ImageIcon("D:/java/java/javapro/src/img/sea.png");
                 //设置组件透明
                Land.setOpaque(false);
       
	
		label = new JLabel(image);		//把背景图片添加到标签里
 
		panel1.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());   //把标签设置为和图片等高等宽
 
		panel1 = (JPanel)this.getContentPane(); 	//把我的面板设置为内容面板
		
		panel1.add(label);
		
		Land.setBounds(100, 100, 100, 50);
 
		pane.add(panel1,JLayeredPane.DEFAULT_LAYER);  
		pane.add(Land, JLayeredPane.MODAL_LAYER);
		
                this.setTitle("QQ");
		this.setBounds(100,100,image.getIconWidth(), image.getIconHeight());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayeredPane(pane);
		this.setVisible(true);
	}
	
}