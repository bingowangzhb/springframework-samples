package com.bgw.ioc.annotation.sample7;

/**
 * JdbcAccountRepository
 *
 * @author zhibin.wang
 * @since 2019-12-22 16:41
 **/
public class JdbcAccountRepository implements AccountRepository {

    private DataSource dataSource;

    public JdbcAccountRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void increase(String account, Double money) {
        dataSource.initConnection();
        System.out.println("Account: " + account + " increased $" + money);
    }
}
