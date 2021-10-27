package com.wangzhb.spring.aop.common;

/**
 * HelloServiceImpl
 *
 * @author wangzhb
 * @since 2020/8/15 17:40
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("Hello World....");
        return "Hello, " + name;
    }
}
