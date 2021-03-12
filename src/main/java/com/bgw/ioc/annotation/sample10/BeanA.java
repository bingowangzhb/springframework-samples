package com.bgw.ioc.annotation.sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * BeanA
 *
 * @author zhibin.wang
 * @since 2021/03/10 11:19
 */
@Component
public class BeanA {

    public BeanA() {
        System.out.println(" no arguments constructor is invoked! ");
    }

    @Autowired
    public BeanA(BeanB b) {
        System.out.println("b = " + b);
    }

    public BeanA(BeanC c) {
        System.out.println("c = " + c);
    }

    public BeanA(String s) {
        System.out.println("s = " + s);
    }

    public BeanA(BeanB b, BeanC c) {
        System.out.println("bc");
    }

    public BeanA(BeanB b, BeanC c, String s) {
        System.out.println("bcs");
    }

}
