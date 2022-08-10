package xiangmu1;
/** 水雷 */
public class Mine {
    int width;
    int height;
    int x;
    int y;
    int speed;
    /** 构造方法 */
    Mine(int x,int y){//根据水雷挺的坐标,获取水雷的位置
    	width = 11;
    	height = 11;
    	this.x = x;
    	this.y = y;
    	speed = 1;
    }

    void move(){
        System.out.println("水雷y向上移动");
    }
}














