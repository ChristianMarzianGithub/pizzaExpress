package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositories.PizzaRepository;
import com.example.demo.Services.IngredientService;
import com.example.demo.Services.PizzaService;
import com.example.demo.Services.UserService;
import com.example.demo.entities.IngredientEntity;
import com.example.demo.entities.PizzaEntity;
import com.example.demo.entities.UserEntity;

@RestController
@RequestMapping(path="/pizza")
public class PizzaController {

	@Autowired
	UserService service;
	
	@Autowired 
	PizzaService pizzaService;
	
	@Autowired
	IngredientService ingredientService;
	
	@GetMapping("/getPizzas")
	public String getHelloWorld() {
		PizzaEntity pizza = new PizzaEntity();
		pizza.setName("Salami");
		
		List<IngredientEntity> ingredients = new ArrayList<>();
		
		IngredientEntity i1 = new IngredientEntity();
		i1.setName("Salami");
		i1.setQuantity(5.0);
		i1.setUnit("Stück");
		
		ingredients.add(i1);
		
		IngredientEntity i2 = new IngredientEntity();
		i2.setName("Käse");
		i2.setQuantity(300.0);
		i2.setUnit("Gramm");
		
		ingredients.add(i2);
		
		IngredientEntity i3 = new IngredientEntity();
		i3.setName("Tomatensauce");
		i3.setQuantity(100.0);
		i3.setUnit("MilliLiter");
		
		ingredients.add(i3);
		ingredientService.saveAll(ingredients);
		
		pizza.setIngredient(ingredients);
		
		UserEntity entity = new UserEntity();
		entity.setName("root");
		entity.setPassword("root");
		
		
		
		pizzaService.save(pizza);
		
		
		
		return "getPizzas";
	}	
}