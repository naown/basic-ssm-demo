<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/9
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.demo.entity.student.Student" %>
<html>
<head>
    <title>更新个人信息</title>
</head>
<body>
<%
    Student student1 = (Student)request.getSession().getAttribute("studentUpdate");
    out.print(student1);
%>
    <form action="updateUser" method="post">
        学生ID：<input type="text" name="sid" readonly value="<%=student1.getSid()%>"><br/>
        学生姓名：<input type="text" name="sname" value="<%=student1.getSname()%>"><br/>
        学生年龄：<input type="text" name="sage" value="<%=student1.getSage()%>"><br/>
        家庭住址：<input type="text" name="address" value="<%=student1.getAddress()%>"><br/>
        学生性别：<input type="text" name="gender" value="<%=student1.getGender()%>"><br/>
        <input type="submit" value="修改">
    </form>
</body>
</html>
