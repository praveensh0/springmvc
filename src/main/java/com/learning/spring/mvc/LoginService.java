package com.learning.spring.mvc;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("user") && password.equals("user");
	}
}