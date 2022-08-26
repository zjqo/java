import org.apache.commons.io.FileUtils;
import sun.net.www.protocol.file.FileURLConnection;
import java.io.*;
import java.net.*;
import java.io.IOException;
//实现多线程同步下载图片
public class TestThread2 implements Runnable {
    private String url;
    private String name;
    public TestThread2(String url,String name){
        this.url = url;
        this.name = name;
    }
    @Override
    //下载线程的执行体
    public void run() {
        webDownloader wed = new webDownloader();
        wed.downloader(url,name);
        System.out.println("下载成功"+name);
    }

    public static void main(String[] args) {
//        TestThread2 tt = new TestThread2("https://s1.ax1x.com/2022/08/13/vYLOld.md.png","zjq.png");
        TestThread2 tt2 = new TestThread2("images/title-background.png","zjq2.png");
        TestThread2 tt3 = new TestThread2("https://img2022.cnblogs.com/blog/35695/202208/35695-20220811174824111-2031411413.jpg","zjq3.jpg");
        TestThread2 tt4 = new TestThread2("https://pic2.zhimg.com/80/v2-80d6db29319d4b59924724fd15a032b6_720w.jpg","zjq4.jpg");
        new Thread( new TestThread2("https://s1.ax1x.com/2022/08/13/vYLOld.md.png","zjq.png")).start();
        new Thread(tt2).start();
        new Thread(tt3).start();
        new Thread(tt4).start();
    }
}
class webDownloader{
    public void downloader(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("IO 错误");
        }

    }
}
