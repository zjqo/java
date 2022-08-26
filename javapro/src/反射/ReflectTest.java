package 反射;

import java.io.IOException;
import java.io.InputStream;
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
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1、加载配置文件
            //1.1、创建Properties对象
        Properties pro = new Properties();
            //1.2、加载配置文件，转换为一个集合
                //1.2.1、获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream rs = classLoader.getResourceAsStream("pro.properties");
        pro.load(rs);


        //2、获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3、加载该类进内存
        Class aClass = Class.forName(className);
        //创建对象
        Object obj = aClass.newInstance();
        //获取方法对象
        Method method =aClass.getMethod(methodName,String.class);
        method.invoke(obj,"吃饭");
    }
}
