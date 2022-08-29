<%--
  Created by IntelliJ IDEA.
  User: wuliz
  Date: 2022/8/6
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
welcome : <shiro:principal></shiro:principal><br/>
<shiro:hasAnyRoles name="admin"><a href="/admin.jsp">admin</a><br></shiro:hasAnyRoles>
<shiro:hasRole name="user"><a href="/user.jsp">user</a><br></shiro:hasRole>
<a href="/shiro/logout">logout</a>
</body>
</html>
