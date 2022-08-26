public class Staticproxy {
    public static void main(String[] args) {
        weddingcompany we = new weddingcompany(new You());
        we.HappyMarr();
    }
}
abstract class hello{
    abstract void nihao();
    void mi(){
        System.out.println("nihao");
    }
}
class my extends hello {


    @Override
    void nihao() {

    }
}
interface Marr{
    static final int x = 9;
    int y = 5;
    void HappyMarr();
}
class You implements Marr{

    @Override
    public void HappyMarr() {
        System.out.println("这是You"+y);
    }
}
class weddingcompany implements Marr{
    private Marr target;
    public weddingcompany(Marr target){
        this.target = target;
    }
    @Override
    public void HappyMarr() {
        before();
        this.target.HappyMarr();
        after();
    }

    private void after() {
        System.out.println("结束后的代理");
    }

    private void before(){
        System.out.println("第一次代理");
    }
}