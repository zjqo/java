package syn;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/17
 * \* Time: 20:12
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestPC {
    public static void main(String[] args) {
        synContainer syn = new synContainer();
        new Product(syn).start();
        new Consumer(syn).start();
    }
}
//生产者
class Product extends Thread{
    synContainer container;
    public Product(synContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了"+i+"鸡");
            container.push(new Chicken(i));
        }
    }
}
//消费者
class Consumer extends Thread{
    synContainer container;
    public Consumer(synContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了"+container.pop().id+"鸡");

        }
    }
}
class Chicken{
    int id;//产品编号
    public Chicken(int id){
        this.id = id;
    }
}
//缓冲区
class synContainer{
    Chicken[] chickens = new Chicken[10];//仓库最多放10个产品
    int count = 0;
    public synchronized void push(Chicken chicken){
        if(count==chickens.length){//判断容器是否已满
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //满了就通知消费者消费
        }
        chickens[count] = chicken;
        count++;
        this.notifyAll();
    }
    public synchronized Chicken pop(){
        if(count == 0){
            //通知生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Chicken chicken = chickens[count];

        this.notifyAll();
        return chicken;

    }
}
