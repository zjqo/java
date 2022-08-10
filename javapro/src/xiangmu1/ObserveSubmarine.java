package xiangmu1;
import java.util.Random;
/** 侦察潜艇 */
public class ObserveSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;
    /** 构造方法 */
    ObserveSubmarine(){
        width = 63;
        height = 19;
        x = -width;
        Random rand = new Random(); //创建随机数对象
        y = rand.nextInt(479-height-150+1)+150;
        /*
           y = rand.nextInt(311);            //0到310之间
           y = rand.nextInt(311)+150;        //150到460之间
           y = rand.nextInt(460-150+1)+150;
           y = rand.nextInt(479-height-150+1)+150;
         */
        speed = rand.nextInt(3)+1;//+1代表从一开始
    }

    void move(){
        System.out.println("侦察潜艇x向右移动");
    }
}

























