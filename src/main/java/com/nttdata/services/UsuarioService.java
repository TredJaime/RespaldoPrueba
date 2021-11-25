package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public void insertarUsuario(@Valid Usuario usuario) {
		usuarioRepository.save(usuario);
		
	}

	
	public List<Usuario> obtenerListaUsuarios() {
		
		return  (List<Usuario>) usuarioRepository.findAll();
	}


	public Usuario BuscarUsarioId(Long id) {
		// TODO Auto-generated method stub return usuarioRepository.findById(id).get();
		return usuarioRepository.findById(id).get();
		
	}


	public void eliminarUsuarioObjeto(Usuario usuario) {
		usuarioRepository.delete(usuario);
		
	}


	
}
