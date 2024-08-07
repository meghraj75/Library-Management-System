package com.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Book;


public class HibernateConfiguration {

	
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory () {
		//org.hibernate.cfg.Configuration con=new org.hibernate.cfg.Configuration();
		Configuration con=new Configuration();
		Properties setting=new Properties();
		setting.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");  //(Environment class in hiberbate
		setting.put(Environment.URL,"jdbc:mysql://localhost:3306/bookmanagement"); 
		setting.put(Environment.USER,"root");
		setting.put(Environment.PASS,"mysql75@"); 
		setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		setting.put(Environment.HBM2DDL_AUTO,"update");
		setting.put(Environment.SHOW_SQL,"true");
		
		con.setProperties(setting);
		con.addAnnotatedClass(Book.class);//annoted classs
		
		//interface present in org.hiberperate that provide service
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		sessionfactory=con.buildSessionFactory(serviceRegistry);
		return sessionfactory;
		
	}
}
