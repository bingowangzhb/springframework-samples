package com.bgw.ioc.sample3;

/**
 * CyclicalBean
 *
 * @author zhibin.wang
 * @since 2019-11-25 19:04
 **/
public class CyclicalBean {

    private String name;

    private AnotherCyclicalBean anotherCyclicalBean;

    public void setAnotherCyclicalBean(AnotherCyclicalBean anotherCyclicalBean) {
        this.anotherCyclicalBean = anotherCyclicalBean;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CyclicalBean{" +
                "name='" + name + '\'' +
                ", anotherCyclicalBean=" + anotherCyclicalBean.hashCode() +
                '}' + ", hashCode=" + this.hashCode();
    }
}
