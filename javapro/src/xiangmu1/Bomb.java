package xiangmu1;
/** 炸弹 */
public class Bomb {
    int width;
    int height;
    int x;
    int y;
    int speed;
    /** 构造方法 */
    Bomb(int x,int y){
    	width = 9;
    	height = 12;
    	this.x = x;
    	this.y = y;
    	speed = 3;
    }

    void move(){
        System.out.println("炸弹y向下移动");
    }
}


















