package Listmode1;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/25
 * \* Time: 9:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Listdame {
        public static void main(String[] args) {
           /* List<String> list = new ArrayList<String>();
            list.add("zxc");
            list.add("asd");
            list.add("qwe");
            //list.remove("asd" );
            System.out.println(list.set(1,"568"));
            Collections.reverse(list); //反转list，李斯特中的下标变化
            System.out.println(list);
            list.add(0,"345");
            System.out.println(list);
            System.out.println(list.indexOf("qwe"));
            List<String> sub = list.subList(1, 3); // 获取子集，含头不含尾[1,3 )
            sub.set(0,"123");
            list.set(1,"999");
            System.out.println(list);
            System.out.println(sub);
            String [] s = {"99","345","678"};
            List<String> str = Arrays.asList(s);


            Random rad = new Random();
            List<Integer> in = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                in.add(rad.nextInt(100));
            }
            Collections.sort(in);
            Collections.reverse(in);
            int [] it = {3,2,1,2,6,7,9,8};
            Arrays.sort(it,0,it.length);
            it = dx(it);

            System.out.println(Arrays.toString(it));
            System.out.println(in);
*/
           List<String> list = new ArrayList<String>();
           list.add("张三");
           list.add("李四");
           list.add("王五");
           list.add("张麻子");
           list.add("二狗子");
           //Collections.sort(list);
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length()-o2.length();

                }
            });
           System.out.println(list);
        }
        static int[] dx(int[] it){
            for (int i = 0,end = it.length-1; i<=end; i++,end--) {
                int y = it[i];
                it[i] = it[end];
                it[end] = y;
            }
            return it;
        }
}
