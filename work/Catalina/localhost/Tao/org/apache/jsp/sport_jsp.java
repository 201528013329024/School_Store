package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.util.Date;
import java.sql.*;

public final class sport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>我的宝贝 - 校园二手交易平台</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/goodsstyle.css\">\r\n");
      out.write("</head>\r\n");
      com.sql.link_SqlServer show_sport = null;
      synchronized (session) {
        show_sport = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("show_sport", PageContext.SESSION_SCOPE);
        if (show_sport == null){
          show_sport = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("show_sport", show_sport, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

		  show_sport.link();

    	  show_sport.show_sport();
    	  
    	  int rowcount = 0;
		  int pagecount = 0;
		  int pagesize =4;
		  int count = 0;
		  int showpage = 1;
    	  


      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("    \t<a href=\"index.jsp\"><img title=\"首页\" src=\"images/logo.png\" alt=\"Logo\"></a>       \t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 180px;\"><a ><span>\r\n");
      out.write("        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
      out.write("        ");

			if (session.getAttribute("name") != null) {
			
      out.print(session.getAttribute("name"));
      out.write("会员，欢迎您！");

						}
					
      out.write("</font></span>\r\n");
      out.write("\t\t\t\t\t</a></li>   \r\n");
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 45px;\"><a href=\"login/login.jsp\"><span>\r\n");
      out.write("       <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">登陆</font></span></a></li>   \r\n");
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 90px;\"><a href=\"regist/cus_regist.jsp\"><span>\r\n");
      out.write("        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">注册</font></span></a></li>   \r\n");
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 655px;\"><a><span>\r\n");
      out.write("        <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
 
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
      out.write("        </span></a></li> \r\n");
      out.write("    \t<li class=\"home current\" style=\"top: 0px; left: 50px;\"><a href=\"index.jsp\"><span>网站首页</span></a></li>\r\n");
      out.write("   \t    <li class=\"mybuy\"><a href=\"mybuy.jsp?type=0\"><span>我的宝贝</span></a></li>\r\n");
      out.write("\t\t<li class=\"mysell\"><a href=\"zz_tuijian.jsp\"><span>站长推荐</span></a></li>\r\n");
      out.write("        <li class=\"announcement\"><a href=\"announcement.jsp\"><span>最新公告</span></a></li>\r\n");
      out.write("        <li class=\"question\"><a href=\"shida.jsp\"><span>魅力师大</span></a></li>\r\n");
      out.write("\t\t<li class=\"about\"><a href=\"about.jsp\"><span>关于我们</span></a></li>\t\t\t\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div id=\"background\">\r\n");
      out.write("            \t<div id=\"templatemo_search\">\r\n");
      out.write("            \t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("                    \t<input type=\"text\" value=\"Search\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("           \t\t      <input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\"  />\r\n");
      out.write("            \t\t</form>\r\n");
      out.write("            \t</div>\t \r\n");
      out.write("             </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("                    \t<h1>生活</h1>\r\n");
      out.write("                        <h4></h4>\r\n");
      out.write("                        \r\n");
      out.write("                        ");

                   	 
                   	 
                   	 
                   	 //show_sport.rs.next(); 
                        	show_sport.rs.last();
							rowcount = show_sport.rs.getRow();

							pagecount = ((rowcount % 16) == 0 ? (rowcount / 16)
									: (rowcount / 16) + 1);
							String top = request.getParameter("page");

							if (top != null) {
								showpage = ((Integer.parseInt(top))/16)+1;  //1
								if (showpage > pagecount) {
									showpage = pagecount;
								} else if (showpage <= 0) {
									showpage = 1;
								}
							}

							show_sport.rs.absolute((showpage - 1) * 16 + 1);
							//show_sport.rs.next();
							
							
							//while (show_liuyan.rs.next()) {

							for (int i = 1; i <= pagesize; i++) {
						
                 	 
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div >\r\n");
      out.write("                           \r\n");
      out.write("                            \r\n");
      out.write("                        ");
if(show_sport.rs!= null) {
      out.write("\r\n");
      out.write("                        \t<div style=\"margin-left:40px;\">\r\n");
      out.write("                            \t<div class=\"product_pic\" align=\"center\">\r\n");
      out.write("                                \t<a target=\"_blank\" href=\"sport_product.jsp?id=");
      out.print(show_sport.rs.getString("proc_id") );
      out.write("\"><img style=\"width:200px;height:200px\" src=\"");
      out.print(show_sport.rs.getString("proc_pic_url"));
      out.write("\" alt=\"Image\"\" alt=\"Image\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_summ\">\r\n");
      out.write("                                \t<p align=\"center\">");
      out.print(show_sport.rs.getString("proc_jianjie"));
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_price\">\r\n");
      out.write("                                \t<p align=\"center\">¥");
      out.print(show_sport.rs.getString("proc_price") );
      out.write("元</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \t</div>         \t\r\n");
      out.write("                        \t");
 }
      out.write("\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t");
if(show_sport.rs.next())  {
      out.write("\r\n");
      out.write("                        \t<div style=\"margin-left:40px;\">\r\n");
      out.write("                            \t<div class=\"product_pic\" align=\"center\">\r\n");
      out.write("                                \t<a target=\"_blank\" href=\"sport_product.jsp?id=");
      out.print(show_sport.rs.getString("proc_id") );
      out.write("\"><img style=\"width:200px;height:200px\" src=\"");
      out.print(show_sport.rs.getString("proc_pic_url"));
      out.write("\" alt=\"Image\"\" alt=\"Image\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_summ\">\r\n");
      out.write("                                \t<p align=\"center\">");
      out.print(show_sport.rs.getString("proc_jianjie"));
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_price\">\r\n");
      out.write("                                \t<p align=\"center\">¥");
      out.print(show_sport.rs.getString("proc_price") );
      out.write("元</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \t</div>         \t\r\n");
      out.write("                        \t");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t");
if(show_sport.rs.next())  {
      out.write("\r\n");
      out.write("                        \t<div style=\"margin-left:40px;\">\r\n");
      out.write("                            \t<div class=\"product_pic\" align=\"center\">\r\n");
      out.write("                                \t<a target=\"_blank\" href=\"sport_product.jsp?id=");
      out.print(show_sport.rs.getString("proc_id") );
      out.write("\"><img style=\"width:200px;height:200px\" src=\"");
      out.print(show_sport.rs.getString("proc_pic_url"));
      out.write("\" alt=\"Image\"\" alt=\"Image\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_summ\">\r\n");
      out.write("                                \t<p align=\"center\">");
      out.print(show_sport.rs.getString("proc_jianjie"));
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_price\">\r\n");
      out.write("                                \t<p align=\"center\">¥");
      out.print(show_sport.rs.getString("proc_price") );
      out.write("元</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \t</div>         \t\r\n");
      out.write("                        \t");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t");
if(show_sport.rs.next())  {
      out.write("\r\n");
      out.write("                        \t<div style=\"margin-left:40px;\">\r\n");
      out.write("                            \t<div class=\"product_pic\" align=\"center\">\r\n");
      out.write("                                \t<a target=\"_blank\" href=\"sport_product.jsp?id=");
      out.print(show_sport.rs.getString("proc_id") );
      out.write("\"><img style=\"width:200px;height:200px\" src=\"");
      out.print(show_sport.rs.getString("proc_pic_url"));
      out.write("\" alt=\"Image\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_summ\">\r\n");
      out.write("                                \t<p align=\"center\">");
      out.print(show_sport.rs.getString("proc_jianjie"));
      out.write("</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product_price\">\r\n");
      out.write("                                \t<p align=\"center\">¥");
      out.print(show_sport.rs.getString("proc_price") );
      out.write("元</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        \t</div>         \t\r\n");
      out.write("                        \t");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                       </div>\r\n");
      out.write("                        \r\n");
      out.write("                       ");

						if (!show_sport.rs.next())
								break;
						}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t<font color=\"#6666FF\" size=\"+1\"> 当前页数:【");
      out.print(showpage);
      out.write("】&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"sport.jsp?page=1\">第一页</a>&nbsp;&nbsp; <a\r\n");
      out.write("\t\t\t\thref=\"sport.jsp?page=");
      out.print(showpage- 16);
      out.write("\">上一页</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"sport.jsp?page=");
      out.print(showpage + 16);
      out.write("\">下一页</a>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp; <a href=\"sport.jsp?page=");
      out.print(pagecount);
      out.write("\">最后一页&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h3>联系我们</h3>\r\n");
      out.write("\t\t\t\t<p>我们的努力，只愿为你创造更丰富的大学生活\t\t\t\t\t\t\t\t \t\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h3>友情链接</h3>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://www2.ahnu.edu.cn/home/\" target=\"_blank\" id=\"ahnu\">安徽师范大学</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx\" target=\"_blank\" id=\"tms\">本科生教育</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://lib.ahnu.edu.cn/index.asp\" target=\"_blank\" id=\"library\">图书期刊</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p class=\"footnote\">Copyright 2013 Anhui Normal University. All rights reserved.\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
