package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//representacion de la entidad modelo
@Table(name="ventas")

public class Venta {
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private String fecha;
	private String estado;
	
	
	
	public Venta() {
		super();
	}
	
	
	public Venta(String fecha, String estado) {
		super();
		this.fecha = fecha;
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
