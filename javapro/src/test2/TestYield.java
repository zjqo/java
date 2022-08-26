package test2;

import java.sql.SQLOutput;

public class TestYield {
    public static void main(String[] args) throws InterruptedException {
//        myYield my = new myYield();
//        new Thread(my,"线程1").start();
//        new Thread(my,"线程2").start();
        myjoin jo = new myjoin();
        Thread k = new Thread(jo);
        k.start();


        for (int i = 0; i < 300; i++) {
            if(i==100){
                k.join();
            }
            System.out.println("main");
        }
    }
}
class myYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        Thread.yield();//线程礼让，由cpu决定让不让
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}


class myjoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("vip");
        }

    }
}