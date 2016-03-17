<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<title>我的宝贝 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<div id="header">
		<div>
			<div id="logo">
				<a href="index.jsp"><img src="images/logo.png" alt="Logo"></a>
			</div>
			<ul>
        	<li class="home"><a href="index.jsp"><span>网站首页</span></a></li>
       	  <li class="mybuy"><a href="mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
			<li class="mysell current"><a href="mysell.jsp"><span>我的店铺</span></a></li>
            <li class="announcement"><a href="announcement.jsp"><span>最新公告</span></a></li>
            <li class="question"><a href="question.jsp"><span>问题反馈</span></a></li>
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
						<ul>
							<li>
								<h2><a href="products.jsp">用户信息</a></h2>
							</li>
							<li>
								<h2><a href="products.jsp">我的订单</a></h2>
							</li>
							<li>
								<h2><a href="products.jsp">我的收藏</a></h2>
							</li>
							<li>
								<h2><a href="products.jsp">收货地址</a></h2>
							</li>
							<li>
								<h2><a href="products.jsp">我的留言</a></h2>
							</li>
							<li>
								<h2><a href="products.jsp">我的消息</a></h2>
							</li>
						</ul>
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
