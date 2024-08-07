package com.app3.hibernatetest1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app3.hibernatetest1.model.Session;
import com.app3.hibernatetest1.model.Visitor;
import com.app3.hibernatetest1.service.SessionService;
import com.app3.hibernatetest1.service.VisitorService;



@RestController
@RequestMapping("/session/")
public class SessionController {

	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private VisitorService visitorService;
	
	
	public record sessionRecord(String date,int idVisitor) {}
	
	
	
	@GetMapping("")
	public Iterable<Session> getSessions()
	{
		return sessionService.getSessions();
	}
	
	
	@PostMapping("")
	public String addSession(@RequestBody sessionRecord sessionRecord)
	{
		
		Visitor visit=visitorService.findVisitorByIdVisitor(sessionRecord.idVisitor);
		
		
		if(visit==null)
			return "visitor undefined";
		else {
			Session s=new Session(visit,sessionRecord.date);
		sessionService.addSession(s);
		return "session added";
		}
	}
	

}
