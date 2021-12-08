package com.bgw.spring.ioc.annotation.sample3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * BarService
 *
 * @author zhibin.bgw
 * @since 2021/04/19 10:53
 */
@Service
public class BarService {
    @Qualifier("fooService")
    @Autowired
    private FooService fooService;
}
