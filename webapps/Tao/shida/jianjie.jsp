<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.text.*" %>
<%@ page language="java" import="java.awt.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>魅力师大 - 校园二手交易平台</title>
	<link rel="stylesheet" type="text/css" href="../css/indexstyle.css">
</head>
<body>
<div id="header">

<div>

	<div id="logo">
    	<a href="index.jsp"><img title="首页" src="../images/logo.png" alt="Logo"></a>       	
    </div>

    <ul>
        <li class="mybuy" style="top: -35px; left: 180px;"><a ><span>
        <font color="#FFFF33" size="3" face="楷体">
        <%
			if (session.getAttribute("name") != null) {
			%><%=session.getAttribute("name")%>会员，欢迎您！<%
						}
					%></font></span>
					</a></li>   
        <li class="mybuy" style="top: -35px; left: 45px;"><a href="../login/login.jsp"><span>
       <font color="#FFFF33" size="3" face="楷体">登陆</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 90px;"><a href="../regist/cus_regist.jsp"><span>
        <font color="#FFFF33" size="3" face="楷体">注册</font></span></a></li>   
        <li class="mybuy" style="top: -35px; left: 655px;"><a><span>
        <font color="#FFFF33" size="3" face="楷体">
<% 
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
	  

         %></font>
        </span></a></li> 
        <li class="home current" style="top: 0px; left: 50px;"><a href="../index.jsp"><span>网站首页</span></a></li>
   	    <li class="mybuy"><a href="../mybuy.jsp?type=0"><span>我的宝贝</span></a></li>
		<li class="mysell"><a href="../zz_tuijian.jsp"><span>站长推荐</span></a></li>
        <li class="announcement"><a href="../announcement.jsp"><span>最新公告</span></a></li>
        <li class="question"><a href="../shida.jsp"><span>魅力师大</span></a></li>
		<li class="about"><a href="../about.jsp"><span>关于我们</span></a></li>			
    </ul>


</div>
		<div>
			<div id="background">
            	<div id="templatemo_search">
            		<form action="#" method="get">
                    	<input type="text" value="Search" name="keyword" id="keyword" title="keyword" onfocus="clearText(this)" onblur="clearText(this)" class="txt_field" />
           		      <input type="submit" name="Search" value="" alt="Search" id="searchbutton" title="Search" class="sub_btn"  />
            		</form>
            	</div>	 
             </div>
		</div>
	</div>
	<div id="body">
		<div>
			<div>
				<div>
					<div>
						<div>
							<div id="article">
								<h2><a href="www.ahnu.edu/cn">安徽师范大学</a></h2>
								<p>
								安徽师范大学是安徽建校最早的高等学府。学校坐落在具有“徽风皖韵、千湖之城”美誉的国家级开放城市——芜湖，濒临浩瀚长江，傍依灵秀赭山，集江南自然之神秀、汇安徽人文之灵杰，是安徽省人民政府与教育部共建的省属重点大学、安徽省委省政府优先建设的综合性大学和安徽省地方高水平大学建设高校。								</p>
								<p>
								学校前身是1928年创建于安庆市的省立安徽大学，1946年更名为国立安徽大学，1949年12月成建制迁至芜湖。后又经历安徽师范学院、合肥师范学院、皖南大学（刘少奇同志题写校名）、安徽工农大学等几个办学阶段。1972年，经国务院批准，正式定名为安徽师范大学（郭沫若同志题写校名）。2005年，芜湖师范专科学校整体并入安徽师范大学。								</p>
								<p>
								在80多年的办学历程中，刘文典、周建人、郁达夫、苏雪林、陈望道、朱湘、朱光潜、王星拱、杨亮功、程演生、陶因、张慰慈、丁绪贤、项南、许杰等一大批知名的专家学者、社会贤达先后汇聚在菱湖之畔、镜湖之滨，著书立说，弘文励教。经过一代代师大人潜心耕耘、励志践行、培育后学、薪火相继、言传身教，砥砺出“厚重朴实、至善致远、追求卓越、自强不息”的精神，积淀出“严谨治学、敬业奉献、教书育人、为人师表”的教风，培育出“勤学慎思、质朴谦逊、知行合一、求实求新”的学风，凝炼出“厚德、重教、博学、笃行”的校训。建校以来，累计为国家培养全日制高等专门人才20万余名。</p>
								<p>
								学校现有文学院、政治学院、法学院、经济管理学院、音乐学院、美术学院、历史与社会学院、教育科学学院、外国语学院、体育学院、传媒学院、数学计算机科学学院、物理与电子信息学院、化学与材料科学学院、国土资源与旅游学院、生命科学学院、环境科学与工程学院等17个学院，以及继续教育学院、国际教育学院，并办有安徽师范大学皖江学院、附中、附小和附幼。</p>
								<p>
								学校学科门类涵盖文学、历史学、哲学、经济学、管理学、法学、教育学、理学、工学、农学、艺术学等，形成了博士——硕士——学士教育等不同层次，全日制高等教育、成人高等教育、留学生教育等不同类型的完整的人才培养体系。现有5个博士学位授权一级学科，45个博士学位授权二级学科，5个博士后流动站，26个硕士学位授权一级学科，128个硕士学位授权二级学科，18个省级重点学科，84个本科专业。有1个教育部人文社会科学重点研究基地，1个教育部重点实验室，3个安徽省高校人文社会科学重点研究基地， 8个省级和省高校重点实验室(中心)，1个省级工程技术研究中心,1个省高校工程技术研究中心，1个省科技创新公共服务平台，2个省级创新团队。</p>	
								<p>
								学校现有教职工2279人，其中专任教师1412人，正高职称350人，副高级职称616人，拥有国家级教学名师1人，国家级教学团队3个，“百千万人才工程”国家级人选6人，教育部“新世纪优秀人才”支持计划7人，“皖江学者”特聘教授5人、讲席教授7人，省学术与技术带头人28人、省学术与技术带头人后备人选47人，5个省级教学团队，10个省级教学名师，12个省级教坛新秀。各类在籍学生37479人，其中，博士研究生187人，硕士研究生4249人，普通本科生21583人，留学生191人，成人本专科生11269人。</p>	
								<p>
								校园占地总面积195.25万平方米，建筑面积79.09万平方米，教学科研仪器设备总值2.57亿元。学校图书馆是全国古籍重点保护单位，藏书丰富，种类齐全，现有图书275.2万册，古籍善本600多种，其中《洪武正韵》为国内唯一全本、元刻明递修《通志》、明嘉靖刻本《李太白全集》、《杜工部集》均为海内珍本，还拥有国内外主要网络资源及数据库，馆藏资源基本实现了数字化。学校办有安徽师范大学出版社，编辑出版《安徽师范大学学报》、《高校辅导员学刊》、《学语文》、《安徽师大报》等多种公开发行的学术期刊和报纸。</p>
								<p>
								学校是全国首批获准招收公费留学生的高校之一，也是国家华文教育基地、安徽省汉语国际推广中心。学校先后接收了30多个国家和地区的长短期进修和学历教育留学生3000多人次，与美国、英国、德国、芬兰、澳大利亚、新西兰、韩国、日本、越南等国家和地区的几十所高等院校、科研机构、学术团体教育机构建立了长期友好合作与学术交流关系，并与澳大利亚查尔斯·达尔文大学、安哥拉独立大学共建了孔子学院。</p>
								<p>
								学校还是教育部高校辅导员培训和研修基地、教育部中小学骨干教师国家级培训基地、国家社会工作专业人才培训基地、安徽省高校师资培训中心、安徽卓越司法人才培养基地、安徽省专业技术人员培训基地、安徽省教育管理干部培训基地、安徽省高中骨干教师培训基地、安徽省旅游中职骨干教师培训基地。</p>
								<p>
								春华秋实，桃李芬芳。为迎接高等教育蓬勃发展带来的机遇和挑战，学校正在围绕“特色鲜明的综合性高水平教学研究型大学”建设目标，在更高的起点上大力实施“质量立校、特色兴校、人才强校、学科领校、开放活校、依法治校、文化荣校”战略，坚持科学发展、内涵发展、和谐发展，不断提高学校的核心竞争力和综合实力，积极为经济社会发展和“美好安徽”建设做出新的更大的贡献。</p>
							
								
								
							</div>
							
							
							
							<div id="sidebar">
								<h4>师大概况</h4>
								<ul>
									<li>
										<a href="jianjie.jsp">师大简介</a>
									</li>
									<li>
										<a href="yange.jsp">学校沿革</a>
									</li>
									<li>
										<a href="curr_leaders.jsp">现任领导</a>
									</li>
									<li>
									<a href="pre_leaders.jsp">历任领导</a>
								   </li>
									<li>
									<li>
										<a href="school_buity.jsp">校园风光</a>
									</li>
									<li>
										<a href="yuanxi.jsp">院系设置</a>
									</li>
										<li>
										<a href="school_map.jsp">学校地图</a>
									</li>
								</ul>
							
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<div id="footer">
	<div>
		<div>
			<h3>联系我们</h3>
				<p>我们的努力，只愿为你创造更丰富的大学生活								 				</p>
		</div>
		<div>
			<h3>友情链接</h3>
			<ul>
				<li><a href="../http://www2.ahnu.edu.cn/home/" target="_blank" id="ahnu">安徽师范大学</a>
				</li>
				<li><a href="../http://tms.ahnu.edu.cn/(yken3aior1po4sjdws3vci45)/default5.aspx" target="_blank" id="tms">本科生教育</a>
				</li>
				<li><a href="../http://lib.ahnu.edu.cn/index.asp" target="_blank" id="library">图书期刊</a>
				</li>
			</ul>
		</div>
	</div>
	<p class="footnote">Copyright 2013 Anhui Normal University. All rights reserved.
	</p>
</div>
</body>
</html>