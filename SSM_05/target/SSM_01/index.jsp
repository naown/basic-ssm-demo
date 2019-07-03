<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>登陆</title>
<body>
<h2>欢迎登陆</h2>
<hr/>
<%-- 用户名密码校验 --%>
<form action="<%=request.getContextPath()%>/student/login" method="post">
    用户名:<input type="text" name="uname"><br/>
    密&nbsp;&nbsp;&nbsp;码:<input type="password" name="upassword"><br/>
    <input type="submit" value="登陆"><br/>
    <font color="red">
    <%
        String str = (String)request.getAttribute("mess");
        if (str!=null){
            out.print(str);
        }
        String path = request.getContextPath();
    %>
    </font>
</form>
</body>
</html>
