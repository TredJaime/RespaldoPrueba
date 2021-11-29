package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	List<Usuario> findAll();
	
	@Query("SELECT u FROM Usuario u Where id = ?nombre")
	List<Usuario> obtenerUsuarioWhereId(Long nombre);
}
