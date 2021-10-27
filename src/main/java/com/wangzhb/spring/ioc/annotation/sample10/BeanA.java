package com.wangzhb.spring.ioc.annotation.sample10;

import org.springframework.stereotype.Component;

/**
 * BeanA
 *
 * @author zhibin.wangzhb
 * @since 2021/03/10 11:19
 */
@Component
public class BeanA {

    public BeanA() {
        System.out.println(" no arguments constructor is invoked! ");
    }

    public BeanA(BeanB b) {
        System.out.println("b = " + b);
    }

    public BeanA(BeanC c) {
        System.out.println("c = " + c);
    }

    public BeanA(BeanB b, BeanC c) {
        System.out.println("bc");
    }



}
