package syn;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/17
 * \* Time: 17:30
 * \* To change this template use File | Settings | File Templates.
 * \* Description:线程的死锁
 * \
 */
public class DeadLock {
    public static void main(String[] args) {
        Makup makup1 = new Makup(0,"灰");
        Makup makup2 = new Makup(1,"白");
        makup1.start();
        makup2.start();
    }
}
class Marry{

}
class NewMarry{

}
 class Makup extends Thread{
    static Marry marry = new Marry();
    static NewMarry newMarry = new NewMarry();
    int chroice;
    String name;
    public Makup(int chroice,String name){
        this.chroice= chroice;
        this.name = name;
    }
     @Override
     public void run() {
         makup();
     }
     private void makup(){
        if(chroice==0){
            synchronized (marry){
                System.out.println(Thread.currentThread().getName()+"获得第一个的锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (newMarry){
                    System.out.println(this.getName()+"获得第二个");
                }
            }


        }else{
            synchronized (newMarry){
                System.out.println(this.getName()+"获得第二个的锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (marry){
                System.out.println(this.getName()+"获得第一个锁");
            }

        }
     }
 }
