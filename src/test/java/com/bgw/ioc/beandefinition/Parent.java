package com.bgw.ioc.beandefinition;

import lombok.ToString;

/**
 * Parent
 *
 * @author wang
 * @since 2020/4/13 23:24
 **/
@ToString
public class Parent {

    private String name;

    private Integer age;

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
