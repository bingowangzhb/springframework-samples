package com.wangzhb.spring.transaction.sample3;

import com.wangzhb.spring.transaction.Person;

/**
 * PersonService
 *
 * @author wangzhb
 * @since 2020/8/27 17:13
 **/
public interface PersonService {
    /**
     * save
     *
     * @param person person
     */
    void save(Person person);

    /**
     * get
     */
    void get();
}
