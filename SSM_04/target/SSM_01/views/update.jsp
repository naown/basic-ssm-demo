<%@ page import="com.demo.entity.student.Student" %><%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/9
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新个人信息</title>
</head>
<body>
<%
    Student student1 = (Student)request.getAttribute("student1");
    out.print(student1);
%>
<%--    <form action="student/update" method="post">--%>
<%--    <form action="student/update" method="post">--%>
    <form action="http://localhost:8080/SSM_04/student/update" method="post">
        学生ID：<input type="text" name="sid" readonly value="<%=student1.getSid()%>"><br/>
        学生姓名：<input type="text" name="sname" value="<%=student1.getSname()%>"><br/>
        学生年龄：<input type="text" name="sage" value="<%=student1.getSage()%>"><br/>
        家庭住址：<input type="text" name="address" value="<%=student1.getAddress()%>"><br/>
        <%
            String gender = (String)student1.getGender();
        %>
        学生性别：<input type="radio" name="gender" value="男"
            <%
                if ("男".equals(gender))
                %>checked
                <%
            %>
        >男&nbsp;
        <input type="radio" name="gender" value="女"
        <%
            if ("女".equals(gender))
                %>checked
                <%
        %>
        >女<br/>
        <input type="submit" value="修改">
    </form>

</body>
</html>
