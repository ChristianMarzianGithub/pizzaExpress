package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IngredientEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	private String name;
	private String unit;
	private Double quantity;	
		
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Ingredient [id=" + Id + ", name=" + name + ", unit=" + unit + ", quantity=" + quantity + "]";
	} 
}
