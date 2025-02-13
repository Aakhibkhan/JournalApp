package com.engineeringaakhib.journalApp.controller;

import com.engineeringaakhib.journalApp.entity.User;
import com.engineeringaakhib.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;


    @GetMapping("health-check")
    public String healthCheck() {
        return "ok : health is good";
    }


    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        userService.saveNewUser(user);
    }
}
