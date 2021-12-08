package com.bgw.spring.ioc.annotation.sample8.config;

import com.bgw.spring.ioc.annotation.sample8.CatFactory;
import com.bgw.spring.ioc.annotation.sample8.InstantiationTracingBeanPostProcessor;
import com.bgw.spring.ioc.annotation.sample8.Person;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * AppConfig
 *
 * @author zhibin.bgw
 * @since 2019-12-22 21:16
 **/

@Configuration
public class Sample8Config {

    @Scope("singleton")
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Person person() {
        return new Person("James", 23);
    }


    @Bean("cat")
    public CatFactory catFactory() {
        return new CatFactory();
    }

    @Bean
    public BeanPostProcessor instantiationTracingBeanPostProcessor() {
        return new InstantiationTracingBeanPostProcessor();
    }
}
