package com.bgw.ioc.annotation.sample7.config;

import com.bgw.ioc.annotation.sample7.AccountRepository;
import com.bgw.ioc.annotation.sample7.TransferService;
import com.bgw.ioc.annotation.sample7.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ServiceConfig
 *
 * @author zhibin.wang
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
