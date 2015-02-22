package com.hibernate;

import java.util.Date;

public class CuponVirtual extends Cupon{
	//Aclarar que es esto
	private double tasa_cambio;

	public CuponVirtual(String i, Date fecha, double tasa){
		super(i, fecha);
		this.tasa_cambio = tasa;
	}
	
	public double getTasa_cambio() {
		return tasa_cambio;
	}

	public void setTasa_cambio(double tasa_cambio) {
		this.tasa_cambio = tasa_cambio;
	}
}
