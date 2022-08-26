package 简单的测试;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/20
 * \* Time: 15:41
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Calculator {
    @Check
    public void add(){
        System.out.println("1+0=" + (1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0=" + (1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0=" + (1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0=" + (1/0));
    }
    public void show(){
        System.out.println("无bug");
    }
}
