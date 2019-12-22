package com.bgw.ioc.sample6;

public interface AccountRepository {
    /**
     * increase
     * @param account account
     * @param money money
     */
    void increase(String account, Double money);
}
