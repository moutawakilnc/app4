package com.app3.hibernatetest1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Visitor {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVisitor;
	
	private String fullName;
	
	private String mail;

	
	@OneToMany(mappedBy="visitor")
	private List<Comment> comment;
	
	
	
	
	
	
	public List<Comment> comment()
	{
		return this.comment;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getIdVisitor() {
		return idVisitor;
	}

	public void setIdVisitor(int idVisitor) {
		this.idVisitor = idVisitor;
	}
}
