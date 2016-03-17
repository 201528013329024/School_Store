<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="gwc_deal" class="com.sql.link_SqlServer" scope="session"></jsp:useBean>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<%
			request.setCharacterEncoding("UTF-8");
		%>

		<title>信息提交中</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<%
			String proc_type = request.getParameter("proc_type");
			String proc_id = request.getParameter("proc_id");			
			
			String gwc_user = new String(request.getParameter("gwc_user").getBytes("GBK"));
			
			
			if(gwc_user.equals("null")){
				out.println("<script language='javascript'>alert('您还未登陆，请先登陆');parent.location.href='login/login.jsp';</script>");
			}else {	
				
				gwc_deal.link();
	            if(gwc_deal.check_gwc(gwc_user, proc_type, proc_id) == 1)
	            {
					if (gwc_deal.insert_gwc(gwc_user, proc_type, proc_id) == 1) {			
						out.println("<script language='javascript'>alert('已成功加入购物车');history.go(-1);</script>");
		 //out.println("<script language='javascript'>alert('��������У԰�Ա��̳ǣ�');parent.location.href='index.jsp';</script>");
		
					}
					
	            }else{
						//System.out.println("ERROR");
						out.println("<script language='javascript'>alert('该宝贝已加入购物车，不能重复加入');history.go(-1);</script>");
		
				}

			}
		%>

		
		
	</body>
</html>