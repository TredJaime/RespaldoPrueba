package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//representacion de la entidad modelo
@Table(name="usuarios")

public class Usuario {
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private String nombre;
	private String apellido;
	private String rut;
	private String celular;
	private Integer edad;
	
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nombre, String apellido, String rut, String celular, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.celular = celular;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", celular=" + celular
				+ ", edad=" + edad + "]";
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


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
