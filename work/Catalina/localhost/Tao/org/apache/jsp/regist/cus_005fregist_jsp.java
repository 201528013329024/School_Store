package org.apache.jsp.regist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class cus_005fregist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.sql.link_SqlServer link_login = null;
      synchronized (session) {
        link_login = (com.sql.link_SqlServer) _jspx_page_context.getAttribute("link_login", PageContext.SESSION_SCOPE);
        if (link_login == null){
          link_login = new com.sql.link_SqlServer();
          _jspx_page_context.setAttribute("link_login", link_login, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>顾客注册</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<SCRIPT src=\"regist/pswdplc.js\"></SCRIPT>\r\n");
      out.write("\t\t<script type=\"text/javascript\">  \r\n");
      out.write("\t\t  function agree(){\r\n");
      out.write("       if(document.getElementById('cb').checked)\r\n");
      out.write("              document.getElementById('tj').disabled=false;\r\n");
      out.write("    else\r\n");
      out.write("        document.getElementById('tj').disabled='disabled';  \r\n");
      out.write("  }  \r\n");
      out.write("      function reImg(){  \r\n");
      out.write("          var img = document.getElementById(\"Img\");  \r\n");
      out.write("           img.src = \"image.jsp\";  \r\n");
      out.write("        }  \r\n");
      out.write("    </script>\r\n");
      out.write("\t\t<script language=\"JavaScript\">\r\n");
      out.write("\t\tvar flag_name = 0;\r\n");
      out.write("\t\tvar flag_pwd = 0;\r\n");
      out.write("\t\tvar flag_repwd = 0;\r\n");
      out.write("\t\t\r\n");
      out.write("function check_name() {\r\n");
      out.write("\tif (isWhiteWpace(form1.cus_nickname.value)) {\r\n");
      out.write("\t\tdocument.getElementById(\"nameErr\").innerHTML = \"<font color='red'>请输入正确的昵称，昵称里不能含有空格</font>\";\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif (form1.cus_nickname.value == \"\") {\r\n");
      out.write("\t\tdocument.getElementById(\"nameErr\").innerHTML = \"<font color='red'>请输入昵称，姓名不能为空！</font>\";\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tlink_sql.check_name(form1.cus_nickname.value);\r\n");
      out.write("\tif(link_login.msg==1)\r\n");
      out.write("\t{ \r\n");
      out.write("\t\tdocument.getElementById(\"nameErr\").innerHTML = \"<font color='red'>该昵称已被注册，请更混注册昵称！</font>\";;\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.getElementById(\"nameErr\").innerHTML = \"\";\r\n");
      out.write("\tflag_name = 1;\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function isWhiteWpace(s) {\r\n");
      out.write("\tvar whitespace = \"\\t\\n\\r\";\r\n");
      out.write("\tvar i;\r\n");
      out.write("\tfor (i = 0; i < s.length; i++) {\r\n");
      out.write("\t\tvar c = s.charAt(i);\r\n");
      out.write("\t\tif (whitespace.indexOf(c) >= 0) {\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function check_pwd() {\r\n");
      out.write("\tif (form1.cus_pwd.value.length < 6 || form1.cus_pwd.value.length > 16) {\r\n");
      out.write("\t\tdocument.getElementById(\"pwdErr\").innerHTML = \"<font color='red'>请输入位数为6-16的密码</font>\";\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"pwdErr\").innerHTML = \"\";\r\n");
      out.write("\tflag_pwd = 1;\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function check_repwd() {\r\n");
      out.write("\tif (form1.cus_pwd.value != form1.cus_repwd.value) {\r\n");
      out.write("\t\tdocument.getElementById(\"repwdErr\").innerHTML = \"<font color='red'>确认密码与原密码不同！</font>\";\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"repwdErr\").innerHTML = \"\";\r\n");
      out.write("\tflag_repwd = 1;\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function check() {\r\n");
      out.write("\tif (flag_name == 0) \r\n");
      out.write("\t{alert(\"姓名填写有误，请重新填写！\");} \r\n");
      out.write("\telse {  if (flag_pwd == 0) {alert(\"密码填写有误，请重新填写！\");} \r\n");
      out.write("\t        else { if (flag_repwd == 0) { alert(\"确认密码填写有误，请重新填写！\");} \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t            \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("var mh = 30;//最小高度\r\n");
      out.write("var step = 10;//每次变化的px量\r\n");
      out.write("var ms = 0;//每隔多久循环一次\r\n");
      out.write("function toggle(o){\r\n");
      out.write("  if (!o.tid)o.tid = \"_\" + Math.random() * 100;\r\n");
      out.write("  if (!window.toggler)window.toggler = {};\r\n");
      out.write("  if (!window.toggler[o.tid]){\r\n");
      out.write("    window.toggler[o.tid]={\r\n");
      out.write("      obj:o,\r\n");
      out.write("      maxHeight:o.offsetHeight,\r\n");
      out.write("      minHeight:mh,\r\n");
      out.write("      timer:null,\r\n");
      out.write("      action:1\r\n");
      out.write("    };\r\n");
      out.write("  }\r\n");
      out.write("  o.style.height = o.offsetHeight + \"px\";\r\n");
      out.write("  if (window.toggler[o.tid].timer)clearTimeout(window.toggler[o.tid].timer);\r\n");
      out.write("  window.toggler[o.tid].action *= -1;\r\n");
      out.write("  window.toggler[o.tid].timer = setTimeout(\"anim('\"+o.tid+\"')\",ms );\r\n");
      out.write("}\r\n");
      out.write("function anim(id){\r\n");
      out.write("  var t = window.toggler[id];\r\n");
      out.write("  var o = window.toggler[id].obj;\r\n");
      out.write("  if (t.action < 0){\r\n");
      out.write("    if (o.offsetHeight <= t.minHeight){\r\n");
      out.write("      clearTimeout(t.timer);\r\n");
      out.write("      return;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  else{\r\n");
      out.write("    if (o.offsetHeight >= t.maxHeight){\r\n");
      out.write("      clearTimeout(t.timer);\r\n");
      out.write("      return;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  o.style.height = (parseInt(o.style.height, 10) + t.action * step) + \"px\";\r\n");
      out.write("  window.toggler[id].timer = setTimeout(\"anim('\"+id+\"')\",ms );\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("div.xx {\r\n");
      out.write("\tborder: solid 1px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\twidth: 350px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.xx h5 {\r\n");
      out.write("\tborder: solid 1px;\r\n");
      out.write("\tborder-width: 0 0 1px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 1;\r\n");
      out.write("\theight: 31px;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tbackground: #eee;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t\t<form name=\"form1\" action=\"regist/cus_regist_deal.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<table align=\"center\" border=0 width=\"550\" class=a2>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t会员昵称\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"cus_nickname\" style=\"width: 200px\"\r\n");
      out.write("\t\t\t\t\t\t\tonblur=\"check_name()\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"nameErr\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"10px\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<tr class=a3>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t登录密码\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"cus_pwd\" size=\"40\" minlength=\"6\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxLength=\"16\" style=\"width: 200px\" onkeyup=EvalPwd(this.value);\r\n");
      out.write("\t\t\t\t\t\t\tonchange=EvalPwd(this.value); onblur=\"check_pwd()\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"pwdErr\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=a3>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\"></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" width=\"208\" cellspacing=\"0\" cellpadding=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"1px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=iWeak align=\"center\" bgcolor=\"#f1f1f1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"COLOR: #adadad; BORDER-RIGHT: #dedede 0px solid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"-1\"><b>弱</b> </font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=iMedium align=\"center\" bgcolor=\"#f1f1f1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"COLOR: #adadad; BORDER-RIGHT: #dedede 0px solid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"-1\"><b>中</b> </font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td id=iStrong align=\"center\" bgcolor=\"#f1f1f1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"COLOR: #adadad;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"-1\"><b>强</b> </font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t<tr height=\"10px\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t确认密码\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"cus_repwd\" style=\"width: 200px\"\r\n");
      out.write("\t\t\t\t\t\t\tonblur=\"check_repwd()\" />\r\n");
      out.write("\t\t\t\t\t\t<span id=\"repwdErr\"></span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"5px\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t验证码\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=rand maxlength=4 value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80px\">\r\n");
      out.write("\t\t\t\t\t\t<img border=0 src=\"regist/image.jsp\" alt=\"验证码\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <img height=\"20px\" border=0 src=\"image.jsp\" alt=\"验证码\"> \r\n");
      out.write(" <img id=\"Img\" src=\"Img\" alt=\"验证码\"  />  \r\n");
      out.write("   <a href=\"#\" onclick=\"reImg();\">看不清，换一张</a>  \r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr height=\"30px\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<!--  \t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\"></td>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"isagreen\" onclick=\"agree();\" id=\"cb\" />同意相关协议\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("-->\r\n");
      out.write("\t\t\t\t<tr height=\"30px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td align=\"left\" colspan=2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"xx\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 onclick=\"toggle(this.parentNode)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isagreen\" onclick=\"agree();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"cb\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t同意相关协议\r\n");
      out.write("\t\t\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"overflow: auto; height: 150px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t本协议由您与淘宝平台的经营者共同缔结，本协议具有合同效力。\r\n");
      out.write("\t\t\t\t\t\t\t\t淘宝平台经营者是指法律认可的经营该平台网站的责任主体，有关淘宝平台经营者的信息请查看各家淘宝平台首页底部公布的公司信息和证照信息。本协议中各家淘宝平台的经营者可单称或统称为“淘宝”。“淘宝平台”指由淘宝运营的网络平台，包括但不限于淘宝网，域名为\r\n");
      out.write("\t\t\t\t\t\t\t\ttaobao.com；天猫，域名为tmall.com；一淘网，域名为etao.com；聚划算，域名为ju.taobao.com。\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t一、 协议内容及签署\r\n");
      out.write("\t\t\t\t\t\t\t\t1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。\r\n");
      out.write("\t\t\t\t\t\t\t\t2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。\r\n");
      out.write("\t\t\t\t\t\t\t\t3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。\r\n");
      out.write("\t\t\t\t\t\t\t\t4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t一、 协议内容及签署\r\n");
      out.write("\t\t\t\t\t\t\t\t1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。\r\n");
      out.write("\t\t\t\t\t\t\t\t2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。\r\n");
      out.write("\t\t\t\t\t\t\t\t3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。\r\n");
      out.write("\t\t\t\t\t\t\t\t4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。\r\n");
      out.write("\t\t\t\t\t\t\t\t一、 协议内容及签署\r\n");
      out.write("\t\t\t\t\t\t\t\t1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。\r\n");
      out.write("\t\t\t\t\t\t\t\t2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。\r\n");
      out.write("\t\t\t\t\t\t\t\t3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。\r\n");
      out.write("\t\t\t\t\t\t\t\t4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。\r\n");
      out.write("\t\t\t\t\t\t\t\t一、 协议内容及签署\r\n");
      out.write("\t\t\t\t\t\t\t\t1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。\r\n");
      out.write("\t\t\t\t\t\t\t\t2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。\r\n");
      out.write("\t\t\t\t\t\t\t\t3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。\r\n");
      out.write("\t\t\t\t\t\t\t\t4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。\r\n");
      out.write("\t\t\t\t\t\t\t\t一、 协议内容及签署\r\n");
      out.write("\t\t\t\t\t\t\t\t1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。\r\n");
      out.write("\t\t\t\t\t\t\t\t2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。\r\n");
      out.write("\t\t\t\t\t\t\t\t3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。\r\n");
      out.write("\t\t\t\t\t\t\t\t4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<tr height=\"30px\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\" style=\"width: 50px; height: 25px; background: #0CF; font-size: 16px\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"注册\" onclick=\"check()\" disabled=\"disabled\" id=\"tj\" />\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 50px; height: 25px; background: #0CF; font-size: 16px\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"重置\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
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
