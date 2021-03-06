package com.bgw.ioc.annotation.sample7;

/**
 * @author zhibin.wang
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
