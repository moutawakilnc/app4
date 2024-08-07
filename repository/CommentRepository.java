package com.app3.hibernatetest1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app3.hibernatetest1.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer>{

}
