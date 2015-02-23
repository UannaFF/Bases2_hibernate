package com.hibernate;

import java.util.Date;
import java.util.Set;

public class Cupon {
	private String id;
	private Date fecha_compra;
	private Set<RegalaOferta> regala;
	
	protected Cupon(){}
	
	public Cupon(String id, Date fecha_compra) {
		super();
		this.id = id;
		this.fecha_compra = fecha_compra;
	}

	public Set<RegalaOferta> getRegala() {
		return regala;
	}

	public void setRegala(Set<RegalaOferta> regala) {
		this.regala = regala;
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
