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
    @Before   // ��ʼ������������������Դ�����з���ִ��֮ǰ����ִ�и÷���
    public void init(){

    }
    @After   // �ͷ���Դ�����з���ִ����ɺ󶼽�ִ�и÷���
    public void close(){

    }
    @Test
    public void testAdd(){
        Calcu cu = new Calcu();
        Assert.assertEquals(5,cu.add(1, 2));//���ԣ���һ�������Ҿ���Ӧ�õ�ֵ���ڶ�����ʵ��������ֵ
    }
}
