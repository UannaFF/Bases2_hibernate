package com.hibernate;

import java.util.Date;

public class TDC {
	
	private String nombre;
	private String tipo;
	private int numero;
	private String nombre_habiente;
	private String cedula_habiente;
	private int codigo_seguridad;
	private Date fecha_vencimiento;
	private Cliente cliente;
	
    public TDC(String name, String tipo, int num, Date fecha_venci, String nombre_hab, int codi_se, String cedu) {
        this.nombre = name;
        this.tipo = tipo;
        this.numero = num;
        this.nombre_habiente = nombre_hab;
        this.cedula_habiente = cedu;
        this.codigo_seguridad = codi_se;
        this.fecha_vencimiento= fecha_venci;
    }
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNombre_habiente() {
		return nombre_habiente;
	}
	
	public void setNombre_habiente(String nombre_habiente) {
		this.nombre_habiente = nombre_habiente;
	}
	
	public String getCedula_habiente() {
		return cedula_habiente;
	}
	
	public void setCedula_habiente(String cedula_habiente) {
		this.cedula_habiente = cedula_habiente;
	}
	
	public int getCodigo_seguridad() {
		return codigo_seguridad;
	}
	
	public void setCodigo_seguridad(int codigo_seguridad) {
		this.codigo_seguridad = codigo_seguridad;
	}
	
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
}
