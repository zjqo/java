package apiday3;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/24
 * \* Time: 14:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class InteratorDame {
    public static void main(String[] args) {
       /* List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("#");
        list.add("tow");
        list.add("#");
        list.add("three");
        list.add("#");
        list.add("four");
        list.add("#");
        list.add("five");
        Collection c = new ArrayList();

        Iterator<String> it = list.iterator(); //创建迭代器
        while(it.hasNext()){ // 获取下一个位置是否有元素
            String str = it.next(); // 获取下一个元素
//            if("#".equals(str)){
//                it.remove();
//            }
            System.out.println(str);
        }


        for (String s : list) { // iter
            System.out.println(s);
        }*/


        String [] str = {"asd","asd","qwe"};
        System.out.println(str.length);
        //将数组转化为集合
        List<String> strings = Arrays.asList(str);
        List<String> list = new ArrayList<>(strings); // list的值不会随着strings的值变化
        List<String> list2 = new ArrayList<String>(Arrays.asList(str));
        str[0] = "cvb";
        System.out.println(strings);
        System.out.println(list);
        String [] str1 = list.toArray(new String[list.size()]);

    }

}
