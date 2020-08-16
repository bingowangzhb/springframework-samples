package com.bgw.aop.proxy;

/**
 * HelloServiceImpl
 *
 * @author wang
 * @since 2020/8/15 17:40
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("Hello World....");
    }


}
