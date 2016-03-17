package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.awt.*;

public final class announcement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>最新公告 - 校园二手交易平台</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/indexstyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
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
      out.write("        \t<li class=\"home\" style=\"top: 0px; left: 50px;\"><a href=\"index.jsp\"><span>网站首页</span></a></li>\r\n");
      out.write("       \t    <li class=\"mybuy\"><a href=\"mybuy.jsp?type=0\"><span>我的宝贝</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"mysell\"><a href=\"zz_tuijian.jsp\"><span>站长推荐</span></a></li>\r\n");
      out.write("            <li class=\"announcement current\"><a href=\"announcement.jsp\"><span>最新公告</span></a></li>\r\n");
      out.write("            <li class=\"question\"><a href=\"shida.jsp\"><span>魅力师大</span></a></li>\r\n");
      out.write("\t\t\t<li class=\"about\"><a href=\"about.jsp\"><span>关于我们</span></a></li>\t\t\t\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div>\r\n");
      out.write("\t<div id=\"background\">\r\n");
      out.write("\t\t<div id=\"templatemo_search\">\r\n");
      out.write("\t\t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"Search\" name=\"keyword\" id=\"keyword\"\r\n");
      out.write("\t\t\t\t\ttitle=\"keyword\" onfocus=\"clearText(this)\"\r\n");
      out.write("\t\t\t\t\tonblur=\"clearText(this)\" class=\"txt_field\" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\"\r\n");
      out.write("\t\t\t\t\tid=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"article\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2><a href=\"blog.jsp\">安徽师范大学</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t安徽师范大学是安徽建校最早的高等学府。学校坐落在具有“徽风皖韵、千湖之城”美誉的国家级开放城市——芜湖，濒临浩瀚长江，傍依灵秀赭山，是一所集江南自然之神秀、汇安徽人文之灵杰的省属重点大学。\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t在十九世纪末清代敬敷书院和二十世纪初创办的安徽大学堂基础上，学校的前身——省立安徽大学于1928年创建于当时的安徽省府安庆市。1946年，省立安徽大学更名为国立安徽大学，时有“于京沪一带，仅次于上海同济大学”之誉。1949年，国立安徽大学成建制迁至芜湖，并与当时的安徽学院合并成立新的安徽大学。1950至1952年，学校部分系先后调整并入到南京大学、复旦大学、浙江大学、华东政法学院等高校，安徽师专于1952年并入我校。1954年，安徽大学的师范学院和农学院分别建院，本部改名为安徽师范学院。1958年，安徽省委决定，将安徽师范学院的部分文科系(科)调整到合肥，建立合肥师范学院；同时将物理系部分师生调入新建的合肥大学(后改名为安徽大学)。1960年，安徽师范学院更名为皖南大学，刘少奇同志题写了校名。1968年，皖南大学更名为安徽工农大学。1970年，合肥师范学院撤消，大部分系(科)迁回安徽工农大学。1972年，经国务院批准，学校正式定名为安徽师范大学，郭沫若同志题写了校名。2005年，芜湖师范专科学校整体并入安徽师范大学。\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t在近80年的办学历程中，刘文典、周建人、郁达夫、苏雪林、陈望道、朱湘、朱光潜等一大批知名的专家学者、社会贤达先后汇聚在菱湖之畔、镜湖之滨，著书立说，弘文励教。经过一代代师大人潜心耕耘、励志践行、培育后学、薪火相继、言传身教，砥砺出“厚重朴实、至善致远、追求卓越、自强不息”的精神，积淀出“严谨治学、敬业奉献、教书育人、为人师表”的教风，培育出“勤学慎思、质朴谦逊、知行合一、求实求新”的学风，凝炼出“厚德、重教、博学、笃行”的校训。\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>最新消息</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"kaidiantongzhi.jsp\">开店通知</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"dianpuzhuce.jsp\">店铺注册须知</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"jiaohuanxuzhi.jsp\">关于二手物品交换须知</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"gengxintongzhi.jsp\">系统更新升级通知</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"wentijieda.jsp\">交易问题解答</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>文档文件</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"gukeshouce.jsp\">顾客手册</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"wangzhanzhinan.jsp\">网站指南</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"zhuanliwenjian.jsp\">专利文件</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"xuexiaopiwen.jsp\">学校批文</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"wangzhangaisu.jsp\">网站概述</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
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
