<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<form action="<%=request.getContextPath()%>/student/queryStudentAll" method="post">
    <input type="submit" value="跳转">
</form>
</html>
