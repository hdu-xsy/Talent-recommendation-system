<%@ page import="bean.LoginUser" %>
<%@ page import="ienum.RrStage" %><%--
  Created by IntelliJ IDEA.
  User: sdtsz
  Date: 2018/11/27
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%  String rrid=request.getParameter("rrid");
    LoginUser user=(LoginUser)session.getAttribute("user");
    String name=user.getUsername();
%>
<head>
    <title>需求(rec_id:<%=rrid%>)的管理页面(状态：<%=RrStage.W_I1%>)</title>
</head>
<p>登录人：<%=name%></p>
<p>需求号：<%=rrid%></p>
<body>
<form action="" method="post">
    <%
        Table_for_SRM_vSift table=new Table_for_SRM_vSift("select rec_rp_id,rec_rp_name,rec_stf_name,rec_from_desc from SRM_OPEN where rec_rr_id="+rrid, ConnectUser.HR);
        String []head={"被推荐人id","被推荐人","推荐人","推荐来源","详细信息","筛选选项"};
        out.print(table.genHTML(head));
    %>

    <input type="submit" value="保存">
</form>
</body>
</html>
