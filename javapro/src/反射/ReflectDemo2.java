package 反射;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 22:06
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();//获取所有的public对象
        for (Field field : fields) {//iter 快捷生成
            System.out.println(field);
        }
        System.out.println("-----------------------------------------------");
        Field sex = personClass.getField("sex");
        Person person = new Person();
        Object p = sex.get(person);
        System.out.println(p);
        sex.set(person,"男");
        System.out.println(person);



        System.out.println("-----------------------------------------------");





        Field[] declaredFields = personClass.getDeclaredFields();


        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        Object na = name.get(person);
        System.out.println(na);
        name.set(person,"张三");
        System.out.println(person);



        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");


        Constructor constructor = personClass.getConstructor(String.class, int.class);//获取构造方法
        System.out.println(constructor);
        Object con = constructor.newInstance("李四", 15);
        System.out.println(con);

        System.out.println("-----------------------------------------------");



        Object con1 = personClass.newInstance();
        System.out.println(con1);


        System.out.println("-----------------------------------------------");
        Method eat = personClass.getMethod("eat", String.class);//获取eat方法，有String的一个形参
        eat.invoke(person,"饭");//执行eat方法
        eat.setAccessible(true);
    }
}
