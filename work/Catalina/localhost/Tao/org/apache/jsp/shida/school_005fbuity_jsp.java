package org.apache.jsp.shida;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class school_005fbuity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>校园风光</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/swfobject.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\t\r\n");
      out.write("\t/* hide from ie on mac \\*/\r\n");
      out.write("\thtml {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\toverflow: hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#flashcontent {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t/* end hide */\r\n");
      out.write("\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t\tbackground-color: #000000;\r\n");
      out.write("\t\tcolor:#ffffff;\r\n");
      out.write("\t\tfont-family:sans-serif;\r\n");
      out.write("\t\tfont-size:40;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\ta {\t\r\n");
      out.write("\t\tcolor:#cccccc;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"flashcontent\">TiltViewer requires JavaScript and the latest Flash player. <a href=\"http://www.macromedia.com/go/getflashplayer/\">Get Flash here.</a></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar fo = new SWFObject(\"TiltViewer.swf\", \"viewer\", \"100%\", \"100%\", \"9.0.23\", \"#000000\");\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// TILTVIEWER CONFIGURATION OPTIONS\r\n");
      out.write("\t\t// To use an option, uncomment it by removing the \"//\" at the start of the line\r\n");
      out.write("\t\t// For a description of config options, go to: \r\n");
      out.write("\t\t// http://www.airtightinteractive.com/projects/tiltviewer/config_options.html\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t//FLICKR GALLERY OPTIONS\r\n");
      out.write("\t\t// To use images from Flickr, uncomment this block\r\n");
      out.write("\t\t//fo.addVariable(\"useFlickr\", \"true\");\r\n");
      out.write("\t\t//fo.addVariable(\"user_id\", \"48508968@N00\");\r\n");
      out.write("\t\t //fo.addVariable(\"tags\", \"jump,smile\");\r\n");
      out.write("\t\t//fo.addVariable(\"tag_mode\", \"all\");\r\n");
      out.write("\t\t//fo.addVariable(\"showTakenByText\", \"true\");\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// XML GALLERY OPTIONS\r\n");
      out.write("\t\t// To use local images defined in an XML document, use this block\t\t\r\n");
      out.write("\t\tfo.addVariable(\"useFlickr\", \"false\");\r\n");
      out.write("\t\tfo.addVariable(\"xmlURL\", \"gallery.xml\");\r\n");
      out.write("\t\tfo.addVariable(\"maxJPGSize\",\"1000\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//GENERAL OPTIONS\t\t\r\n");
      out.write("\t\tfo.addVariable(\"useReloadButton\", \"false\");\r\n");
      out.write("\t\tfo.addVariable(\"columns\", \"6\");\r\n");
      out.write("\t\tfo.addVariable(\"rows\", \"6\");\r\n");
      out.write("\t\tfo.addVariable(\"showFlipButton\", \"false\");\r\n");
      out.write("\t\tfo.addVariable(\"showLinkButton\", \"false\");\t\t\r\n");
      out.write("\t\tfo.addVariable(\"linkLabel\", \"View image info\");\r\n");
      out.write("\t\t//fo.addVariable(\"frameColor\", \"0xFF0000\");\r\n");
      out.write("\t\t//fo.addVariable(\"backColor\", \"0xDDDDDD\");\r\n");
      out.write("\t\t//fo.addVariable(\"bkgndInnerColor\", \"0xFF00FF\");\r\n");
      out.write("\t\t//fo.addVariable(\"bkgndOuterColor\", \"0x0000FF\");\t\t\t\t\r\n");
      out.write("\t\t//fo.addVariable(\"langGoFull\", \"Go Fullscreen\");\r\n");
      out.write("\t\t//fo.addVariable(\"langExitFull\", \"Exit Fullscreen\");\r\n");
      out.write("\t\tfo.addVariable(\"langAbout\", \"About\");\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// END TILTVIEWER CONFIGURATION OPTIONS\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfo.addParam(\"allowFullScreen\",\"true\");\r\n");
      out.write("\t\tfo.write(\"flashcontent\");\t\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
