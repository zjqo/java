package xiangmu1;

import javax.swing.*;

/** 炸弹 */
public class Bomb extends seaObject{
    /** 构造方法 */
	public Bomb(int x,int y){
    	super(9,12,x,y,3);
    }
	public void move(){
    	y+=speed;//y+表示向上
        //System.out.println("炸弹y向下移动");
    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.bomb;
    }
    public String name(){
        String name = "炸弹";
        return name;
    }
}


















