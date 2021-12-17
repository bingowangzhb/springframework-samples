package com.bgw.spring.ioc.annotation.sample13;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ambow
 * @since 2021/12/17 16:59
 */
@Component
public class LiteConfig {

    @Bean
    public LiteBean liteBean() {
        return new LiteBean();
    }

    @Bean
    public String lb(LiteBean liteBean) {

        System.out.println("liteBean = " + liteBean().hashCode());
        System.out.println("liteBean = " + liteBean().hashCode());
        return "lb";
    }
}
