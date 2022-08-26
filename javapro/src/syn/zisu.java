package syn;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/18
 * \* Time: 9:24
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class zisu {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());//获取系统线程数
        double x = 10.25235;
        BigDecimal db = new BigDecimal("12.35363555");
        BigDecimal db2 = new BigDecimal("23.125485");
        BigDecimal db3 = db.divide(db2, 3, RoundingMode.HALF_UP);
        double z = db.doubleValue();
        System.out.println("z="+z);
        System.out.println(db3);
        double y = 2.36589;
        System.out.println(Math.floor(x));//向下取整
        String m = String.format("%.2f",Math.ceil(x*y));
        double l = Double.parseDouble(m);
        System.out.println("a".matches("[a-z[^def]]"));
        System.out.println("333".matches("\\d{3,10}"));
        //int b = Integer.parseInt(m);
        boolean j = Boolean.parseBoolean(m);
        System.out.println(String.format("%.2f",Math.ceil(x*y)));//向上取整
        //13184548309@163.com
        String chike = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("13184548309@163.com".matches(chike));



    }
    static boolean number(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
