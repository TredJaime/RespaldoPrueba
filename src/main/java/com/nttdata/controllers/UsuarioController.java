package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.models.Usuario;
import com.nttdata.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService UsuarioService;
	
	
	@RequestMapping("")
	public String usuario(@ModelAttribute("usuario")Usuario usuarios, Model model) {
		model.addAttribute("ListaUsuarios", UsuarioService.obtenerListaUsuarios());
		return "usuario/usuario.jsp";
	}
	
	@RequestMapping("/login")
	public String login (@Valid @ModelAttribute("usuario") Usuario usuario)
	{
		System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getRut() + " " + usuario.getCelular() + " " + usuario.getEdad());
		
		UsuarioService.insertarUsuario(usuario);
		
		return "redirect:/usuario";
		
	}
}
