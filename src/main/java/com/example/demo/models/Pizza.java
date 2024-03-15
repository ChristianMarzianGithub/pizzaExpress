package com.example.demo.models;

public class Pizza {
	
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
