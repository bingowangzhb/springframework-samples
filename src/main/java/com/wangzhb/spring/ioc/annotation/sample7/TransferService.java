package com.wangzhb.spring.ioc.annotation.sample7;

/**
 * @author zhibin.wangzhb
 */
public interface TransferService {

    /**
     *
     * @param moneyAccount moneyAccount
     * @param fromAccount fromAccount
     * @param toAccount toAccount
     */
    void transfer(Double moneyAccount, String fromAccount, String toAccount);
}
