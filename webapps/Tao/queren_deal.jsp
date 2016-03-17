<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<jsp:useBean id="queren_proc" class="com.sql.link_SqlServer"
	scope="session"></jsp:useBean>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title>确认收货</title>
		<link rel="stylesheet" type="text/css" href="css/mystyle.css">
	</head>
	<body>
<%



	queren_proc.link();

	String user;
	if (session.getAttribute("name") != null) {
		user = (String) session.getAttribute("name");
	} else
		user = null;


	String id = request.getParameter("proc_id");
	String type = request.getParameter("proc_type");
	if(queren_proc.queren_proc(id) ==1 ){
	out.println("<script language='javascript'>history.go(-1);</script>");
	}
	queren_proc.link();
	queren_proc.have_sell_proc(user,type,id);
	
	
	
	
	
	%>
	
</body>
</html>