package com.hibernate;

import java.util.Set;

public class Ciudad {
	private int id_ciudad;
	private String nombre;
	private String pais;
	private Set<Sede> sedes; //Una Ciudad tiene un conjunto de sedes
	
	public int getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(int id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Set<Sede> getSedes() {
		return sedes;
	}
	public void setSedes(Set<Sede> sedes) {
		this.sedes = sedes;
	}
	
}
