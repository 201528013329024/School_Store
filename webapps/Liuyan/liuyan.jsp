<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言板</title>
    
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
  <div style="background-color:#0ff">
    <form action="addServlet" method="post">
    	<table align="center">
    		<caption>填写留言信息</caption>
    		<tr>
    			<td>留言标题</td>
    			<td><input type="text" name="title" style="width:268px""/></td>
    		</tr>
    		
    		<tr>
    			<td>留言内容</td>
    			<td><textarea  name="content" cols="35" rows="8"></textarea></td>
    		</tr>
    		
    		
    		<tr height="45px">
    		<td align="center" >
    		<input type="submit" style="font-size:18px;background: #0CF" "  value="提&nbsp;&nbsp;交">
    		</td>
    		<td align="center">
    		<input type="reset" style="font-size:18px;background: #0CF" " value="重&nbsp;&nbsp;置">
    		</td>
    	</tr>
    	</table>
    	
    </form>
  </body>
  </div>
</html>
