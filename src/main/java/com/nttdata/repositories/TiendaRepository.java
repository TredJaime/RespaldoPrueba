package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Producto;
import com.nttdata.models.Usuario;

@Repository
public interface TiendaRepository extends JpaRepository<Producto, Long> {
	@Query(value= "SELECT categorias.nombre, productos.categoria_id, valor FROM categorias INNER JOIN productos ON categorias.id=productos.categoria_id WHERE categorias.nombre = 1?;", nativeQuery = true)
	List<Usuario> obtenerUsuarioWhereIdSQL(String nombre);
}
