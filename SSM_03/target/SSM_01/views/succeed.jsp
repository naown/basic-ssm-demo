<%@ page import="java.util.List" %>
<%@ page import="com.demo.entity.student.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈舰
  Date: 2019/6/9
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%String mess = (String)request.getAttribute("mess");
    if (mess!=null){
        out.print(mess);
    }
%>
<form>
    <table border="1px" style="top: 0px">
        <tr>
            <th>学生id</th>
            <th>学生姓名</th>
            <th>学生年龄</th>
            <th>家庭住址</th>
            <th>学生性别</th>
            <th>操作</th>
        </tr>
        <%
            List<Student> list = (List<Student>) request.getAttribute("students");
            for (Student student : list){
        %>
        <tr>
            <td>
               <a href="http://localhost:8080/SSM_03/student/views/<%=student.getSid()%>"><%=student.getSid()%></a>
            </td>
            <td>
                <%=student.getSname()%>
            </td>
            <td>
                <%=student.getSage()%>
            </td>
            <td>
                <%=student.getAddress()%>
            </td>
            <td>
                <%=student.getGender()%>
            </td>
            <td><a href="delete/<%=student.getSid()%>">删除</a></td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="http://localhost:8080/SSM_03/views/addStudent.jsp">添加信息</a>
</form>
</body>
</html>
