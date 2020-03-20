package com.bgw.ioc.xml.sample3;

import java.util.StringJoiner;

/**
 * AnotherCyclicalBeanTwo
 *
 * @author wang
 * @since 2020/3/7 17:40
 **/
public class AnotherCyclicalBeanTwo {

    private String name;

    private AnotherCyclicalBeanOne anotherCyclicalBeanOne;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnotherCyclicalBeanOne getAnotherCyclicalBeanOne() {
        return anotherCyclicalBeanOne;
    }

    public void setAnotherCyclicalBeanOne(AnotherCyclicalBeanOne anotherCyclicalBeanOne) {
        this.anotherCyclicalBeanOne = anotherCyclicalBeanOne;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AnotherCyclicalBeanTwo.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("anotherCyclicalBeanOne=" + anotherCyclicalBeanOne)
                .toString();
    }
}
