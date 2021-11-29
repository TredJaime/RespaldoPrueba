package com.nttdata.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.models.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	//SENTECIA JOIN UNO TABLA PRODUCTO Y CATEGORIA Y BUSCO POR NOMBRE 1?
	@Query(value = "SELECT * FROM categorias INNER JOIN productos ON categorias.id=productos.categoria_id WHERE categorias.nombre = ?;", nativeQuery = true)
	List<Object[]> findAllPorCategorias(String nombre);
}
