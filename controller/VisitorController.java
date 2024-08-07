	package com.app3.hibernatetest1.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app3.hibernatetest1.model.Visitor;
import com.app3.hibernatetest1.service.VisitorService;


@RestController
@RequestMapping("/visitor/")
public class VisitorController {


	String driverClassName
    = "sun.jdbc.odbc.JdbcOdbcDriver";
String url = "jdbc:odbc:XE";
String username = "scott";
String password = "tiger";
String query
    = "insert into students values(109, 'bhatt')";

// Load driver class


// Obtain a connection
	
	
	
	@Autowired
	private VisitorService visitorService;
	
	
	@GetMapping("")
	public Iterable<Visitor> getVisitors()
	{
		Logger logger= LoggerFactory.getLogger("com.app3.hibernatetest1.Controller");
	
		logger.info("hello world : logger: {}"+"hihi");;
		return visitorService.getVisitors();
	}
	
	
	//tosec
	@PostMapping("")
	public String addVisitor(@RequestBody Visitor visitor)
	{
		visitorService.addVisitor(visitor);
		return "visitor added";
	}
	
	
	
	
	
}
