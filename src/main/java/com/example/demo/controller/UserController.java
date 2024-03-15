package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@RequestMapping("/getAllUsers")
	public String getUser() {
		return "getAllUsers";
	}
}