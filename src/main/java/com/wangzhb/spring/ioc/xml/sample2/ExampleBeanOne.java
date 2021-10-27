package com.wangzhb.spring.ioc.xml.sample2;

/**
 * ExampleBeanOne
 *
 * @author zhibin.wangzhb
 * @since 2019-11-24 16:38
 **/
public class ExampleBeanOne {

    private int year;

    private String ultimateAnswer;

    public ExampleBeanOne(int year, String ultimateAnswer) {
        this.year = year;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return "ExampleBeanOne{" +
                "year=" + year +
                ", ultimateAnswer='" + ultimateAnswer + '\'' +
                '}';
    }
}
