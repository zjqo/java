package apiday3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/24
 * \* Time: 9:14
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class CollectionDemo {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        list.add("asd");
       // list.remove(0);
        list.clear();
        System.out.println(list.toString());//判断集合是否为空*/
        List<Integer> list = new ArrayList<Integer>();
        List<Point> list2 = new ArrayList<Point>();
        list2.add(new Point(1,2));
        list2.add(new Point(3,4));
        list2.add(new Point(5,6));
        // Point point = list2.get(1);
        System.out.println(list2);
        Point point1 = new Point(1,2);
        boolean contains = list2.contains(point1);//判断元素是否存在，equals判断
        System.out.println(contains);
        System.out.println(list2.remove(point1));//删除与对象相同的集合元素
    }
}
