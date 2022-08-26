package 注解;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/20
 * \* Time: 10:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@MyAnon(className = "注解.Anno",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        MyAnon annotation = reflectTestClass.getAnnotation(MyAnon.class);//获取上边的注解对象，其实就是在内存中生成一个该注解接口的子类实现对象
        String s = annotation.className();
        String s1 = annotation.methodName();
        Class aClass = Class.forName(s);
        Object obj = aClass.newInstance();
        Method method = aClass.getMethod(s1);
        method.invoke(obj);
    }
}
