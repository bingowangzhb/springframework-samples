package com.bgw.ioc.xml.sample2;

public class ExampleBeanThree {

    private String value;

    private ExampleBeanOne exampleBeanOne;

    public ExampleBeanThree(String value) {
        this.value = value;
    }

    public ExampleBeanOne getExampleBeanOne() {
        return exampleBeanOne;
    }

    public void setExampleBeanOne(ExampleBeanOne exampleBeanOne) {
        this.exampleBeanOne = exampleBeanOne;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
