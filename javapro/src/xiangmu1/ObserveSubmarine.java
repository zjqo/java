package xiangmu1;
import javax.swing.*;
import java.util.Random;
/** 侦察潜艇 */
public class ObserveSubmarine extends seaObject {
    /** 构造方法 */
    public ObserveSubmarine(){
    	super(63,19);
    }

    public void move(){
    	x += speed;
        //System.out.println("侦察潜艇"+(x+speed)+"向右移动");
    }

    @Override
    public ImageIcon gitImage() {
        return Imaes.obse;
    }
    public String name(){
        String name = "侦察";
        return name;
    }
}

























