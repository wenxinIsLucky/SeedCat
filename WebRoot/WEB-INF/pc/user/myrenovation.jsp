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
<title>籽匠猫-我的装修进度</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的装修进度">
<meta http-equiv="description" content="籽匠猫-我的装修进度">
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
				<dt>我的装修进度</dt>
				<div class="zx-poxiu">
					<ul>
						<li><div class="zx-poxiu_left fl">
								<a href="javascript:void(0);">正在装修的房子（1）</a>
							</div>
							<div class="zx-poxiu_right fr">
								<a href="javascript:void(0);">查看进度</a>
							</div>
							<div class="cl"></div></li>
						<li><div class="zx-poxiu_left fl">
								<a href="javascript:void(0);">正在装修的房子（2）</a>
							</div>
							<div class="zx-poxiu_right fr">
								<a href="javascript:void(0);">查看进度</a>
							</div>
							<div class="cl"></div></li>
						<li><div class="zx-poxiu_left fl">
								<a href="javascript:void(0);">正在装修的房子（3）</a>
							</div>
							<div class="zx-poxiu_right fr">
								<a href="javascript:void(0);">查看进度</a>
							</div>
							<div class="cl"></div></li>

					</ul>
				</div>
			</dl>
		</div>
	</div>
	<!-- BEGIN FOOTER -->
</body>
</html>
