package com.bgw.ioc.xml.sample3;

import java.util.StringJoiner;

/**
 * CyclicalBeanTwo
 *
 * @author zhibin.wang
 * @since 2019-11-25 19:04
 **/
public class CyclicalBeanTwo {

    private String name;

    private CyclicalBeanOne cyclicalBeanOne;

    public CyclicalBeanTwo(String name, CyclicalBeanOne cyclicalBeanOne) {
        this.name = name;
        this.cyclicalBeanOne = cyclicalBeanOne;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CyclicalBeanTwo.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("cyclicalBeanOne=" + cyclicalBeanOne)
                .toString();
    }
}
