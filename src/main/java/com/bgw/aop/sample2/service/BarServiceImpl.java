package com.bgw.aop.sample2.service;

/**
 * BarService
 *
 * @author wang
 * @since 2020/8/9 23:18
 **/
public class BarServiceImpl implements BarService {
    @Override
    public void bar() {
        System.out.println("-------------------------bar()------------------------------");
    }
}
