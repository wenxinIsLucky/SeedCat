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
<title>籽匠猫-用户注册</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-用户注册">
<meta http-equiv="description" content="籽匠猫-用户注册">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/community_user/css/common.min.css" rel="stylesheet">
<script src="pc/js/jquery.min.js"></script>
<script src="pc/community_user/js/jquery.cookie.js"></script>
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
.ccc {
	background-color: #ccc !important;
}

#register {
	cursor: pointer;
}
/*==========以下部分是Validform必须的===========*/
.Validform_checktip {
	line-height: 20px;
	height: 20px;
	overflow: hidden;
	color: #999;
	font-size: 12px;
	display: block;
	/* float: right; */
	margin-left: 0px;
}

.Validform_right {
	color: #71b83d;
	padding-left: 20px;
	background: url(pc/images/right.png) no-repeat left center;
}

.lucky{
	line-height: 20px;
	height: 20px;
	overflow: hidden;
	color: #999;
	font-size: 12px;
	display: block;
	margin-left: 0px;
}

.lucky_erroe{
	color: red;
	padding-left: 20px;
	white-space: nowrap;
	background: url(pc/images/error.png) no-repeat left center;
}

.lucky_success{
	color: #71b83d;
	padding-left: 20px;
	background: url(pc/images/right.png) no-repeat left center;
}

.Validform_wrong {
	color: red;
	padding-left: 20px;
	white-space: nowrap;
	background: url(pc/images/error.png) no-repeat left center;
}
/* .Validform_loading{
	padding-left:20px;
	background:url(images/onLoad.gif) no-repeat left center;
} */
.Validform_error {
	background-color: #ffe7e7;
}

#Validform_msg {
	color: #7d8289;
	font: 12px/1.5 tahoma, arial, \5b8b\4f53, sans-serif;
	width: 280px;
	-webkit-box-shadow: 2px 2px 3px #aaa;
	-moz-box-shadow: 2px 2px 3px #aaa;
	background: #fff;
	position: absolute;
	top: 0px;
	right: 50px;
	z-index: 99999;
	display: none;
	filter: progid:DXImageTransform.Microsoft.Shadow(Strength=3, Direction=135,
		Color='#999999');
	box-shadow: 2px 2px 0 rgba(0, 0, 0, 0.1);
}

#Validform_msg .iframe {
	position: absolute;
	left: 0px;
	top: -1px;
	z-index: -1;
}

#Validform_msg .Validform_title {
	line-height: 25px;
	height: 25px;
	text-align: left;
	font-weight: bold;
	padding: 0 8px;
	color: #fff;
	position: relative;
	background-color: #999;
	background: -moz-linear-gradient(top, #999, #666 100%);
	background: -webkit-gradient(linear, 0 0, 0 100%, from(#999), to(#666));
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#999999',
		endColorstr='#666666');
}

#Validform_msg a.Validform_close:link,#Validform_msg a.Validform_close:visited
	{
	line-height: 22px;
	position: absolute;
	right: 8px;
	top: 0px;
	color: #fff;
	text-decoration: none;
}

#Validform_msg a.Validform_close:hover {
	color: #ccc;
}

#Validform_msg .Validform_info {
	padding: 8px;
	border: 1px solid #bbb;
	border-top: none;
	text-align: left;
}

.error_msg {
	display: block;
	text-align: center;
	font-size: 14px;
	color: red;
	line-height: 34px;
	margin-top: 10px;
}

.success_msg {
	display: block;
	text-align: center;
	font-size: 14px;
	color: #88DD4B;
	line-height: 34px;
	margin-top: 10px;
}
.none{
	display: none;
}
</style>
</head>
<body id="topBody">
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
					已有账号，<a href="to-login">立即登录</a>
				</div>
				<div class="cl"></div>
				<div class="ia_ligo_logo">
					<img src="pc/community_user/images/ia_ligo_logo.png" alt="">
				</div>
			</div>
			<div class="jia_ligo_bottom">
				<form id="regform" name="regform" action="register" method="post" accept-charset="utf-8">
					<div class="ligo1">欢迎注册</div>
					<div class="ligo3">
						<ul>
							<li class="ligo3-hover">用户注册</li>
							<li>微信注册</li>
						</ul>
						<div class="cl"></div>
					</div>
					<div class="ligo2">
						<dl>
							<dd>
								<input maxlength="11" type="text" name="account" id="" datatype="m" errormsg="请输入正确的手机号码！" placeholder="手机号" class="lo1" />
							</dd>
							<dd>
								<input type="text" name="yzm" id="yzm" placeholder="验证码"
									class="lo2 fl"/><a href="javascript:void(0);"
									class="shoiuji-ipn fr">发验证码到手机</a>
								<div class="cl"></div>
								<span class="lucky lucky_erroe none">请输入验证码</span>
							</dd>
							<dd>
								<input type="password" name="password" placeholder="密码"
									class="lo1" datatype="*8-16" nullmsg="请设置密码！" errormsg="密码范围在8~16位之间！" />
							</dd>
							<dd>
								<input type="password" name="confirm_loginPass" placeholder="确认密码"
									class="lo1" datatype="*" recheck="password" nullmsg="请再输入一次密码！" errormsg="您两次输入的账号密码不一致！"/>
							</dd>
							<!-- <dd>
                    <select name=""  placeholder="身份证类型">
                      <option value="">身份证类型</option>
                      <option value="">身份证类型</option>
                    </select>
                </dd>
                <dd><input type="text" name="" id=""  placeholder="真实姓名" class="lo1" /></dd> -->
							<dd class="yuedu">
								<label><input name="Fruit" type="checkbox" value="" />
									我已阅读并接受 </label><a href="javascript:void(0);">《杍匠猫用户服务协议》</a>
							</dd>
                			<span class="error_msg"></span>
							<span class="success_msg"></span>
							<!-- <dd >
                  <ul class="dizsanf">
                      <li class="dizsanf1">使用第三方帐号：</li>
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
								&nbsp; &nbsp; 快速注册</span>
						</div>
					</div>
			</div>
			<div class="jia_ligo_tij">
				<input type="submit" value="注册" id="register" class="ccc"
					disabled="disabled" />
			</div>

			</form>
		</div>
	</div>
	<script>
		$(document).ready(
				function() {
					$(".ligo3  li").click(
							function() {
								if ($(this).index() === 1) {
									alert("敬请期待!");
									return;
								}
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
		$('input[name="Fruit"]').click(function() {
			if ($(this).attr("checked") === "checked") {
				$('#register').attr('disabled', false);
				$('#register').removeClass('ccc');
				return;
			}
			$('#register').attr('disabled', true);
			$('#register').addClass('ccc');
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
	<script src="pc/js/jquery.form.js"></script>
	<script src="pc/js/Validform_v5.3.2_min.js"></script>
	<script src="pc/js/register-validate.js"></script>
	<script type="text/javascript">
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();
		});
	</script>
</body>
</html>