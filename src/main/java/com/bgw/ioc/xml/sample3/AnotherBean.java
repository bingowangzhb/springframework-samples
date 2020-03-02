package com.bgw.ioc.xml.sample3;

/**
 * AnotherBean
 *
 * @author zhibin.wang
 * @since 2019-11-24 21:51
 **/
public class AnotherBean {

    private String name;

    public AnotherBean(String name) {
        this.name = name;
        System.out.println("-------------AnotherBean ArgConstructor-----------");
    }

    @Override
    public String toString() {
        return "AnotherBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
