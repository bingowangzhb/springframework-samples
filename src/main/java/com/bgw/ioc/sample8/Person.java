package com.bgw.ioc.sample8;

/**
 * Person
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:17
 **/
public class Person {

    private String name;

    private Integer age;

    public Person() {
        System.out.println("---------Person NoArgsConstructor---------");
    }

    public Person(String name, Integer age) {
        System.out.println("---------Person AllArgsConstructor---------");
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
}
