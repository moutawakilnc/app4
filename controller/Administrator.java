package com.app3.hibernatetest1.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admininistrator/")
public class Administrator {

	
	@GetMapping("{id}")
	public List<String> tryAccess(@PathVariable("id") String id)
	{

		List<String> list=new LinkedList<String>();
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app3"
				+ ";user:root;password:coco"))
		{
			
			Statement stm=con.createStatement();
			
			stm.execute("select * from administrator where id="+id);
			
			ResultSet rs=stm.getResultSet();
			
			
			rs.first();
			while(rs.next())
			{
				list.add(rs.getString(2));
			}

			
			
		}
		catch(Exception ex) {
			 list.add(ex.getMessage());
			
		}
		
		return list;
	}
	
	
}
