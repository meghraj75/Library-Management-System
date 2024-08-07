package com.servlet;

import java.io.IOException;
import java.util.List;

import com.dao.BookDao;
import com.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  private BookDao bookdao=new BookDao();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Book>books=bookdao.getBooks();
	
		request.setAttribute("books", books);
		request.getRequestDispatcher("booklist.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
