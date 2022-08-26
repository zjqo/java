public class TestStop implements Runnable{
    private boolean ble = true;
    @Override
    public void run() {
        int i = 0;
        while(ble){
            System.out.println("run"+ i++);
        }
    }
    public void stop(){
        this.ble = false;
    }
    public static void main(String[] args) {
        TestStop teststop  = new TestStop();
        new Thread(teststop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("mian->"+ i);
            if(i==500){
                teststop.stop();
            }
        }
    }
}
