package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity//representacion de la entidad modelo
@Table(name="usuarios")//nombre de la tabla en la bbdd

public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)//autoincremental
	private Long id;
	
	private String nombre;
	private String apellido;
	private String limite;
	private String codigoPostal;
	private String rut;
	private String email;
	private String password;
	@Transient
	private String passwordConfirmation;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(String nombre, String apellido, String limite, String codigoPostal, String rut, String email,
			String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.limite = limite;
		this.codigoPostal = codigoPostal;
		this.rut = rut;
		this.email = email;
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", limite=" + limite + ", codigoPostal="
				+ codigoPostal + ", rut=" + rut + ", email=" + email + ", password=" + password + "]";
	}

	
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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

	public String getLimite() {
		return limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}