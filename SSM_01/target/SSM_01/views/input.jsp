<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/7
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息输入</title>
</head>
<body>
    <form action="addStudent" method="post">
        学生姓名：<input type="text" name="sname">
        学生年龄：<input type="text" name="sage">
        学生性别：<input type="text" name="gender">
        家庭住址：<input type="text" name="address">
        <input type="submit" value="录入">
    </form>
</body>
</html>
