package com.cesar.dao.mapper;

import com.cesar.model.User;

/**
 * Created by Cesar on 2016/3/2.
 */
public interface UserDao {
    public User selectById(int id);
}
