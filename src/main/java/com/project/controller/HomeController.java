package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.BlogPostService;

@Controller
public class HomeController {
	
	private BlogPostService blogPostService;
	
	@Autowired
	public void setBlogPostService(BlogPostService blogPostService) {
		this.blogPostService = blogPostService;
	}
	
	
	@RequestMapping("/") 
	public String index(Model model) {
		model.addAttribute("blogPosts", blogPostService.getBlogPosts());
		return "index";
	}
	
	@RequestMapping("/Home.html") 
	public String home (Model model) {
		model.addAttribute("blogPosts", blogPostService.getBlogPosts());
		return "index";
	}
    
	
//	@RequestMapping("/username/{username}")
//	public String searchForUsername (@PathVariable(value = "username") String username, Model model) {
//		model.addAttribute("username", blogPostService.searchForUsername(username));
//		return "index";
//	}
}
