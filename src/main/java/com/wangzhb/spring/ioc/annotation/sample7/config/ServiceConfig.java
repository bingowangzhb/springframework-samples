package com.wangzhb.spring.ioc.annotation.sample7.config;

import com.wangzhb.spring.ioc.annotation.sample7.AccountRepository;
import com.wangzhb.spring.ioc.annotation.sample7.TransferService;
import com.wangzhb.spring.ioc.annotation.sample7.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final AccountRepository accountRepository;

    @Autowired
    public ServiceConfig(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl(accountRepository);
    }
}
