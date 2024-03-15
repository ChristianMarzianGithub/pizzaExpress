package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/pizza")
public class PizzaController {

	@GetMapping("/getPizzas")
	public String getHelloWorld() {
		return "getPizzas";
	}	
}