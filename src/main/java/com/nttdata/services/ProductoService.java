package com.nttdata.services;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Producto;
import com.nttdata.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	public void insertarProducto(@Valid Producto producto) {
		productoRepository.save(producto);
		
	}

	
public List<Producto> obtenerListaProducto() {
		
		return  (List<Producto>) productoRepository.findAll();
	}
}
