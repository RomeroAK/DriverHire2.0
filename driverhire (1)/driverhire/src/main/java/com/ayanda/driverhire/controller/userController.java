package com.ayanda.driverhire.controller;

import com.ayanda.driverhire.service.userService;
import com.ayanda.driverhire.user.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

private userService userSv;

@Autowired
public userController(userService userSv)
{
    this.userSv = userSv;
}

    @GetMapping
    public List<SystemUser> getUsers()
    {
         return userSv.getUsers();
    }

    @PostMapping
    public void addUser(SystemUser user)
    {
        userSv.addNewUser(user);
    }
}
