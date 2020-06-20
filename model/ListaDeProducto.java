package com.ada.proyectoFinal.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProducto {

	List<Producto> products;
	
	public ListaDeProducto () { 
		products = new ArrayList<>();
		}

	public List<Producto> getProducts() {
		return products;
	}

	public void setProducts(List<Producto> products) {
		this.products = products;
	}

	
}
