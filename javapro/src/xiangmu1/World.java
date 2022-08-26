package xiangmu1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.xml.soap.Text;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/** 整个游戏窗口 */
public class World extends JPanel implements KeyListener{
	public static final int WIDTH = 641;//窗口的宽
	public static final int HEIGHT = 479;//窗口的高
    private Battleship ship = new Battleship();//战舰
    private Bomb[] boms = {};
    private seaObject[] submarines = {};
    private Mine[] mines = {};

	public static void main(String[] args) {
        new World().init();
	}
	/*  专门生成潜艇的  */
	private seaObject nextSubmarine(){//根据随机数产生战舰对象
        Random random = new Random();
        int x = random.nextInt(3)+1;
        if(x == 1){
            return new TorpedoSubmarine();
        } else if(x == 2){
            return new MineSubmarine();
        } else if(x == 3){
            return new ObserveSubmarine();
        }
        return null;
    }

    private int subEnterIndex = 0;//潜艇入场记数

	private void submarineEnterAction(){//将产生的对象存入数组
        subEnterIndex++;//每10毫秒走一次
        if(subEnterIndex %40==0){//每400(40*10)毫秒走一次
            submarines = Arrays.copyOf(submarines,submarines.length+1);//数组扩容,扩容一位
            seaObject obj= nextSubmarine();
            submarines[submarines.length-1] = obj;//将元素添加到数组最后一位，length-1；
        }
    }
	private void action(){//启动的程序执行,定时器
        Timer timer = new Timer();
        int interval = 10;//定时间隔
        timer.schedule(new TimerTask() {//TimerTask()中的run方法实现后也会自动掉用
            @Override
            public void run() {//定时干的事
                submarineEnterAction();
                MineEnterAction();//水雷入场
                 //hit();
                suilei();
                sanchu();
                width2();
                width3();
                repaint();//重画操作，因为在这之前背景只有背景图和对象，重画就将新加入的战舰显示

            }
        },interval,interval);//定时计划表
    }
    private void width(seaObject sub){
                sub.move();

    }
    private void width2(){
        for (int i = 0; i < mines.length; i++) {
            mines[i].move();
            if(mines[i].y <=0){
                mines = minedef(mines,mines[i]);
                System.out.println("删除了鱼雷");
            }
        }
    }
    private void width3(){
        for (int i = 0; i < boms.length; i++) {
            boms[i].move();
            if(boms[i].y >= HEIGHT){
                boms = bombdef(boms,boms[i]);
                System.out.println("删除了炸弹");
            }
        }
    }
    void sanchu(){
	    int k = 1;
	    int j=0;
        for (int i = 0; i < submarines.length; i++) {
            k=1;
            if(submarines[i].x<WIDTH){
                for (j = 0; j < boms.length; j++) {
                    if((boms[j].x>submarines[i].x && boms[j].x<(submarines[i].x+submarines[i].width)) && (boms[j].y>submarines[i].y && boms[j].y<(submarines[i].y+submarines[i].height))){
                        submarines = def(submarines,submarines[i]);
                        k =0;
                        System.out.println("击毁了----------------------------------------------------------------"+submarines.length);
                        boms = bombdef(boms,boms[j]);

                        break;
                    }
                }
                if(k==1){
                    width(submarines[i]);
                }
            }else{
                submarines = def(submarines,submarines[i]);
                System.out.println("删除了----------------------------------------------------------------"+submarines.length);
            }
        }
    }
    void suilei(){
        for (int i = 0; i < mines.length; i++) {
            if((mines[i].x>ship.x && mines[i].x < (ship.x+ship.width)) && (mines[i].y<=(ship.y+ship.height))){
                mines = minedef(mines,mines[i]);
                System.out.println("击中了战舰----------------------------------------------------------------"+submarines.length);
            }
        }
    }
    seaObject[] def(seaObject[] sub,seaObject x){
	    int index = 0;
        for (int i = 0; i < submarines.length; i++) {
            if(submarines[i] != x){
                sub[index] = sub[i];
                index++;
            }
        }
        seaObject[] sub2 = Arrays.copyOf(sub,index);
	    return sub2;
    }
    Bomb[] bombdef(Bomb[] bo ,Bomb bm){
	    int index  = 0;
        for (int i = 0; i < boms.length; i++) {
            if(boms[i] != bm){
                boms[index] = boms[i];
                index++;
            }
        }
        Bomb[] sub = Arrays.copyOf(boms,index);
	    return sub;
    }
    Mine[] minedef(Mine[] mi , Mine mie){
	    int index = 0;
        for (int i = 0; i < mines.length; i++) {
            if(mines[i] != mie){
                mines[index] = mines[i];
                index++;
            }
        }
        Mine[] sub = Arrays.copyOf(mines,index);
	    return sub;

    }
    private int MineEnterAction = 0;
    private void MineEnterAction(){
	    MineEnterAction++;
	    if(MineEnterAction % 100==0){
            for (int i = 0; i < submarines.length; i++) {
                if(submarines[i].name().equals("水雷")){
                        mines = Arrays.copyOf(mines,mines.length+1);
                        mines[mines.length-1] = new Mine(submarines[i].x+submarines[i].width,submarines[i].y-submarines[i].height);
                }

            }

        }
    }
	private void init(){
        JFrame frame = new JFrame();
        World world = new World();
        world.setFocusable(true);

        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+5,HEIGHT+35);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("飞机大战");
        frame.addKeyListener(this);
        frame.setVisible(true);//运行到这里就自动调用paint方法

        action();


    }

    public void paint(Graphics g){
	    Imaes.sea.paintIcon(null,g,0,0);

	    ship.paintImage(g);
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].paintImage(g);
        }
        for (int i = 0; i < mines.length; i++) {
            mines[i].paintImage(g);
        }
        for (int i = 0; i < boms.length; i++) {
            boms[i].paintImage(g);//seaObject类下的方法
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x = e.getKeyCode();

        if(ship.x < (WIDTH -  ship.width) && ship.x > 0){
            if(x==65){
                this.ship.rigth();
                this.ship.move();
            }else if(x==68){
                ship.life();
            }else if(x == 32){
                boms = Arrays.copyOf(boms,boms.length+1);
                boms[boms.length-1] = new Bomb(ship.x,ship.y);
            }
        }else if(ship.x >= (WIDTH -  ship.width)){
                if(x==65){
                    ship.rigth();
                    ship.move();
                }
        }else if(ship.x<=  0){
            if(x==68){
                ship.life();
                ship.move();
            }
        }
        System.out.println(x);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}





















