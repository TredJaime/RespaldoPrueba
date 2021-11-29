package com.nttdata.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nttdata.models.Usuario;

public interface LoginRepository extends CrudRepository<Usuario, Long> {

}
