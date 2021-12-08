package com.bgw.spring.ioc.xml.sample2;

/**
 * Foo
 *
 * @author zhibin.bgw
 * @since 2019-11-24 16:30
 **/
public class Foo {
    private Bar bar;
    private Baz baz;

    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
        System.out.println("-------------foo argument constructor---------");
    }

}
