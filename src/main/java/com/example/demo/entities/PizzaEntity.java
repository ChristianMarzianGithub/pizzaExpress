package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "pizza") // <= Tabellen namen anders als Klassen-Namen nennen
public class PizzaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private String name;
	
	@OneToMany
	private List<IngredientEntity> ingredients = new ArrayList<>();
	
	
	public List<IngredientEntity> getIngredients() {
		return ingredients;
	}
	public void setIngredient(List<IngredientEntity> ingredients) {
		this.ingredients = ingredients;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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