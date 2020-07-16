<%--
  Created by IntelliJ IDEA.
  User: SAADA HASSAN
  Date: 7/16/2020
  Time: 3:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="myservlet" method="get">
    <h2>students information</h2><br><br>
    name<input type="text" name="name"><br><br>
    registration number<input type="text" name="reg"><br><br>
    grade<input type="text" name="grade"><br><br>
    phone number<input type="number" name="phone"><br><br>
    email <input type="email" name="email"><br><br>
    sex <input type="radio" name="sex">female<br>
    <input type="radio" name="sex">male<br><br>
    registration status<input type="radio" name="reg">active<br><br>
     <input type="radio" name="reg">not active<br><br>
    <input type="submit" value="SEND">



  </form>
  </body>
</html>
