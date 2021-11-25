package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//representacion de la entidad modelo
@Table(name="usuarios")//nombre de la tabla en la bbdd

public class Usuario {
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private String nombre;
	private String apellido;
	private String rut;
	private String email;
	
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nombre, String apellido, String rut, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", email=" + email + "]";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
