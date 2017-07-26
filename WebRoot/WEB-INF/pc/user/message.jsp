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
<title>籽匠猫-消息通知-评论回复</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-消息通知-评论回复">
<meta http-equiv="description" content="籽匠猫-消息通知-评论回复">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
#lwxfile {
	position: relative;
	bottom: -380px;
}
</style>
</head>

<body>
	<div class="Wrap">
		<jsp:include page="../top.jsp">
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
		<main class="Cb">
		<p class="Bread Hide">
			<a class="First" target="_self" href="to-community-community_home"> 杍匠社区
				<s></s>
			</a><span>消息<u></u><s></s></span><span class="topspan">评论<u></u><s></s></span>
		</p>
		<!--侧边栏开始-->
	  	<aside class="Fl">
	        <nav class="Box Member" name="Myself">
	        	<a class="reply " name="reply" target="_self" href="to-user-index"><img src="pc/user/images/fh.png" style="margin-right: 32px;"/>返回</a>
		        <a class="reply S" data-tab="1" name="reply" target="bb" href="to-user-message_plhf"><i></i>评论回复</a>
		        <a class="praise " data-tab="2" target="bb" href="to-user-message_zan"><i></i>赞</a>
		        <a class="system" data-tab="3" target="bb" href="to-user-message_sys"><i></i>系统消息</a>
	    	</nav>
	  	</aside>
	  <!--侧边栏结束-->
		<!-- 背景 -->
		

		<div class="Right" style="margin-bottom: 50px;">
			<iframe id="message" name="bb" onLoad="iFMrameHeight()"  frameborder="0" width="100%" height="100%" src="to-user-message_plhf"></iframe>
			<script type="text/javascript">
				function iFMrameHeight() {
					var ifm = document.getElementById("message");
					var subWeb = document.frames ? document.frames["message"].document
							: ifm.contentDocument;
					if (ifm != null && subWeb != null) {
						ifm.height = subWeb.body.scrollHeight;
					}
				}
			</script>
		</div>
		</main>
	</div>

	<jsp:include page="../bottom.jsp" />
</body>
<script type="text/javascript">
$(function(){
	$('.Member a').on('click',function(){
		$(this).siblings().removeClass('S');
		$(this).addClass('S');
		$('.topspan').html($(this).text()+"<u></u><s></s>");
	});
});
</script>
</html>
