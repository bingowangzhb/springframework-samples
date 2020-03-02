package com.bgw.ioc.xml.sample3;

/**
 * YetAnotherBean
 *
 * @author zhibin.wang
 * @since 2019-11-24 21:51
 **/
public class YetAnotherBean {

    private String name;

    public YetAnotherBean() {
        System.out.println("-----------YetAnotherBean NoArgConstructor-----------");
    }

    public YetAnotherBean(String name) {
        this.name = name;
        System.out.println("-----------YetAnotherBean ArgConstructor-----------");
    }

    @Override
    public String toString() {
        return "YetAnotherBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
