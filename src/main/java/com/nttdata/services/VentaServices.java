package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nttdata.models.Venta;
import com.nttdata.repositories.VentaRepositories;

@Service
public class VentaServices {
	
	@Autowired
	VentaRepositories ventaRepository;

	public void insertarVenta(@Valid Venta venta) {
		ventaRepository.save(venta);
		
	}

	
	
public List<Venta> obtenerListaVenta() {
		
		return  (List<Venta>) ventaRepository.findAll();
	}



public Venta BuscarVentaId(Long id) {
	return ventaRepository.findById(id).get();
}



public void eliminarVentaObjeto(Venta venta) {
	ventaRepository.delete(venta);
	
}
}
