package com.cesar.controller;

import com.cesar.model.User;
import com.cesar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Cesar on 2016/3/1.
 */
@RestController
@RequestMapping("/cesar")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String getUserInfo() throws Exception {
        User user = userService.getUserInfo();
        return user.toString();
    }
}
