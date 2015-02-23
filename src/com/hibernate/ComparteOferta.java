package com.hibernate;

import java.io.Serializable;

public class ComparteOferta implements Serializable{
	private ComparteOfertaID id_comparte;

	public ComparteOferta(ComparteOfertaID id_comparte) {
		super();
		this.id_comparte = id_comparte;
	}

	public ComparteOfertaID getId_comparte() {
		return id_comparte;
	}

	public void setId_comparte(ComparteOfertaID id_comparte) {
		this.id_comparte = id_comparte;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
 
		ComparteOferta that = (ComparteOferta) o;
 
		if (id_comparte != null ? !id_comparte.equals(that.getId_comparte())
				: that.getId_comparte() != null)
			return false;
 
		return true;
	}
 
	public int hashCode() {
		return (id_comparte != null ? id_comparte.hashCode() : 0);
	}
}
