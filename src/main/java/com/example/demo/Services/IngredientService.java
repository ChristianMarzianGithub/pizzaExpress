package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.IngredientRepository;
import com.example.demo.models.Ingredient;

@Service
public class IngredientService {
	
	@Autowired
	IngredientRepository ingredientRepository;
	
	public void save(Ingredient ingredient) 
	{
		ingredientRepository.save()
	}
	

}