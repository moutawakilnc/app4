package com.app3.hibernatetest1.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SignUp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	
	
	
	
	
	public SignUp(String name,String email,String password) {
		
		
		
		
		
		// TODO Auto-generated constructor stub
	}

}
