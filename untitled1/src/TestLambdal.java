//推导lambda表达式
public class TestLambdal {
    //静态内部类
    static class like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }
    public static void main(String[] args) {
        Ilike like = new like();
        like.lambda();

        like = new like2();
        like.lambda();

        //局部内部类
        class like3 implements Ilike{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        like = new like3();
        like.lambda();

        //匿名内部类,没有类的名称必须借助接口或父类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        like.lambda();

        //lambda简化
        like = () ->{
            System.out.println("i like lambda5");
        };
        like.lambda();


    }
}
interface Ilike{
    void lambda();
}
//普通实现类
class like implements Ilike{

    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}