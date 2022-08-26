package xiangmu1;
/** 战舰 */
import javax.swing.*;
public class Battleship extends seaObject{
    private static int life;   //命
    /** 构造方法 */
    public Battleship(){
    	super(66,26,270,124,20);
        life = 5;
    }
   
  	public void life() {
    	x += speed;
   }
   public void rigth(){ x-=speed; }
    public void move(){
        System.out.println("战舰移动啦!");
    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.batt;
    }
    public String name(){
        String name = "战舰";
        return name;
    }

}














