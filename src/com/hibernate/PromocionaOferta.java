package com.hibernate;

import java.io.Serializable;

public class PromocionaOferta implements Serializable{
	
	private PromocionaOfertaID id_promo;
	private int cantidad_ofertada;
	
	public PromocionaOferta(PromocionaOfertaID id, int cant) {
		super();
		this.id_promo = id;
		this.cantidad_ofertada = cant;
	}
	
	public PromocionaOfertaID getId_promo() {
		return id_promo;
	}
	public void setId_promo(PromocionaOfertaID id_promo) {
		this.id_promo = id_promo;
	}
	public int getCantidad_ofertada() {
		return cantidad_ofertada;
	}
	public void setCantidad_ofertada(int cantidad_ofertada) {
		this.cantidad_ofertada = cantidad_ofertada;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
 
		PromocionaOferta that = (PromocionaOferta) o;
 
		if (id_promo != null ? !id_promo.equals(that.getId_promo())
				: that.getId_promo() != null)
			return false;
 
		return true;
	}
 
	public int hashCode() {
		return (id_promo != null ? id_promo.hashCode() : 0);
	}
}
