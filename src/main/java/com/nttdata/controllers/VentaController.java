package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.models.Usuario;
import com.nttdata.models.Venta;
import com.nttdata.services.UsuarioService;


@Controller
@RequestMapping("/venta")
public class VentaController {
/*	
	@Autowired
	UsuarioService UsuarioService;
	
	@RequestMapping("")
	public String usuario(@ModelAttribute("venta")Venta ventas, Model model) {
		model.addAttribute("ListaVentas", UsuarioService.obtenerListaUsuarios());
		//model.addAttribute("ListaUsuarios", UsuarioService.obtenerListaUsuarios());
		return "usuario/venta.jsp";
	}
	
	@RequestMapping("/loginVenta")
	public String login (@Valid @ModelAttribute("venta") Venta venta) {
		System.out.println(venta.getFecha() + " " + venta.getEstado());
		
		UsuarioService.insertarVenta(venta);
		
		return "redirect:/venta";
		
	}
	
*/
}
