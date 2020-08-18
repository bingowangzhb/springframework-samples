package com.bgw.ioc.annotation.sample8.config;

import com.bgw.ioc.annotation.sample8.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:16
 **/
@ComponentScan(basePackages = {"com.bgw.ioc.annotation.sample8"})
@Configuration
public class Sample8Config {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Person person() {
        return new Person("James", 23);
    }
}
