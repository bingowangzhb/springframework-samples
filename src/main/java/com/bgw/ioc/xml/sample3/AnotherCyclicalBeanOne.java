package com.bgw.ioc.xml.sample3;

import java.util.StringJoiner;

/**
 * AnotherCyclicalBeanOne
 *
 * @author wang
 * @since 2020/3/7 17:39
 **/
public class AnotherCyclicalBeanOne {

    private String name;

    private AnotherCyclicalBeanTwo anotherCyclicalBeanTwo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnotherCyclicalBeanTwo getAnotherCyclicalBeanTwo() {
        return anotherCyclicalBeanTwo;
    }

    public void setAnotherCyclicalBeanTwo(AnotherCyclicalBeanTwo anotherCyclicalBeanTwo) {
        this.anotherCyclicalBeanTwo = anotherCyclicalBeanTwo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AnotherCyclicalBeanOne.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("anotherCyclicalBeanTwo=" + anotherCyclicalBeanTwo)
                .toString();
    }
}
