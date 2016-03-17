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
							<table  bordercolor="#009900" border="1"> 
							<tr> 
							<td align="middle" width="80PX" height="38">党委书记</td> 
							<td width="80PX" height="38">　顾家山</td> 
							<td width="600PX" height="38">主持学校党委全面工作。分管组织建设与干部工作、保密、国家安全、维护稳定等工作；代管宣传、统战、机关、精神文明建设、学生思想政治教育与管理、人民武装、共青团、网络、信息、安全保卫、综合治理等工作。分管办公室、组织部（党校）；代管宣传部（新闻中心）、统战部（港澳台侨事务办公室）、机关党委（机关工作处）、学生工作处（学工部、人武部）、保卫处、团委、信息管理中心、教育部高校辅导员培训和研修基地管委会办公室（《高校辅导员学刊》编辑部）。联系政治学院、法学院、经济管理学院、音乐学院、教育科学学院、数学计算机科学学院。</td> 
							</tr> 
							<tr> 
							<td align="middle" width="" height="38">校长<br /> 
							党委副书记</td> 
							<td width="" height="38">　王　伦</td> 
							<td width="" height="38">主持学校行政全面工作。分管发展规划、人事、财务、董事会、校友会、基金会、独立学院办学等工作；代管后勤、爱国卫生工作。分管发展规划处、人事处、财务处、董事会、校友会、基金会、皖江学院；代管后勤管理处、后勤集团、爱卫会。联系文学院、传媒学院。</td> 
							</tr> 
							<tr> 
							<td align="middle" width="" height="38">纪委书记</td> 
							<td width="" height="38">　程　度</td> 
							<td width="" height="38">主管纪委工作。分管审计、医疗卫生、计划生育等工作；代管离退休、工会、教代会、关心下一代工作。分管监察处、审计处、校医院、计生委；代管离退休工作处、工会、关工委。联系美术学院、化学与材料科学学院。</td> 
							</tr> 
							<tr> 
							<td align="middle" width="" height="38">副校长</td> 
							<td width="" height="38">　王绍武</td> 
							<td width="" height="38">分管科研、社会服务、学科建设、资产管理、产业、出版、学报等工作；代管外事、留学生教育与管理工作。分管科研处、资产管理处、出版社、学报编辑部；代管国际教育学院（外事办公室）。联系外国语学院、物理与电子信息学院、环境科学与工程学院。</td> 
							</tr> 
							<tr> 
							<td align="middle" width="" height="38">副校长</td> 
							<td width="" height="38">　李琳琦</td> 
							<td width="" height="38">分管学位与研究生教育、图书资料、档案管理、附属学校等工作。分管研究生学院（研究生工作部）、图书馆、档案馆、教育集团、附中、附小、附幼。联系历史与社会学院、国土资源与旅游学院。</td> 
							</tr> 
							<tr> 
							<td align="middle" width="" height="38">副校长</td> 
							<td width="" height="38">　李进华</td> 
							<td width="" height="38">分管本科教学、招生、教学评估、思想政治理论课建设、体育、高校师资培训等工作；代管继续教育、花津校区建设、教职工住宅建设工作。分管教务处（招生办）、教学评估办公室、思想政治理论课教研部、体委、省高等学校师资培训中心；代管继续教育学院、科创房地产开发有限公司（新校区建设指挥部综合办）。联系生命科学学院、体育学院。</td> 
							</tr> 
							
							<tr> 
							<td align="middle" width="" height="38">校长助理</td> 
							<td width="" height="38">　沈　洪</td> 
							<td width="" height="38">协助校长管理董事会、校友会、基金会、独立学院办学等工作。协调校长交办的其他工作。</td> 
							</tr> 
							</table> 
								
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