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

		<title>�˿�ע��</title>
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
		document.getElementById("nameErr").innerHTML = "<font color='red'>��������ȷ���ǳƣ��ǳ��ﲻ�ܺ��пո�</font>";
		return false;
	}
	if (form1.cus_nickname.value == "") {
		document.getElementById("nameErr").innerHTML = "<font color='red'>�������ǳƣ���������Ϊ�գ�</font>";
		return false;
	}
	
	link_sql.check_name(form1.cus_nickname.value);
	if(link_login.msg==1)
	{ 
		document.getElementById("nameErr").innerHTML = "<font color='red'>���ǳ��ѱ�ע�ᣬ�����ע���ǳƣ�</font>";;
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
		document.getElementById("pwdErr").innerHTML = "<font color='red'>������λ��Ϊ6-16������</font>";
		return false;
	}
	document.getElementById("pwdErr").innerHTML = "";
	flag_pwd = 1;
	return true;
}
function check_repwd() {
	if (form1.cus_pwd.value != form1.cus_repwd.value) {
		document.getElementById("repwdErr").innerHTML = "<font color='red'>ȷ��������ԭ���벻ͬ��</font>";
		return false;
	}
	document.getElementById("repwdErr").innerHTML = "";
	flag_repwd = 1;
	return true;
}


function check() {
	if (flag_name == 0) 
	{alert("������д������������д��");} 
	else {  if (flag_pwd == 0) {alert("������д������������д��");} 
	        else { if (flag_repwd == 0) { alert("ȷ��������д������������д��");} 
						
			}
		}
				            
}


		</script>


		<script type="text/javascript">
var mh = 30;//��С�߶�
var step = 10;//ÿ�α仯��px��
var ms = 0;//ÿ�����ѭ��һ��
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
						��Ա�ǳ�
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
						��¼����
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
									<font size="-1"><b>��</b> </font>
								</td>
								<td id=iMedium align="center" bgcolor="#f1f1f1"
									style="COLOR: #adadad; BORDER-RIGHT: #dedede 0px solid">
									<font size="-1"><b>��</b> </font>
								</td>
								<td id=iStrong align="center" bgcolor="#f1f1f1"
									style="COLOR: #adadad;">
									<font size="-1"><b>ǿ</b> </font>
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
						ȷ������
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
						��֤��
					</td>
					<td>
						<input type="text" name=rand maxlength=4 value=""
							style="width: 80px">
						<img border=0 src="regist/image.jsp" alt="��֤��" />
					</td>
				</tr>

				<!-- <img height="20px" border=0 src="image.jsp" alt="��֤��"> 
 <img id="Img" src="Img" alt="��֤��"  />  
   <a href="#" onclick="reImg();">�����壬��һ��</a>  
 -->


				<tr height="30px">
					<td></td>
					<td></td>
				<tr>
					<!--  				<tr>
					<td align="right"></td>
					<td align="left">
						<input type="checkbox" name="isagreen" onclick="agree();" id="cb" />ͬ�����Э��
					</td>
				</tr>
-->
				<tr height="30px">

					<td align="left" colspan=2>
						<div class="xx">
							<h5 onclick="toggle(this.parentNode)">
								<input type="checkbox" name="isagreen" onclick="agree();"
									id="cb" />
								ͬ�����Э��
							</h5>
							<div style="overflow: auto; height: 150px">
								��Э���������Ա�ƽ̨�ľ�Ӫ�߹�ͬ�޽ᣬ��Э����к�ͬЧ����
								�Ա�ƽ̨��Ӫ����ָ�����Ͽɵľ�Ӫ��ƽ̨��վ���������壬�й��Ա�ƽ̨��Ӫ�ߵ���Ϣ��鿴�����Ա�ƽ̨��ҳ�ײ������Ĺ�˾��Ϣ��֤����Ϣ����Э���и����Ա�ƽ̨�ľ�Ӫ�߿ɵ��ƻ�ͳ��Ϊ���Ա��������Ա�ƽ̨��ָ���Ա���Ӫ������ƽ̨���������������Ա���������Ϊ
								taobao.com����è������Ϊtmall.com��һ����������Ϊetao.com���ۻ��㣬����Ϊju.taobao.com��

								һ�� Э�����ݼ�ǩ��
								1����Э�����ݰ���Э�����ļ������Ա��Ѿ������Ļ������ܷ����ĸ���������й���Ϊ��Э�鲻�ɷָ����ɲ��֣���Э�����ľ���ͬ�ȷ���Ч������������ȷ�����⣬�κ��Ա����������˾�ṩ�ķ������³�Ϊ�Ա�ƽ̨���񣩾��ܱ�Э��Լ����
								2.��Ӧ����ʹ���Ա�ƽ̨����֮ǰ�����Ķ�ȫ��Э�����ݣ�����Э�����ԼӴ�������ʾ�����ݣ���Ӧ�ص��Ķ���������Э�����κ����ʵģ�Ӧ���Ա���ѯ������������ʵ���Ƿ���ʹ���Ա�ƽ̨����֮ǰ�����Ķ��˱�Э�����ݣ�ֻҪ��ʹ���Ա�ƽ̨������Э�鼴��������Լ������ʱ����Ӧ��δ�Ķ���Э������ݻ���δ����Ա�������ѯ�Ľ������ɣ����ű�Э����Ч����Ҫ������Э�顣
								3.����ŵ���ܲ����ر�Э���Լ�����������ͬ�ⱾЭ���Լ������Ӧ����ֹͣע��/��������ֹͣʹ���Ա�ƽ̨����
								4.�Ա���Ȩ������Ҫ��ʱ���ƶ����޸ı�Э�鼰/�������򣬲�����վ��ʾ�ķ�ʽ���й��棬���ٵ���֪ͨ����������Э��͹���һ������վ�����������Զ���Ч��������ͬ����ر����Ӧ������ֹͣʹ���Ա�ƽ̨����������ʹ���Ա�ƽ̨����ģ�����ʾ�����ܾ��޶���Э��͹���


								һ�� Э�����ݼ�ǩ��
								1����Э�����ݰ���Э�����ļ������Ա��Ѿ������Ļ������ܷ����ĸ���������й���Ϊ��Э�鲻�ɷָ����ɲ��֣���Э�����ľ���ͬ�ȷ���Ч������������ȷ�����⣬�κ��Ա����������˾�ṩ�ķ������³�Ϊ�Ա�ƽ̨���񣩾��ܱ�Э��Լ����
								2.��Ӧ����ʹ���Ա�ƽ̨����֮ǰ�����Ķ�ȫ��Э�����ݣ�����Э�����ԼӴ�������ʾ�����ݣ���Ӧ�ص��Ķ���������Э�����κ����ʵģ�Ӧ���Ա���ѯ������������ʵ���Ƿ���ʹ���Ա�ƽ̨����֮ǰ�����Ķ��˱�Э�����ݣ�ֻҪ��ʹ���Ա�ƽ̨������Э�鼴��������Լ������ʱ����Ӧ��δ�Ķ���Э������ݻ���δ����Ա�������ѯ�Ľ������ɣ����ű�Э����Ч����Ҫ������Э�顣
								3.����ŵ���ܲ����ر�Э���Լ�����������ͬ�ⱾЭ���Լ������Ӧ����ֹͣע��/��������ֹͣʹ���Ա�ƽ̨����
								4.�Ա���Ȩ������Ҫ��ʱ���ƶ����޸ı�Э�鼰/�������򣬲�����վ��ʾ�ķ�ʽ���й��棬���ٵ���֪ͨ����������Э��͹���һ������վ�����������Զ���Ч��������ͬ����ر����Ӧ������ֹͣʹ���Ա�ƽ̨����������ʹ���Ա�ƽ̨����ģ�����ʾ�����ܾ��޶���Э��͹���
								һ�� Э�����ݼ�ǩ��
								1����Э�����ݰ���Э�����ļ������Ա��Ѿ������Ļ������ܷ����ĸ���������й���Ϊ��Э�鲻�ɷָ����ɲ��֣���Э�����ľ���ͬ�ȷ���Ч������������ȷ�����⣬�κ��Ա����������˾�ṩ�ķ������³�Ϊ�Ա�ƽ̨���񣩾��ܱ�Э��Լ����
								2.��Ӧ����ʹ���Ա�ƽ̨����֮ǰ�����Ķ�ȫ��Э�����ݣ�����Э�����ԼӴ�������ʾ�����ݣ���Ӧ�ص��Ķ���������Э�����κ����ʵģ�Ӧ���Ա���ѯ������������ʵ���Ƿ���ʹ���Ա�ƽ̨����֮ǰ�����Ķ��˱�Э�����ݣ�ֻҪ��ʹ���Ա�ƽ̨������Э�鼴��������Լ������ʱ����Ӧ��δ�Ķ���Э������ݻ���δ����Ա�������ѯ�Ľ������ɣ����ű�Э����Ч����Ҫ������Э�顣
								3.����ŵ���ܲ����ر�Э���Լ�����������ͬ�ⱾЭ���Լ������Ӧ����ֹͣע��/��������ֹͣʹ���Ա�ƽ̨����
								4.�Ա���Ȩ������Ҫ��ʱ���ƶ����޸ı�Э�鼰/�������򣬲�����վ��ʾ�ķ�ʽ���й��棬���ٵ���֪ͨ����������Э��͹���һ������վ�����������Զ���Ч��������ͬ����ر����Ӧ������ֹͣʹ���Ա�ƽ̨����������ʹ���Ա�ƽ̨����ģ�����ʾ�����ܾ��޶���Э��͹���
								һ�� Э�����ݼ�ǩ��
								1����Э�����ݰ���Э�����ļ������Ա��Ѿ������Ļ������ܷ����ĸ���������й���Ϊ��Э�鲻�ɷָ����ɲ��֣���Э�����ľ���ͬ�ȷ���Ч������������ȷ�����⣬�κ��Ա����������˾�ṩ�ķ������³�Ϊ�Ա�ƽ̨���񣩾��ܱ�Э��Լ����
								2.��Ӧ����ʹ���Ա�ƽ̨����֮ǰ�����Ķ�ȫ��Э�����ݣ�����Э�����ԼӴ�������ʾ�����ݣ���Ӧ�ص��Ķ���������Э�����κ����ʵģ�Ӧ���Ա���ѯ������������ʵ���Ƿ���ʹ���Ա�ƽ̨����֮ǰ�����Ķ��˱�Э�����ݣ�ֻҪ��ʹ���Ա�ƽ̨������Э�鼴��������Լ������ʱ����Ӧ��δ�Ķ���Э������ݻ���δ����Ա�������ѯ�Ľ������ɣ����ű�Э����Ч����Ҫ������Э�顣
								3.����ŵ���ܲ����ر�Э���Լ�����������ͬ�ⱾЭ���Լ������Ӧ����ֹͣע��/��������ֹͣʹ���Ա�ƽ̨����
								4.�Ա���Ȩ������Ҫ��ʱ���ƶ����޸ı�Э�鼰/�������򣬲�����վ��ʾ�ķ�ʽ���й��棬���ٵ���֪ͨ����������Э��͹���һ������վ�����������Զ���Ч��������ͬ����ر����Ӧ������ֹͣʹ���Ա�ƽ̨����������ʹ���Ա�ƽ̨����ģ�����ʾ�����ܾ��޶���Э��͹���
								һ�� Э�����ݼ�ǩ��
								1����Э�����ݰ���Э�����ļ������Ա��Ѿ������Ļ������ܷ����ĸ���������й���Ϊ��Э�鲻�ɷָ����ɲ��֣���Э�����ľ���ͬ�ȷ���Ч������������ȷ�����⣬�κ��Ա����������˾�ṩ�ķ������³�Ϊ�Ա�ƽ̨���񣩾��ܱ�Э��Լ����
								2.��Ӧ����ʹ���Ա�ƽ̨����֮ǰ�����Ķ�ȫ��Э�����ݣ�����Э�����ԼӴ�������ʾ�����ݣ���Ӧ�ص��Ķ���������Э�����κ����ʵģ�Ӧ���Ա���ѯ������������ʵ���Ƿ���ʹ���Ա�ƽ̨����֮ǰ�����Ķ��˱�Э�����ݣ�ֻҪ��ʹ���Ա�ƽ̨������Э�鼴��������Լ������ʱ����Ӧ��δ�Ķ���Э������ݻ���δ����Ա�������ѯ�Ľ������ɣ����ű�Э����Ч����Ҫ������Э�顣
								3.����ŵ���ܲ����ر�Э���Լ�����������ͬ�ⱾЭ���Լ������Ӧ����ֹͣע��/��������ֹͣʹ���Ա�ƽ̨����
								4.�Ա���Ȩ������Ҫ��ʱ���ƶ����޸ı�Э�鼰/�������򣬲�����վ��ʾ�ķ�ʽ���й��棬���ٵ���֪ͨ����������Э��͹���һ������վ�����������Զ���Ч��������ͬ����ر����Ӧ������ֹͣʹ���Ա�ƽ̨����������ʹ���Ա�ƽ̨����ģ�����ʾ�����ܾ��޶���Э��͹���

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
							value="ע��" onclick="check()" disabled="disabled" id="tj" />
						&nbsp;&nbsp;&nbsp;
						<input type="reset"
							style="width: 50px; height: 25px; background: #0CF; font-size: 16px"
							value="����" />
					</td>
				</tr>
			</table>

		</form>
	</body>
</html>
