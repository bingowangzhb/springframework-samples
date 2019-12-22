package com.bgw.ioc.sample7;

public interface AccountRepository {
    /**
     * increase
     * @param account account
     * @param money money
     */
    void increase(String account, Double money);
}
