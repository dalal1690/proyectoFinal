package com.ada.proyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name= "Producto")

public class Producto {
	
	// ATRIBUTOS 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
		
	@NotNull(message="Ingresar nombre del producto")
	@Size(min = 1, max = 50, message = "El nombre del producto debe contener entre 1 y 50 caracteres")
	private String productName;
	
	@NotNull(message="Ingresar la categoría del producto")
	@Size(min = 1, max = 50, message = "La categoría debe contener entre 1 y 50 caracteres")
	private String category;
	
	@NotNull(message="Ingresar la descripción del producto")
	@Size(min = 1, max = 500, message = "El nombre del producto debe contener entre 1 y 500 caracteres")
	private String description;
	
	@NotNull(message="Ingresar los ingredientes del producto")
	@Size(min = 1, max = 500, message = "Los ingredientes del producto debe contener entre 1 y 500 caracteres")
	private String ingredients;
	
	@NotNull(message="Ingresar el modo de preparación del producto")
	@Size(min = 1, max = 200, message = "El modo de preparación del producto debe contener entre 1 y 200 caracteres")
	private String preparation;
	
	@NotNull(message="Ingresar el peso del producto")
	@Min(value = 0, message = "El peso mínimo es 0")
	private float weight;
	
	@NotNull(message="Ingresar el precio del producto")
	@Min(value = 0, message = "El precio mínimo es 0")
	private float price;	
	
	@NotNull(message="Ingresar el stock del producto")
	@Min(value = 0, message = "El stock mínimo es 0")
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
	
