package org.apache.jsp.regist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.imageio.*;

public final class image_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


 Color getRandColor(int fc,int bc){//给定范围获得随机颜色
Random random = new Random();
 if(fc>255) fc=255;
 if(bc>255) bc=255;
 int r=fc+random.nextInt(bc-fc);
 int g=fc+random.nextInt(bc-fc);
 int b=fc+random.nextInt(bc-fc);
 return new Color(r,g,b);
 }
 
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
      response.setContentType("image/jpeg;charset=gb2312");
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
      out.write("\r\n");
      out.write(" ");
      out.write('\r');
      out.write('\n');
      out.write(' ');

 //设置页面不缓存
response.setHeader("Pragma","No-cache");
 response.setHeader("Cache-Control","no-cache");
 response.setDateHeader("Expires", 0);

 // 在内存中创建图象
int width=60, height=20;
 BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

 // 获取图形上下文
Graphics g = image.getGraphics();

 //生成随机类
Random random = new Random();

 // 设定背景色
g.setColor(getRandColor(200,250));
 g.fillRect(0, 0, width, height);

 //设定字体
g.setFont(new Font("Times New Roman",Font.PLAIN,18));

 //画边框
//g.setColor(new Color());
 //g.drawRect(0,0,width-1,height-1);

 // 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
g.setColor(getRandColor(160,200));
 for (int i=0;i<155;i++)
 {
 int x = random.nextInt(width);
 int y = random.nextInt(height);
 int xl = random.nextInt(12);
 int yl = random.nextInt(12);
 g.drawLine(x,y,x+xl,y+yl);
 }

 // 取随机产生的认证码(4位数字)
String sRand="";
 for (int i=0;i<4;i++){
 String rand=String.valueOf(random.nextInt(10));
 sRand+=rand;
 // 将认证码显示到图象中
g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));//调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
g.drawString(rand,13*i+6,16);
 }

 // 将认证码存入SESSION
 session.setAttribute("rand",sRand);

 // 图象生效
g.dispose();

 // 输出图象到页面
ImageIO.write(image, "JPEG", response.getOutputStream());

 
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'image.jsp' starting page</title>\r\n");
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
