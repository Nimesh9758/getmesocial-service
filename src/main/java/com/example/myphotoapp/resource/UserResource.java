package com.example.myphotoapp.resource;

import com.example.myphotoapp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @GetMapping("/user")
    public User getUser(){
        User user = new User("xyz","Ontario", 25);
        return user;
    }
}
