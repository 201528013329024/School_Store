<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<%@ page language="java" import="java.util.Date" %>
<%@page import="java.sql.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<jsp:useBean id="book_xiangxi" class="com.sql.link_SqlServer"
	scope="session"></jsp:useBean>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		<meta charset="gb2312">
		<title>�鼮-У԰����ƽ̨</title>
		<link rel="stylesheet" type="text/css" href="css/product.css">
	</head>
	<body>

		<%
			book_xiangxi.link();
			String id = request.getParameter("id");
			book_xiangxi.check_book(id);
			System.out.print(id);

			// String sqlStr = "select * from cus_info where proc_id ='"+id+"'";
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
							<div class="tb-detail-hd">
								<h3>
									ipadȫ�����
								</h3>
							</div>
								<div class="tb-summary">
								<div class="big-pic">
									<div class="pic">
									<img src="<%=book_xiangxi.check_book_rs.getString("proc_pic_url")%>" style="width:280px;height:285px">
									</div>
								</div>
								
								
								
								
								
								
								
								<div>

								
							<div>					
										<div class="type">
											<p>
												��Ʒ����:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("proc_name")%></p>
										</div>
									</div>
									<div>
										<div class="type">
											<p>
												��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��
											</p>
										</div><div class="promote">
											<p>
												��<%=book_xiangxi.check_book_rs.getString("proc_price")%>Ԫ
											</p>
										</div>
									</div>
									
									<div>
										<div class="type">
											<p>
												��Ʒ����:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("proc_xiangjie")%></p>
										</div>
									</div>



									<div>
										<div class="type">
											<p>
												�����ǳ�:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("seller_name")%></p>
										</div>
									</div>

									<div>
										<div class="type">
											<p>
												���ҵ绰:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("seller_tel")%></p>
										</div>
									</div>


									<div>
										<div class="type">
											<p>
												���ҵ�ַ:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("seller_addr")%></p>
										</div>

										<br />
										<br />
										<br />
										<br />
										<br /><br />
										<br />
										<br />
										
										
										
										
										
							
									</div>

									
						

				          <div style="margin-left:-250px; margin-top:1px; width:900px;height:10px">
									<a href="zan.jsp?proc_id=<%=id%>&gwc_user=<%=(String)session.getAttribute("name")%>&proc_type=<%=book_xiangxi.check_book_rs.getString("proc_type")%>">  
									<img src="images/zan.png" style="width:80px;height:80px"></img></a>	
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
									<a href="insert_to_gwc.jsp?proc_id=<%=id%>&gwc_user=<%=(String)session.getAttribute("name")%>&proc_type=<%=book_xiangxi.check_book_rs.getString("proc_type")%>"> 
									<img src="images/insert_gwc.png" style="width:80px;height:80px"></img></a>
								    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							     	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							     	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
								    <a href="book_product_goumai.jsp?id=<%=id%>">		
								  <img src="images/insert_gwc.png" style="width:80px;height:80px"></img></a>
									<br/><br/>
								<%	
								
								
								//System.out.println("zan_count="+life_xiangxi.check_life_rs.getString("zan_count"));
								int i=0;
								
								int temp = Integer.parseInt(book_xiangxi.check_book_rs.getString("zan_count"));
								
								//zan= temp;
								
								//int temp =8;
								while(temp/10>0)
								{
									i++;
									temp /= 10;
								}
								if(i==0){%>
								    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							       <% } else if(i==1) {%>
									       &nbsp;&nbsp;&nbsp;&nbsp;
								             <%}  else if(i==2) {%>	
								                    &nbsp;&nbsp;
								                    <% }else if(i==3){%>	
							                            &nbsp;
								                          <%} else if(i==4){%>	
								                        
								                               <%}%>
									<<%=book_xiangxi.check_book_rs.getString("zan_count")%>>
									&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

														
									
									���빺�ﳵ&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
									���̹���&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
									</div>	
							
									
									
								</div>
								
									
							</div>
							

							 
						</div>
						
						
						
						
						
						
					</div>
					
					
					
					
				</div>
				
				
				
				
			</div>
			
			
			
			
			
		</div>


		
	
		
	                      
		
		
		
		
		
		<div id="footer">
			<div>
				<div>
					<h3>
						��ϵ����
					</h3>
					<p>
						���ǵ�Ŭ����ֻԸΪ�㴴����ḻ�Ĵ�ѧ����
					</p>
				</div>
				<div>
					<h3>
						��������
					</h3>
					<ul>
						<li>
							<a href="http://www2.ahnu.edu.cn/home/" target="_blank" 

id="ahnu">����ʦ����ѧ</a>
						</li>
						<li>
							<a
								href="http://tms.ahnu.edu.cn/

(yken3aior1po4sjdws3vci45)/default5.aspx"
								target="_blank" id="tms">����������</a>
						</li>
						<li>
							<a href="http://lib.ahnu.edu.cn/index.asp" target="_blank"
								id="library">�����ڿ�</a>
						</li>
					</ul>
				</div>
			</div>
			<p class="footnote">
				Copyright 2013 Anhui Normal University. All rights reserved.
			</p>
		</div>
</html>
