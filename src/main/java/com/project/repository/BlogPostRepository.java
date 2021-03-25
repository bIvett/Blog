package com.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.domain.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {  
	
	List<BlogPost> findAll();

}
 