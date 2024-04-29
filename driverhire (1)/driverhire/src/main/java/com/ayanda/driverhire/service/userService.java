package com.ayanda.driverhire.service;


import com.ayanda.driverhire.repository.userRepository;
import com.ayanda.driverhire.user.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    private userRepository userRp;

    @Autowired
    public userService(userRepository userRp) {
        this.userRp = userRp;
    }


    public SystemUser addNewUser(SystemUser user)
    {
        return userRp.save(user);
    }

    public List<SystemUser> getUsers()
    {
        List<SystemUser> userList = userRp.findAll();

        return userList;
    }

}
