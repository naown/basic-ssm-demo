<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="index1">redirect</a>
    <br/>
    <form action="show" method="post"><br/>
        学生姓名：<input type="text" name="sname"><br/>
        学生年龄：<input type="text" name="sage"><br/>
        家庭住址：<input type="text" name="address"><br/>
        学生性别：<input type="radio" name="gender" value="男" checked>男&nbsp;
        <input type="radio" name="gender" value="女">女<br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
