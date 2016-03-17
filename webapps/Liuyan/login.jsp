<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.io.*"%>  
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

		<title>留言板</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/styles.css">

	</head>

	<body>


		<%
			BufferedReader test; //BufferedReader对象，读取文件数据   
			String tmp = null; //文本文件中存储的值   
			int i = 0; //记数值   
			String spath = request.getRealPath(""); //获取URL   

			File f = new File(spath, "WEB-INF/count.txt"); //获取   File对象   在相应的位置建一个count.txt的文件
			test = new BufferedReader(new FileReader(f));
			try {
				tmp = test.readLine();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			if (tmp == null) { //第一次运行时   
				i = 0;
			} else {
				i = (int) (Integer.parseInt(tmp) + 1);
			}
			//*********************   
			try {
				PrintWriter outf = new PrintWriter(new FileOutputStream(f));
				outf.println(i); //将i写入文件中   
				outf.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			test.close();
		%>

		<div style="background-color: #0ff">

			<form action="mainServlet" method="post">
				<table align="center" class="table">
					<caption>
						用户登录
					</caption>
					<tr height="50px">
						<td>
							登录名：
						</td>
						<td>
							<input type="text" name="username"
								style="width: 150px; height: 25px" size="10" />
						</td>
					</tr>

					<tr height="45px">
						<td>
							密&nbsp;&nbsp;码：
						</td>
						<td>
							<input type="password" style="width: 150px; height: 25px"
								name="pwd" size="10" />
						</td>
					</tr>

					<tr height="45px">
						<td align="center">
							<input type="submit" style="font-size: 18px; background: #0CF"
								"  value="登&nbsp;&nbsp;陆">
						</td>
						<td align="center">
							<input type="reset" style="font-size: 18px; background: #0CF"
								" value="重&nbsp;&nbsp;置">
						</td>
					</tr>

					<tr height="65px">
						<td colspan="3">
							如果没注册 单击
							<a href="regist.jsp">这里</a>注册
						</td>
					</tr>
					
					<tr height="95px" >
						<td colspan="3" align="center">
							您是第<%=i%>位访客
						</td>
					</tr>
				</table>


			</form>
		</div>
	</body>
</html>
