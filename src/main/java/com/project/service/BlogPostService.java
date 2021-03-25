package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.domain.BlogPost;
import com.project.domain.User;
import com.project.repository.BlogPostRepository;
import com.project.repository.UserRepository;

@Service
public class BlogPostService {
	
	private BlogPostRepository blogPostRepository;
	private UserRepository userRepository;

	@Autowired
	public void setBlogPostRepository(BlogPostRepository blogPostRepository) {
		this.blogPostRepository = blogPostRepository;
	}
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<BlogPost> getBlogPosts() { 
		return blogPostRepository.findAll();
	}

	public User searchForUsername(String username) {
		return userRepository.findByUsername(username);
	}	
}
