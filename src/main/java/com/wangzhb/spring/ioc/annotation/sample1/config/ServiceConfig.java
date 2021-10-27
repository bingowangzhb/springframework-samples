package com.wangzhb.spring.ioc.annotation.sample1.config;

import com.wangzhb.spring.ioc.annotation.sample1.AccountRepository;
import com.wangzhb.spring.ioc.annotation.sample1.TransferService;
import com.wangzhb.spring.ioc.annotation.sample1.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ServiceConfig
 *
 * @author zhibin.wangzhb
 * @since 2019-12-22 16:38
 **/
@Configuration
public class ServiceConfig {

    @Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }
}
