package com.app3.hibernatetest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app3.hibernatetest1.model.Session;
import com.app3.hibernatetest1.model.Visitor;
import com.app3.hibernatetest1.repository.SessionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SessionService {

	@Autowired
	private SessionRepository sessionRepository;
	
	
	public void addSession(Session session)
	{
		
		sessionRepository.save(session);
		
	}
	

	public Iterable<Session> getSessions()
	{
		
		return sessionRepository.findAll();
		
	}
}

