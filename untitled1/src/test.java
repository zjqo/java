import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class test {
    List<String> list1 = new ArrayList<>();
    @Test
    public void test1(){

        list1.add("你好");
        list1.add("你好1");
        list1.add("你好2");
        list1.add("你好3");
        System.out.print(list1);
    }
    @Test
    public void test2(){
        test1();
        list1.add(2,"hello");
        System.out.print(list1);
        list1.remove(3);
        System.out.print("\n"+list1);
        List<String> list2 = new ArrayList<>();
        list2.add("你好4");
        list2.add("你好5");
        list2.add("你好6");
        list2.add("你好7");
        int x = list1.size();
        list1.addAll(x,list2);
        System.out.print(list1);
        Qoo s = new Qoo(10);
        Qoo o = s.test(30);
        System.out.print(o.x);
        System.out.print(s.x);

    }
}
class Qoo{
    int x;
    Qoo(int x ){
        this.x = x;
    }
    Qoo test(int x){
        return new Qoo(x);
    }

}
