package xiangmu1;

import javax.swing.*;
import java.util.Random;

/** 鱼雷潜艇 */
public class TorpedoSubmarine extends seaObject{

    /** 构造方法 */
	public TorpedoSubmarine(){
    	super(64,20);
    	//当超类的构造为有参的构造，需要自己调用
    	//super();//超类（父类）构造方法只存在于子类（派生类）的构造方法中,并且超类构造必须先执行，会默认调用
    }

	public void move(){
    	this.x += this.speed;//水雷向上移动
        //System.out.println("鱼雷潜艇x向右移动");

    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.torp;
    }
    public String name(){
	    String name = "鱼雷";
	    return name;
    }

}








