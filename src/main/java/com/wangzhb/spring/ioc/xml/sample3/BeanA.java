package com.wangzhb.spring.ioc.xml.sample3;

/**
 * BeanA
 *
 * @author wangzhb
 * @since 2020/4/18 15:03
 **/
public class BeanA {
    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
