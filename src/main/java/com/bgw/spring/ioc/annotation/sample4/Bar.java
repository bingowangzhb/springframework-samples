package com.bgw.spring.ioc.annotation.sample4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {
    @Autowired
    private Foo foo;
}
