package com.bgw.spring.ioc.xml.sample6;

/**
 * DefaultServiceLocator
 *
 * @author bgw
 * @since 2020/3/12 21:41
 **/
public class DefaultServiceLocator {

    private ClientService clientService = new ClientServiceImpl();

    private AccountService accountService = new AccountServiceImpl();

    public AccountService createAccountServiceInstance() {
        return accountService;
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }
}
