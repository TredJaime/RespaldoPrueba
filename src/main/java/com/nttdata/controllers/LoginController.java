package com.nttdata.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata.models.Usuario;
import com.nttdata.services.UsuarioService;


@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String login(@ModelAttribute("usuario") Usuario usuario,
			Model model) {
		model.addAttribute("listaUsuarios", usuarioService.obtenerListaUsuarios());
		return "login/login.jsp";
	}
	
	/*
	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("usuario") Usuario usuario) {
		System.out.println(usuario.getNombre()+ " " + usuario.getApellido() + " " + usuario.getRut() + " " + usuario.getEmail());
	
		usuarioService.insertarUsuario(usuario);
		
		return "redirect:/usuario";
	}
	*/
	
	@RequestMapping("/login")
	public String login(@RequestParam("nombre")String nombre, @ModelAttribute("usuario") Usuario usuario,
			Model model) {
		System.out.println(nombre);
		List<Usuario> ListaUsuariosA=usuarioService.obtenerUsuarioWhereIdSQL(nombre);
		
		for (int i = 0; i < ListaUsuariosA.size(); i++) {
			if(nombre.equals(ListaUsuariosA.get(i).getNombre())) {
				
				
				return "redirect:/tienda";
			}
		}
		return "redirect:/login";
	
	}
	
	
	
	@RequestMapping("/eliminar")
	public String eliminarUsuario(@RequestParam("id") Long id) {
		Usuario usuario = usuarioService.BuscarUsarioId(id);
		if(usuario !=null) {
			usuarioService.eliminarUsuarioObjeto(usuario);
			
		
		}
		return "redirect:/usuario";
	}
	
	
	
	
}
