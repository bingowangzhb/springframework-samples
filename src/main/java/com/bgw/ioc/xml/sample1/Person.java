package com.bgw.ioc.xml.sample1;

public class Person {

    private String name;
    private Integer sex;
    private int age;

    public Person(String name, Integer sex, int age) {
        System.out.println("----------Person有参构造函数----------");
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
        System.out.println("----------Person无参构造函数----------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() {
        System.out.println("---------Person initMethod:init()----------");
    }

    public void destroy() {
        System.out.println("----------Person destroyMethod:destroy()----------");
    }
}
