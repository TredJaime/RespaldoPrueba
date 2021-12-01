package com.nttdata.services;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	//Busco por email
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	
	//Insertar usuario
	public Usuario registroUsuario(Usuario usuario) {
		//hashear(encriptar) el password
		String password_hashed= BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
		//sobre escribir la password
		usuario.setPassword(password_hashed);
		return usuarioRepository.save(usuario);
	}
	
	
	
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


	public void updateUsuario(@Valid Usuario usuario) {
		if(usuarioRepository.existsById(usuario.getId())) {
			usuarioRepository.save(usuario);
		}
		
	}


	public List<Usuario> obtenerUsuarioWhereIdSQL(String nombre){
		return usuarioRepository.obtenerUsuarioWhereIdSQL(nombre);
	}


	
}
