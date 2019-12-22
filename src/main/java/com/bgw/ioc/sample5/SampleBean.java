package com.bgw.ioc.sample5;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * SampleBean
 *
 * @author zhibin.wang
 * @since 2019-12-12 22:44
 **/
public class SampleBean {

    @Qualifier
    private String name;
}
