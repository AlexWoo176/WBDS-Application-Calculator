<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/5/2020
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="result" method="post">
    <table>
        <tr>
            <td><input type="text" name="numberOne" value="${numberOne}"></td>
            <td><input type="text" name="numberTwo" value="${numberTwo}"></td>
        </tr>
    </table>

    <input type="submit" value="Addition(+)" name="add">
    <input type="submit" value="Subtraction(-)" name="sub">
    <input type="submit" value="Multiplication(x)" name="mul">
    <input type="submit" value="Division(/)" name="div">
</form>
Result ${app} : ${result}.
</body>
</html>
