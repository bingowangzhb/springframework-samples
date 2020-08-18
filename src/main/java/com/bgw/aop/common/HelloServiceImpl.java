package com.bgw.aop.common;

/**
 * HelloServiceImpl
 *
 * @author wang
 * @since 2020/8/15 17:40
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("Hello World....");
        return "Hello, " + name;
    }
}
