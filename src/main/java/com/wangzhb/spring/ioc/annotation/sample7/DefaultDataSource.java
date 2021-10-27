package com.wangzhb.spring.ioc.annotation.sample7;

/**
 * DefaultDataSource
 *
 * @author zhibin.wangzhb
 * @since 2019-12-22 16:42
 **/
public class DefaultDataSource implements DataSource {

    @Override
    public void initConnection() {
        System.out.println("initConnection....");
    }
}
