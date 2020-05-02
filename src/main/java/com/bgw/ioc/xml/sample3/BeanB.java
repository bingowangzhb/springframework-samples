package com.bgw.ioc.xml.sample3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * BeanB
 *
 * @author wang
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
