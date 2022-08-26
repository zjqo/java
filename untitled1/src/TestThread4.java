//抢票例子
public class TestThread4 implements Runnable{
    //票数
    private int ticket=10;
    @Override
    public void run() {
        while(true){
            if(ticket<=0){
                break;
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第："+ ticket-- +"票");
            try {//模拟延迟
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestThread4 tic = new TestThread4();
        new Thread(tic,"张三").start();
        new Thread(tic,"李四").start();
        new Thread(tic,"王五").start();
    }
}
