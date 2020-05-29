<%@ page import="model.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cbadea
  Date: 5/29/2020
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List books</title>
</head>
<body>
            <table>
                <tr>
                    <th> Book name </th>
                    <th> Book author </th>
                    <th> Action </th>
                </tr>
                <tr>
                    <%
                        List<Book> books = (List) request.getAttribute("books");
                        for (Book book : books) {
                    %>
                    <td><%=book.getName()%></td>
                    <td><%=book.getAuthor()%></td>
                    <td><a href="deleteBookServlet?bookName=<%=book.getName()%>">Delete Book</a></td>
                </tr>
                <%}%>
            </table>

          <a href="loginServlet?param=listing">Go back to options</a>
</body>
</html>
