package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class liuyan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
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
      com.sql.link_SqlServer show_liuyan_content = null;
      synchronized (session) {
        show_liuyan_content = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("show_liuyan_content", PageContext.SESSION_SCOPE);
        if (show_liuyan_content == null){
          show_liuyan_content = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("show_liuyan_content", show_liuyan_content, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"gb2312\">\r\n");
      out.write("\t\t<title>chakan</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

			//public static  int type;
			show_liuyan_content.link();
			String liuyan_id = request.getParameter("liuyan_id");
			String proc_id = request.getParameter("proc_id");
			show_liuyan_content.liuyan_show_content(liuyan_id);
			show_liuyan_content.rs.next();
			show_liuyan_content.check_life(proc_id);
		
      out.write("\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"Logo\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"home\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.jsp\"><span>缂�拷锟芥＃锟姐�</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"mybuy current\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mybuy.jsp?type=0\"><span>锟斤拷锟界�锟斤拷</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"mysell\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"mysell.jsp\"><span>缁�拷锟斤拷��拷</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"announcement\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"announcement.jsp\"><span>锟斤拷锟斤拷锟斤拷</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"question\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"question.jsp\"><span>姒�拷锟界�锟姐�</span> </a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"about\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"about.jsp\"><span>锟藉�锟斤拷锟芥�</span> </a>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"mybuy.jsp?type=1\">锟姐�锟芥���拷</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"show_gouwuche.jsp\">��拷锟芥�锟�a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"show_dingdan.jsp\">锟斤拷锟界���拷</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"show_liuyan.jsp\">锟斤拷锟斤拷锟斤拷</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"have_get.jsp\">瀹歌弓�辩�锟斤拷</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"have_sell.jsp\">瀹告�锟界�锟斤拷</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"form1\"\r\n");
      out.write("\t\t\t\taction=\"show_liuyan_content_deal.jsp?from_liuyan_id=");
      out.print(show_liuyan_content.rs.getString("liuyan_id"));
      out.write("&proc_type=");
      out.print(show_liuyan_content.rs.getString("proc_type"));
      out.write("&to_who=");
      out.print(show_liuyan_content.rs.getString("liuyan_person"));
      out.write("&liuyan_person=");
      out.print(show_liuyan_content.rs.getString("to_who"));
      out.write("\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"margin-left: 220px; margin-top: -395px; width: 800px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"\" border=\"0\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<caption style=\"background-color: #96C\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font color=\"#FFFF00\" size=\"+2\">锟姐�锟斤拷锟斤拷锟斤拷锟芥���拷</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #3CF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"75\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷锟芥导锟藉�\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(show_liuyan_content.rs.getString("liuyan_person"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #3CF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"75\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷nbsp;&nbsp;&nbsp;&nbsp;&nbsp;娴�拷\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.print(show_liuyan_content.rs.getString("give_price"));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #3CF\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷锟斤拷锟斤拷\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"125\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea readonly rows=\"6\" cols=\"40\" >");
      out.print(show_liuyan_content.rs.getString("content"));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr style=\"background-color: #3CF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷锟斤拷锟斤拷\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"125\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea rows=\"6\" cols=\"40\" name=\"content\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr height=\"20\" style=\"background-color: #3CF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" style=\"background: #0CF\" value=\"锟斤拷nbsp;&nbsp;缂�拷 />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" style=\"background: #0CF\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"锟斤拷nbsp;&nbsp;娴�拷 />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"margin-left: 650px; margin-top: -413px; width: 600px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"\" border=\"0\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<caption style=\"background-color: #96C\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font color=\"#FFFF00\" size=\"+2\">锟斤拷锟芥���拷</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									  String url = show_liuyan_content.check_life_rs.getString("proc_type")+"_product.jsp?id="+show_liuyan_content.check_life_rs.getString("proc_id");
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print(url);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img style=\"width: 250px; height: 230px;\"src=\"images/products/life1.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷锟斤拷锟叫��锟�=show_liuyan_content.check_life_rs.getString(\"proc_name\")%>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t锟斤拷nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;娴��锟�%=show_liuyan_content.check_life_rs\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.getString(\"proc_price\")%>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t����风郴����烽��ゆ�\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t����烽�瑙���峰�����烽��ゆ����涓洪�濮������烽�缁����茎杈炬�瀛���ゆ���拷\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t����烽��ゆ�����烽��ゆ�\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www2.ahnu.edu.cn/home/\" target=\"_blank\" id=\"ahnu\">����烽��ゆ�甯���ゆ�����峰�</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttarget=\"_blank\" id=\"tms\">����烽��ゆ�����烽��ゆ���拷/a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://lib.ahnu.edu.cn/index.asp\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"library\">�鹃��ゆ�����℃�</a>\r\n");
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
