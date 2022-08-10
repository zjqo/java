package xiangmu1;
/** 战舰 */
import javax.swing.*;
public class Battleship{
	ImageIcon img2;
    int width;  //宽
    int height; //高
    int x;      //x坐标
    int y;      //y坐标
    int speed;  //速度
    int life;   //命
    /** 构造方法 */
    public Battleship(){
        width = 66;
        height = 26;
        x = 270;
        y = 124;
        speed = 20;
        life = 5;
    }
   

    void move(){
        System.out.println("战舰移动啦!");
    }
}













