<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.one{
text-align:center;
}
</style>
</head>
<body>
<div class="one">
<h1 style="color:red;">Welcome to library management</h1>
<a href="add-0book.jsp">Add book</a>
<a href="updateBook.jsp">update</a>
<form action="BookListServlet" method="get">
<input type="submit" value="view">
</form>
</div>
</body>
</html>