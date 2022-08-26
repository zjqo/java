package syn;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/17
 * \* Time: 19:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:lock线程锁
 * \
 */
public class Testlock {
    public static void main(String[] args) {
        ticke tc = new ticke();
        new Thread(tc,"小红").start();
        new Thread(tc,"小明").start();
        new Thread(tc,"小智").start();

    }
}
class ticke implements Runnable{
    private final ReentrantLock lock = new ReentrantLock();
    private int tck = 100;
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();//加锁
                if(tck>0){
                    System.out.println(Thread.currentThread().getName()+tck--);

                }else{
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }finally{
                lock.unlock();//解锁
            }

        }
    }
}
