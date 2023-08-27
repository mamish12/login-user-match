package com.login.entity;

import lombok.Data;

@Data
public class User {
	
	private String name;
	private String pass;

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getUsername() {
		return name;
	}

	public String getPassword() {
		return pass;
	}


}