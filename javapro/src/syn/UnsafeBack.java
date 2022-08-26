package syn;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/16
 * \* Time: 19:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:不安全线程模拟取钱
 * \
 */
public class UnsafeBack {
    public static void main(String[] args) {
        Bank bk = new Bank(3000,"钱钱");
        DaiWing my= new DaiWing(bk,200,"我");
        DaiWing you = new DaiWing(bk,200,"你");
        my.start();
        you.start();
    }
}

class Bank{
    int money;
    String name;

    public Bank(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class DaiWing extends Thread{
    Bank bank;
    int daiwingmoney;
    int nomoney;

    public DaiWing(Bank bank, int daiwingmoney,String name){
        super(name);
        this.bank = bank;
        this.daiwingmoney = daiwingmoney;

    }
    public void run(){
        synchronized (bank){//线程锁，锁方法块，锁的对象结束要增删改查的对象
            System.out.println("卡内余额为："+bank.money);
            if(bank.money-daiwingmoney<0){
                System.out.println("余额不足");
                System.out.println("卡内余额为："+bank.money);
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bank.money = bank.money-daiwingmoney;
            nomoney = nomoney+daiwingmoney;
            System.out.println(this.getName()+"取了"+daiwingmoney);

            System.out.println(this.getName()+nomoney);
        }

    }

}