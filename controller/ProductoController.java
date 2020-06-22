package com.ada.proyectoFinal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.ada.proyectoFinal.model.Producto;
import com.ada.proyectoFinal.repository.ProductoRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(path = "/all-products")

public class ProductoController {

	@Autowired
	ProductoRepository productoRepository;

	Log log = LogFactory.getLog(ProductoController.class);
		
	@PostMapping(path = "/new-product")
	@Operation(summary = "Save new product", description = "Saves a new product added to the database")
	public ResponseEntity<Producto> guardarProducto(@RequestBody Producto product) {
		log.info("Guadar producto nuevo " + product);
		productoRepository.save(product);
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/products/{id}")
	@Operation(summary = "Get a product", description = "Gets a product already saved in the database")
	public ResponseEntity<Producto> getProducto(@PathVariable("id") Integer id) {
		log.info("Busqueda de producto en la base: ");
		Optional<Producto> product = productoRepository.findById(id);
		if (Optional.empty().equals(product)) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			Producto returnProduct = product.get();
			return new ResponseEntity<>(returnProduct, HttpStatus.OK);
		}
	}

	@GetMapping(path = "/products/list")
	@Operation(summary = "Get a list of products", description = "Gets a list of products already saved in the database")
	public ResponseEntity<List<Producto>> listProduct() {
		log.info("Listado de productos cargados ");
		Iterable<Producto> productList = productoRepository.findAll();
		List<Producto> result = Lists.newArrayList(productList);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@DeleteMapping(path = "/products/{id}")
	@Operation(summary = "Delete a product", description = "Deletes a product already saved in the database")
	public ResponseEntity<Object> deleteProducto(@PathVariable Integer id) {
		log.info("Producto" + id + " borrado");
		productoRepository.deleteById(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	@PutMapping(path = "/products")
	@Operation(summary = "Update a product", description = "Updates a product already saved in the database")
	public ResponseEntity<Producto> updateProduct(@RequestBody Producto product) {
		log.info("Actualizar producto: " + product);
		productoRepository.save(product);
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}
}