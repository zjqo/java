package xiangmu1;

import java.util.Random;

/** 鱼雷潜艇 */
public class TorpedoSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;
    /** 构造方法 */
    TorpedoSubmarine(){
    	width = 64;
        height = 20;
        x = -width;
        Random rand = new Random(); //创建随机数对象
        y = rand.nextInt(479-height-150+1)+150;
        speed = rand.nextInt(3)+1;//+1代表从一开始
    }

    void move(){
        System.out.println("鱼雷潜艇x向右移动");
    }
}








