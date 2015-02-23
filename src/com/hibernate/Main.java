package com.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import util.HibernateUtil;

public class Main {
	public static void main(String[] args){
		System.out.println("");
		System.out.println("!********CREACION DE LA BASE DATOS*****!");
		System.out.println("");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			
			transaction = session.beginTransaction();
			
			//Agrega dos super categorias

			Categoria superCategoria1 = new Categoria();
			superCategoria1.setId_categoria("c001");
			superCategoria1.setNombre("Belleza");
			superCategoria1.setDescripcion("Servicios y artículos de belleza");
			
			Categoria superCategoria2 = new Categoria();
			superCategoria2.setId_categoria("c002");
			superCategoria2.setNombre("Alimentación");
			superCategoria2.setDescripcion("Servicios de alimentación");

			session.save(superCategoria1);
			session.save(superCategoria2);
			
			//Agrega dos subcategorias
			Categoria subCategoria1 = new Categoria();
			subCategoria1.setId_categoria("sc001");
			subCategoria1.setNombre("Maquillaje");
			subCategoria1.setDescripcion("Servicios y artículos de maquillaje");
			
			
			Categoria subCategoria2 = new Categoria();
			subCategoria2.setId_categoria("sc002");
			subCategoria2.setNombre("Restaurantes 5 estrellas");
			subCategoria2.setDescripcion("Las mejores ofertas en los mejores restaurantes");

			subCategoria2.setSuper_categoria(superCategoria2);
			subCategoria1.setSuper_categoria(superCategoria1);
			session.save(subCategoria1);
			session.save(subCategoria2);
			
			//CREANDO EMPRESA
			Empresa empresa = new Empresa();
			empresa.setContrasena("1234");
			empresa.setCorreo("empresa@gmail.com");
			empresa.setUser_name("empresita");
			empresa.setId_empresa("id123");
			empresa.setNombre("Empresa Sulca");
			empresa.setLinks(new String[] {"sulca.com", "facebook.sulca.com", "twitter.sulca.com"});
			Set<Categoria> conjuntoCategoria = new HashSet<Categoria>();
			conjuntoCategoria.add(superCategoria1);
			conjuntoCategoria.add(superCategoria2);
			empresa.setCategorias(conjuntoCategoria);
			session.save(empresa);
			
			//CREANDO CIUDADES
			Ciudad ciudad1 = new Ciudad();
			ciudad1.setId_ciudad(001);
			ciudad1.setNombre("Caracas");
			ciudad1.setPais("Venezuela");
			session.save(ciudad1);
		
			Ciudad ciudad2 = new Ciudad();
			ciudad2.setId_ciudad(002);
			ciudad2.setNombre("Maracaibo");
			ciudad2.setPais("Venezuela");
			session.save(ciudad2);
			
			//CREANDO SEDES
			Sede sede1 = new Sede();
			sede1.setId_sede("s001");
			sede1.setUbicacion("Las Palmas");
			sede1.setTelefonos(new String[]{"04129536426", "02125031208"});
			sede1.setMoneda("Bolivar");
			sede1.setEmpresa(empresa);
			sede1.setCiudad(ciudad1);
			session.save(sede1);
			
			Sede sede2 = new Sede();
			sede2.setId_sede("s002");
			sede2.setUbicacion("La Florida");
			sede2.setTelefonos(new String[]{"04129536427", "02125031209"});
			sede2.setMoneda("Dolar");
			sede2.setEmpresa(empresa);
			sede2.setCiudad(ciudad2);
			session.save(sede2);
			
			//CREANDO OFERTAS
			Oferta oferta1 = new Oferta("Alto Restaurant 2x1", "Disfrute de una velada romantica por el precio de 1", 300.0, 100.0, new Date(), new Date(), new Date(), new Date());
			Set<Categoria> catOf1 = new HashSet<Categoria>();
			catOf1.add(subCategoria2);
			oferta1.setCategorias(catOf1);
			session.save(oferta1);
			
			Oferta oferta2 = new Oferta("Linea mac mitad de precio", "Ofrecemos maquillaje mas accesible", 400.0, 200.0, new Date(), new Date(), new Date(), new Date());
			Set<Categoria> catOf2 = new HashSet<Categoria>();
			catOf2.add(subCategoria1);
			oferta2.setCategorias(catOf2);
			session.save(oferta2);
			
			//RELACION PROMOCIONA
			
			PromocionaOferta promo1 = new PromocionaOferta(new PromocionaOfertaID(sede1, oferta1), 12);
			PromocionaOferta promo3 = new PromocionaOferta(new PromocionaOfertaID(sede2, oferta1), 12);
			PromocionaOferta promo2 = new PromocionaOferta(new PromocionaOfertaID(sede2, oferta2), 22);
			session.save(promo1);
			session.save(promo2);
			session.save(promo3);
			
			//LLEGO LA HORA DEL CLIENTE
			
			//CREA CLIENTE CON CIUDADES Y CATEGORIAS.
			Cliente cliente1 = new Cliente();
			cliente1.setUsername("UannaFF");
			cliente1.setApellido("Gomez");
			cliente1.setContrasena("bleh");
			cliente1.setCorreo("anna.gomez.op@gmail.com");
			cliente1.setDinero_promocion(10.0);
			cliente1.setFecha_nacimiento(new Date());
			cliente1.setNombre("Anna");
			cliente1.setUsuario_red(new String[]{"uannaffani", "uannaff"});
			Set<Categoria> catCli1 = new HashSet<Categoria>();
			catCli1.add(superCategoria1);
			cliente1.setCategorias(catCli1);
			
			Set<Ciudad> ciuCli1 = new HashSet<Ciudad>();
			ciuCli1.add(ciudad1);
			cliente1.setCiudades(ciuCli1);
			session.save(cliente1);
			
			Cliente cliente2 = new Cliente();
			cliente2.setUsername("vBallestes");
			cliente2.setApellido("Ballestes");
			cliente2.setContrasena("balle");
			cliente2.setCorreo("vanessa.ballestes@gmail.com");
			cliente2.setDinero_promocion(1000.0);
			cliente2.setFecha_nacimiento(new Date());
			cliente2.setNombre("Vanessa");
			cliente2.setUsuario_red(new String[]{"vBalle", "vanesilla"});
			Set<Categoria> catCli2 = new HashSet<Categoria>();
			catCli2.add(superCategoria1);
			catCli2.add(superCategoria2);
			cliente2.setCategorias(catCli2);
			
			Set<Ciudad> ciuCli2 = new HashSet<Ciudad>();
			ciuCli2.add(ciudad2);
			cliente2.setCiudades(ciuCli2);
			session.save(cliente2);
			
			//TARJETA DE CREDITO PARA EL CLIENTE 1
			TDC tdc = new TDC("Banco Venezuela", "Visa", 897854321, new Date(), "Anna", 174, "20801877");
			TDC tdc2 = new TDC("Banco Venezuela", "Visa", 897854322, new Date(), "Franca", 176, "20801879");
			tdc.setCliente(cliente1);
			tdc2.setCliente(cliente1);
			session.save(tdc);
			session.save(tdc2);
			
			//CLIENTE 1 COMPARTE CON CLIENTE 2
			ComparteOferta comp = new ComparteOferta(new ComparteOfertaID(oferta1, cliente1, cliente2));
			session.save(comp);
			
			//CLIENTE 1 GUARDA OFERTA 2
			Set<Oferta> ofCli1 = new HashSet<Oferta>();
			ofCli1.add(oferta2);
			cliente1.setOfertas_guardadas(ofCli1);
			session.update(cliente1);
			
			//CLIENTE 2 REGALA OFERTA 1 A CLIENTE 1, paga con dinero promocion
			CuponVirtual cuponvirt = new CuponVirtual("qeu23712iwe8", new Date(), 100.0);
			
			RegalaOferta regala1 = new RegalaOferta(new RegalaOfertaID(oferta1, cliente2, cliente1), cuponvirt);
			session.save(regala1);
			session.save(cuponvirt);
			
			//CLIENTE 1 SE COMPRA 2
			CuponTDC cupontdc = new CuponTDC("128312837qhe89137", new Date(), oferta1.getMonto_ofertado(), 100.0, 0.0);
			
			RegalaOferta regala2 = new RegalaOferta(new RegalaOfertaID(oferta2, cliente1, cliente1), cupontdc);
			session.save(regala2);
			session.save(cupontdc);
			
			//CLIENTE 2 COMPRA LA OFERTA COMPARTIDA POR CLIENTE 1
			CuponVirtual cuponvirt2 = new CuponVirtual("QWEIUQE8", new Date(), 50.0);
			RegalaOferta regala3 = new RegalaOferta(new RegalaOfertaID(oferta1, cliente2, cliente2), cuponvirt2);
			session.save(regala3);
			session.save(cuponvirt2);
		
		transaction.commit();
		}catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println("");
		System.out.println("!********CONSULTAS*****!");
		System.out.println("");
		System.out.println("--------------LISTAR CLIENTES--------------");
		System.out.println("");
		listarClientes();
		System.out.println("");
		System.out.println("--------------LISTAR OFERTAS---------------");
		System.out.println("");
		listarOfertas();
		System.out.println("");
		System.out.println("--------------LISTAR CUPONES DE TDC---------------");
		System.out.println("");
		listarCuponesTDC();
		sessionFactory.close();
	}
	
	//CONSULTAS GENERALES
    public static void listCategorias( ){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
        
        	Query query =
    				session.createQuery("from com.hibernate.Categoria cat");
    				query.setFirstResult(0);
    				query.setMaxResults(4); //Para definir el número máximo de tuplas que quiero consultar
    	    
    		//Guardando en la lista todas las tuplas recibidas en el query	
    		List cats = query.list(); 

    		//Iterando sobre todas las tuplas almacenadas en la lista
        	for (Iterator iterator = cats.iterator(); iterator.hasNext();) {
        		Categoria cat = (Categoria) iterator.next(); 
        		System.out.print("ID: " + cat.getId_categoria()); 
        		System.out.print(" Cant sub: " + cat.getSub_categoria().size()); 
        		//System.out.println("  Salary: " + employee.getSalary()); 
        	}
        	transaction.commit();
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
    
    public static void listarClientes(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
	     String sql = "SELECT * FROM CLIENTE";
	     SQLQuery query = session.createSQLQuery(sql);
	     query.addEntity(Cliente.class);
	     @SuppressWarnings("unchecked")
	     ArrayList<Cliente> clientes = (ArrayList<Cliente>) query.list();
	
	     for (Iterator<Cliente> iterator =clientes.iterator(); iterator.hasNext();){
		      Cliente cliente1 = (Cliente) iterator.next(); 
		      System.out.println("Nombre: " + cliente1.getNombre() + " "); 
		      System.out.println("Apellido: " + cliente1.getApellido()); 
	     }
        } catch (HibernateException e) {
        	if (transaction!=null) transaction.rollback();
        	e.printStackTrace(); 
        } finally {
        	session.close(); 
        }
    }
    public static void listarOfertas(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
	     String sql1 = "SELECT * FROM OFERTA";
	     SQLQuery query1 = session.createSQLQuery(sql1);
	     query1.addEntity(Oferta.class);
	     @SuppressWarnings("unchecked")
	     ArrayList<Oferta> ofertas = (ArrayList<Oferta>) query1.list();
	
	     for (Iterator<Oferta> iterator =ofertas.iterator(); iterator.hasNext();){
		      Oferta oferta1 = (Oferta) iterator.next(); 
		      System.out.println("Nombre: " + oferta1.getNombre() + " "); 
		      System.out.println("Monto Original: " + oferta1.getMonto_original());
		      System.out.println("Monto Ofertado: " + oferta1.getMonto_ofertado());
		      System.out.println("Fecha inicio compra: " + oferta1.getPeriodo_inicio_compra());
		      System.out.println("Fecha fin compra: " + oferta1.getPeriodo_fin_compra());
		      System.out.println("Fecha inicio uso: " + oferta1.getFecha_inicio_uso());
		      System.out.println("Fecha fin uso: " + oferta1.getFecha_fin_uso());
	     }
    } catch (HibernateException e) {
    	if (transaction!=null) transaction.rollback();
    	e.printStackTrace(); 
    } finally {
    	session.close(); 
    }
    }
    public static void listarCuponesTDC(){
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
        try{
        	transaction = session.beginTransaction();
		     String sql2 = "SELECT * FROM CUPON WHERE monto_subtotal IS NOT NULL";
		     SQLQuery query2 = session.createSQLQuery(sql2);
		     query2.addEntity(Cupon.class);
		     @SuppressWarnings("unchecked")
		     ArrayList<Cupon> cupones = (ArrayList<Cupon>) query2.list();
		     System.out.println(cupones.size());
		     for (Iterator<Cupon> iterator =cupones.iterator(); iterator.hasNext();){
			      CuponTDC cuponTDC1 = (CuponTDC) iterator.next(); 
			      System.out.println("ID: " + cuponTDC1.getId() + " "); 
			      System.out.println("Fecha de Compra: " + cuponTDC1.getFecha_compra());
			      System.out.println("Monto subtotal: " + cuponTDC1.getMonto_subtotal());
			      System.out.println("Monto impuestos: " + cuponTDC1.getMonto_impuestos());
			      System.out.println("Monto total: " + cuponTDC1.getMonto_total());
		     }
	    } catch (HibernateException e) {
	    	if (transaction!=null) transaction.rollback();
	    	e.printStackTrace(); 
	    } finally {
	    	session.close(); 
	    }
    }
}
