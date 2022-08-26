package xiangmu1;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/** 水雷 */
public class Mine extends seaObject{
    /** 构造方法 */
	public Mine(int x,int y){//根据水雷挺的坐标,获取水雷的位置
    	super(11,11,x,y,1);
    }

	public void move(){
    	y -= speed;
        //System.out.println("水雷y向上移动");
    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.mine;
    }
    public String name(){
        String name = "炸弹";
        return name;
    }

}














