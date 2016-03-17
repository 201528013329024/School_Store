package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>用户注册</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <div style=\"background-color:#0ff\">\r\n");
      out.write("    <form action=\"addUser\" method=\"post\">\r\n");
      out.write("    \t<table align=\"center\" class=\"table\">\r\n");
      out.write("    \t<caption>用户注册</caption>\r\n");
      out.write("    \t<tr height=\"50px\">\r\n");
      out.write("    \t\t<td>\r\n");
      out.write("    \t\t登录名：\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t\t<td>\r\n");
      out.write("    \t\t<input type=\"text\" name=\"username\" style=\"width:150px;height:25px\" size=\"10\"/>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<tr height=\"45px\">\r\n");
      out.write("    \t\t<td>\r\n");
      out.write("    \t\t密&nbsp;&nbsp;码：\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t\t<td>\r\n");
      out.write("    \t\t<input type=\"password\" style=\"width:150px;height:25px\" name=\"pwd\" size=\"10\"/>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<tr height=\"45px\">\r\n");
      out.write("    \t\t<td align=\"center\" >\r\n");
      out.write("    \t\t<input type=\"submit\" style=\"font-size:18px;background: #0CF\" \"  value=\"注&nbsp;&nbsp;册\">\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t\t<td align=\"center\">\r\n");
      out.write("    \t\t<input type=\"reset\" style=\"font-size:18px;background: #0CF\" \" value=\"重&nbsp;&nbsp;置\">\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    \t\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("  </div>\r\n");
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
