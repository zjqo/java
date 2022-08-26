package domain;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/19
 * \* Time: 21:41
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Person {
    private String name;
    private int age;
    public String sex;
    public String sex2;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void eat(String ci){
        System.out.println(ci);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sex2='" + sex2 + '\'' +
                '}';
    }
}
