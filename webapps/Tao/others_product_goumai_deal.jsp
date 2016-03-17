j<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=gb2312" %>
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
		
		     String user = null;
			if (session.getAttribute("name") != null) {
				 user = (String) session.getAttribute("name");
			} else
				user = null;
		%>

		<title>��Ϣ�ύ��</title>

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

			String proc_id = request.getParameter("id");
			String seller = new String(request.getParameter("seller").getBytes("GBK"));

			String name = request.getParameter("name");
			String qq = request.getParameter("qq");
			String tel = request.getParameter("tel");
			String price = request.getParameter("myprice");
			String liuyan = request.getParameter("content");
			//System.out.println(proc_name+"---"+seller);
			//System.out.println(liuyan);
			liuyan_deal.link();
			liuyan_deal.liuyan("others",proc_id,price,seller,name,qq,tel,liuyan);
			liuyan_deal.link();
			liuyan_deal.insert_dingdan(user,"others",proc_id);
   
		%>

		
		
	</body>
</html>