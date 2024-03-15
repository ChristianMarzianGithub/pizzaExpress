package com.example.demo.entities;

import com.example.demo.models.UserType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	private String name;
	private String password;
	private UserType userType;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", password=" + password + ", userType=" + userType + "]";
	}
}
