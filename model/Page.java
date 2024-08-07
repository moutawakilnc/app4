package com.app3.hibernatetest1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Page {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPage;
	
	private String Description;
	
	private String url;

	
	
	
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
