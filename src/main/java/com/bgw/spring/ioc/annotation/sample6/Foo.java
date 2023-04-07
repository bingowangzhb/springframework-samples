package com.bgw.spring.ioc.annotation.sample6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Foo {

    @Autowired
    private Bar bar;


}
