import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;
    TestCallable(String url,String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call(){
        webDownloader1 webDownloader1 = new webDownloader1();
        webDownloader1.downloader(url,name);
        System.out.print("下载了："+ name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable tt2 = new TestCallable("images/title-background.png","zjq2.png");
        TestCallable tt3 = new TestCallable("https://img2022.cnblogs.com/blog/35695/202208/35695-20220811174824111-2031411413.jpg","zjq3.jpg");
        TestCallable tt4 = new TestCallable("https://pic2.zhimg.com/80/v2-80d6db29319d4b59924724fd15a032b6_720w.jpg","zjq4.jpg");
        ExecutorService esc = Executors.newFixedThreadPool(3);
        Future<Boolean> r1 = esc.submit(tt2);
        Future<Boolean> r2 = esc.submit(tt3);
        Future<Boolean> r3 = esc.submit(tt4);
        boolean rs1 = r1.get();
        boolean rs2 = r1.get();
        boolean rs3 = r1.get();

        esc.shutdown();
    }
}
class webDownloader1{
    public void downloader(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("IO 错误");
        }

    }
}