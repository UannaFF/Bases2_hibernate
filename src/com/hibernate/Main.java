package com.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args){
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//agregando cliente
		Cliente cliente = new Cliente();
		cliente.setUsername("UannaFF");
		cliente.setApellido("Gómez");
		cliente.setContrasena("drehrhhp");
		cliente.setCorreo("anna.gomez.op@gmail.com");
		cliente.setDinero_promocion(10.0);
		cliente.setFecha_nacimiento(new Date());
		cliente.setNombre("Anna");
		cliente.setUsuario_red(new String[]{"uannaffani", "uannaff"});
		
		
		//Agregando TDCs
		TDC tdc = new TDC("Banco Venezuela", "Visa", 897854321, new Date(), "Anna", 174, "20801877");
		
		TDC tdc2 = new TDC("Banco Venezuela", "Visa", 897854322, new Date(), "Franca", 176, "20801879");
		
		
		
		
		//agregando empresa
		Empresa empresa = new Empresa();
		empresa.setContrasena("1234");
		empresa.setCorreo("empresa@gmail.com");
		empresa.setUser_name("empresita");
		empresa.setId_empresa("id123");
		empresa.setNombre("Empresa Sulca");
		empresa.setLinks(new String[] {"sulca.com", "facebook.sulca.com", "twitter.sulca.com"});
		
		session.save(empresa);
		
		//Agregando Ciudad
		Ciudad ciudad = new Ciudad();
		ciudad.setId_ciudad(001);
		ciudad.setNombre("Caracas");
		ciudad.setPais("Venezuela");
		//session.save(ciudad);
	
		Ciudad ciudad1 = new Ciudad();
		ciudad1.setId_ciudad(002);
		ciudad1.setNombre("Maracaibo");
		ciudad1.setPais("Venezuela");
		//session.save(ciudad1);
		
		Set<Ciudad> ciudades = new HashSet<Ciudad>();
		ciudades.add(ciudad);
		ciudades.add(ciudad1);
		
		cliente.setCiudades(ciudades);
		tdc.setCliente(cliente);
		tdc2.setCliente(cliente);
		session.save(tdc);
		session.save(tdc2);
		
		//Agregando Sede
		Sede sede1 = new Sede();
		sede1.setId_sede("s001");
		sede1.setUbicacion("Las Palmas");
		sede1.setTelefonos(new String[]{"04129536426", "02125031208"});
		sede1.setMoneda("Bolivar");
		sede1.setEmpresa(empresa);
		sede1.setCiudad(ciudad);
		session.save(sede1);
		
		Sede sede2 = new Sede();
		sede2.setId_sede("s002");
		sede2.setUbicacion("La Florida");
		sede2.setTelefonos(new String[]{"04129536427", "02125031209"});
		sede2.setMoneda("Dolar");
		sede2.setEmpresa(empresa);
		sede2.setCiudad(ciudad1);
		session.save(sede2);
		
		//Agregando Clase Categoria
		Categoria superCategoria = new Categoria();
		superCategoria.setId_categoria("c001");
		superCategoria.setNombre("Belleza");
		superCategoria.setDescripcion("Servicios y artículos de belleza");
		
		Categoria subCategoria = new Categoria();
		subCategoria.setId_categoria("c002");
		subCategoria.setNombre("Maquillaje");
		subCategoria.setDescripcion("Servicios y artículos de maquillaje");
		subCategoria.setSuper_categoria(superCategoria);//seteo la super categoria a la subcategoria
		
		Categoria subCategoria1 = new Categoria();
		subCategoria1.setId_categoria("c003");
		subCategoria1.setNombre("Piel");
		subCategoria1.setDescripcion("Servicios y artículos para el cuidado de la piel");
		subCategoria1.setSuper_categoria(superCategoria);
		
		session.save(superCategoria);
		session.save(subCategoria);
		session.save(subCategoria1);
		
		CuponTDC cupontdc1 = new CuponTDC("iui", new Date(), 100.0, 100.0);
		session.save(cupontdc1);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
