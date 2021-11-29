package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	List<Usuario> findAll();
	
	@Query(value= "SELECT * FROM usuarios Where nombre = ?1", nativeQuery = true)
	List<Usuario> obtenerUsuarioWhereIdSQL(String nombre);
}
