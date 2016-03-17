package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.jspsmart.upload.*;
import java.sql.*;

public final class add_005fproc_005fdeal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      com.sql.link_SqlServer add_proc_deal = null;
      synchronized (session) {
        add_proc_deal = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("add_proc_deal", PageContext.SESSION_SCOPE);
        if (add_proc_deal == null){
          add_proc_deal = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("add_proc_deal", add_proc_deal, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("gb2312");	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("\t\t");

			request.setCharacterEncoding("gb2312");
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<title>信息提交</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

					
			SmartUpload su = new SmartUpload();
		    su.initialize(pageContext) ; // 初始化上传
		    su.setAllowedFilesList("jpg,JPG,bmp,BMP,gif,GIF,png,PNG");
		    su.upload() ;     // 准备上传
		    su.save("/proc_pic");   
		    String proc_pic_url="proc_pic/"+su.getFiles().getFile(0).getFileName();

		    
		    String proc_name = su.getRequest().getParameter("proc_name");
		    System.out.println("proc_name="+proc_name);
			String proc_type = su.getRequest().getParameter("proc_type");
			System.out.println("proc_type="+proc_type);
			String proc_jianjie = su.getRequest().getParameter("proc_jianjie");
			System.out.println("proc_jianjie="+proc_jianjie);
			String proc_xiangjie = su.getRequest().getParameter("proc_xiangjie");
			String proc_price = su.getRequest().getParameter("proc_price");
			String seller_addr = su.getRequest().getParameter("addr");
			String seller_tel = su.getRequest().getParameter("tel");
			//String to_who = request.getParameter("to_who");
			String seller_name="null";
		    
			
			if (session.getAttribute("name") != null) {
				seller_name = (String) session.getAttribute("name");
			} else
				seller_name = null;

			add_proc_deal.link();

			if(add_proc_deal.add_proc(proc_type, proc_name, proc_xiangjie, proc_jianjie,proc_price,proc_pic_url, seller_name, seller_tel, seller_addr, proc_type)==1)
			{
				//out.println("<script language='javascript'>alert('商品上架成功！');parent.location.href='add_proc.jsp';</script>");

				add_proc_deal.link();
				add_proc_deal.check_insert_id(proc_type);
				add_proc_deal.link();
				if(add_proc_deal.add_proc_list(proc_type,add_proc_deal.insert_id,seller_name) == 1){
					out.println("<script language='javascript'>alert('商品上架成功！');parent.location.href='add_proc.jsp';</script>");
				}else out.println("<script language='javascript'>alert('操作失败！');parent.location.href='drop_proc.jsp';</script>");

			}else out.println("<script language='javascript'>alert('操作失败！');parent.location.href='drop_proc.jsp';</script>");

   
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
