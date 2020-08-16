package com.bgw.aop.sample1;

public class SimplePojo implements Pojo {

    @Override
    public void foo(String name, Integer age) {
        System.out.println("foo name : " + name + ", age: " + age);
        //System.out.println(1/0);
    }
}
