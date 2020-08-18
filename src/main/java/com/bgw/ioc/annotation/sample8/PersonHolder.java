package com.bgw.ioc.annotation.sample8;

/**
 * PersonHolder
 *
 * @author zhibin.wang
 * @since 2020/08/05 17:26
 */
public class PersonHolder {

    private Person person;

    public PersonHolder(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "PersonHolder{" +
                "person=" + person +
                '}';
    }
}
