package com.example.demo.entities;

import com.example.demo.models.Ingredient;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PizzaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	private String name;
	private Ingredient ingredient;
	
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", ingredient=" + ingredient + "]";
	}
}
