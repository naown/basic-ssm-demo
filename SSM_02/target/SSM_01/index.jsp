<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
    <a href="show">redirect</a>
    <br/>
    <form action="show" method="post">
        学生姓名：<input type="text" name="sname">
        学生年龄：<input type="text" name="sage">
        家庭住址：<input type="text" name="address">
        学生性别：<input type="text" name="gender">
        <input type="submit" value="提交">
    </form>
</body>
</html>
