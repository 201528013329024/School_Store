<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>关于我们 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="css/indexstyle.css">
</head>
<body>

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
    	<li class="home " style="top: 0px; left: 50px;"><a href="index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy"><a href="mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
		<li class="mysell"><a href="zz_tuijian.jsp"><span>站长推荐</span></a></li>
        <li class="announcement"><a href="announcement.jsp"><span>最新公告</span></a></li>
        <li class="question"><a href="shida.jsp"><span>魅力师大</span></a></li>
		<li class="about current"><a href="about.jsp"><span>关于我们</span></a></li>			
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
						<div>
							<h3>校园二手交易平台简介</h3>
							<p>
								国内高校一般都有自己的BBS，例如清华大学的水木社区、北京大学的北大未名、广东海洋大学的海浪bbs等。而在这些BBS里，二手市场是其中最为热闹的板块之一。可以说，国内大部分的高校都是这样的情况。究其原因，随着国家经济的不断发展，人民生活水平不断地提高，大学生群体的购买能力也随之提高，同时他们是一群年轻的高消费群体，具有一定的消费盲目性，例如攀比心理、从众心理、标新立异心理。在这样一个环境中，许多二手物品被浪费处理的情况越来越严重。另一方面，目前国内高校的相当一部分学生还来自低收入家庭，他们的消费观念相对而言更加保守，趋向实用性，对许多实用而廉价的二手物品有很强的需求。虽然高校BBS的二手市场板块在一定程度上缓和了这种情况，并且满足了一部分学生实用性消费的需求，但BBS的业务功能、交互体验与专业电子商务网站相比是远远不够的。</br>
本系统将搭建一个高校二手市场网络平台。它能让学生更加方便的选购出自己的目标商品、更加方便的卖出自己的闲置物品。
							</p>
							<h3>我们的团队</h3>
							<p>
								
							</p>
							<h3>我们的宗旨</h3>
							<p>
								
							</p>
							
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
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.</a>
	</p>
</div>
</body>
</html>