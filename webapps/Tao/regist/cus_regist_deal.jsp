j<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="link_regist" class="com.sql.link_SqlServer"
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
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<%
			request.setCharacterEncoding("gb2312");
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
			String cus_nickname = request.getParameter("cus_nickname");
			String cus_pwd = request.getParameter("cus_pwd");
		%>

		<%
			String rand = (String) session.getAttribute("rand");
			String input = request.getParameter("rand");
		%>

		<%
			if (!rand.equals(input)) {

				out
						.println("<script language='javascript'>alert('�������������');window.location.href='cus_regist.jsp';</script>");
			}

			else {
				link_regist.link();
				link_regist.insert_cus_info(cus_nickname, cus_pwd);
				out
						.println("<script language='javascript'>alert('��ϲ�����ѳɹ�ע�ᣡ');window.location.href='index.jsp';</script>");
			}
		%>
	</body>
</html>