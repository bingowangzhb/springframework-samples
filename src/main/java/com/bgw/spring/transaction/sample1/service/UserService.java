package com.bgw.spring.transaction.sample1.service;

import com.bgw.spring.transaction.User;

/**
 * PersonService
 *
 * @author bgw
 * @since 2020/8/27 10:39
 **/
public interface UserService {
    /**
     * save()
     * @param person person
     */
    void save(User user);

}
