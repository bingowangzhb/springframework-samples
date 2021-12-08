package com.bgw.spring.ioc.framework;

/**
 * MyBeanFactory
 *
 * @author zhibin.bgw
 * @since 2020/09/03 11:09
 */
public interface MyBeanFactory {

    /**
     * getBean
     * @param name name
     * @return Object
     */
    Object getBean(String name);
}
