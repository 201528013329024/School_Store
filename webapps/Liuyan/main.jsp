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
    
    <title>���԰���Ϣ</title>
    
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
    		<caption><font color="#F00000" size="+2">����������Ϣ</font></caption>
    		<tr align="center" style="background-color: #3CF">
    			<td width="150px">����������</td>
    			<td width="150px">����ʱ��</td>
    			<td width="150px">���Ա���</td>
    			<td>��������</td>
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
    		
    		<tr align="center" height="60px"><td colspan="8"><input type="submit" value="��Ҫ����" style="font-size:18px;background: #0CF" " /></td></tr>
    	</table>
    	
    </form>
  </body>
</html>
