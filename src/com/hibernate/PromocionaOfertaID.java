package com.hibernate;

import java.io.Serializable;

public class PromocionaOfertaID implements Serializable {
	private Sede id_sede;
	private Oferta nombre;
	
	protected PromocionaOfertaID(){}
	
	public PromocionaOfertaID(Sede sed, Oferta of) {
		super();
		this.id_sede = sed;
		this.nombre = of;
	}
	
	public Sede getId_sede() {
		return id_sede;
	}
	public void setId_sede(Sede id_sede) {
		this.id_sede = id_sede;
	}
	public Oferta getNombre() {
		return nombre;
	}
	public void setNombre(Oferta oferta) {
		this.nombre = oferta;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        PromocionaOfertaID that = (PromocionaOfertaID) o;
 
        if (id_sede != null ? !id_sede.equals(that.getId_sede()) : that.getId_sede() != null) return false;
        if (nombre != null ? !nombre.equals(that.getNombre()) : that.getNombre() != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (id_sede != null ? id_sede.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
