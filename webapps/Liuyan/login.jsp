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

		<title>���԰�</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/styles.css">

	</head>

	<body>


		<%
			BufferedReader test; //BufferedReader���󣬶�ȡ�ļ�����   
			String tmp = null; //�ı��ļ��д洢��ֵ   
			int i = 0; //����ֵ   
			String spath = request.getRealPath(""); //��ȡURL   

			File f = new File(spath, "WEB-INF/count.txt"); //��ȡ   File����   ����Ӧ��λ�ý�һ��count.txt���ļ�
			test = new BufferedReader(new FileReader(f));
			try {
				tmp = test.readLine();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			if (tmp == null) { //��һ������ʱ   
				i = 0;
			} else {
				i = (int) (Integer.parseInt(tmp) + 1);
			}
			//*********************   
			try {
				PrintWriter outf = new PrintWriter(new FileOutputStream(f));
				outf.println(i); //��iд���ļ���   
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
						�û���¼
					</caption>
					<tr height="50px">
						<td>
							��¼����
						</td>
						<td>
							<input type="text" name="username"
								style="width: 150px; height: 25px" size="10" />
						</td>
					</tr>

					<tr height="45px">
						<td>
							��&nbsp;&nbsp;�룺
						</td>
						<td>
							<input type="password" style="width: 150px; height: 25px"
								name="pwd" size="10" />
						</td>
					</tr>

					<tr height="45px">
						<td align="center">
							<input type="submit" style="font-size: 18px; background: #0CF"
								"  value="��&nbsp;&nbsp;½">
						</td>
						<td align="center">
							<input type="reset" style="font-size: 18px; background: #0CF"
								" value="��&nbsp;&nbsp;��">
						</td>
					</tr>

					<tr height="65px">
						<td colspan="3">
							���ûע�� ����
							<a href="regist.jsp">����</a>ע��
						</td>
					</tr>
					
					<tr height="95px" >
						<td colspan="3" align="center">
							���ǵ�<%=i%>λ�ÿ�
						</td>
					</tr>
				</table>


			</form>
		</div>
	</body>
</html>
