package com.app3.hibernatetest1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app3.hibernatetest1.model.Page;

@Repository
public interface PageRepository  extends CrudRepository<Page,Integer>{

}
