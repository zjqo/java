package Listmode1;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/25
 * \* Time: 15:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Listmedo2 {
    public static void main(String[] args) {
        List<Point> poin = new ArrayList<>();
        poin.add(new Point(1,2));
        poin.add(new Point(3,4));
        poin.add(new Point(5,6));
        poin.add(new Point(7,8));
        poin.add(new Point(9,100));
        poin.add(new Point(11,12));
        Collections.sort(poin,( o1,  o2) ->(o1.getX()*o1.getX()+o1.getY()*o1.getY())-(o2.getX()*o2.getX()+o2.getY()*o2.getY()));
        System.out.println(poin);

        poin.sort(( o1,  o2) ->(o1.getX()*o1.getX()+o1.getY()*o1.getY())-(o2.getX()*o2.getX()+o2.getY()*o2.getY()));
        System.out.println(poin);
    }
}
