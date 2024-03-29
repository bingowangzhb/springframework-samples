package com.bgw.spring.ioc.framework;


/**
 * MyAbstractBeanFactory
 *
 * @author zhibin.bgw
 * @since 2020/09/03 10:55
 */
public abstract class MyAbstractBeanFactory extends MyDefaultSingletonBeanRegistry implements MyBeanFactory {

    /**
     * createBean
     * @param beanName beanName
     * @param args args
     * @return Object
     */
    protected abstract Object createBean(String beanName, Object[] args);
}
