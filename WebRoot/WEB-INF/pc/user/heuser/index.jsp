<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>籽匠猫-他的主页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-他的主页">
<meta http-equiv="description" content="籽匠猫-他的主页">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script src="pc/user/js/jquery.min.js"></script>
<script type="text/javascript">
if(top.location!=self.location){
	top.location = self.location;
}
</script>
<link href="pc/user/css/common.min.css" rel="stylesheet">
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
.levelh4 {
	color: #ffb267 !important;
}
</style>
</head>

<body>
	<div class="Wrap">
		<jsp:include page="../../top.jsp">
			<jsp:param value="8" name="pageName" />
		</jsp:include>

		<!--我的主页-->
		<div class="ierhua_cr">
			<div class="w1200">
				<div class="ierhua">
					<ul>
						<li><a href="javascript:void(0);">商城会员中心</a></li>
						<li><a href="javascript:void(0);" class="ierhua_hiv">个人中心</a></li>
					</ul>
				</div>
			</div>
		</div>
		<main class="Cb RR_TE">
		<p class="Bread Hide">
			<a class="First" target="_self" href="to-community-community_home">
				杍匠社区 <s></s>
			</a><span>他的主页<u></u><s></s></span>
		</p>

		<!-- 侧边栏 -->
		<div id="Member_Top">
			<a class="Avatar"><img src="/static_img/head/${home.user.head}"></a>
			<h1>
				<span>${home.user.name}</span><i class="${home.container.sex=='0'?'Female':home.container.sex=='1'?'Male':'0'}"></i>
			</h1>
			<h4 class="levelh4">LV${home.container.lel}.${home.container.grade}</h4>
			<h4 class="signstr">${home.container.signature}</h4>
			<p class="MT10">
				<button onclick="goFollowZhuYe('${home.user.uid}',${home.isGz});">${home.isGz==1?'已关注':'+ 关注'}</button>
			</p>
		</div>
		<!--侧边栏开始--> <aside class="Fl">
		<ul class="Box Cb Count" id="Member_Count">
			<li><a target="bb" href="to-user-heuser-follow"><b
					class="followCount">${home.follow}</b><span>关注</span></a></li>
			<li><a target="bb" href="to-user-heuser-fans"><b
					class="fansCount">${home.fans}</b><span>粉丝</span></a></li>
			<li><a target="bb" href="to-user-heuser-visitor"><b
					class="visitorCount">${home.visitor}</b><span>访客</span></a></li>
		</ul>
		<nav class="Box Member" name="Myself"> <a class="index S"
			data-tab="1" target="bb" href="to-user-heuser-home"><i></i>他的主页</a> <a
			class="info " data-tab="2" target="bb" href="to-user-heuser-hedata"><i></i>他的资料</a>
		<a class="fav " data-tab="3" target="bb" href="to-user-heuser-hepost"><i></i>他的拍客
			<input type="hidden" value="${home.user.uid}" class="useruid"/>
			<input type="hidden" value="${home.user.name}" class="username"/>
			<input type="hidden" value="${home.container.number}" class="maobi"/>
			<input type="hidden" value="Lv${home.container.lel}.${home.container.grade}" class="levl"/>
			<input type="hidden" value="${home.container.sex}" class="sex"/>
			<input type="hidden" value="${home.container.day}" class="day"/>
			<input type="hidden" value="${home.container.sheng}-${home.container.shi}" class="sheng"/>
			<input type="hidden" value="${home.container.signature}" class="signature"/>
		</a>
		<a class="hajj " data-tab="3" target="bb" href="to-user-heuser-hesun"><i></i>他的晒家</a></nav></aside>
		<!--侧边栏结束--> 
		<!-- 侧边栏 -->


		<div class="Right" style="margin-bottom: 50px;">
			<iframe id="iframe" name="bb" frameborder="0"
				 width="100%" height="100%"
				src="to-user-heuser-home" onLoad="iFrameHeight()"></iframe>
				<script type="text/javascript">
				function iFrameHeight() {
					var ifm = document.getElementById("iframe");
					var subWeb = document.frames ? document.frames["iframe"].document
							: ifm.contentDocument;
					if (ifm != null && subWeb != null) {
						ifm.height = subWeb.body.scrollHeight;
					}
				}
			</script>
		</div>
		</main>
	</div>
	<!-- BEGIN FOOTER -->

	<jsp:include page="../../bottom.jsp" />
</body>
<script type="text/javascript">
$(function() {
	//loadFun();
	$('.Member a').on('click',function(){
		$(this).siblings().removeClass('S');
		$(this).addClass('S');
	});
	$('.Count a').on('click',function(){
		$('.Member a').removeClass('S');
	});
});
function loadFun() {
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getUserHomeData',
		data : {
			heuid : '${luckyParam}'
		},
		success : function(re) {
			$('.signstr').text(re.sign==null?'':re.sign);
			$('.followCount').text(re.follow);
			$('.fansCount').text(re.fans);
			$('.visitorCount').text(re.visitor);
			$('.messageCount').text(re.message);
		},
		error : function(re) {
			alert(re.status);
		}
	});
}
function goFollowZhuYe(heuid,gz){
	if(gz === 0){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'addFollowData',
			data : {'follow.uid':heuid},
			success : function(re){
				if(re.status === 200){
					location.reload();
				}else if(re.status === 404){
					location.href = re.url;
				}else{
					alert(re.msg);
				}
			},error : function(re){
				alert(re.status);
			}
		});
	}
}
</script>
</html>
