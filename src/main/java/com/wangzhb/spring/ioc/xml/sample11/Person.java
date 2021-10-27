package com.wangzhb.spring.ioc.xml.sample11;

/**
 * Person
 *
 * @author zhibin.wangzhb
 * @since 2019-11-23 19:10
 **/
public class Person {

    private String name;
    private Integer age;

    public Person() {
        System.out.println("--------Person NoArgConstructor-------");
    }

    public Person(String name, Integer age) {
        System.out.println("--------Person AllArgConstructor-------");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void init() {
        System.out.println("-------Person init-method ------");
    }

    public void destroy() {
        System.out.println("-------Person destroy-method ------");
    }
}
