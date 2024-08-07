package com.servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao bookDao=new BookDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
	   bookDao.deleteBooks(id);
		response.sendRedirect("BookListServlet");
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
