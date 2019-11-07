package com.learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class LoginController {

	@RequestMapping(value = "/first-example")
	@ResponseBody
	public String sayHello()
	{		
		return "Hello World";
	}
	
	@RequestMapping(value = "/login")
	public String getLogin()
	{
		return "login";
	}
}
