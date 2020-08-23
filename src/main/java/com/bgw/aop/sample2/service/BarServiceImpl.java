package com.bgw.aop.sample2.service;

/**
 * BarService
 *
 * @author wang
 * @since 2020/8/9 23:18
 **/
public class BarServiceImpl implements BarService {
    @Override
    public String bar(String name, int age) {
        System.out.println("-------------------------bar()------------------------------");
        System.out.println("name=" + name + ", age=" + age);

        return "Hello, " + name + ", age=" + age;
    }
}
