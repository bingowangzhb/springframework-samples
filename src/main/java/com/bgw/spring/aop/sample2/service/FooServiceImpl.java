package com.bgw.spring.aop.sample2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FooServiceImpl
 *
 * @author bgw
 * @since 2020/9/6 15:07
 **/
public class FooServiceImpl implements FooService {

    private BarService barService;

    @Override
    public void foo() {
        System.out.println("-------foo----");
    }
}
