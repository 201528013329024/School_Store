<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>魅力师大 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="../css/indexstyle.css">
</head>
<body>
<div id="header">

<div>

	<div id="logo">
    	<a href="index.jsp"><img title="首页" src="../images/logo.png" alt="Logo"></a>       	
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
        <li class="mybuy" style="top: -35px; left: 45px;"><a href="../login/login.jsp"><span>
       <font color="#FFFF33" size="3" face="楷体">登陆</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 90px;"><a href="../regist/cus_regist.jsp"><span>
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
        <li class="home current" style="top: 0px; left: 50px;"><a href="../index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy"><a href="../mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
		<li class="mysell"><a href="../zz_tuijian.jsp"><span>站长推荐</span></a></li>
        <li class="announcement"><a href="../announcement.jsp"><span>最新公告</span></a></li>
        <li class="question"><a href="../shida.jsp"><span>魅力师大</span></a></li>
		<li class="about"><a href="../about.jsp"><span>关于我们</span></a></li>				
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
						<div>
							<div id="article">
							<img src="yange.gif" alt="Logo">
							</div>
							
							
							
							<div id="sidebar">
								<h4>师大概况</h4>
								<ul>
									<li>
										<a href="jianjie.jsp">师大简介</a>
									</li>
									<li>
										<a href="yange.jsp">学校沿革</a>
									</li>
									<li>
										<a href="curr_leaders.jsp">现任领导</a>
									</li>
									<li>
									<a href="pre_leaders.jsp">历任领导</a>
								   </li>
									
									<li>
										<a href="school_buity.jsp">校园风光</a>
									</li>
									<li>
										<a href="yuanxi.jsp">院系设置</a>
									</li>
										<li>
										<a href="school_map.jsp">学校地图</a>
									</li>
								</ul>
							
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
			<h3>联系我们</h3>
				<p>我们的努力，只愿为你创造更丰富的大学生活								 				</p>
		</div>
		<div>
			<h3>友情链接</h3>
			<ul>
				<li><a href="../http://www2.ahnu.edu.cn/home/" target="_blank" id="ahnu">安徽师范大学</a>
				</li>
				<li><a href="../http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx" target="_blank" id="tms">本科生教育</a>
				</li>
				<li><a href="../http://lib.ahnu.edu.cn/index.asp" target="_blank" id="library">图书期刊</a>
				</li>
			</ul>
		</div>
	</div>
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.
	</p>
</div>
</body>
</html>