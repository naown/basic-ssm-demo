<%@ page import="org.springframework.web.bind.annotation.SessionAttribute" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>登陆</title>
<body>
<%--<h2>Hello World!</h2>
    <a href="views/index.html">redirect</a>
    <br/>
    <form action="show" method="post"><br/>
        学生姓名：<input type="text" name="sname"><br/>
        学生年龄：<input type="text" name="sage"><br/>
        家庭住址：<input type="text" name="address"><br/>
        学生性别：<input type="radio" name="gender" value="男" checked>男&nbsp;
        <input type="radio" name="gender" value="女">女<br/>
        <input type="submit" value="提交">
    </form>--%>
<h2>欢迎登陆</h2>
<hr/>
<%-- 用户名密码校验 --%>
<form action="student/login" method="post">
    用户名:<input type="text" name="uname"><br/>
    密&nbsp;&nbsp;&nbsp;码:<input type="password" name="upassword"><br/>
    <input type="submit" value="登陆"><br/>
    <font color="red">
    <%
        String str = (String)request.getAttribute("mess");
        if (str!=null){
            out.print(str);
        }
    %>
    </font>
</form>

<form action="UserTest">
    学生ID：<input type="text" name="sid"><br/>
    学生姓名：<input type="text" name="sname"><br/>
    学生年龄：<input type="text" name="sage"><br/>
    家庭住址：<input type="text" name="address"><br/>
    学生性别：<input type="text" name="gender"><br/>
    <input type="submit" value="修改">
</form>
</body>
</html>
