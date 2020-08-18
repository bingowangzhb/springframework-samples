package com.bgw.aop.sample2;

/**
 * HelloServiceImpl
 *
 * @author zhibin.wang
 * @since 2020/08/07 15:09
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
