package com.bgw.ioc.annotation.sample1;

/**
 * TransferServiceImpl
 *
 * @author zhibin.wang
 * @since 2019-12-22 16:39
 **/
public class TransferServiceImpl implements TransferService {

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(Double moneyAccount, String fromAccount, String toAccount) {
        System.out.println("From Account: " + fromAccount + " transfer $" + moneyAccount + "to Account: " + toAccount);
        accountRepository.increase(fromAccount, -moneyAccount);
        accountRepository.increase(toAccount, moneyAccount);
    }
}
