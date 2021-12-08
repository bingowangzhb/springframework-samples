package com.bgw.spring.ioc.xml.sample11;

/**
 * DefaultServiceLocator
 *
 * @author zhibin.bgw
 * @since 2019-11-24 16:00
 **/
public class DefaultServiceLocator {

    private PersonService personService = new PersonService();
    private AccountService accountService = new AccountService();

    public PersonService createPersonService() {
        return personService;
    }

    public AccountService createAccountService() {
        return accountService;
    }
}
