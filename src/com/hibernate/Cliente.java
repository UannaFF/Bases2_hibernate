package com.hibernate;

import java.util.Date;
import java.util.Set;

public class Cliente {
	
	private String username;
	private String contrasena;
	private String correo;
	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private String[] usuario_red;
	private double dinero_promocion;
	private Set<TDC> tarjetas;
	private Set<Ciudad> ciudades;
	private Set<Oferta> ofertas_guardadas;
	private Set<Categoria> categorias;
	
	//Roles-comparte
	private Set<ComparteOferta> informador;
	private Set<ComparteOferta> informado;
		
	public Set<ComparteOferta> getInformador() {
		return informador;
	}
	public void setInformador(Set<ComparteOferta> informador) {
		this.informador = informador;
	}
	public Set<ComparteOferta> getInformado() {
		return informado;
	}
	public void setInformado(Set<ComparteOferta> informado) {
		this.informado = informado;
	}
	
	public Set<Oferta> getOfertas_guardadas() {
		return ofertas_guardadas;
	}

	public void setOfertas_guardadas(Set<Oferta> ofertas_guardadas) {
		this.ofertas_guardadas = ofertas_guardadas;
	}

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public Set<TDC> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Set<TDC> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String[] getUsuario_red() {
		return usuario_red;
	}

	public void setUsuario_red(String[] usuario_red) {
		this.usuario_red = usuario_red;
	}

	public double getDinero_promocion() {
		return dinero_promocion;
	}

	public void setDinero_promocion(double dinero_promocion) {
		this.dinero_promocion = dinero_promocion;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

}
