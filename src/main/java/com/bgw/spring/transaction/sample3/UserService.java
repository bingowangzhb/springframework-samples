package com.bgw.spring.transaction.sample3;

import com.bgw.spring.transaction.User;

/**
 * PersonService
 *
 * @author bgw
 * @since 2020/8/27 17:13
 **/
public interface UserService {
    /**
     * save
     *
     * @param user user
     */
    void save(User user);

    /**
     * get
     */
    void get();
}
