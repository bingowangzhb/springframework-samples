package com.bgw.spring.ioc.framework;

/**
 * MyAbstractBeanFactory
 *
 * @author zhibin.bgw
 * @since 2020/09/03 10:54
 */
public abstract class MyAbstractAutowireCapableBeanFactory extends MyAbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, Object[] args) {
        return null;
    }
}
