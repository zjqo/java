package xiangmu1;
import javax.swing.*;
/** 整个游戏窗口 */
public class World extends JFrame{
	 Battleship zs = new Battleship();
	 JLayeredPane windos = new JLayeredPane();;
	 JLabel jab;
	 ImageIcon img;
	 JPanel panel1 = new JPanel();
    public World() {
    	bomb();
    	batt();
    	init();
    	System.out.print(123);
    }
    void init() {
    	img = new ImageIcon("D:/java/java/javapro/src/img/sea.png");
    	jab = new JLabel(img);
    	panel1.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    	panel1 = (JPanel)this.getContentPane();
    	panel1.add(jab);
    	windos.add(panel1,JLayeredPane.DEFAULT_LAYER);
    	this.setTitle("大战");
    	
    	this.setBounds(200, 200, img.getIconWidth(),img.getIconHeight());
    	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	this.setLayeredPane(windos);
    	this.setVisible(true);
//		windos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void batt() {
    	ImageIcon img2 = new ImageIcon("D:/java/java/javapro/src/img/battleship.png");
    	JLabel jab = new JLabel();
    	jab.setIcon(img2);
    	jab.setHorizontalAlignment(SwingConstants.LEFT);
    	jab.setBounds(zs.x, zs.y, img2.getIconWidth(), img2.getIconHeight());
    	jab.setOpaque(true);
    	windos.add(jab);
    	System.out.print(img2.getIconWidth());
    }
    public void bomb() {
    	ImageIcon img3 = new ImageIcon("D:/java/java/javapro/src/img/bomb.png");
    	JLabel jab = new JLabel();
    	jab.setIcon(img3);
    	jab.setHorizontalAlignment(SwingConstants.LEFT);
    	Bomb bo = new Bomb(zs.x,zs.y);
    	jab.setBounds(bo.x, bo.y, img3.getIconWidth(), img3.getIconHeight());
    	jab.setOpaque(true);
    	windos.add(jab);
    	System.out.print(img3.getIconWidth());
    }
    

}





















