package com.xadmin.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String category;
	
	public User() {
	}
	
	public User(String name, String email, String category) {
		super();
		this.name = name;
		this.email = email;
		this.category = category;
	}

	public User(int id, String name, String email, String category) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.category = category;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}