<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="link_login" class="com.sql.link_SqlServer"
	scope="session"></jsp:useBean>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>顾客注册</title>
	</head>

	<body>
		<SCRIPT src="regist/pswdplc.js"></SCRIPT>
		<script type="text/javascript">  
		  function agree(){
       if(document.getElementById('cb').checked)
              document.getElementById('tj').disabled=false;
    else
        document.getElementById('tj').disabled='disabled';  
  }  
      function reImg(){  
          var img = document.getElementById("Img");  
           img.src = "image.jsp";  
        }  
    </script>
		<script language="JavaScript">
		var flag_name = 0;
		var flag_pwd = 0;
		var flag_repwd = 0;
		
function check_name() {
	if (isWhiteWpace(form1.cus_nickname.value)) {
		document.getElementById("nameErr").innerHTML = "<font color='red'>请输入正确的昵称，昵称里不能含有空格</font>";
		return false;
	}
	if (form1.cus_nickname.value == "") {
		document.getElementById("nameErr").innerHTML = "<font color='red'>请输入昵称，姓名不能为空！</font>";
		return false;
	}
	
	link_sql.check_name(form1.cus_nickname.value);
	if(link_login.msg==1)
	{ 
		document.getElementById("nameErr").innerHTML = "<font color='red'>该昵称已被注册，请更混注册昵称！</font>";;
		return false;
	}
	
	document.getElementById("nameErr").innerHTML = "";
	flag_name = 1;
	return true;
}
function isWhiteWpace(s) {
	var whitespace = "\t\n\r";
	var i;
	for (i = 0; i < s.length; i++) {
		var c = s.charAt(i);
		if (whitespace.indexOf(c) >= 0) {
			return true;
		}
	}
	return false;
}



function check_pwd() {
	if (form1.cus_pwd.value.length < 6 || form1.cus_pwd.value.length > 16) {
		document.getElementById("pwdErr").innerHTML = "<font color='red'>请输入位数为6-16的密码</font>";
		return false;
	}
	document.getElementById("pwdErr").innerHTML = "";
	flag_pwd = 1;
	return true;
}
function check_repwd() {
	if (form1.cus_pwd.value != form1.cus_repwd.value) {
		document.getElementById("repwdErr").innerHTML = "<font color='red'>确认密码与原密码不同！</font>";
		return false;
	}
	document.getElementById("repwdErr").innerHTML = "";
	flag_repwd = 1;
	return true;
}


function check() {
	if (flag_name == 0) 
	{alert("姓名填写有误，请重新填写！");} 
	else {  if (flag_pwd == 0) {alert("密码填写有误，请重新填写！");} 
	        else { if (flag_repwd == 0) { alert("确认密码填写有误，请重新填写！");} 
						
			}
		}
				            
}


		</script>


		<script type="text/javascript">
var mh = 30;//最小高度
var step = 10;//每次变化的px量
var ms = 0;//每隔多久循环一次
function toggle(o){
  if (!o.tid)o.tid = "_" + Math.random() * 100;
  if (!window.toggler)window.toggler = {};
  if (!window.toggler[o.tid]){
    window.toggler[o.tid]={
      obj:o,
      maxHeight:o.offsetHeight,
      minHeight:mh,
      timer:null,
      action:1
    };
  }
  o.style.height = o.offsetHeight + "px";
  if (window.toggler[o.tid].timer)clearTimeout(window.toggler[o.tid].timer);
  window.toggler[o.tid].action *= -1;
  window.toggler[o.tid].timer = setTimeout("anim('"+o.tid+"')",ms );
}
function anim(id){
  var t = window.toggler[id];
  var o = window.toggler[id].obj;
  if (t.action < 0){
    if (o.offsetHeight <= t.minHeight){
      clearTimeout(t.timer);
      return;
    }
  }
  else{
    if (o.offsetHeight >= t.maxHeight){
      clearTimeout(t.timer);
      return;
    }
  }
  o.style.height = (parseInt(o.style.height, 10) + t.action * step) + "px";
  window.toggler[id].timer = setTimeout("anim('"+id+"')",ms );
}
</script>
		<style type="text/css">
div.xx {
	border: solid 1px;
	overflow: hidden;
	width: 350px;
	overflow: hidden;
}

div.xx h5 {
	border: solid 1px;
	border-width: 0 0 1px;
	padding: 0;
	margin: 1;
	height: 31px;
	line-height: 30px;
	cursor: pointer;
	background: #eee;
}
</style>

		<form name="form1" action="regist/cus_regist_deal.jsp" method="post">
			<table align="center" border=0 width="550" class=a2>
				<tr>
					<td width="100px" align="center">
						会员昵称
					</td>
					<td>
						<input type="text" name="cus_nickname" style="width: 200px"
							onblur="check_name()" />
						<span id="nameErr"></span>
					</td>
				</tr>
				<tr height="10px">
					<td></td>
					<td></td>
				<tr>
				<tr class=a3>
					<td width="100px" align="center">
						登录密码
					</td>
					<td>
						<input type="password" name="cus_pwd" size="40" minlength="6"
							maxLength="16" style="width: 200px" onkeyup=EvalPwd(this.value);
							onchange=EvalPwd(this.value); onblur="check_pwd()" />
						<span id="pwdErr"></span>
					</td>
				</tr>
				<tr class=a3>
					<td align="center"></td>
					<td>
						<table border="0" width="208" cellspacing="0" cellpadding="2">
							<tr height="1px">
								<td id=iWeak align="center" bgcolor="#f1f1f1"
									style="COLOR: #adadad; BORDER-RIGHT: #dedede 0px solid">
									<font size="-1"><b>弱</b> </font>
								</td>
								<td id=iMedium align="center" bgcolor="#f1f1f1"
									style="COLOR: #adadad; BORDER-RIGHT: #dedede 0px solid">
									<font size="-1"><b>中</b> </font>
								</td>
								<td id=iStrong align="center" bgcolor="#f1f1f1"
									style="COLOR: #adadad;">
									<font size="-1"><b>强</b> </font>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				
				 
				<tr height="10px">
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td width="100px" align="center">
						确认密码
					</td>
					<td>
						<input type="password" name="cus_repwd" style="width: 200px"
							onblur="check_repwd()" />
						<span id="repwdErr"></span>
					</td>
				</tr>
				<tr height="5px">
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td width="100px" align="center">
						验证码
					</td>
					<td>
						<input type="text" name=rand maxlength=4 value=""
							style="width: 80px">
						<img border=0 src="regist/image.jsp" alt="验证码" />
					</td>
				</tr>

				<!-- <img height="20px" border=0 src="image.jsp" alt="验证码"> 
 <img id="Img" src="Img" alt="验证码"  />  
   <a href="#" onclick="reImg();">看不清，换一张</a>  
 -->


				<tr height="30px">
					<td></td>
					<td></td>
				<tr>
					<!--  				<tr>
					<td align="right"></td>
					<td align="left">
						<input type="checkbox" name="isagreen" onclick="agree();" id="cb" />同意相关协议
					</td>
				</tr>
-->
				<tr height="30px">

					<td align="left" colspan=2>
						<div class="xx">
							<h5 onclick="toggle(this.parentNode)">
								<input type="checkbox" name="isagreen" onclick="agree();"
									id="cb" />
								同意相关协议
							</h5>
							<div style="overflow: auto; height: 150px">
								本协议由您与淘宝平台的经营者共同缔结，本协议具有合同效力。
								淘宝平台经营者是指法律认可的经营该平台网站的责任主体，有关淘宝平台经营者的信息请查看各家淘宝平台首页底部公布的公司信息和证照信息。本协议中各家淘宝平台的经营者可单称或统称为“淘宝”。“淘宝平台”指由淘宝运营的网络平台，包括但不限于淘宝网，域名为
								taobao.com；天猫，域名为tmall.com；一淘网，域名为etao.com；聚划算，域名为ju.taobao.com。

								一、 协议内容及签署
								1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。
								2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。
								3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。
								4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。


								一、 协议内容及签署
								1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。
								2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。
								3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。
								4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。
								一、 协议内容及签署
								1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。
								2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。
								3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。
								4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。
								一、 协议内容及签署
								1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。
								2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。
								3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。
								4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。
								一、 协议内容及签署
								1、本协议内容包括协议正文及所有淘宝已经发布的或将来可能发布的各类规则。所有规则为本协议不可分割的组成部分，与协议正文具有同等法律效力。除另行明确声明外，任何淘宝及其关联公司提供的服务（以下称为淘宝平台服务）均受本协议约束。
								2.您应当在使用淘宝平台服务之前认真阅读全部协议内容，对于协议中以加粗字体显示的内容，您应重点阅读。如您对协议有任何疑问的，应向淘宝咨询。但无论您事实上是否在使用淘宝平台服务之前认真阅读了本协议内容，只要您使用淘宝平台服务，则本协议即对您产生约束，届时您不应以未阅读本协议的内容或者未获得淘宝对您问询的解答等理由，主张本协议无效，或要求撤销本协议。
								3.您承诺接受并遵守本协议的约定。如果您不同意本协议的约定，您应立即停止注册/激活程序或停止使用淘宝平台服务。
								4.淘宝有权根据需要不时地制订、修改本协议及/或各类规则，并以网站公示的方式进行公告，不再单独通知您。变更后的协议和规则一经在网站公布后，立即自动生效。如您不同意相关变更，应当立即停止使用淘宝平台服务。您继续使用淘宝平台服务的，即表示您接受经修订的协议和规则。

							</div>

						</div>
					</td>
				<tr height="30px">
					<td></td>
					<td></td>
				<tr>
					<td></td>
					<td align="left">
						<input type="submit"
							" style="width: 50px; height: 25px; background: #0CF; font-size: 16px"
							value="注册" onclick="check()" disabled="disabled" id="tj" />
						&nbsp;&nbsp;&nbsp;
						<input type="reset"
							style="width: 50px; height: 25px; background: #0CF; font-size: 16px"
							value="重置" />
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>
