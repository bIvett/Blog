package com.project.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BlogPost {
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String title;
	@Column(columnDefinition = "TEXT")
	private String content;
	private Date posted;
	@ManyToOne
	private User user;
		
	private BlogPost(){
	}
	
	public BlogPost(String title, String content, Date posted, User user) {
		super();
		this.title = title;
		this.content = content;
		this.posted = posted;
		this.user = user;
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPosted() {
		return posted;
	}
	public void setPosted(Date posted) {
		this.posted = posted;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
