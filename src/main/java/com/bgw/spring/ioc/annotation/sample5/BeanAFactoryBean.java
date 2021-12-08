package com.bgw.spring.ioc.annotation.sample5;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhibin.bgw
 */
public class BeanAFactoryBean implements FactoryBean<BeanA> {

    @Override
    public BeanA getObject() throws Exception {
        return new BeanA();
    }

    @Override
    public Class<?> getObjectType() {
        return BeanA.class;
    }
}
