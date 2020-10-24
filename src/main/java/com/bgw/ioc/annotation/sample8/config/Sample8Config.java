package com.bgw.ioc.annotation.sample8.config;

import com.bgw.ioc.annotation.sample8.Cat;
import com.bgw.ioc.annotation.sample8.CatFactory;
import com.bgw.ioc.annotation.sample8.InstantiationTracingBeanPostProcessor;
import com.bgw.ioc.annotation.sample8.Person;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:16
 **/

@Configuration
public class Sample8Config {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Person person() {
        return new Person("James", 23);
    }


    @Bean("catFactory")
    public CatFactory catFactory() {
        return new CatFactory();
    }

    @Bean
    public BeanPostProcessor instantiationTracingBeanPostProcessor() {
        return new InstantiationTracingBeanPostProcessor();
    }
}
