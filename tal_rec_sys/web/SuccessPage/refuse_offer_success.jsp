<%@ page import="bean.ConfirmUser" %><%--
  Created by IntelliJ IDEA.
  User: sdtsz
  Date: 2018/10/30
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拒绝成功</title>
</head>
<body>
<% ConfirmUser user=(ConfirmUser)session.getAttribute("confirm_user");
    String name=user.getName();
    String sex=user.getSex();%>

<%=name+sex+"，拒绝成功!"%>
</body>
</html>
