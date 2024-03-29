package com.bgw.spring.ioc.annotation.sample8;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * CatFactory
 *
 * @author zhibin.bgw
 * @since 2020/10/20 20:22
 */
@Component("cat")
public class CatFactory implements FactoryBean<Cat> {

    @Override
    public Cat getObject() throws Exception {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
