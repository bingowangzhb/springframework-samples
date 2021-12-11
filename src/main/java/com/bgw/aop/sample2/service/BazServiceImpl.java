package com.bgw.aop.sample2.service;

import org.springframework.stereotype.Service;

/**
 * BazServiceImpl
 *
 * @author wang
 * @since 2021/4/18 11:37
 **/
@Service("bazService")
public class BazServiceImpl {

    public void baz(String name) {
        System.out.println(" baz :" + name );
    }
}
