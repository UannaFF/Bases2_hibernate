package com.hibernate;

import java.util.Set;

public class Sede {
	private String id_sede;
	private String ubicacion;
	private String[] telefonos;
	private String moneda;
	private Empresa empresa;
	private Ciudad ciudad;
	private Set<PromocionaOferta> promos_ofertas;
	
	public Set<PromocionaOferta> getPromos_ofertas() {
		return promos_ofertas;
	}
	public void setPromos_ofertas(Set<PromocionaOferta> promos_ofertas) {
		this.promos_ofertas = promos_ofertas;
	}
	public String getId_sede() {
		return id_sede;
	}
	public void setId_sede(String id_sede) {
		this.id_sede = id_sede;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String[] getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
