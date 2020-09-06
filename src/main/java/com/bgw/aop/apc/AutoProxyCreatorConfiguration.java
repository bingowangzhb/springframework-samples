package com.bgw.aop.apc;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoProxyCreatorConfiguration
 *
 * @author wang
 * @since 2020/8/31 22:55
 **/
@Configuration
public class AutoProxyCreatorConfiguration {


    @Bean
    public BeanNameAutoProxyCreator autoProxyCreator() {
        BeanNameAutoProxyCreator autoProxyCreator = new BeanNameAutoProxyCreator();
        autoProxyCreator.setInterceptorNames("myInterceptor");
        autoProxyCreator.setBeanNames("*service");
        return autoProxyCreator;
    }
}
