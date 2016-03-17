<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<meta charset="UTF-8">
	<title>我的宝贝 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<%  
         //public static  int type; 
		 my_baby.link(); 
 		// my_baby.show_cus_info(); 
    	 // String sqlStr = &quot;select * from cus_info where proc_id ='&quot;+id+&quot;'&quot;; 
    	 if (session.getAttribute("name") != null) {  
               String s = (String)session.getAttribute("name"); 
               //System.out.println(s+&quot;l;;&quot;); 
               my_baby.show_cus_info(s); 
	      }else {my_baby.show_cus_info_rs = null ;} 
	       
	     // session.setAttribute(&quot;baby&quot;,&quot;first&quot;); 
  
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
    	<li class="home" style="top: 0px; left: 50px;"><a href="index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy current"><a href="mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
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
                	<div style="height:420px">
						<ul>
							<li>
								<h2><a href="mybuy.jsp?type=1">用户信息</a></h2>
							</li>
							<li>
								<h2><a href="show_gouwuche.jsp">购物车</a></h2>
							</li>
							<li>
								<h2><a href="show_dingdan.jsp">我的订单</a></h2>
							</li>
							<li>
								<h2><a href="show_liuyan.jsp">我的留言</a></h2>
							</li>
							<li>
							<h2><a href="show_msg.jsp">我的消息</a></h2>
						    </li>
							<li>
								<h2><a href="have_get.jsp">已买宝贝</a></h2>
							</li>
							<li>
								<h2><a href="have_sell.jsp">已卖宝贝</a></h2>
							</li>
							<li>
							<h2><a href="add_proc.jsp">宝贝上架</a></h2>
							</li>
						
							<li>
							<h2><a href="drop_proc.jsp">宝贝下架</a></h2>
							</li>
						</ul>						
					</div>
					
	                <div style="margin-left:204px; margin-top:-420px; width:400px">
	                 <%
	                 if( my_baby.show_cus_info_rs != null){
	                 if(((String)request.getParameter("type")).equals("1")) {%>
	                 
	                 <img src="images/person1.jpg" style="width: 80px; height: 80px;"></img>
 <div style="margin-left:100px; margin-top:-50px; width:400px; height:10px;background-color: #3CF">
 <font color="#6666FF" size="+1"> <%=my_baby.show_cus_info_rs.getString("cus_nickname")%></font></div>
 
 
 </div>
 
 
 <div style="margin-left: 204px; margin-top: -440px;height:200px; width: 400px">
	                 <table >

	                      
	                          
	                  <tr>
	                 <td>收货地址</td>
	                 <td>
	                  <%=my_baby.show_cus_info_rs.getString("shouhuo_addr")%>
	                 </td>
	                 </tr>
	                 
	                 
	                  <tr>
	                 <td>注册时间</td>
	                 <td>
	                  <%=my_baby.show_cus_info_rs.getString("cus_regist_time")%>
	                 </td>
	                 </tr>
	                 
	                 </table>
		               
		            
		               
	                <% }}
	                else {%>
	                您还未登陆，请先登陆！
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
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.</p>
</div>
</body>
</html>
