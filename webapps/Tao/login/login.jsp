<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.sql.*"%>
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

		<title>µÇÂ¼</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<form name="form1" action="login/login_deal.jsp" method="post">
	<body>
		<table width="800" align="center">
			<tr height="100">
				<td></td>
			</tr>
			<tr>
				<td>
					<img src="images/login.jpg" />
				</td>
				<td>
					<table>
						<tr height="50">
							<td>
								ÕÊ&nbsp;&nbsp;ºÅ£º
							</td>
							<td>
								<input type="text" name="cus_nickname" style="width: 150px" />
							</td>
						</tr>
						<tr height="50">
							<td>
								ÃÜ&nbsp;&nbsp;Âë£º
							</td>
							<td>
								<input  type="password" name="cus_pwd" style="width: 150px" />
							</td>
						</tr>
						<tr height="50">
							<td>
								Éí&nbsp;&nbsp;·Ý£º
							</td>
							<td align="center">
								<input type="radio" name="identity" value="customer " />
								¹Ë¿Í &nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="identity" value="seller" />
								µêÖ÷
							</td>
						</tr>
						<tr height="30">
							<td colspan="2" align="center">
								<input type="reset" style="background: #0CF" value="ÖØ&nbsp;ÖÃ" />
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="submit" style="background: #0CF" value="µÇ&nbsp;Â½" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
	</form>
</html>
