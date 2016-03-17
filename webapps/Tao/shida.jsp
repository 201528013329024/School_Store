<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<%@ page language="java" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>魅力师大 - 校园二手交易平台</title>
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
    	<li class="home" style="top: 0px; left: 50px;"><a href="index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy "><a href="mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
		<li class="mysell "><a href="zz_tuijian.jsp"><span>站长推荐</span></a></li>
        <li class="announcement"><a href="announcement.jsp"><span>最新公告</span></a></li>
        <li class="question current"><a href="shida.jsp"><span>魅力师大</span></a></li>
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
						<div>
							<div id="article">
								<h2><a href="blog.jsp">安徽师范大学</a></h2>
								<p>
									安徽师范大学是安徽建校最早的高等学府。学校坐落在具有“徽风皖韵、千湖之城”美誉的国家级开放城市——芜湖，濒临浩瀚长江，傍依灵秀赭山，是一所集江南自然之神秀、汇安徽人文之灵杰的省属重点大学。
								</p>
								<p>
									在十九世纪末清代敬敷书院和二十世纪初创办的安徽大学堂基础上，学校的前身——省立安徽大学于1928年创建于当时的安徽省府安庆市。1946年，省立安徽大学更名为国立安徽大学，时有“于京沪一带，仅次于上海同济大学”之誉。1949年，国立安徽大学成建制迁至芜湖，并与当时的安徽学院合并成立新的安徽大学。1950至1952年，学校部分系先后调整并入到南京大学、复旦大学、浙江大学、华东政法学院等高校，安徽师专于1952年并入我校。1954年，安徽大学的师范学院和农学院分别建院，本部改名为安徽师范学院。1958年，安徽省委决定，将安徽师范学院的部分文科系(科)调整到合肥，建立合肥师范学院；同时将物理系部分师生调入新建的合肥大学(后改名为安徽大学)。1960年，安徽师范学院更名为皖南大学，刘少奇同志题写了校名。1968年，皖南大学更名为安徽工农大学。1970年，合肥师范学院撤消，大部分系(科)迁回安徽工农大学。1972年，经国务院批准，学校正式定名为安徽师范大学，郭沫若同志题写了校名。2005年，芜湖师范专科学校整体并入安徽师范大学。
								</p>
								<p>
									在近80年的办学历程中，刘文典、周建人、郁达夫、苏雪林、陈望道、朱湘、朱光潜等一大批知名的专家学者、社会贤达先后汇聚在菱湖之畔、镜湖之滨，著书立说，弘文励教。经过一代代师大人潜心耕耘、励志践行、培育后学、薪火相继、言传身教，砥砺出“厚重朴实、至善致远、追求卓越、自强不息”的精神，积淀出“严谨治学、敬业奉献、教书育人、为人师表”的教风，培育出“勤学慎思、质朴谦逊、知行合一、求实求新”的学风，凝炼出“厚德、重教、博学、笃行”的校训。
								</p>
							</div>
							<div id="sidebar">
								<h4>师大概况</h4>
								<ul>
									<li>
										<a href="shida/jianjie.jsp">师大简介</a>
									</li>
									<li>
										<a href="shida/yange.jsp">学校沿革</a>
									</li>
									<li>
										<a href="shida/curr_leaders.jsp">现任领导</a>
									</li>
									<li>
									<a href="shida/pre_leaders.jsp">历任领导</a>
								   </li>
									
									<li>
										<a href="shida/school_buity.jsp">校园风光</a>
									</li>
									<li>
										<a href="shida/yuanxi.jsp">院系设置</a>
									</li>
										<li>
										<a href="shida/school_map.jsp">学校地图</a>
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