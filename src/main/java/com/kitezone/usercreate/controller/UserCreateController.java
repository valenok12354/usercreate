package com.kitezone.usercreate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserCreateController {

    @Autowired
    private Environment env;

    @GetMapping("/status")
    public String getUser() {

        return "Working on " + env.getProperty("local.server.port") ;
    }
}
