package com.hibernate;

import java.io.Serializable;

public class ComparteOfertaID implements Serializable{
	private Oferta oferta;
	private Cliente cliente_informador;
	private Cliente cliente_informado;
	
	public ComparteOfertaID(Oferta of, Cliente informador, Cliente informado) {
		super();
		this.oferta = of;
		this.cliente_informador = informador;
		this.cliente_informado = informado;
	}
	
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	public Cliente getCliente_informador() {
		return cliente_informador;
	}
	public void setCliente_informador(Cliente cliente_informador) {
		this.cliente_informador = cliente_informador;
	}
	public Cliente getCliente_informado() {
		return cliente_informado;
	}
	public void setCliente_informado(Cliente cliente_informado) {
		this.cliente_informado = cliente_informado;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        ComparteOfertaID that = (ComparteOfertaID) o;
 
        if (oferta != null ? !oferta.equals(that.getOferta()) : that.getOferta() != null) return false;
        if (cliente_informador != null ? !cliente_informador.equals(that.getCliente_informador()) : that.getCliente_informador() != null)
            return false;
        if (cliente_informado != null ? !cliente_informado.equals(that.getCliente_informado()) : that.getCliente_informado() != null)
            return false;
 
        return true;
    }
 
    public int hashCode() {
        int result;
        result = (oferta != null ? oferta.hashCode() : 0);
        result = 31 * result + (cliente_informador != null ? cliente_informador.hashCode() : 0);
        result = 31 * result + (cliente_informado != null ? cliente_informado.hashCode() : 0);
        return result;
    }
}
