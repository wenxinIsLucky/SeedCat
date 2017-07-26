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
<title>籽匠猫-我的钱包</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的钱包">
<meta http-equiv="description" content="籽匠猫-我的钱包">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
</head>

<body>
	<div class="Wrap">
		<div class="Right">
			<!--动态列表开始-->
			<dl class="Box">
				<dt>我的钱包</dt>

				<div class="daijin">
					<div class="dain_tpo">
						代金券<span>注册成功即送200元代金券</span>

					</div>
					<div class="dain_min">
						<a href="javascript:;"><img src="pc/user/images/djin.png" alt=""></a>
						<a href="javascript:;"><img src="pc/user/images/djin.png" alt=""></a>
					</div>
					<div class="din_ba">我的装修贷</div>
					<div class="din_baiud">
						<a href="javascript:void(0);"><img src="pc/user/images/baiudju.png" alt=""><span>点击跳转到百度装修贷</span></a>

					</div>

				</div>
			</dl>
		</div>
		</main>

	</div>
	<!-- BEGIN FOOTER -->
</body>
</html>
