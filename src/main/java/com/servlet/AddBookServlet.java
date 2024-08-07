package com.servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private BookDao bookdao = new BookDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	        String bookIdString = request.getParameter("book_id");
    	        int bookId = 0;
    	        try {
    	            if (bookIdString != null && !bookIdString.isEmpty()) {
    	                bookId = Integer.parseInt(bookIdString);
    	            }
    	        } catch (NumberFormatException e) {
    	            e.printStackTrace();  // Print stack trace instead of logging
    	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid book ID");
    	            return;
    	        }

    	        String title = request.getParameter("title");
    	        String author = request.getParameter("author");
    	        double price = 0.0;
    	        try {
    	            price = Double.parseDouble(request.getParameter("price"));
    	        } catch (NumberFormatException e) {
    	            e.printStackTrace();  // Print stack trace instead of logging
    	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid price");
    	            return;
    	        }

    	        Book book = new Book(title, author, price);

    	        boolean result = bookdao.save(book);

    	        if (result) {
    	            response.sendRedirect("booklist.jsp");
    	        } else {
    	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Failed to add book");
    	        }
    }
}
