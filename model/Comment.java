package com.app3.hibernatetest1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComment;
	
	private String title;
	
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name="idVisitor")
	private Visitor visitor;
	
	
	
	public Visitor getVisitor()
	{
		return this.visitor;
	}
	
	public void setVisitor(Visitor visitor)
	{
		this.visitor=visitor;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
