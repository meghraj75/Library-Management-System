package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Book;

public class BookDao {
	 public boolean save(Book book) {
	        Transaction trans = null;
	        boolean isSuccess = false;

	        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
	            trans = session.beginTransaction();
	            session.save(book);
	            trans.commit();
	            isSuccess = true;
	        } catch (HibernateException e) {
	            if (trans != null) trans.rollback();
	            e.printStackTrace();  // Print stack trace instead of logging
	        }
	        return isSuccess;
	    }


	public static List<Book> getBooks() {
		Transaction trans = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();

		trans = session.beginTransaction();
		
		return session.createQuery("from Book",Book.class).list();
		
	}
	
	public static boolean updateBooks(Book book){
		Transaction trans = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();

		trans = session.beginTransaction();
		session.update(book);
		trans.commit();
		session.close();
	   return false;	
	}
	
	public static void deleteBooks(int bid) {
		Transaction trans = null;
		Session session = HibernateConfiguration.getSessionFactory().openSession();

		trans = session.beginTransaction();
		Book book=session.get(Book.class,bid );
		session.delete(book);
		trans.commit();
		session.close();
		
	}
}
