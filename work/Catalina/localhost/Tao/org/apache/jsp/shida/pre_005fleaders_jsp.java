package org.apache.jsp.shida;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;

public final class pre_005fleaders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>魅力师大 - 校园二手交易平台</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/indexstyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("    \t<a href=\"index.jsp\"><img title=\"首页\" src=\"../images/logo.png\" alt=\"Logo\"></a>       \t\r\n");
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
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 45px;\"><a href=\"../login/login.jsp\"><span>\r\n");
      out.write("       <font color=\"#FFFF33\" size=\"3\" face=\"楷体\">登陆</font></span></a></li>   \r\n");
      out.write("        <li class=\"mybuy\" style=\"top: -35px; left: 90px;\"><a href=\"../regist/cus_regist.jsp\"><span>\r\n");
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
      out.write("        <li class=\"home current\" style=\"top: 0px; left: 50px;\"><a href=\"../index.jsp\"><span>网站首页</span></a></li>\r\n");
      out.write("   \t    <li class=\"mybuy\"><a href=\"../mybuy.jsp?type=0\"><span>我的宝贝</span></a></li>\r\n");
      out.write("\t\t<li class=\"mysell\"><a href=\"../zz_tuijian.jsp\"><span>站长推荐</span></a></li>\r\n");
      out.write("        <li class=\"announcement\"><a href=\"../announcement.jsp\"><span>最新公告</span></a></li>\r\n");
      out.write("        <li class=\"question\"><a href=\"../shida.jsp\"><span>魅力师大</span></a></li>\r\n");
      out.write("\t\t<li class=\"about\"><a href=\"../about.jsp\"><span>关于我们</span></a></li>\t\t\t\t\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"article\">\r\n");
      out.write("\t\t\t\t\t\t\t<table  bordercolor=\"#009900\" border=\"0\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\t\t\t\t<table bordercolor=\"#009900\"  border=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"591\" height=\"20\" colspan=\"6\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"left\"><strong>党委书记</strong></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr  bordercolor=\"#009900\"> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">项　南</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">干仲儒</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">方向明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">万立誉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">陈望岐</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李　锐</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">陈　韧</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">魏心一</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沙流辉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杨新生</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">谷国华</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沈家仕</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">丁万鼎</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">蒋玉珉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">吴良仁</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</tbody> \r\n");
      out.write("\t\t\t\t\t\t\t</table> \r\n");
      out.write("\t\t\t\t\t\t\t<br /> \r\n");
      out.write("\t\t\t\t\t\t\t<table bordercolor=\"#009900\" border=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tbody> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"584\" height=\"20\" colspan=\"6\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"left\"><strong>党委副书记</strong></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">戈　华</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘青锋</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">高　峰</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张　良</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">邱成宣</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李卫义</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">方志明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沙流辉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">徐勉一</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">朱仇美</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张正元</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">任兴田</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沈家仕</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">袁起河</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">胡昭林</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">丁万鼎</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘登义</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">高家保</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王　肃</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">&nbsp;&nbsp;蒋玉珉　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">&nbsp; 余淑珍　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">&nbsp;&nbsp; 刘新跃　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</tbody> \r\n");
      out.write("\t\t\t\t\t\t\t</table> \r\n");
      out.write("\t\t\t\t\t\t\t<br /> \r\n");
      out.write("\t\t\t\t\t\t\t<table bordercolor=\"#009900\" border=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tbody> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"625\" height=\"20\" colspan=\"6\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"left\"><strong>校(院)长</strong></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">姚永朴</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘文典</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">程天放</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王星拱</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杨亮功</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">何 &nbsp;鲁</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">程演生</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">傅 铜</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李顺卿</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">汪宏法</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘真如</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李品仙</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">朱清华</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘乃敬</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">朱佛定</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘天予</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">程演生</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">朱光潜</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">陶&nbsp; 因</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">柯育甫</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">万昌言</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杨亮功</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李相勖</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">许　杰</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">方向明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">万立誉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">吴从云</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">童世杰</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">魏心一</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">陈　韧</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沙流辉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">叶钟文</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杜宜瑾</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张海鹏</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沈家仕</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">丁万鼎</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">蒋玉珉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</tbody> \r\n");
      out.write("\t\t\t\t\t\t\t</table> \r\n");
      out.write("\t\t\t\t\t\t\t<br /> \r\n");
      out.write("\t\t\t\t\t\t\t<table bordercolor=\"#009900\" border=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tbody> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"572\" height=\"20\" colspan=\"6\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"left\"><strong>副校(院)长</strong></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">方向明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">干仲儒</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘<span lang=\"ja\" lang=\"ja\" xml:lang=\"ja\">迺</span>敬</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘青锋</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沙流辉</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">童世杰</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">石锡侯</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">李卫义</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">赵一鸣</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王郁昭</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张怀璋</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张俊杰</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张动民</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">吕敬芳</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">徐勉一</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">方志明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张　范</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">许用思</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杨　志</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">朱仇美</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">叶钟文</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">杨新生</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">任兴田</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">张海鹏</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">严云绶</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">许用忠</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">文秉模</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">倪光明</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">沈家仕</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">夏瑞庆</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">马怀柱</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">黄金余</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">丁万鼎</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王　肃</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">刘登义</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">闵永新</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王世华</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">&nbsp;&nbsp; 朱士群 　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">&nbsp;&nbsp;&nbsp; 余淑珍&nbsp; 　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\">王先俊</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"110\" height=\"20\" align=\"middle\" valign=\"center\"></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</table> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</table> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>师大概况</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"jianjie.jsp\">师大简介</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"yange.jsp\">学校沿革</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"curr_leaders.jsp\">现任领导</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"pre_leaders.jsp\">历任领导</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"school_buity.jsp\">校园风光</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"yuanxi.jsp\">院系设置</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"school_map.jsp\">学校地图</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
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
      out.write("\t\t\t\t<li><a href=\"../http://www2.ahnu.edu.cn/home/\" target=\"_blank\" id=\"ahnu\">安徽师范大学</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx\" target=\"_blank\" id=\"tms\">本科生教育</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../http://lib.ahnu.edu.cn/index.asp\" target=\"_blank\" id=\"library\">图书期刊</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p class=\"footnote\">Copyright 2013 Anhui Normal University. All rights reserved.\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
