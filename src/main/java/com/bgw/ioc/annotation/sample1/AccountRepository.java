package com.bgw.ioc.annotation.sample1;

public interface AccountRepository {
    /**
     * increase
     * @param account account
     * @param money money
     */
    void increase(String account, Double money);
}
