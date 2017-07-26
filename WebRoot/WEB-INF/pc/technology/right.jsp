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
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<script type="text/javascript" src="pc/technology/js/right.js"></script>
</head>

<body>
	<div class="culture_right fr">
		<div class="culture_banner">
			<a href="javascript:void(0);"><img src="pc/images/cul_banner.jpg"
				alt=""></a>
		</div>

		<div class="result">
			<span>预约免费出效果图</span> <input type="text" name="name" class="yyname tijaid"
				placeholder="您的称呼"> <input type="text" name="phone"
				class="yyphone tijaid" placeholder="您的手机" maxlength="11"> <input type="button"
				name="" value="立即预约" class="tij_sub" style="cursor: pointer;" />
			<div class="tiyan">*只需提交您的个人联系方式即可进行体验</div>
		</div>

		<div class="cia">
			<dl>
				<dt>最新文章</dt>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>
				<dd>
					<a href="javascript:void(0);">● 史上最详细的泥瓦验收标准知识 </a>
				</dd>

			</dl>
		</div>

	</div>
	<div class="cl"></div>
</body>
</html>
