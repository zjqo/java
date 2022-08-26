import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/23
 * \* Time: 10:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class biao {
    public static void main(String[] args) {
        String line = ".121315121..1213..1.........";
        String [] str = line.split("\\."); //拆分
        System.out.println(Arrays.toString(str));
        // line.replaceAll("","") 替換字符
        String s = Arrays.toString(str);
        String s1 = s.replaceAll("\\[|\\]|,","");
        System.out.println(s1);
        s1.trim();
        System.out.println(s1);


    }
}
