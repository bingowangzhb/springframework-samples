package com.bgw.ioc.sample5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * InstantiationTracingBeanProcessor
 *
 * @author zhibin.wang
 * @since 2019-12-12 22:39
 **/
public class InstantiationTracingBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName '" + beanName + "', class '" + bean.getClass() + "'");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
