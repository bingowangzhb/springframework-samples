package com.bgw.ioc.framework;

/**
 * Main
 *
 * @author zhibin.wang
 * @since 2020/09/03 10:57
 */
public class Main {

    public static void main(String[] args) {

        MyApplicationContext applicationContext = new MyApplicationContext();
        applicationContext.getBean("abcd");


    }
}
