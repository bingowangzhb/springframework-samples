package com.bgw.spring.ioc.framework;

/**
 * MyDefaultSingletonBeanRegistry
 *
 * @author zhibin.bgw
 * @since 2020/09/03 11:15
 */
public class MyDefaultSingletonBeanRegistry {

    Object getSingleton(String beanName, MyObjectFactory<?> objectFactory) {
        System.out.println("before getSingleton");
        Object bean = objectFactory.getObject();
        System.out.println("after getSingleton");

        return bean;
    }
}
