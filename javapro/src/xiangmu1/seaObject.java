package xiangmu1;

import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;

/*海洋对象*/
public abstract class seaObject {//普通对象存在堆中，通过new访问
						//静态变量存放在方法区中，通过类名访问
						//方法区：.class字节码文件（包括静态变量和所有方法）,静态方法中没有this，不能直接访问实例变量和方法
    public static final int LIVE = 0;
    public static final int DATE = 1;
    protected int state=LIVE ;
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	protected int speed;
    public seaObject(int width,int height){
    	this.width = width;
        this.height = height;
        x = -width;
        Random rand = new Random(); //创建随机数对象
        y = rand.nextInt(World.HEIGHT-height-150+1)+150;
        speed = rand.nextInt(3)+1;//+1代表从一开始
    }
    
    //专门给战舰，水雷，炸弹提供
    public seaObject(int width , int height,int x,int y,int speed){
    	this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
       
    }
    //移动方法
	public abstract void move();
    //获取图片方法
    public abstract ImageIcon gitImage();
    //对象是活的
    public boolean isLive(){
        return state==LIVE;
    }
    //对象是死的
    public boolean isDate(){
        return state==DATE;
    }
    /* 画对象 */
    public void paintImage(Graphics g){// Graphics g:画笔工具
        if(this.isLive()){
            this.gitImage().paintIcon(null,g,this.x,this.y);
        }
    }
    public abstract String name();

}
