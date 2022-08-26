package 简单的测试;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/20
 * \* Time: 15:44
 * \* To change this template use File | Settings | File Templates.
 * \* Description:j简单的测试框架
 * \
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //创建计算器对象
        Calculator c = new Calculator();
        //2、获取字节码文件对象
        Class aClass = c.getClass();
        //3、获取所有的方法
        Method[] methods = aClass.getMethods();
        int num = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //4、判断是否有注解
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(aClass);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName()+"出现异常");
                    bw.newLine();
                    //bw.write("异常名称"+ e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    //bw.write("异常原因"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------------------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次一共出现"+num+"异常");
        bw.flush();
        bw.close();

    }


}
