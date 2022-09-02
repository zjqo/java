package xiangmu1;
//图片
import javax.swing.*;
public class Imaes {
	public static ImageIcon sea;
	public static ImageIcon batt;
	public static ImageIcon bomb;
	public static ImageIcon game;
	public static ImageIcon mine;
	public static ImageIcon mines;
	public static ImageIcon obse;
	public static ImageIcon torp;
	static {
		sea = new ImageIcon("D:/java/java/javapro/src/img/sea.png");
		batt = new ImageIcon("D:/java/java/javapro/src/img/battleship.png");
		bomb = new ImageIcon("D:/java/java/javapro/src/img/bomb.png");
		game = new ImageIcon("D:/java/java/javapro/src/img/gameover.png");
		mine = new ImageIcon("D:/java/java/javapro/src/img/mine.png");
		mines = new ImageIcon("D:/java/java/javapro/src/img/minesubm.png");
		obse = new ImageIcon("D:/java/java/javapro/src/img/obsersubm.png");
		torp = new ImageIcon("D:/java/java/javapro/src/img/torpesubm.png");
	}
	public static void main(String[] args) {
		System.out.print(sea.getImageLoadStatus());//测试图片是否可用
		System.out.print(batt.getImageLoadStatus());
		System.out.print(bomb.getImageLoadStatus());
		System.out.print(game.getImageLoadStatus());
		System.out.print(mine.getImageLoadStatus());
		System.out.print(mines.getImageLoadStatus());
		System.out.print(obse.getImageLoadStatus());
		System.out.print(torp.getImageLoadStatus());
		

	}
}
