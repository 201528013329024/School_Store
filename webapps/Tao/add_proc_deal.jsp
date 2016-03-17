<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.jspsmart.upload.*" %>
<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="add_proc_deal" class="com.sql.link_SqlServer" scope="session"></jsp:useBean>
<%
	request.setCharacterEncoding("gb2312");	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<%
			request.setCharacterEncoding("gb2312");
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
					
			SmartUpload su = new SmartUpload();
		    su.initialize(pageContext) ; // 初始化上传
		    su.setAllowedFilesList("jpg,JPG,bmp,BMP,gif,GIF,png,PNG");
		    su.upload() ;     // 准备上传
		    su.save("/proc_pic");   
		    String proc_pic_url="proc_pic/"+su.getFiles().getFile(0).getFileName();

		    
		    String proc_name = su.getRequest().getParameter("proc_name");
		    System.out.println("proc_name="+proc_name);
			String proc_type = su.getRequest().getParameter("proc_type");
			System.out.println("proc_type="+proc_type);
			String proc_jianjie = su.getRequest().getParameter("proc_jianjie");
			System.out.println("proc_jianjie="+proc_jianjie);
			String proc_xiangjie = su.getRequest().getParameter("proc_xiangjie");
			String proc_price = su.getRequest().getParameter("proc_price");
			String seller_addr = su.getRequest().getParameter("addr");
			String seller_tel = su.getRequest().getParameter("tel");
			//String to_who = request.getParameter("to_who");
			String seller_name="null";
		    
			
			if (session.getAttribute("name") != null) {
				seller_name = (String) session.getAttribute("name");
			} else
				seller_name = null;

			add_proc_deal.link();

			if(add_proc_deal.add_proc(proc_type, proc_name, proc_xiangjie, proc_jianjie,proc_price,proc_pic_url, seller_name, seller_tel, seller_addr, proc_type)==1)
			{
				//out.println("<script language='javascript'>alert('商品上架成功！');parent.location.href='add_proc.jsp';</script>");

				add_proc_deal.link();
				add_proc_deal.check_insert_id(proc_type);
				add_proc_deal.link();
				if(add_proc_deal.add_proc_list(proc_type,add_proc_deal.insert_id,seller_name) == 1){
					out.println("<script language='javascript'>alert('商品上架成功！');parent.location.href='add_proc.jsp';</script>");
				}else out.println("<script language='javascript'>alert('操作失败！');parent.location.href='drop_proc.jsp';</script>");

			}else out.println("<script language='javascript'>alert('操作失败！');parent.location.href='drop_proc.jsp';</script>");

   
		%>

		
		
	</body>
</html>