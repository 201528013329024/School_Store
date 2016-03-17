<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="model.*" %>
<%@page import="db.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言板信息</title>
    
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
    <form action="liuyan.jsp" method="post">
    	<table align="center">
    		<caption><font color="#F00000" size="+2">所有留言信息</font></caption>
    		<tr align="center" style="background-color: #3CF">
    			<td width="150px">留言人姓名</td>
    			<td width="150px">留言时间</td>
    			<td width="150px">留言标题</td>
    			<td>留言内容</td>
    		</tr>
    		
    		<%
    		    lyTable ly = null;
    	 		ArrayList a1 = (ArrayList)session.getAttribute("a1");
    			Iterator iter = a1.iterator();
    			while(iter.hasNext()){
    				 ly = (lyTable)iter.next();
    			
    		%>
    		
    		<tr align="center" style="background-color: #CFF">
    			<td>
    			<%System.out.println(ly.getUserId()); %>
    			<%=new DB().getUserName(ly.getUserId()) %>
    			</td>
    			<td>
    			<%=ly.getDate().toString()%>
    			</td>
    			<td>
    			<%=ly.getTitle() %>
    			</td>
    			<td>
    			<textarea cols="35"  rows="5"  readonly><%=ly.getConten() %></textarea>
    			</td>
    		</tr>
    		<%} %>
    		
    		<tr align="center" height="60px"><td colspan="8"><input type="submit" value="我要留言" style="font-size:18px;background: #0CF" " /></td></tr>
    	</table>
    	
    </form>
  </body>
</html>
