package com.ada.proyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Producto")

public class Producto {
	
	// ATRIBUTOS 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;		
	private String productName;
	private String category;
	private String description;
	private String ingredients;
	private String preparation;
	private float weight;
	private float price;	
	private int stock;
	
	// CONSTRUCTOR 
	
	public Producto () {
		
	}
		
	public Producto (int id, String productName, String  category, String description, String ingredients, String preparation, float weight, float price, int stock) {
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.ingredients = ingredients;
		this.preparation = preparation;
		this.weight = weight;
		this.price = price;
		this.stock = stock;
	}

	// GETTERS Y SETTERS
	
	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return description;
	}

	public String getIngredients() {
		return ingredients;
	}

	public String getPreparation() {
		return preparation;
	}

	public float getWeight() {
		return weight;
	}

	public float getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
	
