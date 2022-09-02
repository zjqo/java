package com.danei.mysql;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/26
 * \* Time: 18:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Account {
    private String id;
    private String name;
    private int age;
    private String sex;
    private String clas;
    private int fraction;

    public Account(String id, String name, int age, String sex, String clas, int fraction) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.clas = clas;
        this.fraction = fraction;
    }

    public Account(String id, String name, String sex, String clas, int fraction) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.clas = clas;
        this.fraction = fraction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", clas='" + clas + '\'' +
                ", fraction=" + fraction +
                '}';
    }
}
