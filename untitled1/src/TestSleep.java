import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public String time(){
        Date startime = new Date(System.currentTimeMillis());//获取系统当前时间
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startime));//输出当前系统时间
                if(new SimpleDateFormat("HH:mm:ss").format(startime).equals("17:32:00")){
                    return new SimpleDateFormat("HH:mm:ss").format(startime);
                }
                startime = new Date(System.currentTimeMillis());//更新系统时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //倒计时
    public static void tenDwen() throws InterruptedException {
        int i=10;
        while(i>=0){
            Thread.sleep(1000);
            System.out.println(i--);

        }


    }
}
