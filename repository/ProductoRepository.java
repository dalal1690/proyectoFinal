package com.ada.proyectoFinal.repository;

import org.springframework.data.repository.CrudRepository;
import com.ada.proyectoFinal.model.Producto;

public interface ProductoRepository extends CrudRepository <Producto,Integer> {
	
	Producto findById (String Id);
}
