package com.hibernate;

import java.util.Date;

public class CuponTDC extends Cupon{
	private double monto_subtotal;
	private double monto_impuestos;
	private double monto_total;
	
	public CuponTDC(String id, Date fecha_c, double subtotal, double impuestos){
		super(id, fecha_c);
		this.monto_subtotal = subtotal;
		//Me parece que impuestos podrian ser derivados, pero no se
		this.monto_impuestos = impuestos;
		this.monto_total = subtotal + impuestos;
	}
	
	public double getMonto_subtotal() {
		return monto_subtotal;
	}
	public void setMonto_subtotal(double monto_subtotal) {
		this.monto_subtotal = monto_subtotal;
	}
	public double getMonto_impuestos() {
		return monto_impuestos;
	}
	public void setMonto_impuestos(double monto_impuestos) {
		this.monto_impuestos = monto_impuestos;
	}
	public double getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}
	
}
