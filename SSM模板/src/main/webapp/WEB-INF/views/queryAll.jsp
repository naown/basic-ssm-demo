<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/7/2
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table width="80px" border="1">
        <tr>
            <th>sid</th>
            <th>sname</th>
            <th>sage</th>
            <th>address</th>
            <th>gender</th>
        </tr>
        <c:forEach var="s" items="${students}" >
            <tr>
                <td>${s.sid}</td>
                <td>${s.sname}</td>
                <td>${s.sage}</td>
                <td>${s.address}</td>
                <td>${s.gender}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
