package org.apache.jsp.shida;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;

public final class yuanxi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<li class=\"about\"><a href=\"../about.jsp\"><span>关于我们</span></a></li>\t\t\t\r\n");
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
      out.write("\t\t\t\t\t\t\t<table  bordercolor=\"#009900\" border=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t<tr align=\"center\"  bordercolor=\"#009900\"> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"150\" height=\"29\"> \r\n");
      out.write("\t\t\t\t\t\t\t<strong>学院</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"140\"> \r\n");
      out.write("\t\t\t\t\t\t\t<strong>系</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"200\"> \r\n");
      out.write("\t\t\t\t\t\t\t<strong>所</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"323\"> \r\n");
      out.write("\t\t\t\t\t\t\t<strong>中心、部</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"STYLE1\" tppabs=\"http://wxy.ahnu.edu.cn/\" href=\"http://wxy.ahnu.edu.cn/\" target=\"_blank\"><a href=\"http://wxy.ahnu.edu.cn/\">文学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>中文系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>语言研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t文学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t古籍整理研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t美育与审美文化研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"http://shixue.ahnu.edu.cn/\" target=\"_blank\">中国诗学研究中心</a>、艺术文化学研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\"><a class=\"STYLE1\" href=\"http://politics.ahnu.edu.cn/\" target=\"_blank\">政治学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">马克思主义哲学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t诠释学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t皖南农村研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t国学研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">教育部高校辅导员培训和研修基地、《高校辅导员学刊》编辑部、安徽省高校人文社科重点研究基地马克思主义研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\"><a class=\"STYLE1\" href=\"http://law.ahnu.edu.cn/\" target=\"_blank\">法学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>公共管理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">知识产权研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t诉讼法研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t当代中国政治发展研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">&nbsp;</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>法律系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\"><a class=\"STYLE1\" href=\"http://ahnujgxy.ahnu.edu.cn/jg.swf\" target=\"_blank\">经济管理学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>经济系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\">经济学研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\">生态经济研究中心　</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>工商管理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>财务会计系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>市场营销系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td><a class=\"STYLE1\" href=\"http://music.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://music.ahnu.edu.cn/\">音乐学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td><a class=\"STYLE1\" href=\"http://msxy.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://210.45.192.19/meishu/index.htm\">美术学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>　</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a href=\"http://social.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://social.ahnu.edu.cn/\"><span class=\"STYLE1\">历史与社会学院</span></a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>历史系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">历史研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t社会学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t徽学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t家谱研究中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t社会调查研究中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t社会发展研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\"><a href=\"http://wannan.ahnu.edu.cn/\" target=\"_blank\">皖南历史文化研究中心</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>社会学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>公共管理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>安徽省社会工作人才培训基地</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\"><a class=\"STYLE1\" href=\"http://edu.ahnu.edu.cn/\" target=\"_blank\">教育科学学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>教育学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\">教育科学研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"4\">学前教育师资培训中心、现代教育技术中心、<a href=\"http://jsggfz.ahnu.edu.cn/\" target=\"_blank\">教育改革与发展研究中心</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>教育技术学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>心理学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>学前教育学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a class=\"STYLE1\" href=\"http://flc.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://flc.ahnu.edu.cn/\">外国语学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>英语系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">外国语言文学研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">公共外语教研部</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>日语系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>俄语系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a href=\"http://ty.ahnu.edu.cn/\" target=\"_blank\"><span class=\"STYLE1\">体育学院</span></a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>体育系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>体育科学研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"http://ty-dxtyb.ahnu.edu.cn/\">大学体育教研部</a></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>社会体育系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\"> \r\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"http://ahtcw.ahnu.edu.cn/ahsirc/index.jsp\" target=\"_blank\">安徽省体育产业研究中心</a></p> \r\n");
      out.write("\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>运动训练系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"5\"><a href=\"http://chm.ahnu.edu.cn/\" target=\"_blank\"><span class=\"STYLE1\">传媒学院</span></a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>新闻系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"5\">视觉传达文化研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t文化产业研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"2\">传媒与文化创意研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>广告系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>摄影系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a href=\"http://jz.ahnu.edu.cn/\" target=\"_blank\">安徽经致科技文化传播有限公司</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>动画系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>文化产业管理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a class=\"STYLE1\" href=\"http://math.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://math.ahnu.edu.cn/\">数学计算机科学学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>数学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">数学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t数学教育研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t计算机科学与技术研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t瑞信软件研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">网络与信息安全工程技术研究中心、高性能计算研究中心、教学实验中心、省级计算机基础课实验教学示范中心、科研实验中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>计算机科学与技术系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>统计系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a class=\"STYLE1\" href=\"http://physics.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://physics.ahnu.edu.cn/\">物理与电子信息学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>物理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">物理研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">　</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>电子信息工程系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>通信工程系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a href=\"http://chem.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://chem.ahnu.edu.cn/\"><span class=\"STYLE1\">化学与材料科学学院</span></a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>化学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">有机化学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t分析化学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t材料化学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t应用化学研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t化学教育研究所</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">　</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>应用化学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>材料化学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"6\"><a href=\"http://tourism.ahnu.edu.cn/\" target=\"_blank\"><span class=\"STYLE1\">国土资源与旅游学院</span></a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>地理系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"6\">江淮流域气候变化与水资源研究中心、安徽师范大学土地评价与规划研究中心、安徽师范大学旅游发展与规划研究中心、安徽师范大学城市与区域规划研究中心、安徽师范大学酒店管理研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"6\">安徽师范大学旅游发展与规划省级人文社会科学重点研究基地、中等职业学校骨干教师省级培训基地、资源环境与地理信息工程安徽省工程技术研究中心、安徽省自然灾害过程与防控研究省级实验室、安徽省地理学会</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>旅游系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>饭店系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>土地系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>地理信息系统系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>城市规划系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"5\"><a class=\"STYLE1\" href=\"http://biology.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://biology.ahnu.edu.cn/\">生命科学学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>生物科学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"5\">生物多样性研究中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t分子生物学及生物技术研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t园艺研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t中药资源研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t生物信息研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t生物资源开发与利用研究中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t野生动植物种及其产品鉴定中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t饵料生物繁育研究中心</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"5\">安徽重要生物资源保护与利用研究省级重点实验室、生物环境与生态安全安徽省高校省级重点实验室、安徽省生物标本数字化科技创新服务平台、安徽省中药日化产品工程技术研究中心、安徽省植物学会</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>生物技术系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>生态学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>园艺系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>应用生物科学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\"><a class=\"STYLE1\" href=\"http://envirsci.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://210.45.192.19/huanjing/index.htm\">环境科学与工程学院</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td>环境科学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">环境科学研究中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t(承接建设项目环境影响评价)<br /> \r\n");
      out.write("\t\t\t\t\t\t\t分析测试中心<br /> \r\n");
      out.write("\t\t\t\t\t\t\t(承担分析测试)<br /> \r\n");
      out.write("\t\t\t\t\t\t\t环境工程研究所<br /> \r\n");
      out.write("\t\t\t\t\t\t\t(承接清洁生产审核)。</td> \r\n");
      out.write("\t\t\t\t\t\t\t<td rowspan=\"3\">安徽绿研环境科技有限公司</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>环境工程系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td>食品科学系</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t<td noWrap><a class=\"STYLE1\" href=\"http://cie.ahnu.edu.cn/\" target=\"_blank\" tppabs=\"http://cie.ahnu.edu.cn/\">国际教育学院(外事办公室)</a></td> \r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\">&nbsp;</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
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
      out.write("\t\t\t\t\t\t\t\t   </li>\r\n");
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
