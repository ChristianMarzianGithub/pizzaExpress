package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class IngredientsController {
	@RestController
	@RequestMapping(path="/ingredients")
	public class IngridientsController {
		@GetMapping("/getAllIngredients")
		public String getHelloWorld() {
			return "getAllIngredients";
		}	
	}
}
