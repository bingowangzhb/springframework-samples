package com.bgw.ioc.sample3;

/**
 * AnotherCyclicalBean
 *
 * @author zhibin.wang
 * @since 2019-11-25 19:04
 **/
public class AnotherCyclicalBean {

    public String name;

    private CyclicalBean cyclicalBean;

    public void setCyclicalBean(CyclicalBean cyclicalBean) {
        this.cyclicalBean = cyclicalBean;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnotherCyclicalBean{" +
                "name='" + name + '\'' +
                ", cyclicalBean=" + cyclicalBean.hashCode() +
                '}'+ ", hashCode=" + this.hashCode();
    }
}
