package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class hava_005fsell_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      com.sql.link_SqlServer show_dingdan = null;
      synchronized (session) {
        show_dingdan = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("show_dingdan", PageContext.SESSION_SCOPE);
        if (show_dingdan == null){
          show_dingdan = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("show_dingdan", show_dingdan, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>已卖出的宝贝</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

			//public static  int type;
		show_dingdan.link();
			String user;
			if (session.getAttribute("name") != null) {
				user = (String) session.getAttribute("name");
			} else
				user = null;

			int rowcount = 0;
			int pagecount = 0;
			int pagesize = 10;
			int count = 0;
			int showpage = 1;
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			session.setAttribute("baby", "first");
		
      out.write("\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"Logo\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"home\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.jsp\"><span>网站首页</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"mybuy current\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mybuy.jsp?type=0\"><span>我的宝贝</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"mysell\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mysell.jsp\"><span>我的店铺</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"announcement\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"announcement.jsp\"><span>最新公告</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"question\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"question.jsp\"><span>问题反馈</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"about\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"about.jsp\"><span>关于我们</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"background\">\r\n");
      out.write("\t\t\t\t\t<div id=\"templatemo_search\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Search\" name=\"keyword\" id=\"keyword\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"keyword\" onfocus=\"clearText(this)\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"mybuy.jsp?type=1\">个人信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\">我的购物车</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\">我的订单</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"products.jsp\">已买到的宝贝</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"show_liuyan.jsp\">我的留言</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"\">我的消息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (user == null) {
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"margin-left: 204px; margin-top: -410px; width: 400px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t您还未登陆，请先登陆！\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
									show_dingdan.show_selled(user);

									if(!show_dingdan.rs.next())
									{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"margin-left: 204px; margin-top: -410px; width: 400px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t您目前没有还没有卖出任何宝贝！\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");
}
									else {
										show_dingdan.rs.last();
									rowcount = show_dingdan.rs.getRow();

									pagecount = ((rowcount % pagesize) == 0 ? (rowcount / pagesize)
											: (rowcount / pagesize) + 1);
									String top = request.getParameter("page");

									if (top != null) {
										showpage = Integer.parseInt(top);
										if (showpage > pagecount) {
											showpage = pagecount;
										} else if (showpage <= 0) {
											showpage = 1;
										}
									}

									show_dingdan.rs.absolute((showpage - 1) * pagesize + 1);
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"margin-left: 200px; margin-top: -400px; width: 740px; height: 440px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"\" border=\"0\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<caption style=\"background-color: #96C\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font color=\"#FFFF00\" size=\"+2\">已卖出的宝贝信息</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #3CF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"75\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t商品图片\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"75\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t商品名称\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"75\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t出&nbsp;价\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"200\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t商品介绍\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"120\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t删除记录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

										//while (show_liuyan.rs.next()) {

											for (int i = 1; i <= pagesize; i++) {
												
												
												String url = show_dingdan.rs.getString("proc_type")+"_product.jsp?id="+show_dingdan.rs.getString("proc_id");

												show_dingdan.show_gouwuche_content(show_dingdan.rs.getString("proc_type"),show_dingdan.rs.getString("proc_id"));
									
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #CFF\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img></img>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"\" d=\"x2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=");
      out.print(url);
      out.write('>');
      out.write('	');
      out.write('	');
      out.print(show_dingdan.show_gouwuche_content_rs.getString("proc_name"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(show_dingdan.show_gouwuche_content_rs.getString("proc_price"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(show_dingdan.show_gouwuche_content_rs.getString("proc_jianjie"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"120\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t删除记录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

											if (!show_dingdan.rs.next())
														break;
												}
										
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"9\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font color=\"#6666FF\" size=\"+1\"> 当前页数:【");
      out.print(showpage);
      out.write("】&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"show_dingdan.jsp?page=1\">第一页</a>&nbsp;&nbsp; <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"show_dingdan.jsp?page=");
      out.print(showpage - 1);
      out.write("\">上一页</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"show_dingdan.jsp?page=");
      out.print(showpage + 1);
      out.write("\">下一页</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp; <a href=\"show_dingdan.jsp?page=");
      out.print(pagecount);
      out.write("\">最后一页&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
									}
									
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t联系我们\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t我们的努力，只愿为你创造更丰富的大学生活\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t友情链接\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www2.ahnu.edu.cn/home/\" target=\"_blank\" id=\"ahnu\">安徽师范大学</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttarget=\"_blank\" id=\"tms\">本科生教育</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://lib.ahnu.edu.cn/index.asp\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"library\">图书期刊</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p class=\"footnote\">\r\n");
      out.write("\t\t\t\tCopyright 2013 Anhui Normal University. All rights reserved.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
