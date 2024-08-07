package com.servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		double price=Double.parseDouble(request.getParameter("price"));
		
		
		Book book=new Book(id,title,author,price);
		BookDao.updateBooks(book);
		response.sendRedirect("BookListServlet");
	}

}
