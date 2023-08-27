package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.User;
import com.login.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	    @Autowired
	    private UserService userService;

	    @PostMapping("/login")
	    public String login(@RequestBody User user) {
	        if (userService.authenticateUser(user)) {
	            return "Login successful!";
	        } else {
	            return "Login failed!";
	        }
	    }

}