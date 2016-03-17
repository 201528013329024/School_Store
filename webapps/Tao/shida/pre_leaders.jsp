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
							<table  bordercolor="#009900" border="0"> 
							<tr><td>
							<table bordercolor="#009900"  border="1"> 
							<tr> 
							<td width="591" height="20" colspan="6"> 
							<p align="left"><strong>党委书记</strong></p> 
							</td> 
							</tr> 
							<tr  bordercolor="#009900"> 
							<td width="110" height="20" align="middle" valign="center">项　南</td> 
							<td width="110" height="20" align="middle" valign="center">干仲儒</td> 
							<td width="110" height="20" align="middle" valign="center">方向明</td> 
							<td width="110" height="20" align="middle" valign="center">万立誉</td> 
							<td width="110" height="20" align="middle" valign="center">陈望岐</td> 
							<td width="110" height="20" align="middle" valign="center">李　锐</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">陈　韧</td> 
							<td width="110" height="20" align="middle" valign="center">魏心一</td> 
							<td width="110" height="20" align="middle" valign="center">沙流辉</td> 
							<td width="110" height="20" align="middle" valign="center">杨新生</td> 
							<td width="110" height="20" align="middle" valign="center">谷国华</td> 
							<td width="110" height="20" align="middle" valign="center">沈家仕</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">丁万鼎</td> 
							<td width="110" height="20" align="middle" valign="center">蒋玉珉</td> 
							<td width="110" height="20" align="middle" valign="center">吴良仁</td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							</tr> 
							</tbody> 
							</table> 
							<br /> 
							<table bordercolor="#009900" border="1"> 
							<tbody> 
							<tr> 
							<td width="584" height="20" colspan="6"> 
							<p align="left"><strong>党委副书记</strong></p> 
							</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">戈　华</td> 
							<td width="110" height="20" align="middle" valign="center">刘青锋</td> 
							<td width="110" height="20" align="middle" valign="center">高　峰</td> 
							<td width="110" height="20" align="middle" valign="center">张　良</td> 
							<td width="110" height="20" align="middle" valign="center">邱成宣</td> 
							<td width="110" height="20" align="middle" valign="center">李卫义</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">方志明</td> 
							<td width="110" height="20" align="middle" valign="center">沙流辉</td> 
							<td width="110" height="20" align="middle" valign="center">徐勉一</td> 
							<td width="110" height="20" align="middle" valign="center">朱仇美</td> 
							<td width="110" height="20" align="middle" valign="center">张正元</td> 
							<td width="110" height="20" align="middle" valign="center">任兴田</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">沈家仕</td> 
							<td width="110" height="20" align="middle" valign="center">袁起河</td> 
							<td width="110" height="20" align="middle" valign="center">胡昭林</td> 
							<td width="110" height="20" align="middle" valign="center">丁万鼎</td> 
							<td width="110" height="20" align="middle" valign="center">刘登义</td> 
							<td width="110" height="20" align="middle" valign="center">高家保</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">王　肃</td> 
							<td width="110" height="20" align="middle" valign="center">&nbsp;&nbsp;蒋玉珉　</td> 
							<td width="110" height="20" align="middle" valign="center">&nbsp; 余淑珍　</td> 
							<td width="110" height="20" align="middle" valign="center">&nbsp;&nbsp; 刘新跃　</td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							</tr> 
							</tbody> 
							</table> 
							<br /> 
							<table bordercolor="#009900" border="1"> 
							<tbody> 
							<tr> 
							<td width="625" height="20" colspan="6"> 
							<p align="left"><strong>校(院)长</strong></p> 
							</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">姚永朴</td> 
							<td width="110" height="20" align="middle" valign="center">刘文典</td> 
							<td width="110" height="20" align="middle" valign="center">程天放</td> 
							<td width="110" height="20" align="middle" valign="center">王星拱</td> 
							<td width="110" height="20" align="middle" valign="center">杨亮功</td> 
							<td width="110" height="20" align="middle" valign="center">何 &nbsp;鲁</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">程演生</td> 
							<td width="110" height="20" align="middle" valign="center">傅 铜</td> 
							<td width="110" height="20" align="middle" valign="center">李顺卿</td> 
							<td width="110" height="20" align="middle" valign="center">汪宏法</td> 
							<td width="110" height="20" align="middle" valign="center">刘真如</td> 
							<td width="110" height="20" align="middle" valign="center">李品仙</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">朱清华</td> 
							<td width="110" height="20" align="middle" valign="center">刘乃敬</td> 
							<td width="110" height="20" align="middle" valign="center">朱佛定</td> 
							<td width="110" height="20" align="middle" valign="center">刘天予</td> 
							<td width="110" height="20" align="middle" valign="center">程演生</td> 
							<td width="110" height="20" align="middle" valign="center">朱光潜</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">陶&nbsp; 因</td> 
							<td width="110" height="20" align="middle" valign="center">柯育甫</td> 
							<td width="110" height="20" align="middle" valign="center">万昌言</td> 
							<td width="110" height="20" align="middle" valign="center">杨亮功</td> 
							<td width="110" height="20" align="middle" valign="center">李相勖</td> 
							<td width="110" height="20" align="middle" valign="center">许　杰</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">方向明</td> 
							<td width="110" height="20" align="middle" valign="center">万立誉</td> 
							<td width="110" height="20" align="middle" valign="center">吴从云</td> 
							<td width="110" height="20" align="middle" valign="center">童世杰</td> 
							<td width="110" height="20" align="middle" valign="center">魏心一</td> 
							<td width="110" height="20" align="middle" valign="center">陈　韧</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">沙流辉</td> 
							<td width="110" height="20" align="middle" valign="center">叶钟文</td> 
							<td width="110" height="20" align="middle" valign="center">杜宜瑾</td> 
							<td width="110" height="20" align="middle" valign="center">张海鹏</td> 
							<td width="110" height="20" align="middle" valign="center">沈家仕</td> 
							<td width="110" height="20" align="middle" valign="center">丁万鼎</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">蒋玉珉</td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							</tr> 
							</tbody> 
							</table> 
							<br /> 
							<table bordercolor="#009900" border="1"> 
							<tbody> 
							<tr> 
							<td width="572" height="20" colspan="6"> 
							<p align="left"><strong>副校(院)长</strong></p> 
							</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">方向明</td> 
							<td width="110" height="20" align="middle" valign="center">干仲儒</td> 
							<td width="110" height="20" align="middle" valign="center">刘<span lang="ja" lang="ja" xml:lang="ja">迺</span>敬</td> 
							<td width="110" height="20" align="middle" valign="center">刘青锋</td> 
							<td width="110" height="20" align="middle" valign="center">沙流辉</td> 
							<td width="110" height="20" align="middle" valign="center">童世杰</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">石锡侯</td> 
							<td width="110" height="20" align="middle" valign="center">李卫义</td> 
							<td width="110" height="20" align="middle" valign="center">赵一鸣</td> 
							<td width="110" height="20" align="middle" valign="center">王郁昭</td> 
							<td width="110" height="20" align="middle" valign="center">张怀璋</td> 
							<td width="110" height="20" align="middle" valign="center">张俊杰</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">张动民</td> 
							<td width="110" height="20" align="middle" valign="center">吕敬芳</td> 
							<td width="110" height="20" align="middle" valign="center">徐勉一</td> 
							<td width="110" height="20" align="middle" valign="center">方志明</td> 
							<td width="110" height="20" align="middle" valign="center">张　范</td> 
							<td width="110" height="20" align="middle" valign="center">许用思</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">杨　志</td> 
							<td width="110" height="20" align="middle" valign="center">朱仇美</td> 
							<td width="110" height="20" align="middle" valign="center">叶钟文</td> 
							<td width="110" height="20" align="middle" valign="center">杨新生</td> 
							<td width="110" height="20" align="middle" valign="center">任兴田</td> 
							<td width="110" height="20" align="middle" valign="center">张海鹏</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">严云绶</td> 
							<td width="110" height="20" align="middle" valign="center">许用忠</td> 
							<td width="110" height="20" align="middle" valign="center">文秉模</td> 
							<td width="110" height="20" align="middle" valign="center">倪光明</td> 
							<td width="110" height="20" align="middle" valign="center">沈家仕</td> 
							<td width="110" height="20" align="middle" valign="center">夏瑞庆</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">马怀柱</td> 
							<td width="110" height="20" align="middle" valign="center">黄金余</td> 
							<td width="110" height="20" align="middle" valign="center">丁万鼎</td> 
							<td width="110" height="20" align="middle" valign="center">王　肃</td> 
							<td width="110" height="20" align="middle" valign="center">刘登义</td> 
							<td width="110" height="20" align="middle" valign="center">闵永新</td> 
							</tr> 
							<tr> 
							<td width="110" height="20" align="middle" valign="center">王世华</td> 
							<td width="110" height="20" align="middle" valign="center">&nbsp;&nbsp; 朱士群 　</td> 
							<td width="110" height="20" align="middle" valign="center">&nbsp;&nbsp;&nbsp; 余淑珍&nbsp; 　</td> 
							<td width="110" height="20" align="middle" valign="center">王先俊</td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							<td width="110" height="20" align="middle" valign="center"></td> 
							</tr> 
							</table> 
							
							
							</td>
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