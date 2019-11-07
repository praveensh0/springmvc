package com.learning.spring.mvc;

public class LoginService {
	
	/**
	 *  TODO: This will be implemented in future with hibernate integration till then using dummpy values
	 *  
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("user") && password.equals("user");
	}
}