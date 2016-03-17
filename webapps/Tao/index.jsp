<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>校园二手交易平台</title>
	<link href="css/indexstyle.css" rel="stylesheet" type="text/css" />
	<link href="css/nivo-slider.css" rel="stylesheet" type="text/css" />
	<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
	</head>

	
<body>

<div id="show">
<div id="templatemo_middle"><!--图象显示的位置-->
					<div id="slider-wrapper"><!--图象显示的外框-->
						<div id="slider" class="nivoSlider">
 							<img src="images/slider/01.jpg" alt="Slider 01" />
                			<img src="images/slider/02.jpg" alt="Slider 02" />
                			<img src="images/slider/03.jpg" alt="Slider 03" />
                			<img src="images/slider/04.jpg" alt="Slider 04" />
                       </div>
					</div>
				</div>
      			<script src="js/jquery-1.4.3.min.js"></script>
      			<script src="js/jquery.nivo.slider.js"></script>
      			<script>
					$(window).load(function() {
                	$('#slider').nivoSlider();});</script>            
</div> 
	





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
   
			<div id="figure">
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
					<ul>
						<li><a href="life.jsp"><img src="images/icon/life.png" alt="LifeImage"></a>
							<h2><a href="life.jsp">生 活</a></h2>
                        </li>
						<li><a href="book.jsp"><img src="images/icon/book.png" alt="BookImage"></a>
							<h2><a href="book.jsp">书 籍</a></h2>
                        </li>
						<li><a href="electronic.jsp"><img src="images/icon/ele.png" alt="EleImage"></a>
							<h2><a href="electronic.jsp">电 子</a></h2>
						</li>
                    </ul>
                    <ul>
                        <li><a href="sport.jsp"><img src="images/icon/sport.png" alt="SportImage"></a>
							<h2><a href="sport.jsp">体 育</a></h2>
						</li>
                        <li><a href="fuwu.jsp"><img src="images/icon/service.png" alt="ServiceImage"></a>
							<h2><a href="fuwu.jsp">服 务</a></h2>
						</li>
                        <li><a href="others.jsp"><img src="images/icon/other.png" alt="OtherImage"></a>
							<h2><a href="others.jsp">其 他</a></h2>
						</li>
					</ul>
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
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.	</p>
</div>

</body>

</html>
