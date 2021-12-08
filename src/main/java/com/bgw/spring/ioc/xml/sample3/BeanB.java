package com.bgw.spring.ioc.xml.sample3;

/**
 * BeanB
 *
 * @author bgw
 * @since 2020/4/18 15:03
 **/
public class BeanB {

    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}
