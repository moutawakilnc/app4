package com.app3.hibernatetest1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app3.hibernatetest1.model.Session;

@Repository
public interface SessionRepository  extends CrudRepository<Session,Integer>{

}
