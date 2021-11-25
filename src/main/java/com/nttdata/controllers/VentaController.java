package com.nttdata.controllers;


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

import com.nttdata.models.Venta;
import com.nttdata.services.VentaServices;

@Controller
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	VentaServices ventaService;
	
	
	@RequestMapping("")
	public String venta(@ModelAttribute("venta") Venta venta, 
			Model model) {
		
		model.addAttribute("listaVenta", ventaService.obtenerListaVenta());
		
		return "usuario/venta.jsp";
	}
	
	@RequestMapping("/loginV")
	public String loginP(@Valid @ModelAttribute("Venta") Venta venta) {
		System.out.println(venta.getValorTotal() + " " + venta.getFecha());
		
		ventaService.insertarVenta(venta);
		
		return "redirect:/venta";
	}
	
	@RequestMapping("/eliminarV")
	public String eliminarVenta(@RequestParam("id") Long id) {
		Venta venta = ventaService.BuscarVentaId(id);
		if(venta !=null) {
			ventaService.eliminarVentaObjeto(venta);
		}
		return "redirect:/venta";
	}
	
	
	@RequestMapping("/{id}/editarV")
	public String edit(@PathVariable("id") Long id, Model model) {
		System.out.println("Editar Venta");
		Venta venta = ventaService.BuscarVentaId(id);
		if(venta !=null) {
			model.addAttribute("venta", venta);
			return "/usuario/editarVenta.jsp";
		}
		return "redirect:/venta";
	}
	
	@RequestMapping(value="/updateV/{id}", method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("venta") Venta venta, BindingResult result) {
		System.out.println("update");
		if(result.hasErrors()) {
			return "/usuario/editarVenta.jsp";
		}else {
			ventaService.updateVenta(venta);
			return "redirect:/venta";
		}
	}
	
}
