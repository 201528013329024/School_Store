package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>校园二手交易平台</title>\r\n");
      out.write("\t<link href=\"css/indexstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"css/nivo-slider.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"show\">\r\n");
      out.write("<div id=\"templatemo_middle\"><!--图象显示的位置-->\r\n");
      out.write("\t\t\t\t\t<div id=\"slider-wrapper\"><!--图象显示的外框-->\r\n");
      out.write("\t\t\t\t\t\t<div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write(" \t\t\t\t\t\t\t<img src=\"images/slider/01.jpg\" alt=\"Slider 01\" />\r\n");
      out.write("                \t\t\t<img src=\"images/slider/02.jpg\" alt=\"Slider 02\" />\r\n");
      out.write("                \t\t\t<img src=\"images/slider/03.jpg\" alt=\"Slider 03\" />\r\n");
      out.write("                \t\t\t<img src=\"images/slider/04.jpg\" alt=\"Slider 04\" />\r\n");
      out.write("                       </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("      \t\t\t<script src=\"js/jquery-1.4.3.min.js\"></script>\r\n");
      out.write("      \t\t\t<script src=\"js/jquery.nivo.slider.js\"></script>\r\n");
      out.write("      \t\t\t<script>\r\n");
      out.write("\t\t\t\t\t$(window).load(function() {\r\n");
      out.write("                \t$('#slider').nivoSlider();});</script>            \r\n");
      out.write("</div> \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("    \r\n");
      out.write("    \t<div id=\"logo\">\r\n");
      out.write("        \t<a href=\"index.jsp\"><img title=\"首页\" src=\"images/logo.png\" alt=\"Logo\"></a>       \t\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"mybuy\" style=\"top: -35px; left: 180px;\"><a ><span>\r\n");
      out.write("            <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
      out.write("            ");

				if (session.getAttribute("name") != null) {
				
      out.print(session.getAttribute("name"));
      out.write("会员，欢迎您！");

							}
						
      out.write("</font></span>\r\n");
      out.write("\t\t\t\t\t\t</a></li>   \r\n");
      out.write("            <li class=\"mybuy\" style=\"top: -35px; left: 45px;\"><a href=\"login/login.jsp\"><span>\r\n");
      out.write("           <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">登陆</font></span></a></li>   \r\n");
      out.write("            <li class=\"mybuy\" style=\"top: -35px; left: 90px;\"><a href=\"regist/cus_regist.jsp\"><span>\r\n");
      out.write("            <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">注册</font></span></a></li>   \r\n");
      out.write("            <li class=\"mybuy\" style=\"top: -35px; left: 655px;\"><a><span>\r\n");
      out.write("            <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">\r\n");
      out.write(" ");
 
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
      out.write("            </span></a></li> \r\n");
      out.write("        \t<li class=\"home current\" style=\"top: 0px; left: 50px;\"><a href=\"index.jsp\"><span>网站首页</span></a></li>\r\n");
      out.write("       \t    <li class=\"mybuy\"><a href=\"mybuy.jsp?type=0\"><span>我的宝贝</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"mysell\"><a href=\"zz_tuijian.jsp\"><span>站长推荐</span></a></li>\r\n");
      out.write("            <li class=\"announcement\"><a href=\"announcement.jsp\"><span>最新公告</span></a></li>\r\n");
      out.write("            <li class=\"question\"><a href=\"shida.jsp\"><span>魅力师大</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"about\"><a href=\"about.jsp\"><span>关于我们</span></a></li>\t\t\t\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("   \r\n");
      out.write("\t\t\t<div id=\"figure\">\r\n");
      out.write("            \t<div id=\"templatemo_search\">\r\n");
      out.write("            \t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("                    \t<input type=\"text\" value=\"Search\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("           \t\t      <input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\"  />\r\n");
      out.write("            \t\t</form>\r\n");
      out.write("            \t</div>\t \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \t\r\n");
      out.write("            \r\n");
      out.write("\t  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"life.jsp\"><img src=\"images/icon/life.png\" alt=\"LifeImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"life.jsp\">生 活</a></h2>\r\n");
      out.write("                        </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"book.jsp\"><img src=\"images/icon/book.png\" alt=\"BookImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"book.jsp\">书 籍</a></h2>\r\n");
      out.write("                        </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"electronic.jsp\"><img src=\"images/icon/ele.png\" alt=\"EleImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"electronic.jsp\">电 子</a></h2>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"sport.jsp\"><img src=\"images/icon/sport.png\" alt=\"SportImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"sport.jsp\">体 育</a></h2>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("                        <li><a href=\"fuwu.jsp\"><img src=\"images/icon/service.png\" alt=\"ServiceImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"fuwu.jsp\">服 务</a></h2>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("                        <li><a href=\"others.jsp\"><img src=\"images/icon/other.png\" alt=\"OtherImage\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"others.jsp\">其 他</a></h2>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("\t<p class=\"footnote\">Copyright 2013 Anhui Normal University. All rights reserved.\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
