public class test2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print("run"+i+"\n");
        }
    }

    public static void main(String[] args) {
        test2 x = new test2();
        x.start();
        for (int i = 0; i < 20  ; i++) {
            System.out.print("main"+i+"\n");
        }

    }
}

