package com.hibernate;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

public class RegalaOferta implements Serializable{
	
	private RegalaOfertaID id_regala;
	private Cupon cupon;
	
	protected RegalaOferta(){}
	
	public RegalaOferta(RegalaOfertaID id_regala, Cupon cupon) {
		super();
		this.id_regala = id_regala;
		this.cupon = cupon;
	}
	
	public Cupon getCupon() {
		return cupon;
	}

	public void setCupon(Cupon cupon) {
		this.cupon = cupon;
	}

	public RegalaOfertaID getId_regala() {
		return id_regala;
	}

	public void setId_regala(RegalaOfertaID id_regala) {
		this.id_regala = id_regala;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
 
		ComparteOferta that = (ComparteOferta) o;
 
		if (id_regala != null ? !id_regala.equals(that.getId_comparte())
				: that.getId_comparte() != null)
			return false;
 
		return true;
	}
 
	public int hashCode() {
		return (id_regala != null ? id_regala.hashCode() : 0);
	}

}
