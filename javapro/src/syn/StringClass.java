package syn;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 10:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StringClass {
    public static void main(String[] args) {
        String str = "abcde";
        String str2 = "cdeab";
        System.out.println("kaishi");
        int i=0;
        while(true){
            if(str.equals(str2)){
                break;
            }
            str =  xz(str);
            i++;
            System.out.println(str);
        }
        System.out.println(i);
    }
    public static String xz(String str){
        char[] chr = str.toCharArray();
        char c = chr[0];
        for (int i = 1; i < chr.length; i++) {
            chr[i-1] = chr[i];
        }
        chr[chr.length-1] = c;
        String str2 = new String(chr);

        return str2;
    }
}
