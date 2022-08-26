package test2;

public class TestPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"->"+Thread.currentThread().getPriority());
        Priority priority = new Priority();
        Thread th = new Thread(priority,"第一");
        Thread th2 = new Thread(priority,"二");
        Thread th3 = new Thread(priority,"三");
        Thread th4= new Thread(priority,"四");
        Thread th5 = new Thread(priority,"五");

        th2.start();

        th3.setPriority(Thread.MAX_PRIORITY);
        th3.start();

        th4.setPriority(5);
        th4.start();

        th5.setPriority(3);
        th5.start();

        th.setPriority(Thread.MIN_PRIORITY);
        th.start();



    }
}

class Priority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"->"+Thread.currentThread().getPriority());
    }
}