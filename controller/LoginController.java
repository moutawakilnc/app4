package com.app3.hibernatetest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/user")
	public String getUser()
	{
		return "Welcome, user";
	}
	
	
	@GetMapping("/admin")
	public String getAdmin()
	{
		return "Welcome, Admin";
	}
	
	
	
	
	
	
}
