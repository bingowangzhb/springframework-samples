package com.wangzhb.spring.aop.sample2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FooServiceImpl
 *
 * @author wangzhb
 * @since 2020/9/6 15:07
 **/
@Service("fooService")
public class FooServiceImpl implements FooService {

    @Autowired
    private BarService barService;

    @Override
    public void foo() {
        System.out.println("-------foo----");
    }
}
