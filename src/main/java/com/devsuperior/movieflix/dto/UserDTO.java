package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entites.Review;
import com.devsuperior.movieflix.entites.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	@JsonIgnore
	public List<Review> reviews = new ArrayList<>();

	
	public UserDTO(Long id, String name, String email, List<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.reviews = reviews;
	}

	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		reviews = entity.getReviews();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Review> getReviews() {
		return reviews;
	}
	
}
