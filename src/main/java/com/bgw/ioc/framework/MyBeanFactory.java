package com.bgw.ioc.framework;

/**
 * MyBeanFactory
 *
 * @author zhibin.wang
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
