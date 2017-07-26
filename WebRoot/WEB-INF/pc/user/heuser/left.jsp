<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String currentName = request.getParameter("currentName");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<div id="Member_Top">
		<a class="Avatar"><img src="pc/user/images/58_avatar_big.jpg"></a>
		<h1>
			<span>李了解</span><i class="Female"></i>
		</h1>
		<h4 class="signstr">其实你并不内向，只是不擅长对不亲密的人开朗</h4>
		<p class="MT10">
			<button>+ 关注</button>
		</p>
	</div>
	<!--侧边栏开始-->
	<aside class="Fl">
	<ul class="Box Cb Count" id="Member_Count">
		<li><a target="bb" href="to-user-heuser-follow"><b class="followCount">3</b><span>关注</span></a></li>
		<li><a target="bb" href="to-user-heuser-fans"><b class="fansCount">2</b><span>粉丝</span></a></li>
		<li><a target="bb" href="to-user-heuser-visitor"><b class="visitorCount">2</b><span>访客</span></a></li>
	</ul>
	<nav class="Box Member" name="Myself"> <a class="index S"
		data-tab="1" target="bb" href="to-user-heuser-home"><i></i>他的主页</a>
	<a class="info " data-tab="2" target="bb"
		href="to-user-heuser-hedata"><i></i>他的资料</a> <a class="fav "
		data-tab="3" target="bb" href="to-user-heuser-post"><i></i>他的帖子</a></nav></aside>
	<!--侧边栏结束-->
</body>
<script type="text/javascript">
  	var currentName = '<%=currentName%>';
	$('.Member a').each(function(i, v) {
		if (currentName == "0") {
			$(v).siblings().removeClass('S');
			return;
		}
		if ($(v).attr('data-tab') === currentName) {
			$(v).siblings().removeClass('S');
			$(v).addClass('S');
			return;
		}
	});
	$(function() {
		loadFun();
	})
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
</script>
</html>
