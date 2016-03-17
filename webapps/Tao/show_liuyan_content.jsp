<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<jsp:useBean id="show_liuyan_content" class="com.sql.link_SqlServer"
	scope="session"></jsp:useBean>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="UTF-8">
		<title>查看留言</title>
		<link rel="stylesheet" type="text/css" href="css/mystyle.css">
	</head>
	<body>
		<%
			//public static  int type;
			show_liuyan_content.link();
			String liuyan_id = request.getParameter("liuyan_id");
			String proc_id = request.getParameter("proc_id");
			String proc_type = request.getParameter("proc_type");
			show_liuyan_content.liuyan_show_content(liuyan_id);
			show_liuyan_content.rs.next();
			show_liuyan_content.check_proc(proc_type,proc_id);
		%>
		<div id="header">
			<div>
				<div id="logo">
					<a href="index.jsp"><img src="images/logo.png" alt="Logo">
					</a>
				</div>
				<ul>
					<li class="home">
						<a href="index.jsp"><span>网站首页</span> </a>
					</li>
					<li class="mybuy current">
						<a href="mybuy.jsp?type=0"><span>我的宝贝</span> </a>
					</li>
					<li class="mysell">
						<a href="mysell.jsp"><span>站长推荐</span> </a>
					</li>
					<li class="announcement">
						<a href="announcement.jsp"><span>最新公告</span> </a>
					</li>
					<li class="question">
						<a href="question.jsp"><span>魅力师大</span> </a>
					</li>
					<li class="about">
						<a href="about.jsp"><span>关于我们</span> </a>
					</li>
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
						<div style="height:445px">
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
							<h2><a href="show_liuyan.jsp">我的消息</a></h2>
						    </li>
							<li>
								<h2><a href="have_get.jsp">已买宝贝</a></h2>
							</li>
							<li>
								<h2><a href="have_sell.jsp">已卖宝贝</a></h2>
							</li>
							<li>
							<h2><a href="have_sell.jsp">添加宝贝</a></h2>
						</li>
						</ul>						
					</div>










<form name="form1"
				action="show_liuyan_content_deal.jsp?from_liuyan_id=<%=show_liuyan_content.rs.getString("liuyan_id")%>&proc_type=<%=show_liuyan_content.rs.getString("proc_type")%>&proc_id=<%=show_liuyan_content.rs.getString("proc_id")%>&to_who=<%=show_liuyan_content.rs.getString("liuyan_person")%>&liuyan_person=<%=show_liuyan_content.rs.getString("to_who")%>"
				method="post">
							<div style="margin-left: 220px; margin-top: -440px; height:400px;width: 800px">
								<table width="" border="0" align="left">
									<caption style="background-color: #96C">
										<font color="#FFFF00" size="+2">查看我的留言信息</font>
									</caption>
									<tr style="background-color: #3CF">
										<td width="75" align="center">
											留言伙伴
										</td>

										<td align="center">
											<%=show_liuyan_content.rs.getString("liuyan_person")%>
										</td>
									</tr>

									<tr style="background-color: #3CF">
										<td width="75" align="center">
											出&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价
										</td>

										<td align="center">
											<%=show_liuyan_content.rs.getString("give_price")%>
										</td>
									</tr>


									<tr style="background-color: #3CF">

										<td width="" align="center">
											留言内容
										</td>

										<td width="125" align="center">
											<textarea readonly rows="6" cols="40" ><%=show_liuyan_content.rs.getString("content")%></textarea>
										</td>
									</tr>

									<tr style="background-color: #3CF">
										<td width="" align="center">
											回复留言
										</td>

										<td width="125" align="center">
											<textarea rows="6" cols="40" name="content"></textarea>
										</td>
									</tr>

									<tr height="20" style="background-color: #3CF">
										<td colspan="2" align="center">
											<input type="reset" style="background: #0CF" value="重&nbsp;&nbsp;置" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="submit" style="background: #0CF"
												value="提&nbsp;&nbsp;交" />

										</td>
									</tr>





								</table>
							</div>

</form>

							<div style="margin-left: 650px; margin-top: -415px; height:400px;width: 600px">
								<table width="" border="0" align="left">
									<caption style="background-color: #96C">
										<font color="#FFFF00" size="+2">商品信息</font>
									</caption>
									<tr>
									<td>
									<%
									  String url = show_liuyan_content.check_proc_rs.getString("proc_type")+"_product.jsp?id="+show_liuyan_content.check_proc_rs.getString("proc_id");
									  System.out.println(url);
									%>
									<a href="<%=url%>">
									<img style="width: 250px; height: 230px;"src="images/products/life1.jpg">
										</a></td>
										</tr>
							
							
									<tr>
										<td>
											商品名称：<%=show_liuyan_content.check_proc_rs.getString("proc_name")%>
										</td>
									</tr>



									<tr>
										<td>
											标&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价：<%=show_liuyan_content.check_proc_rs.getString("proc_price")%>
										</td>
									</tr>


								</table>





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
							<a href="http://www2.ahnu.edu.cn/home/" target="_blank" id="ahnu">安徽师范大学</a>
						</li>
						<li>
							<a
								href="http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx"
								target="_blank" id="tms">本科生教育</a>
						</li>
						<li>
							<a href="http://lib.ahnu.edu.cn/index.asp" target="_blank"
								id="library">图书期刊</a>
						</li>
					</ul>
				</div>
			</div>
			<p class="footnote">
				Copyright 2013 Anhui Normal University. All rights reserved.
			</p>
		</div>
	</body>
	</html>
