<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{
align:center;
color:green;
}

</style>
</head>
<body>
 <h2>Update book here</h2>
 <form action="UpdateBookServlet" method="post">
 Book Id:<input type="text" name="id" required/> <br><br>
  Book Title:<input type="text" name="title" required/><br><br>
  Book Author:<input type="text" name="author"  required/><br><br>
  Book Price:<input type="text" name="price"  required/><br><br>
  
  <input type="submit" value="update"/>
 </form>
 <a href="booklist.jsp">book list </a>
</body>
</html>