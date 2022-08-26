
//创建线程
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print("run"+i+"\n");
        }
    }

    public static void main(String[] args) {
        TestThread3 tt = new TestThread3();
        new Thread(tt).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}
