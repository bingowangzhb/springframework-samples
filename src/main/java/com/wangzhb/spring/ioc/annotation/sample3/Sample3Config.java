package com.wangzhb.spring.ioc.annotation.sample3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Sample3Config
 *
 * @author wangzhb
 * @since 2020/8/9 22:48
 **/
@Configuration
@Import({Dog.class, MyImportSelector.class})
public class Sample3Config {


    @Bean
    public MyImportDefinitionRegistrar myImportDefinitionRegistrar() {
        return new MyImportDefinitionRegistrar();
    }
}
