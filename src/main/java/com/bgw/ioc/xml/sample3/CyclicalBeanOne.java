package com.bgw.ioc.xml.sample3;

import java.util.StringJoiner;

/**
 * CyclicalBeanOne
 *
 * @author zhibin.wang
 * @since 2019-11-25 19:04
 **/
public class CyclicalBeanOne {

    private String name;

    private CyclicalBeanTwo cyclicalBeanTwo;


    public CyclicalBeanOne(String name, CyclicalBeanTwo cyclicalBeanTwo) {
        this.name = name;
        this.cyclicalBeanTwo = cyclicalBeanTwo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CyclicalBeanOne.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("cyclicalBeanTwo=" + cyclicalBeanTwo)
                .toString();
    }
}
