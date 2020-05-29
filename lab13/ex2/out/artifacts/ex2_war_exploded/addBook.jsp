<%--
  Created by IntelliJ IDEA.
  User: cbadea
  Date: 5/29/2020
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="addBookServlet" method="post">
            Enter Book Name: <input type="text" name="bookName">
            Enter Book Author: <input type="text" name="bookAuthor">
            <button type="submit">Save Book</button>
        </form>
</body>
</html>
