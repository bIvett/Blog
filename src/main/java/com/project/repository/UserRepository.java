package com.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findAll();

	User findByUsername(String username);

}
