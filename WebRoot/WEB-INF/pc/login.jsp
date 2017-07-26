<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String url = request.getAttribute("url").toString();
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-用户登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-用户登录">
<meta http-equiv="description" content="籽匠猫-用户登录">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/community_user/css/common.min.css" rel="stylesheet">
<script src="pc/js/jquery.min.js"></script>
<script src="pc/community_user/js/jquery.cookie.js"></script>
<script type="text/javascript">
if(top.location!=self.location){
	top.location = self.location;
}
</script>
<link title="default" rel="stylesheet"
	href="pc/community_user/css/enter1.css" />
<link title="blue" rel="stylesheet"
	href="pc/community_user/css/enter2.css" disabled="disabled" />
<link title="brown" rel="stylesheet"
	href="pc/community_user/css/enter3.css" disabled="disabled" />
<!--[if lte IE 8]>
<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
<![endif]-->
<style type="text/css">
.tips {
	display: none;
	margin: 0;
	padding: 0;
	text-align: center;
	font-size: 14px;
	color: #f00;
	line-height: 20px;
	margin-top: 20px;
}

#error_mask {
	height: 100%;
	width: 100%;
	position: fixed;
	_position: absolute;
	top: 0;
	z-index: 1000;
	opacity: 0.1;
	filter: alpha(opacity = 10);
	background-color: #ccc;
}

iframe {
	width: 350px;
	height: 350px;
	position: fixed;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	margin: auto;
	border: 0px;
	z-index: 9999;
}
.none{
	display: none;
}
</style>
</head>
<body id="topBody">
	<div id="error_mask" class="none"></div>
	<iframe class="none iframe" id="iframe" name="iframe"></iframe>
	<div class="enter">
		<div class="header-top top_hui ">
			<div class="head_con top_hui1">
				<!-- <div class="head_con_left fl">
					<div class="head_con_le fl">请选择所在城市</div>
					<div class="head_con_rt fl">深圳</div>
					<div class="cl"></div>
				</div> -->

				<div class="head_con_right fr">
					<!-- <div class="head_con_right1 fl">
						<ul>
							<li><a href="javascript:void(0);"><img
									src="pc/community_user/images/top_qq.png" alt="" /></a></li>
							<li><a href="javascript:void(0);"><img
									src="pc/community_user/images/top_wx.png" alt="" /></a></li>
							<li><a href="javascript:void(0);"><img
									src="pc/community_user/images/top_xl.png" alt="" /></a></li>
						</ul>
					</div> -->
					<!-- <div class="head_con_right2 fl">
						<ul>
							<li><a href="javascript:void(0);">登录</a></li>
							<li><a href="javascript:void(0);">注册</a></li>
							<li><a href="javascript:void(0);">会员中心</a></li>
							<li class="dhuw"><a href="javascript:void(0);"
								class="no_border-right">购物车</a>
								<div class="shu">0</div></li>
						</ul>
					</div> -->
					<div class="cl"></div>
				</div>
			</div>
		</div>
		<div class="jia_ligo zoomIn animated">
			<div class="jia_ligo_top">
				<div class="jia_ligo_top_l fl">
					<div class="jir">
						<ul id="styles">
							<li id="default"><img
								src="pc/community_user/images/clor1.png" alt=""></li>
							<li id="blue"><img src="pc/community_user/images/clor2.png"
								alt=""></li>
							<li id="brown"><img src="pc/community_user/images/clor3.png"
								alt=""></li>
						</ul>
						<div class="cl"></div>
					</div>
				</div>
				<div class="jia_ligo_top_r fr">
					还没账号，<a href="to-register">立即注册</a>
				</div>
				<div class="cl"></div>
				<div class="ia_ligo_logo">
					<img src="pc/community_user/images/ia_ligo_logo.png" alt="">
				</div>
			</div>
			<div class="jia_ligo_bottom">
				<form id="regform" name="regform" action="addUser" method="post"
					accept-charset="utf-8">

					<div class="ligo1">欢迎登录</div>
					<div class="ligo3">
						<ul>
							<li class="ligo3-hover">账号登录</li>
							<li>微信登录</li>
						</ul>
						<div class="cl"></div>
					</div>
					<div class="ligo2">
						<dl>
							<dd>
								<input type="text" name="loginName" id=""
									placeholder="用户名/手机号/邮箱" class="lo1 loginName" />
							</dd>
							<dd>
								<input type="password" name="loginPass" id="" placeholder="密码"
									class="lo1 loginPass" />
								<input type="hidden" id="url" value="<%=url%>"/>
							</dd>

							<dd class="yuedu">
								<label>如登录出现异常,请清理浏览器缓存后再尝试。</label>
								<!-- <label class="fl">
                		<input name="Fruit" type="checkbox" value="" /> 下次自动登录 
                	</label>
                	<a href="javascript:void(0);"  class="wangsj fr">忘记密码？</a> 
                	<div class="cl"></div> -->
							</dd>
							<div id="msgtips" class="tips tips1"></div>
							<!-- <dd >
                  <ul class="dizsanf mae">
                      <li class="dizsanf2"><a href="javascript:void(0);">微博登录</a></li>
                      <li class="dizsanf3"><a href="javascript:void(0);">QQ登录</a></li>
                  </ul>
                  <div class="cl"></div>
                </dd> -->
						</dl>
					</div>
					<div class="ligo2" style="display:none;">
						<div class="wexde">
							<img src="pc/community_user/images/weixj.jpg" alt=""> <span>微信扫码
								&nbsp; &nbsp; 快速登录</span>
						</div>
					</div>
			</div>
			<div class="jia_ligo_tij">
				<input type="button" value="登录" class="btnSubmit1"
					style="cursor: pointer;" />
			</div>

			</form>
		</div>
	</div>
	<script>
		$(document).ready(
				function() {
					$('.loginName').focus();
					$(".ligo3  li").click(
							function() {
								$(".ligo3  li").eq($(this).index()).addClass(
										"ligo3-hover").siblings().removeClass(
										'ligo3-hover');
								$(".ligo2").hide().eq($(this).index()).show();

							});
				});
	</script>
	<script type="text/javascript">
		$("#styles li").click(function() {
			var style = $(this).attr("id");
			$("link[title='" + style + "']").removeAttr("disabled");
			$("link[title!='" + style + "']").attr("disabled", "disabled");
			$.cookie("mystyle", style, {
				expires : 30
			});
			$(this).addClass("cur").siblings().removeClass("cur");
		});
	</script>

	<script type="text/javascript">
		var cookie_style = $.cookie("mystyle");
		if (cookie_style == null) {
			$("link[title='default']").removeAttr("disabled");
			$("#styles li#default").addClass("cur");
		} else {
			$("link[title='" + cookie_style + "']").removeAttr("disabled");
			$("#styles li[id='" + cookie_style + "']").addClass("cur");
		}
	</script>

	<!-- 尾部 -->
	<jsp:include page="bottom.jsp"></jsp:include>
	<!-- 尾部 -->
	<script src="pc/js/Carousel.js"></script>
	<script src="pc/js/login.js"></script>

	<script type="text/javascript">
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();
		});
	</script>
</body>
</html>