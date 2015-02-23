package com.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
	private String user_name;
	private String contrasena;
	private String correo;
	private String id_empresa;
	private String nombre;
	private String[] links;
	private Set<Sede> sedes; // La empresa tiene un set de sedes
	private Set<Categoria> categorias;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getLinks() {
		return links;
	}
	public void setLinks(String[] links) {
		this.links = links;
	}
	public Set<Sede> getSedes() {
		return sedes;
	}
	public void setSedes(Set<Sede> sedes) {
		this.sedes = sedes;
	}
	public Set<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}
	
}
