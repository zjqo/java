package syn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 11:36
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestTime {
    public static void main(String[] args) throws ParseException {
        //RandomDate();
        //time();
//        Date dt = new Date();
//        System.out.println(new SimpleDateFormat("yy-MM-dd HH-mm-ss EE").format(dt));
        //simp();
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.YEAR,1999);
        int year = ca.get(Calendar.YEAR);
        System.out.println(year);
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        ZoneId z2 = ZoneId.systemDefault();
        System.out.println(z2);
        Instant now = Instant.now();//获取当前时间，不带时区
        System.out.println(now);
        ZonedDateTime now1 = ZonedDateTime.now();//获取当前时区的时间
        System.out.println(now1);
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1999,10,10);
        Period period = Period.between(ld2,ld);
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println(days);
        System.out.println(months);
        System.out.println(period.toTotalMonths()*30);


        System.out.println("==========================================================");


        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022,10,10,0,0,0);
        Duration dua = Duration.between(ldt2,ldt);
        System.out.println(dua.toDays());


        System.out.println("==========================================================");




        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        String str2 = Integer.toBinaryString(i);
        System.out.println(str2);



        System.out.println("==========================================================");

        Integer [] a = {2,3,5,6,8,9,5,6,2,9};
        Arrays.sort(a, (Integer o1,Integer o2) ->{
            return o1-o2;
        });
        System.out.println(Arrays.toString(a));
    }

    private static void simp() throws ParseException {
        String str = "1999-10-10";
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = sm.parse(str);
        SimpleDateFormat sm2 = new SimpleDateFormat("yyyy年MM月dd日");
        String fmat = sm2.format(dd);
        System.out.println(fmat);
    }

    private static void RandomDate() {
        Random r = new Random();
        Date d1 = new Date( Math.abs(r.nextInt()));
        Date d2 = new Date( Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        long m = time1 > time2 ? time1: time2;
        if(m==time1){
            System.out.println("time1da  ");
        }else{
            System.out.println("time2da  ");
        }
        System.out.println(m);
    }

    //获取时间远点的后一年
    private static void time() {
        Date d = new Date(0L);
        long time = d.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);
        System.out.println(d);
    }

}
