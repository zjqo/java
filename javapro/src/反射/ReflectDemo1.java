package 反射;

import domain.Person;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 21:44
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象的方式
            //1、Class.forName("全类名")
        Class aClass = Class.forName("domain.Person");
        System.out.println(aClass);
            //2、类名.class
        Class personClass = Person.class;
        System.out.println(personClass);
            //3、对象.getClass();
    }
}
