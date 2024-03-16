package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.IngredientEntity;

@Repository
public interface IngredientRepository extends JpaRepository<IngredientEntity,Integer>{

	
}