<%@ page import="ienum.ConnectUser" %>
<%@ page import="table.Table_for_SRM_vOpen" %>
<%@ page import="bean.LoginUser" %>
<%@ page import="ienum.RrStage" %>
<%@ page import="ienum.SRM_Page" %><%--
  Created by IntelliJ IDEA.
  User: sdtsz
  Date: 2018/11/12
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%  String rrid=request.getParameter("rrid");
    LoginUser user=(LoginUser)session.getAttribute("user");
    String name=user.getUsername();
%>
<head>
    <title>需求(rec_id:<%=rrid%>)的管理页面(状态：<%=RrStage.OPEN%>)</title>
</head>
<body>
<p>登录人：<%=name%></p>
<p>需求号：<%=rrid%></p><a href="/function/Query_Recruit_HR.html">需求详情</a>
<%
    Table_for_SRM_vOpen table=new Table_for_SRM_vOpen("select rec_id,rec_rp_id,rec_rp_name,rec_stf_name,rec_from_desc from SRM_OPEN where rec_rr_id="+rrid, ConnectUser.HR);
    String []head={"推荐id","被推荐人id","被推荐人","推荐人","推荐来源","详细信息"};
    out.print(table.genHTML(head));
%>

<%-- should be done in workflow --%>
<div><button><a href="<%=SRM_Page.W_SIFT%>?rrid=<%=rrid%>">开始筛选</a></button>
    <button><a href="...">更新需求</a></button>
</div>
</body>
</html>
