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
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String usuario(@ModelAttribute("usuario") Usuario usuario,
			Model model) {
		
		model.addAttribute("listaUsuarios", usuarioService.obtenerListaUsuarios());
		return "usuario/usuario.jsp";
	}
	
	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("usuario") Usuario usuario) {
		System.out.println(usuario.getNombre()+ " " + usuario.getApellido() + " " + usuario.getRut() + " " + usuario.getEmail());
	
		usuarioService.insertarUsuario(usuario);
		
		return "redirect:/usuario";
	}
	

}
