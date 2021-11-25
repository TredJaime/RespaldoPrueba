package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity//representacion de la entidad modelo
@Table(name="ventas")//nombre de la tabla en la bbdd
public class Venta {
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private Integer valorTotal;
	private String fecha;
	
	
	public Venta() {
		super();
	}
	
	
	public Venta(Integer valorTotal, String fecha) {
		super();
		this.valorTotal = valorTotal;
		this.fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Venta [valorTotal=" + valorTotal + ", fecha=" + fecha + "]";
	}
	
	
	public Integer getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
		
}
