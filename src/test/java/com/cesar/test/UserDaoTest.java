package com.cesar.test;

import com.cesar.Application;
import com.cesar.dao.mapper.UserDao;
import com.cesar.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Cesar on 2016/3/2.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void getUser(){
        User user = userDao.selectById(12);
        if(user!=null){
            System.out.println(user.toString());
        }
        else {
            System.err.println("user is null");
        }
    }
}
