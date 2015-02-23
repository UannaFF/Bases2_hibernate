package com.hibernate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Categoria {
	private String id_categoria;
	private String nombre;
	private String descripcion;
	//Roles
	private Categoria super_categoria;
	private Set<Categoria> sub_categoria = new HashSet<Categoria>();
	private Set<Empresa> empresas = new HashSet<Empresa>();
	private Set<Cliente> clientes = new HashSet<Cliente>();
	private Set<Oferta> ofertas = new HashSet<Oferta>();
	
	protected Categoria(){}
	
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
	
	/* Método para actualizar tuplas dentro de Empleado */
    public static void updateCategoria(String id){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
	        //Actualizamos
	        String hql = "update categoria set id_categoria = '"+id+"' where id_categoria = '"+id+"'";
	        Query query = session.createQuery(hql); 
    	    int result = query.executeUpdate();
    		System.out.println("Rows affected: " + result);			
  
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
	
}
