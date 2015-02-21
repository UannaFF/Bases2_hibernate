package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
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
		session.save(cliente);
		
		//Agregando TDCs
		TDC tdc = new TDC("Banco Venezuela", "Visa", 897854321, new Date(), "Anna", 174, "20801877");
		tdc.setCliente(cliente);
		TDC tdc2 = new TDC("Banco Venezuela", "Visa", 897854322, new Date(), "Franca", 176, "20801879");
		tdc2.setCliente(cliente);
		
		session.save(tdc);
		session.save(tdc2);
		
		//agregando empresa
		Empresa empresa = new Empresa();
		empresa.setContrasena("1234");
		empresa.setCorreo("empresa@gmail.com");
		empresa.setUser_name("empresita");
		empresa.setId_empresa("id123");
		empresa.setNombre("Empresa Sulca");
		empresa.setLinks(new String[] {"sulca.com", "facebook.sulca.com", "twitter.sulca.com"});
		
		session.save(empresa);
		
		//Agregando Sede
		Sede sede1 = new Sede();
		sede1.setId_sede("s001");
		sede1.setUbicacion("Las Palmas");
		sede1.setTelefonos(new String[]{"04129536426", "02125031208"});
		sede1.setMoneda("Bolivar");
		sede1.setEmpresa(empresa);
		session.save(sede1);
		
		Sede sede2 = new Sede();
		sede2.setId_sede("s002");
		sede2.setUbicacion("La Florida");
		sede2.setTelefonos(new String[]{"04129536427", "02125031209"});
		sede2.setMoneda("Dolar");
		sede2.setEmpresa(empresa);
		session.save(sede2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
