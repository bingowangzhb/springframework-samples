package com.bgw.spring.ioc.annotation.sample8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Cat
 *
 * @author zhibin.bgw
 * @since 2020/08/06 10:49
 */
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("------------Cat NoArgConstructor----------");
    }


    public void init() {
        System.out.println("------------Cat init Method---------------");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("------------Cat postConstruct---------------");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("------------Cat preDestroy---------------");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("------------Cat destroy---------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("------------Cat afterPropertiesSet---------------");
    }
}
