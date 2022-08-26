package syn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/16
 * \* Time: 19:58
 * \* To change this template use File | Settings | File Templates.
 * \* Description:将线程完整的存入list（1000）
 * \
 */
public class UnsafeLisk {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 1000; i++) {
           new Thread(()->{
               synchronized (list) {
                   list.add(Thread.currentThread().getName());
               }
           }).start();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
