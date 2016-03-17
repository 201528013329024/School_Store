<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="liuyan_deal" class="com.sql.link_SqlServer" scope="session"></jsp:useBean>
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

		<title>信息提交</title>

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

			String from_liuyan_id = request.getParameter("from_liuyan_id");
			String proc_type = request.getParameter("proc_type");
			String proc_id = request.getParameter("proc_id");
			//String to_who = request.getParameter("to_who");
			String to_who = new String(request.getParameter("to_who").getBytes("GBK"));
			
			String liuyan_person = new String(request.getParameter("liuyan_person").getBytes("GBK"));

			//String to_who = request.getParameter("to_who");
			//String liuyan_person = request.getParameter("liuyan_person");
			String liuyan = request.getParameter("content");

	
			liuyan_deal.link();
			liuyan_deal.liuyan_huifu(proc_id, proc_type, from_liuyan_id, to_who, liuyan_person, liuyan);
   
		%>

		
		
	</body>
</html>