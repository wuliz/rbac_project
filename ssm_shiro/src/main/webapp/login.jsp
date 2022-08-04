<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/4
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <form action="<%=request.getContextPath()%>/shiro/login">
           账号：<input type="text" name="username">
           <br>
           密码：<input type="text" name="password">
           <input type="submit" value="提交">
       </form>
</body>
</html>
