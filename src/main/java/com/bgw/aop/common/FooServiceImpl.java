package com.bgw.aop.common;

/**
 * FooServiceImpl
 * @author zhibin.wang
 */
public class FooServiceImpl implements FooService {

    @Override
    public void foo(String name, Integer age) {
        System.out.println("foo name : " + name + ", age: " + age);
        //System.out.println(1/0);
    }
}
