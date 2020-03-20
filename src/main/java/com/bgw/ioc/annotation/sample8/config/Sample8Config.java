package com.bgw.ioc.annotation.sample8.config;

import com.bgw.ioc.annotation.sample8.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * AppConfig
 *
 * @author zhibin.wang
 * @since 2019-12-22 21:16
 **/
@Configuration("sample8Config")
public class Sample8Config {

    @Lazy
    @Bean
    public Person person() {
        return new Person("James", 23);
    }

}
