package com.nttdata.controllers;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.models.Categoria;
import com.nttdata.models.Producto;
import com.nttdata.services.CategoriaService;
import com.nttdata.services.ProductoService;




@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	@Autowired
	CategoriaService categoriaService;
	private Producto lisp;
	private Categoria lisC;
	
	@RequestMapping("")
	public String producto(@ModelAttribute("producto") Producto producto, 
			Model model) {
		
		model.addAttribute("listaCategoria", categoriaService.obtenerListaCategoria());
		model.addAttribute("listaProducto", productoService.obtenerListaProducto());
		
		return "usuario/producto.jsp";
	}
	

	
	@RequestMapping("/buscarCate")
	public String login(@RequestParam("nombre")String nombre, @ModelAttribute("producto") Producto producto,
			Model model) {
		System.out.println(nombre);
		List<Object[]> oUsuarios = productoService.findAllPorCategorias(nombre);
		
		for(Object[] fila: oUsuarios) {
			
			
			System.out.println(fila);
			lisp = (Producto) fila[0];
			lisC = (Categoria) fila[1];
		}
		return "redirect:/tienda";
	
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
	
	@RequestMapping("/{id}/editarP")
	public String edit(@PathVariable("id") Long id, Model model) {
		System.out.println("Editar Producto");
		Producto producto = productoService.BuscarProducto(id);
		if(producto !=null) {
			model.addAttribute("producto", producto);
			return "/usuario/editarProducto.jsp";
		}
		return "redirect:/producto";
	}
	  
	@RequestMapping(value="/updateP/{id}", method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("producto") Producto producto, BindingResult result) {
		System.out.println("Udate");
		if(result.hasErrors()) {
			return "/usuario/editarProducto.jsp";
		}else {
			productoService.updateProducto(producto);
			return "redirect:/producto";
		}
	}
}
