package com.hibernate;

import java.util.Date;
import java.util.Set;

public class Oferta {
	
	private String nombre;
	private String descripcion;
	private  double monto_original;
	private double monto_ofertado;
	private Date periodo_inicio_compra;
	private Date periodo_fin_compra;
	private Date fecha_inicio_uso;
	private Date fecha_fin_uso;
	private Set<Cliente> clientes;
	private Set<PromocionaOferta> sedes_oferta;
	private Set<ComparteOferta> compartidos;
	
	
	public Set<ComparteOferta> getCompartidos() {
		return compartidos;
	}

	public void setCompartidos(Set<ComparteOferta> compartidos) {
		this.compartidos = compartidos;
	}

	public Oferta(String nom, String des, double ori, double ofer, Date ini_compra, Date fin_compra, Date ini_uso, Date fin_uso) {
		this.nombre = nom;
		this.descripcion = des;
		this.monto_original = ori;
		this.monto_ofertado = ofer;
		this.periodo_inicio_compra = ini_compra;
		this.periodo_fin_compra = fin_compra;
		this.fecha_inicio_uso = ini_uso;
		this.fecha_fin_uso = fin_uso;
	}
	
	public Set<PromocionaOferta> getSedes_oferta() {
		return sedes_oferta;
	}
	public void setSedes_oferta(Set<PromocionaOferta> sedes_oferta) {
		this.sedes_oferta = sedes_oferta;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
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
	public double getMonto_original() {
		return monto_original;
	}
	public void setMonto_original(double monto_original) {
		this.monto_original = monto_original;
	}
	public double getMonto_ofertado() {
		return monto_ofertado;
	}
	public void setMonto_ofertado(double monto_ofertado) {
		this.monto_ofertado = monto_ofertado;
	}
	public Date getPeriodo_inicio_compra() {
		return periodo_inicio_compra;
	}
	public void setPeriodo_inicio_compra(Date periodo_inicio_compra) {
		this.periodo_inicio_compra = periodo_inicio_compra;
	}
	public Date getPeriodo_fin_compra() {
		return periodo_fin_compra;
	}
	public void setPeriodo_fin_compra(Date periodo_fin_compra) {
		this.periodo_fin_compra = periodo_fin_compra;
	}
	public Date getFecha_inicio_uso() {
		return fecha_inicio_uso;
	}
	public void setFecha_inicio_uso(Date fecha_inicio_uso) {
		this.fecha_inicio_uso = fecha_inicio_uso;
	}
	public Date getFecha_fin_uso() {
		return fecha_fin_uso;
	}
	public void setFecha_fin_uso(Date fecha_fin_uso) {
		this.fecha_fin_uso = fecha_fin_uso;
	}
}
