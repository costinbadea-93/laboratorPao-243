<%--
  Created by IntelliJ IDEA.
  User: cbadea
  Date: 5/29/2020
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>
       <form action="loginServlet" method="post">
         Enter Username : <input type="text" name="username">
         Enter Password : <input type="password" name="password">
         <button type="submit">Login</button>
       </form>
  </body>
</html>
