package com.app3.hibernatetest1.model;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Session {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSession;
	
	private String date;

	
	@OneToOne
	@JoinColumn(name="idVisitor")
	private Visitor visitor;	
	
	
	@ManyToMany
	@JoinTable( name = "VisitorVisits",
    joinColumns = @JoinColumn( name = "idSession" ),
    inverseJoinColumns = @JoinColumn( name = "idPage")) 
	private List<Page> pageVisited;
	
	
	
	public List<Page> getPageVisited()
	{
		return this.pageVisited;
	}
	

	public Session() {}
	
	public Session(Visitor visitor, String date)
	{
		this.visitor=visitor;
		this.date=date;
	}

	
	public Visitor getVisitor()
	{
		return this.visitor;
	}
	
	
	public int getIdSession() {
		return idSession;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
