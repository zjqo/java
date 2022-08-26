public class Race implements Runnable {

    private static String wienn;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("兔子") && i%10==0){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(gemaover(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--->跑了："+ i +"步");
        }
    }
    private boolean gemaover(int bu){
        if(wienn!=null){
            return true;
        }else if(bu>=100){
            wienn = Thread.currentThread().getName();
            System.out.println("胜利者:"+wienn);
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Race r = new Race();
        new Thread(r,"乌龟").start();
        new Thread(r,"兔子").start();
    }

}
