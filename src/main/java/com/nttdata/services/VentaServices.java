package com.nttdata.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.models.Usuario;
import com.nttdata.models.Venta;
import com.nttdata.repositories.UsuarioRepository;

@Service
public class VentaServices {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	

	
}
