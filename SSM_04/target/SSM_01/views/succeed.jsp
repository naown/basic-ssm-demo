<%@ page import="com.demo.entity.student.Prop" %>
<%@ page import="com.demo.entity.student.Student" %>
<%@ page import="java.util.List" %>
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
    Prop prop = (Prop) request.getSession().getAttribute("prop");
%>
<form action="http://localhost:8080/SSM_04/student/updateDATA">
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
               <a href="http://localhost:8080/SSM_04/student/views/<%=student.getSid()%>"><%=student.getSid()%></a>
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
            <td><a href="http://localhost:8080/SSM_04/student/delete/<%=student.getSid()%>">删除</a></td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="http://localhost:8080/SSM_04/views/addStudent.jsp">添加信息</a>
    &nbsp;
    请选择显示条数：
    <select name="numbers">
    <option value="5">5</option>
    <option value="10">10</option>
    <option value="15">15</option>
    </select> &nbsp;当前显示条数为:<%=prop.getNumbers()==null?5:prop.getNumbers()%><br/>
    <br/>
    <%=prop.getSpeed()==0?"首页":"<a href=\"http://localhost:8080/SSM_04/student/home\">首页</a>&nbsp;"%>
    <%=prop.getSpeed()==0?"上一页":"<a href=\"http://localhost:8080/SSM_04/student/previous\">上一页</a>"%>
    <%=(prop.getLast()-1)*prop.getNumbers()==prop.getSpeed()?"下一页":"<a href=\"http://localhost:8080/SSM_04/student/down\">下一页</a>&nbsp;"%>
    <%=(prop.getLast()-1)*prop.getNumbers()==prop.getSpeed()?"尾页":"<a href=\"http://localhost:8080/SSM_04/student/last\">尾页</a>"%>
    <input type="submit" value="更新数据">
</form>
</body>
</html>
