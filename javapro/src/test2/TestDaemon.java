package test2;

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread th =new Thread(god);
        th.setDaemon(true);
        th.start();

        new Thread(you).start();
    }

}
class God implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("my son");
        }
    }
}
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
        System.out.println("bay");
    }
}