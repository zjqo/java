package xiangmu1;

import javax.swing.*;
import java.util.Random;

/** 水雷潜艇 */
public class MineSubmarine extends seaObject{
    /** 构造方法 */
	public MineSubmarine(){
    	super(63,19);
    }

	public void move(){
    	x += speed;
       // System.out.println("水雷潜艇"+(x+speed)+"向右移动");
    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.mines;
    }

    public Mine shootMine(){
	    return new Mine(this.x+this.width,this.y-11);
    }
    public String name(){
        String name = "水雷";
        return name;
    }
}











