package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.IngredientRepository;
import com.example.demo.entities.IngredientEntity;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public void save(IngredientEntity ingredientEntity) 
	{
		ingredientRepository.save(ingredientEntity);
	}
	
	public void saveAll(List<IngredientEntity> ingredientList) {
		ingredientRepository.saveAll(ingredientList);
	}
	
	public void update(IngredientEntity ingredientEntity) {
		ingredientRepository.deleteById(ingredientEntity.getId());
		ingredientRepository.save(ingredientEntity);
	}
}