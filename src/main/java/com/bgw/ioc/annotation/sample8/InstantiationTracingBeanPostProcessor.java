package com.bgw.ioc.annotation.sample8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * InstantiationTracingBeanPostProcessor
 *
 * @author zhibin.wang
 * @since 2020/10/20 20:43
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-------postProcessBeforeInitialization：beanName '" + beanName + "'");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-------postProcessAfterInitialization：Bean '" + beanName + "' created: " + bean.toString());
        return bean;
    }
}
