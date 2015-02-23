package com.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Categoria {
	private String id_categoria;
	private String nombre;
	private String descripcion;
	//Roles
	private Categoria super_categoria;
	private Set<Categoria> sub_categoria = new HashSet<Categoria>();
	private Set<Empresa> empresas;
	private Set<Cliente> clientes;
	private Set<Oferta> ofertas;
	
	public String getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Categoria getSuper_categoria() {
		return super_categoria;
	}
	public void setSuper_categoria(Categoria super_categoria) {
		this.super_categoria = super_categoria;
	}
	public Set<Categoria> getSub_categoria() {
		return sub_categoria;
	}
	public void setSub_categoria(Set<Categoria> sub_categoria) {
		this.sub_categoria = sub_categoria;
	}

	public Set<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(Set<Empresa> empresas) {
		this.empresas = empresas;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Set<Oferta> getOfertas() {
		return ofertas;
	}
	public void setOfertas(Set<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

}
