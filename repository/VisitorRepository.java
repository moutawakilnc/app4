package com.app3.hibernatetest1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import com.app3.hibernatetest1.model.Visitor;

@Repository
public interface VisitorRepository  extends CrudRepository<Visitor,Integer>{

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Override
	Visitor save(Visitor s);

	Visitor findVisitorByIdVisitor(int id);
}
