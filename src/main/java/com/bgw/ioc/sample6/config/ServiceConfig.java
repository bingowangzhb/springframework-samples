package com.bgw.ioc.sample6.config;

import com.bgw.ioc.sample6.AccountRepository;
import com.bgw.ioc.sample6.TransferService;
import com.bgw.ioc.sample6.TransferServiceImpl;
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
