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
		
		TDC tdc = new TDC("Banco Venezuela", "Visa", 897854321, new Date(), "Anna", 174, "20801877");
		tdc.setCliente(cliente);
		
		TDC tdc2 = new TDC("Banco Venezuela", "Visa", 897854322, new Date(), "Franca", 176, "20801879");
		tdc2.setCliente(cliente);

		session.save(tdc);
		session.save(tdc2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
