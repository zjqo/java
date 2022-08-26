package junittest;

import junit.Calcu;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 20:53
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class calcutest {
    @Before   // 初始化方法，用于申请资源，所有方法执行之前都会执行该方法
    public void init(){

    }
    @After   // 释放资源，所有方法执行完成后都将执行该方法
    public void close(){

    }
    @Test
    public void testAdd(){
        Calcu cu = new Calcu();
        Assert.assertEquals(5,cu.add(1, 2));//断言，第一个数是我觉得应该的值，第二个是实际运算后的值
    }
}
