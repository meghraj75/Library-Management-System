<%@ page import="java.util.List" %>
<%@ page import="com.entity.Book" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Book List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <div align="center">
        <h1>Book List</h1>
        <table>
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Author</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>

            <% 
                List<Book> books = (List<Book>) request.getAttribute("books");
                if (books != null) {
                    for (Book book : books) { 
            %>
                <tr>
                    <td><%= book.getBid() %></td>
                    <td><%= book.getTitle() %></td>
                    <td><%= book.getAuthor() %></td>
                    <td><%= book.getPrice() %></td>
                     <td>
                     
                        <a href="DeleteBookServlet?id=<%= book.getBid() %>">Delete</a>&nbsp;<a href="updateBook.jsp">Update</a>
                    </td>
                  
                </tr>
            <% 
                    }
                }
            %>
        </table>
    </div>
    <div align="center">
        <a href="home.jsp">Home</a>
    </div>
</body>
</html>


