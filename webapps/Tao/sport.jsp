<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<%@ page language="java" import="java.util.Date" %>
<%@ page import="java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<title>我的宝贝 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="css/goodsstyle.css">
</head>
<jsp:useBean id="show_sport" class="com.sql.link_SqlServer" scope="session"></jsp:useBean>

<body>
<%
		  show_sport.link();

    	  show_sport.show_sport();
    	  
    	  int rowcount = 0;
		  int pagecount = 0;
		  int pagesize =4;
		  int count = 0;
		  int showpage = 1;
    	  

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
                    	<input type="text" value="Search" name="keyword" id="keyword" title="keyword" onfocus="clearText(this)" onblur="clearText(this)" class="txt_field" />
           		      <input type="submit" name="Search" value="" alt="Search" id="searchbutton" title="Search" class="sub_btn"  />
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
                    	<h1>生活</h1>
                        <h4></h4>
                        
                        <%
                   	 
                   	 
                   	 
                   	 //show_sport.rs.next(); 
                        	show_sport.rs.last();
							rowcount = show_sport.rs.getRow();

							pagecount = ((rowcount % 16) == 0 ? (rowcount / 16)
									: (rowcount / 16) + 1);
							String top = request.getParameter("page");

							if (top != null) {
								showpage = ((Integer.parseInt(top))/16)+1;  //1
								if (showpage > pagecount) {
									showpage = pagecount;
								} else if (showpage <= 0) {
									showpage = 1;
								}
							}

							show_sport.rs.absolute((showpage - 1) * 16 + 1);
							//show_sport.rs.next();
							
							
							//while (show_liuyan.rs.next()) {

							for (int i = 1; i <= pagesize; i++) {
						
                 	 %>
                        
                        
                        
                        
                        <div >
                           
                            
                        <%if(show_sport.rs!= null) {%>
                        	<div style="margin-left:40px;">
                            	<div class="product_pic" align="center">
                                	<a target="_blank" href="sport_product.jsp?id=<%=show_sport.rs.getString("proc_id") %>"><img style="width:200px;height:200px" src="<%=show_sport.rs.getString("proc_pic_url")%>" alt="Image"" alt="Image"></a>
                                </div>
                                <div class="product_summ">
                                	<p align="center"><%=show_sport.rs.getString("proc_jianjie")%></p>
                                </div>
                                <div class="product_price">
                                	<p align="center">¥<%=show_sport.rs.getString("proc_price") %>元</p>
                                </div>
                        	</div>         	
                        	<% }%>
                        	
                        	
                        	<%if(show_sport.rs.next())  {%>
                        	<div style="margin-left:40px;">
                            	<div class="product_pic" align="center">
                                	<a target="_blank" href="sport_product.jsp?id=<%=show_sport.rs.getString("proc_id") %>"><img style="width:200px;height:200px" src="<%=show_sport.rs.getString("proc_pic_url")%>" alt="Image"" alt="Image"></a>
                                </div>
                                <div class="product_summ">
                                	<p align="center"><%=show_sport.rs.getString("proc_jianjie")%></p>
                                </div>
                                <div class="product_price">
                                	<p align="center">¥<%=show_sport.rs.getString("proc_price") %>元</p>
                                </div>
                        	</div>         	
                        	<% }%>

                        	<%if(show_sport.rs.next())  {%>
                        	<div style="margin-left:40px;">
                            	<div class="product_pic" align="center">
                                	<a target="_blank" href="sport_product.jsp?id=<%=show_sport.rs.getString("proc_id") %>"><img style="width:200px;height:200px" src="<%=show_sport.rs.getString("proc_pic_url")%>" alt="Image"" alt="Image"></a>
                                </div>
                                <div class="product_summ">
                                	<p align="center"><%=show_sport.rs.getString("proc_jianjie")%></p>
                                </div>
                                <div class="product_price">
                                	<p align="center">¥<%=show_sport.rs.getString("proc_price") %>元</p>
                                </div>
                        	</div>         	
                        	<% }%>

                        	
                        	<%if(show_sport.rs.next())  {%>
                        	<div style="margin-left:40px;">
                            	<div class="product_pic" align="center">
                                	<a target="_blank" href="sport_product.jsp?id=<%=show_sport.rs.getString("proc_id") %>"><img style="width:200px;height:200px" src="<%=show_sport.rs.getString("proc_pic_url")%>" alt="Image"></a>
                                </div>
                                <div class="product_summ">
                                	<p align="center"><%=show_sport.rs.getString("proc_jianjie")%></p>
                                </div>
                                <div class="product_price">
                                	<p align="center">¥<%=show_sport.rs.getString("proc_price") %>元</p>
                                </div>
                        	</div>         	
                        	<% }%>

                       </div>
                        
                       <%
						if (!show_sport.rs.next())
								break;
						}
					%>

			</div>	
			
			
			
			<center>
			<font color="#6666FF" size="+1"> 当前页数:【<%=showpage%>】&nbsp;&nbsp;&nbsp;

				<a href="sport.jsp?page=1">第一页</a>&nbsp;&nbsp; <a
				href="sport.jsp?page=<%=showpage- 16%>">上一页</a>&nbsp;&nbsp;

				<a href="sport.jsp?page=<%=showpage + 16%>">下一页</a>
				&nbsp;&nbsp; <a href="sport.jsp?page=<%=pagecount%>">最后一页&nbsp;</a>&nbsp;&nbsp;


			
		</center>

			
			
			
			
			
			
			
			
			
			
				</div>
			</div>
		</div>
	</div>
<div id="footer">
	<div>
		<div>
			<h3>联系我们</h3>
				<p>我们的努力，只愿为你创造更丰富的大学生活								 				</p>
		</div>
		<div>
			<h3>友情链接</h3>
			<ul>
				<li><a href="http://www2.ahnu.edu.cn/home/" target="_blank" id="ahnu">安徽师范大学</a>
				</li>
				<li><a href="http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx" target="_blank" id="tms">本科生教育</a>
				</li>
				<li><a href="http://lib.ahnu.edu.cn/index.asp" target="_blank" id="library">图书期刊</a>
				</li>
			</ul>
		</div>
	</div>
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.
	</p>
</div>
</body>
</html>
