package Listmode1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/25
 * \* Time: 16:45
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class More {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<String>();
        set.add("asd");
        set.add("asd2");
        set.add("asd3");
        set.add("asd");
        System.out.println(set);*/

        //如何去重
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("asd");
        list.add("asd");
        list.add("asd2");
        list.add("asd3");
        list.add("asd4");
        System.out.println(list);
        for (String s : list) {
            if(!list2.contains(s)){
                list2.add(s);
            }

        }
        System.out.println(list2);

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        System.out.println(2%5);
    }
}
