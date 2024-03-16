package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PizzaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	private String name;
	
	@OneToMany
	private List<IngredientEntity> ingredients = new ArrayList<>();
	
	
	public List<IngredientEntity> getIngredient() {
		return ingredients;
	}
	public void setIngredient(List<IngredientEntity> ingredients) {
		this.ingredients = ingredients;
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
		return "Pizza [id=" + id + ", name=" + name + ", ingredient="  + "]";
	}
}
