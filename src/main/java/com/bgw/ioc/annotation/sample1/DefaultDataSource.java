package com.bgw.ioc.annotation.sample1;

/**
 * DefaultDataSource
 *
 * @author zhibin.wang
 * @since 2019-12-22 16:42
 **/
public class DefaultDataSource implements DataSource {

    @Override
    public void initConnection() {
        System.out.println("initConnection....");
    }
}
