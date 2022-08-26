package syn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 18:31
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class testList {


    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<Student>();
        Student s1 = new Student("zhangsan",15);
        Student s2 = new Student("zhangsan2",15);
        Student s3 = new Student("zhangsan4",15);
        Student s4 = new Student("zhangsan4",15);
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        coll.add(s4);
        Student s5 = new Student("zhangsan",15);
        System.out.println(coll.contains(s5));
        Iterator<Student> it = coll.iterator();
        while(it.hasNext()){
            Student st = it.next();
            System.out.println(st.getName());
        }
        coll.forEach(s-> System.out.println(s.getName() ));

    }

    private static void list1() {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.add("hello5");
        //list.remove(1);
        list.add(1,"hello2");
        System.out.println(list);
    }
}
