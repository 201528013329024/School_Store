<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�û�ע��</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css">


  </head>
  
  <body>
  <div style="background-color:#0ff">
    <form action="addUser" method="post">
    	<table align="center" class="table">
    	<caption>�û�ע��</caption>
    	<tr height="50px">
    		<td>
    		��¼����
    		</td>
    		<td>
    		<input type="text" name="username" style="width:150px;height:25px" size="10"/>
    		</td>
    	</tr>
    	
    	<tr height="45px">
    		<td>
    		��&nbsp;&nbsp;�룺
    		</td>
    		<td>
    		<input type="password" style="width:150px;height:25px" name="pwd" size="10"/>
    		</td>
    	</tr>
    	
    	<tr height="45px">
    		<td align="center" >
    		<input type="submit" style="font-size:18px;background: #0CF" "  value="ע&nbsp;&nbsp;��">
    		</td>
    		<td align="center">
    		<input type="reset" style="font-size:18px;background: #0CF" " value="��&nbsp;&nbsp;��">
    		</td>
    	</tr>

    </table>
    	
    </form>
  </body>
  </div>
</html>
