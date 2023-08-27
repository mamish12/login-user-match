package com.login.service;

import org.springframework.stereotype.Service;

import com.login.entity.User;

@Service
public class UserService {
	
	public boolean authenticateUser(User user) {
		String validUsername = "manish123";
		String validPassword = "mku@123";
		return validUsername.equals(user.getUsername()) && validPassword.equals(user.getPassword());
	}

}

