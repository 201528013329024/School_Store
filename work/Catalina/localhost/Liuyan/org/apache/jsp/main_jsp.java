package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.*;
import db.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>留言板信息</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <form action=\"liuyan.jsp\" method=\"post\">\r\n");
      out.write("    \t<table align=\"center\">\r\n");
      out.write("    \t\t<caption><font color=\"#F00000\" size=\"+2\">所有留言信息</font></caption>\r\n");
      out.write("    \t\t<tr align=\"center\" style=\"background-color: #3CF\">\r\n");
      out.write("    \t\t\t<td width=\"150px\">留言人姓名</td>\r\n");
      out.write("    \t\t\t<td width=\"150px\">留言时间</td>\r\n");
      out.write("    \t\t\t<td width=\"150px\">留言标题</td>\r\n");
      out.write("    \t\t\t<td>留言内容</td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t");

    		    lyTable ly = null;
    	 		ArrayList a1 = (ArrayList)session.getAttribute("a1");
    			Iterator iter = a1.iterator();
    			while(iter.hasNext()){
    				 ly = (lyTable)iter.next();
    			
    		
      out.write("\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<tr align=\"center\" style=\"background-color: #CFF\">\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t");
System.out.println(ly.getUserId()); 
      out.write("\r\n");
      out.write("    \t\t\t");
      out.print(new DB().getUserName(ly.getUserId()) );
      out.write("\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t");
      out.print(ly.getDate().toString());
      out.write("\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t");
      out.print(ly.getTitle() );
      out.write("\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("    \t\t\t<td>\r\n");
      out.write("    \t\t\t<textarea cols=\"35\"  rows=\"5\"  readonly>");
      out.print(ly.getConten() );
      out.write("</textarea>\r\n");
      out.write("    \t\t\t</td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t");
} 
      out.write("\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<tr align=\"center\" height=\"60px\"><td colspan=\"8\"><input type=\"submit\" value=\"我要留言\" style=\"font-size:18px;background: #0CF\" \" /></td></tr>\r\n");
      out.write("    \t</table>\r\n");
      out.write("    \t\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
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
