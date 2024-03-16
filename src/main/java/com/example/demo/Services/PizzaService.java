package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.PizzaRepository;
import com.example.demo.entities.PizzaEntity;

@Service
public class PizzaService {
	
	 @Autowired
	 PizzaRepository pizzaRepository;
	 
	 
	 public void save(PizzaEntity pe) {
		 pizzaRepository.save(pe);
	 }	 
}