package com.hibernate;

import java.util.Date;

public class Cupon {
	private String id;
	private Date fecha_compra;
	
	public Cupon(String i, Date fecha) {
		this.id = i;
		this.fecha_compra = fecha;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
}
