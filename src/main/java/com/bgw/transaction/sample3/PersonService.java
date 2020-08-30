package com.bgw.transaction.sample3;

import com.bgw.transaction.Person;

/**
 * PersonService
 *
 * @author wang
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
