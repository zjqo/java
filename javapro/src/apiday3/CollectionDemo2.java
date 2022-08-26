package apiday3;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/24
 * \* Time: 10:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("C++");
        list.add(".net");

        List<String> list2 =new ArrayList<String>();

        list2.add("android");
        list2.add("ios");
        list2.add("java");

        System.out.println(list2.addAll(list));//将list1的元素加入到list2中
        System.out.println(list2);

        List<String> list3 = new ArrayList<String>();

        list3.add("java");
        list3.add("C++");
        list3.add("python");

        System.out.println(list2.containsAll(list3));//是否包含所有

        // list3.retainAll(list2);//取交集，取完之后list3就只剩交集的元素

        // list3.removeAll(list2); // 将list3里和list2共有的元素删除

        System.out.println(list3);
        System.out.println(list2);
    }
}
