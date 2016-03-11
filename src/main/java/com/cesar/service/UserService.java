package com.cesar.service;

import com.cesar.dao.mapper.UserDao;
import com.cesar.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Cesar on 2016/3/2.
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserInfo() throws Exception {
        User user = userDao.selectById(1);
        if(user==null){
            throw  new Exception("UserService getUserInfo user is null");
        }
        return user;
    }



}
