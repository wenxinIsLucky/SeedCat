<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-软装定制</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-软装定制">
<meta http-equiv="description" content="籽匠猫-软装定制">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script src="pc/js/lrtk20160517.js"></script>
<script type="text/javascript" src="pc/js/jquery.superslide.2.1.1.js"></script>
<style type="text/css">
#nav {
	width: 116px;
}

#nav ul,li /*这是关键，去掉ul li默认的margin padding 值*/ {
	margin: 0px;
	padding: 0px;
	list-style: none;
}

#nav ul /*这是关键*/ {
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
}

#nav li {
	/* width: 100px; /*每个元素的初始化宽度*/ */
	text-align: center;
	flex: auto; /*这是关键*/
}
</style>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="2" name="pageName"/>
	</jsp:include>
	<div class="title">
		<div class="w1200">
			<div class="ny-title">
				<div class="ny-title-left fl">
					<ul>
						<li class="ny-title-left1"><a href="javascript:void(0)">
								<img src="pc/images/shouye.png" alt="">
						</a></li>
						<li class="ny-title-left2"><a href="javascript:void(0)">家居软装
						</a></li>
						<li class="ny-title-left3"><img src="pc/images/jit.png"
							alt=""></li>
						<li class="ny-title-left4">定制说明</li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="ny-title-right fr">
					<ul>
						<li><a href="to-ruanzhuang-rzCustom">定制流程 </a></li>
						<li><a href="javascript:void(0)" class="tit_hover"> 定制风格
						</a></li>
						<li><a href="to-ruanzhuang-rzCustom_table"> 申请装修表 </a></li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
	</div>
	<div class="softwarp">
		<div class="softSilde">
			<div class="softs-tit">
				<ul>
					<li style="display: block;">
						<div class="softs-tit_top">
							<div class="tit_top_left fl" style="color:${package.rpcolor};">
								${package.rpname}</div>
							<div class="tit_top_right fl"
								style="background-color:${package.rpcolor};">
								<c:forEach items="${package.rz_package_projects}" var="rpp">
							${rpp.rppname} &nbsp;  
						</c:forEach>
							</div>
							<div class="cl"></div>
						</div>
						<div class="softs-tit_bottom">
							<div class="tit_bottom_left fl">
								【软装全套】￥${package.rpprice}.00</div>
							<div class="tit_bottom_right fl"
								style="color:${package.rpcolor};">${package.rpstyle}</div>
							<div class="cl"></div>
						</div>
					</li>
				</ul>
			</div>
			<div class="bd">
				<c:forEach items="${package.rz_package_projects}" var="rpp">
					<ul>
						<li class="dknh" style="border-color:${package.rpcolor};"><img
							src="/static_img/rz_img/${rpp.project_info.rpiimg}" width="1186"
							height="486" style="margin-left: 0px;" alt="" /> <c:forEach
								items="${rpp.project_info.rzInfos}" var="rpi">
								<div class="fdtips"
									style="left: ${rpi.left*2}; top: ${rpi.top*2};">
									<i></i>
									<div class="fdson">
										<a href="javascript:closefdson()" class="closefdson"></a>
										<h3>${rpi.materialName}</h3>
										<p>
											<span style="${empty rpi.model?'display: none;':''}">${rpi.model}</span>数量：${rpi.materialCount}
										</p>
										<p>尺寸：${rpi.materialSize}</p>
										<p>材质：${rpi.material}</p>
									</div>
								</div>
							</c:forEach></li>
					</ul>
				</c:forEach>

			</div>
			<div class="hd">
				<a href="javascript:void(0)" class="next" style="right: 32%"> <a
					href="javascript:void(0)" class="prev" style="left: 32%;"></a></a>
				<ul>
					<c:forEach items="${package.rz_package_projects}" var="rpp">
						<li>${rpp.rppname}</li>
					</c:forEach>
				</ul>
			</div>
			<div class="dinzhi">
				<a href="javascript:void(0)">定制选材</a>
			</div>
		</div>
	</div>
	<div class="w1200">
		<div class="zhuti1">
			<div class="zhuti1_left fl">
				<div class="zhuti1_leti ">设计主题</div>
				<div class="cl"></div>
				<dl class="juk">
					<dt>相关词</dt>
					<dd>
						<div id="nav">
							<ul>
								<c:forEach items="${fn:split(package.tab,',')}" var="t" varStatus="index">
									<li style="color:#${index.index}${index.index*8}${index.index*99};">${t}</li>
								</c:forEach>
							</ul>
						</div>
					</dd>
				</dl>
			</div>
			<div class="zhuti1_right fl">
				<div class="i1_right_le fl">${package.rpname}</div>
				<div class="i1_right_rt fr">【软装全套】￥${package.rpprice}.00</div>
				<div class="cl"></div>
				<div class="i1_right-txt">${package.rpidea}</div>
			</div>
			<div class="cl"></div>
		</div>
		<c:forEach items="${package.rz_package_projects}" var="rpp">
			<div class="zhuti2">
				<div class="zhuti2_left fl">
					<div class="zhuti1_leti ">${rpp.rppname}</div>
					<ul class="zhu1">
						<c:forEach items="${rpp.project_info.rzInfos}" var="rpi">
							<li>
								<div class="zhu1_top">${rpi.materialName}</div>
								<div class="zhu1_bottom">数量：${rpi.materialCount}</div>
							</li>
						</c:forEach>
					</ul>
				</div>
				<div class="zhuti2_right fl">
					<p>${rpp.rppidea}</p>
					<img src="/static_img/rz_img/${rpp.rppimg}" alt="" width="100%">
				</div>
				<div class="cl"></div>
			</div>
		</c:forEach>
	</div>
	<div class="w1200">
		<div class="shouye">
			<div class="dinzhi">
				<a href="pc/rzCustom_table.jsp">申请装修</a>
			</div>
		</div>
	</div>
	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp"/>
	<!-- 尾部 -->
	<script type="text/javascript">
		jQuery(".softSilde").slide({
			effect : "fold",
			autoPlay : false,
			delayTime : 700,
			interTime : 7000
		});
		$(function() {
			$(".softSilde .bd ul li").find(".fdtips i").addClass("addshow");
			$(".fdtips i").hover(function() {
				$(this).next().fadeIn();
			})
			$(".fdtips .closefdson").click(function() {
				$(this).parent().fadeOut();
			})
			$(".fdson").mouseleave(function() {
				$(this).fadeOut();
			})
		})
	</script>
</body>
</html>
