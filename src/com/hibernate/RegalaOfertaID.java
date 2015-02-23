package com.hibernate;

import java.io.Serializable;

public class RegalaOfertaID implements Serializable{
	private Oferta oferta;
	private Cliente cliente_emisor;
	private Cliente cliente_receptor;
	
	public RegalaOfertaID(Oferta oferta, Cliente cliente_emisor,
			Cliente cliente_receptor) {
		super();
		this.oferta = oferta;
		this.cliente_emisor = cliente_emisor;
		this.cliente_receptor = cliente_receptor;
	}
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	public Cliente getCliente_emisor() {
		return cliente_emisor;
	}
	public void setCliente_emisor(Cliente cliente_emisor) {
		this.cliente_emisor = cliente_emisor;
	}
	public Cliente getCliente_receptor() {
		return cliente_receptor;
	}
	public void setCliente_receptor(Cliente cliente_receptor) {
		this.cliente_receptor = cliente_receptor;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        RegalaOfertaID that = (RegalaOfertaID) o;
 
        if (oferta != null ? !oferta.equals(that.getOferta()) : that.getOferta() != null) return false;
        if (cliente_emisor != null ? !cliente_emisor.equals(that.getCliente_emisor()) : that.getCliente_emisor() != null)
            return false;
        if (cliente_receptor != null ? !cliente_receptor.equals(that.getCliente_receptor()) : that.getCliente_receptor() != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (oferta != null ? oferta.hashCode() : 0);
        result = 31 * result + (cliente_emisor != null ? cliente_emisor.hashCode() : 0);
        result = 31 * result + (cliente_receptor != null ? cliente_receptor.hashCode() : 0);
        return result;
    }
	
}
