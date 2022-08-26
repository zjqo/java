package test2;

public class Testclass {
    public static void main(String[] args) {
        coo c = new coo();
        coo c2 = c;
        c.a = 5;
        c2.a = 20;
        System.out.println(c.a);
    }

}
class coo{
    int a=0;

}