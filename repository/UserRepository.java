package com.app3.hibernatetest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app3.hibernatetest1.model.*;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	public User findByUsername(String username);
}
