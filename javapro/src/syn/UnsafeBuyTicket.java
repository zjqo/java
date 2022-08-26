package syn;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/16
 * \* Time: 18:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:不安全线程模拟买票
 * \
 */
public class UnsafeBuyTicket {

    public static void main(String[] args) {
        myticket statr = new myticket();
        new Thread(statr,"小明").start();
        new Thread(statr,"小红").start();
        new Thread(statr,"小黄").start();
    }
}
class myticket implements Runnable{
    private int ticket=10;
    private boolean fale = true;
    @Override
    public void run() {
        while(fale){
            try {
                Thread.sleep(10);
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private synchronized void buy(){//锁：锁方法
        if(ticket<=0){
            fale = false;
            return;
        }

        System.out.println(Thread.currentThread().getName()+"拿到了"+ticket--);
    }
}
