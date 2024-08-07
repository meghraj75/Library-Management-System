<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.form{

text-align:center;
}
</style>
</head>
<body>
<div class="form">
<h2>Add your book here </h2>
<form action="AddBookServlet" method ="post">
Id:<input type="text" name="book_id" required/><br> <br>
Title:<input type="text" placeholder="enter book title" name="title" required/><br> <br>
Author:<input type="text" placeholder="enter book author" name="author" required/><br><br>
Price:<input type="text" placeholder="enter book price" name="price" required/><br><br>

<br>
<input type="submit" value="submit">
<input type="reset" value="value">
</form>
</div>
<form action="BookListServlet" method="get">
<input type="submit" value="view">

</form>
</body>
</html>