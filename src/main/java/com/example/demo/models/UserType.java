package com.example.demo.models;

public class UserType {
	private Integer id;
	private String description;
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "UserType [id=" + id + ", description=" + description + "]";
	}
}