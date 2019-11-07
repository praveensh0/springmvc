package com.learning.spring.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.spring.mvc.LoginService;

@Controller
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	private LoginService loginService = new LoginService();
	
	@RequestMapping(value = "/default")
	@ResponseBody
	public String getFirstResponse()
	{		
		return "Hello World";
	}
	
	@RequestMapping(value = "/home" )
	public String getLoginPage()
	{
		LOGGER.info("LoginController::getLoginPage()");		
		return "login";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String processLoginRequest(@RequestParam String name,
			@RequestParam String password,
			ModelMap model)
	{
		LOGGER.info("LoginController::processLoginRequest()");
		if(loginService.validateUser(name, password)) 
		{
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials!");
		return "login";
		
	}
}
