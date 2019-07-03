<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/8
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入信息</title>
</head>
<body>
    <form action="student/addUser1" method="post">
        学生姓名：<input type="text" name="sname">
        学生年龄：<input type="text" name="sage">
        家庭住址：<input type="text" name="address">
        学生性别：<input type="text" name="gender">
        <input type="submit" value="提交">
    </form>
</body>
</html>
