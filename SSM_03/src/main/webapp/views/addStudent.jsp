<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/9
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/SSM_03/student/addStudent1" method="post">
    学生姓名：<input type="text" name="sname"><br/>
    学生年龄：<input type="text" name="sage"><br/>
    家庭住址：<input type="text" name="address"><br/>
    学生性别：<input type="radio" name="gender" value="男" checked>男&nbsp;
    <input type="radio" name="gender" value="女">女<br/>
    <input type="submit" value="添加">
</form>
</body>
</html>
