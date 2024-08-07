package com.app3.hibernatetest1.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app3.hibernatetest1.model.Visitor;
import com.app3.hibernatetest1.repository.VisitorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VisitorService {

	
	@Autowired
	private VisitorRepository visitorRepository;
	
	
	
	public void addVisitor(Visitor visitor)
	{
		
		visitorRepository.save(visitor);
		
	}
	
	public Iterable<Visitor> getVisitors()
	{
		Logger logger= LoggerFactory.getLogger("com.app3.hibernatetest1.Service");
		int var=10;
		logger.info("get visitor method "+var);;
		
		logger.warn("get visitor method "+var);;
		return visitorRepository.findAll();
		
	}
	
	

	public Visitor findVisitorByIdVisitor(int id)
	{
		Logger logger= LoggerFactory.getLogger("com.app3.hibernatetest1.Service");
		
		logger.info("get visitor method by id:"+id);;
		return visitorRepository.findVisitorByIdVisitor(id);
		
	}
	
	
}
