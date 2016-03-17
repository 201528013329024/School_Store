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
		<title>书籍-校园二手平台</title>
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
    	<a href="index.jsp"><img title="首页" src="images/logo.png" alt="Logo"></a>       	
    </div>

    <ul>
        <li class="mybuy" style="top: -35px; left: 180px;"><a ><span>
        <font color="#FFFF33" size="3" face="楷体">
        <%
			if (session.getAttribute("name") != null) {
			%><%=session.getAttribute("name")%>会员，欢迎您！<%
						}
					%></font></span>
					</a></li>   
        <li class="mybuy" style="top: -35px; left: 45px;"><a href="login/login.jsp"><span>
       <font color="#FFFF33" size="3" face="楷体">登陆</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 90px;"><a href="regist/cus_regist.jsp"><span>
        <font color="#FFFF33" size="3" face="楷体">注册</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 655px;"><a><span>
        <font color="#FFFF33" size="3" face="楷体">
<% 
	Date today = new Date();
  	int year = 1900+today.getYear();
  	int month = today.getMonth(); 
  	int day = today.getDate();
	int w = today.getDay();
	String week = null;
	month = month+1;
	//arr_week[] = new String{"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
	if(w == 0) week = "星期日";
	if(w == 1) week = "星期一";
	if(w == 2) week = "星期二";
	if(w == 3) week = "星期三";
	if(w == 4) week = "星期四";
	if(w == 5) week = "星期五";
	if(w == 6) week = "星期六";
	//week = arr_week[w];
	//var time = "";	
	out.print("今天是"+year+"年"+month+"月"+day +"日"+" "+week+" ");
	  

         %></font>
        </span></a></li> 
    	<li class="home current" style="top: 0px; left: 50px;"><a href="index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy"><a href="mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
		<li class="mysell"><a href="zz_tuijian.jsp"><span>站长推荐</span></a></li>
        <li class="announcement"><a href="announcement.jsp"><span>最新公告</span></a></li>
        <li class="question"><a href="shida.jsp"><span>魅力师大</span></a></li>
		<li class="about"><a href="about.jsp"><span>关于我们</span></a></li>			
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
									ipad全网最低
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
												商品名称:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("proc_name")%></p>
										</div>
									</div>
									<div>
										<div class="type">
											<p>
												价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;格：
											</p>
										</div><div class="promote">
											<p>
												￥<%=book_xiangxi.check_book_rs.getString("proc_price")%>元
											</p>
										</div>
									</div>
									
									<div>
										<div class="type">
											<p>
												商品介绍:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("proc_xiangjie")%></p>
										</div>
									</div>



									<div>
										<div class="type">
											<p>
												卖家昵称:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("seller_name")%></p>
										</div>
									</div>

									<div>
										<div class="type">
											<p>
												卖家电话:
											</p>
										</div>
										<div class="add">
											<p><%=book_xiangxi.check_book_rs.getString("seller_tel")%></p>
										</div>
									</div>


									<div>
										<div class="type">
											<p>
												卖家地址:
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

														
									
									加入购物车&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
									立刻购买&nbsp;&nbsp;
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
						联系我们
					</h3>
					<p>
						我们的努力，只愿为你创造更丰富的大学生活
					</p>
				</div>
				<div>
					<h3>
						友情链接
					</h3>
					<ul>
						<li>
							<a href="http://www2.ahnu.edu.cn/home/" target="_blank" 

id="ahnu">安徽师范大学</a>
						</li>
						<li>
							<a
								href="http://tms.ahnu.edu.cn/

(yken3aior1po4sjdws3vci45)/default5.aspx"
								target="_blank" id="tms">本科生教育</a>
						</li>
						<li>
							<a href="http://lib.ahnu.edu.cn/index.asp" target="_blank"
								id="library">如数期刊</a>
						</li>
					</ul>
				</div>
			</div>
			<p class="footnote">
				Copyright 2013 Anhui Normal University. All rights reserved.
			</p>
		</div>
</html>
