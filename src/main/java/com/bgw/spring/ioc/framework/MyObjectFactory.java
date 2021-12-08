package com.bgw.spring.ioc.framework;

/**
 * MyObjectFactory
 *
 * @author zhibin.bgw
 * @since 2020/09/03 10:52
 */
public interface MyObjectFactory<T> {
    /**
     * getObject
     * @return T
     */
    T getObject();
}
