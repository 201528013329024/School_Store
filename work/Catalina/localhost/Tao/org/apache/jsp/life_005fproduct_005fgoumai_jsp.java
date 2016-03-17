package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.util.Date;
import java.sql.*;

public final class life_005fproduct_005fgoumai_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write('\r');
      out.write('\n');
      com.sql.link_SqlServer life_xiangxi = null;
      synchronized (session) {
        life_xiangxi = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("life_xiangxi", PageContext.SESSION_SCOPE);
        if (life_xiangxi == null){
          life_xiangxi = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("life_xiangxi", life_xiangxi, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>立刻购买</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/product.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("#table {\r\n");
      out.write("\t\r\n");
      out.write("\tfont-size: 19px;\r\n");
      out.write("\tcolor: #0FF\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t");

			life_xiangxi.link();
			String id = request.getParameter("id");
			life_xiangxi.check_life(id);

			//System.out.print(id);

			// String sqlStr = "slifet * from cus_info where proc_id ='"+id+"'";
		
      out.write("\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t    \t<a href=\"index.jsp\"><img title=\"首页\" src=\"images/logo.png\" alt=\"Logo\"></a>       \t\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\t\t    <ul>\r\n");
      out.write("\t\t        <li class=\"mybuy\" style=\"top: -35px; left: 180px;\"><a ><span>\r\n");
      out.write("\t\t        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
      out.write("\t\t        ");

					if (session.getAttribute("name") != null) {
					
      out.print(session.getAttribute("name"));
      out.write("会员，欢迎您！");

								}
							
      out.write("</font></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>   \r\n");
      out.write("\t\t        <li class=\"mybuy\" style=\"top: -35px; left: 45px;\"><a href=\"login/login.jsp\"><span>\r\n");
      out.write("\t\t       <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">登陆</font></span></a></li>   \r\n");
      out.write("\t\t        <li class=\"mybuy\" style=\"top: -35px; left: 90px;\"><a href=\"regist/cus_regist.jsp\"><span>\r\n");
      out.write("\t\t        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">注册</font></span></a></li>   \r\n");
      out.write("\t\t        <li class=\"mybuy\" style=\"top: -35px; left: 655px;\"><a><span>\r\n");
      out.write("\t\t        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
      out.write("\t\t");
 
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
			  

		         
      out.write("</font>\r\n");
      out.write("\t\t        </span></a></li> \r\n");
      out.write("\t\t    \t<li class=\"home current\" style=\"top: 0px; left: 50px;\"><a href=\"index.jsp\"><span>网站首页</span></a></li>\r\n");
      out.write("\t\t   \t    <li class=\"mybuy\"><a href=\"mybuy.jsp?type=0\"><span>我的宝贝</span></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"mysell\"><a href=\"zz_tuijian.jsp\"><span>站长推荐</span></a></li>\r\n");
      out.write("\t\t        <li class=\"announcement\"><a href=\"announcement.jsp\"><span>最新公告</span></a></li>\r\n");
      out.write("\t\t        <li class=\"question\"><a href=\"shida.jsp\"><span>魅力师大</span></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"about\"><a href=\"about.jsp\"><span>关于我们</span></a></li>\t\t\t\r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"background\">\r\n");
      out.write("\t\t\t\t\t<div id=\"templatemo_search\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"life_product_goumai_deal.jsp\" method=\"get\">\r\n");
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
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form name=\"form1\"\r\n");
      out.write("\t\t\t\taction=\"life_product_goumai_deal.jsp?id=");
      out.print(life_xiangxi.check_life_rs.getString("proc_id"));
      out.write("&seller=");
      out.print(life_xiangxi.check_life_rs.getString("seller_name"));
      out.write("\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t<table id=\"table\" border=\"0\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<caption>\r\n");
      out.write("\t\t\t\t给卖家留言\r\n");
      out.write("\t\t\t</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"100px\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"name\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td  align=\"center\" >\r\n");
      out.write("\t\t\t\t\t联系方式\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"tel\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td  align=\"center\">\r\n");
      out.write("\t\t\t\t\t我的出价\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"m\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td  align=\"center\">\r\n");
      out.write("\t\t\t\t\t留&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;言\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<textarea rows=\"5\" cols=\"30\" name=\"content\"></textarea>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"80\">\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t<input type=\"reset\" style=\"background: #0CF\" value=\"重&nbsp;置\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" style=\"background: #0CF\" value=\"登&nbsp;陆\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
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
