package syn;

import java.util.StringJoiner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 8:33
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StringMode1 {

    public static void main(String[] args) {
        String str = "abc";
        char[] cha = str.toCharArray();
        for (int i = 0; i < cha.length; i++) {

            if(cha[i] == 'b'){
                cha[i] = 'z';
            }
            System.out.print(cha[i]);
        }
        str = new String(cha);
        System.out.println(str);
        System.out.println(str = String.valueOf(cha));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));//获取字符串的单个内容
        }
        int []a = {1,2,3};
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < a.length; i++) {
            sj.add(a[i]+"");
        }
        System.out.println(sj);

    }
}
