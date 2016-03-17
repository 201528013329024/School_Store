<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.sql.*"%>
<%
	request.setCharacterEncoding("gb2312");
%>
<jsp:useBean id="saveProblem" class="com.sql.link_sqlserve"
	scope="session"></jsp:useBean>
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

		<title>My JSP 'link_sql.jsp' starting page</title>

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
			String cus_nickname = request.getParameter("cus_nickname");
			String cus_pwd = request.getParameter("cus_pwd");
			//out.println("您注册的昵称是：" + cus_nickname);
			//out.println("您注册的登录密码是：" + cus_pwd);
		%>

		<%
			String rand = (String) session.getAttribute("rand");
			String input = request.getParameter("rand");
		%>
		
		<%
			if (!rand.equals(input)) {

				out
						.println("<script language='javascript'>alert('输入条形码错误');window.location.href='cus_regist.jsp';</script>");
			}

			else {
			saveProblem.link();
			saveProblem.insert_cus_info(cus_nickname, cus_pwd);
				out
						.println("<script language='javascript'>alert('恭喜，您已成功注册！');</script>");
			}
		%>

	</body>
</html>
