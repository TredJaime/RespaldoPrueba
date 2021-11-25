package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.models.Producto;
import com.nttdata.services.ProductoService;




@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;

	@RequestMapping("")
	public String producto(@ModelAttribute("producto") Producto producto, 
			Model model) {
		
		model.addAttribute("listaProducto", productoService.obtenerListaProducto());
		
		return "usuario/producto.jsp";
	}
	
	@RequestMapping("/loginP")
	public String loginP(@Valid @ModelAttribute("Producto") Producto producto) {
		System.out.println(producto.getNombre() + " " + producto.getValor() + " " + producto.getDescripcion());
		
		productoService.insertarProducto(producto);
		
		return "redirect:/producto";
	}
	
	@RequestMapping("/eliminarP")
	public String eliminarProducto(@RequestParam("id") Long id) {
		Producto producto = productoService.BuscarProducto(id);
		if(producto !=null) {
			productoService.eliminarProductoObjeto(producto);
		}
		return "redirect:/producto";
	}
	
}
