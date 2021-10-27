package com.wangzhb.spring.ioc.annotation.sample9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Sample9Config
 *
 * @author zhibin.wangzhb
 * @since 2020/10/24 10:57
 */
@Configuration
public class Sample9Config {



    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        placeholderConfigurer.setLocation(new ClassPathResource("jdbc.properties"));

        
        return placeholderConfigurer;
    }


}
