<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:useBean id="my_baby" class="com.sql.link_SqlServer" scope="session"></jsp:useBean>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="gb2312">
	<title>�ҵı��� - У԰���ֽ���ƽ̨</title>
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<%  
		 my_baby.link(); 
		 String user = "null";
 		
    	 if (session.getAttribute("name") != null)  
              user = (String)session.getAttribute("name"); 

  
%>
<div id="header">

<div>

	<div id="logo">
    	<a href="index.jsp"><img title="��ҳ" src="images/logo.png" alt="Logo"></a>       	
    </div>

    <ul>
        <li class="mybuy" style="top: -35px; left: 180px;"><a ><span>
        <font color="#FFFF33" size="3" face="����">
        <%
			if (session.getAttribute("name") != null) {
			%><%=session.getAttribute("name")%>��Ա����ӭ����<%
						}
					%></font></span>
					</a></li>   
        <li class="mybuy" style="top: -35px; left: 45px;"><a href="login/login.jsp"><span>
       <font color="#FFFF33" size="3" face="����">��½</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 90px;"><a href="regist/cus_regist.jsp"><span>
        <font color="#FFFF33" size="3" face="����">ע��</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 655px;"><a><span>
        <font color="#FFFF33" size="3" face="����">
<% 
	Date today = new Date();
  	int year = 1900+today.getYear();
  	int month = today.getMonth(); 
  	int day = today.getDate();
	int w = today.getDay();
	String week = null;
	month = month+1;
	//arr_week[] = new String{"������","����һ","���ڶ�","������","������","������","������"};
	if(w == 0) week = "������";
	if(w == 1) week = "����һ";
	if(w == 2) week = "���ڶ�";
	if(w == 3) week = "������";
	if(w == 4) week = "������";
	if(w == 5) week = "������";
	if(w == 6) week = "������";
	//week = arr_week[w];
	//var time = "";	
	out.print("������"+year+"��"+month+"��"+day +"��"+" "+week+" ");
	  

         %></font>
        </span></a></li> 
    	<li class="home current" style="top: 0px; left: 50px;"><a href="index.jsp"><span>��վ��ҳ</span></a></li>
   	    <li class="mybuy"><a href="mybuy.jsp?type=0"><span>�ҵı���</span></a></li>
		<li class="mysell"><a href="zz_tuijian.jsp"><span>վ���Ƽ�</span></a></li>
        <li class="announcement"><a href="announcement.jsp"><span>���¹���</span></a></li>
        <li class="question"><a href="shida.jsp"><span>����ʦ��</span></a></li>
		<li class="about"><a href="about.jsp"><span>��������</span></a></li>			
    </ul>

    </div>


<div>
<div id="background">
	<div id="templatemo_search">
		<form action="#" method="get">
			<input type="text" value="Search" name="keyword" id="keyword"
				title="keyword" onfocus="clearText(this)"
				onblur="clearText(this)" class="txt_field" />
			<input type="submit" name="Search" value="" alt="Search"
				id="searchbutton" title="Search" class="sub_btn" />
		</form>
	</div>
</div>
</div>
</div>


	<div id="body">
	
		<div>

			<div>
				<div>
                	<div>
                	<div style="height:420px">
						<ul>
							<li>
								<h2><a href="mybuy.jsp?type=1">�û���Ϣ</a></h2>
							</li>
							<li>
								<h2><a href="show_gouwuche.jsp">���ﳵ</a></h2>
							</li>
							<li>
								<h2><a href="show_dingdan.jsp">�ҵĶ���</a></h2>
							</li>
							<li>
								<h2><a href="show_liuyan.jsp">�ҵ�����</a></h2>
							</li>
							<li>
							<h2><a href="show_msg.jsp">�ҵ���Ϣ</a></h2>
						    </li>
							<li>
								<h2><a href="have_get.jsp">���򱦱�</a></h2>
							</li>
							<li>
								<h2><a href="have_sell.jsp">��������</a></h2>
							</li>
							<li>
							<h2><a href="add_proc.jsp">�����ϼ�</a></h2>
							</li>
						
							<li>
							<h2><a href="drop_proc.jsp">�����¼�</a></h2>
							</li>
						</ul>						
					</div>
	                 <%
	                 if( user != null){
	                %>
	              
 

 
 
 <div style="margin-left: 224px; margin-top: -415px;height:200px; width: 600px" >
 		<form name="form1" action="add_proc_deal.jsp" method="post"  ENCTYPE="multipart/form-data">
	                 <table width="600px" border="0" align="center">
                     <caption style="background-color: #96C">
                     <font color="#FFFF00" size="+2">�������Ʒ��ǰ̨ҳ��</font></caption>
	                  <tr>
	                 <td width="80px" style="background-color: #3CF" align="center">��Ʒ����</td>
	                 <td style="background-color: #3AF">
	                    <input id="x1" type="text" name="proc_name">
	                 </td>
	                 </tr>
	                 
	                 
	                  <tr>
	                 <td style="background-color: #3CF" align="center">��Ʒ����</td>
	                 <td style="background-color: #3AF">
	                   <select name="proc_type" id="x3">
					        <option value="life" SELECTED>����</option>
					        <option value="book">�鼮</option>
					        <option value="electronic" >����</option>
					        <option value="sport" >����</option>
					        <option value="fuwu" >����</option>
					        <option value="others" >����</option>
					 </select>
	                 </td>
	                 </tr>
	                 
	                 
	                 <tr>
	                 <td style="background-color: #3CF" align="center">��Ʒ���</td>
	                 <td style="background-color: #3AF">
	                    <input id="x1" type="text" name="proc_jianjie">���ö���12��
	                 </td>
	                 </tr>
	                 
	                 
	                 <tr style="background-color: #3AF">
	                 <td style="background-color: #3CF "  align="center">��Ʒ���</td>
	                 <td>
	                   
	                    <textarea id="x2" style="width:155px;height:60px;" name="proc_xiangjie"  wrap="hard" ></textarea>
	                   ���ö���50�� 
	                 </td>
	                 </tr>
	                 
	                 
	                 <tr>
	                 <td style="background-color: #3CF" align="center">��Ʒ���</td>
	                 <td style="background-color: #3AF">
	                    <input id="x1" type="text" name="proc_price">
	                 </td>
	                 </tr>
	                 
	                 
	                 
	                 <tr>
	                 <td style="background-color: #3CF" align="center">��ƷͼƬ</td>
	                 <td style="background-color: #3AF">
	                   <input type="file" name="proc_pic_url">
	                 </td>
	                 </tr>
	                 
	                 <tr>
	                 <td style="background-color: #3CF" align="center">����ͼƬ</td>
	                 <td style="background-color: #3AF">
	                   <input type="file" name="proc_pic_url_1">
	                   &nbsp;
	                   <input type="file" name="proc_pic_url_2">
	                   &nbsp;
	                   <input type="file" name="proc_pic_url_3">
	                   &nbsp;
	                   <input type="file" name="proc_pic_url_4">
	                 </td>
	                 </tr>
	                 
	                 
	                 <tr>
	                 <td style="background-color: #3CF" align="center">��ϵ�绰</td>
	                 <td style="background-color: #3AF">
	                    <input id="x1" type="text" name="tel">
	                 </td>
	                 </tr>
	                 
	                 
	                 <td style="background-color: #3CF" align="center">��ϵ��ַ</td>
	                 <td style="background-color: #3AF">
	                    <input id="x1" type="text" name="addr">
	                 </td>
	                 </tr>
	                 
	                 
	   
	                 
	                <tr height="40px" style="background-color: #3CF">
										<td colspan="2" align="center">
											<input type="reset" style="background: #0CF" value="��&nbsp;&nbsp;��" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="submit" style="background: #0CF"
												value="��&nbsp;&nbsp;��" />

										</td>
									</tr>
	                 
	                 
	                 </table>
		               
		</form>            
		               
	                <% } else {%>����δ��½�����ȵ�½��
	                     <%} %>
	                </div>
					
                    </div>
				</div>
			</div>

		</div>

	</div>
	
	

<div id="footer">
	<div>
		<div>
			<h3>��ϵ����</h3>
				<p>���ǵ�Ŭ����ֻԸΪ�㴴����ḻ�Ĵ�ѧ����								 				</p>
		</div>
		<div>
			<h3>��������</h3>
			<ul>
				<li><a href="http://www2.ahnu.edu.cn/home/" target="_blank" id="ahnu">����ʦ����ѧ</a>
				</li>
				<li><a href="http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx" target="_blank" id="tms">����������</a>
				</li>
				<li><a href="http://lib.ahnu.edu.cn/index.asp" target="_blank" id="library">ͼ���ڿ�</a>
				</li>
			</ul>
		</div>
	</div>
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.</p>
</div>
</body>
</html>
