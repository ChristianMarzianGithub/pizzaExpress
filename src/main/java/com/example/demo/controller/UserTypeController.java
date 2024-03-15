package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserType")
public class UserTypeController {
	
	@RequestMapping("/getUserTypes")
	public String getUserTypes() {
		return "getUserTypes";
	}
}