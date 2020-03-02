package com.bgw.ioc.annotation.sample1.config;

import com.bgw.ioc.annotation.sample1.AccountRepository;
import com.bgw.ioc.annotation.sample1.TransferService;
import com.bgw.ioc.annotation.sample1.TransferServiceImpl;
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

    @Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }
}
