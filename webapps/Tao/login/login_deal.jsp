<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="link_login" class="com.sql.link_SqlServer"
	scope="session"></jsp:useBean>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%
	request.setCharacterEncoding("gb2312");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

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
			System.out.println(cus_nickname+cus_pwd);
			link_login.link();
			link_login.login_check(cus_nickname,cus_pwd);
			if(link_login.msg==1){
				out.println("<script language='javascript'>alert('������û�������ȷ������������');parent.location.href='login.jsp';</script>");
			}
			else if(link_login.msg==2){
			
			session.setAttribute("name", cus_nickname);
			session.setAttribute("zan_state", "false");
			//session.setAttribute("id", cus_id);
		
			    	 out.println("<script language='javascript'>alert('��������У԰�Ա��̳ǣ�');parent.location.href='index.jsp';</script>");
			     }
				 else if(link_login.msg==3) {
					out.println("<script language='javascript'>alert('Sorry�������������');parent.location.href='login.jsp';</script>"); 
				 }	
				 	  else if(link_login.msg==4) {
				 	  					out.println("<script language='javascript'>alert('�û��������벻����Ϊ�գ�');parent.location.href='login/login.jsp';</script>"); 
				 	  }
		%>
		<br>
	</body>
</html>
