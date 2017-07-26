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
<title>籽匠猫-销售回复消息管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-销售回复消息管理">
<meta http-equiv="description" content="籽匠猫-销售回复消息管理">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<script type="text/javascript" src="pcadmin/designer/js/upd_dialogue.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css" />
<link rel="stylesheet" href="pcadmin/community/css/show_post.css" />
</head>

<body>
	<div class="error_mask error_opacity none"></div>
	<div class="error_content none">
		<div style="height: 36px;">
			<img src="pcadmin/community/images/close.png"
				style="position:absolute;right: 10px;cursor: pointer;" class="close" />
		</div>
		<div class="contentdiv"></div>
	</div>
	<div id="show_post_div">
		<div style="margin:0px auto;width: 400px;margin-top: 20px;">
			<!-- <h1>待审核拍客列表</h1> -->
			<div class="listpaike">
				<span class="current" data-sh="0">待回复消息</span> 
				<span data-sh="1">已回复消息</span>
			</div>
			<div class="clear"></div>
		</div>
		<table width="100%" class="title_table" style="table-layout: fixed;">
			<tr height="32px" align="center" bgcolor="#ccc">
				<td width="10%" class="td-title">头像</td>
				<td width="10%" class="td-title">ip</td>
				<td width="15%" class="td-title">ip所属地区</td>
				<td width="20%" class="td-title">用户问题</td>
				<td width="10%" class="td-title">发送时间</td>
				<td width="5%" class="td-title">操作</td>
			</tr>
		</table>
		<!-- <div class="youjian-div none">
		   	<span class="upd-span">通过审核</span>
		   	<span class="upd-span">审核不通过</span>
		   	<span class="jia" data-sj="1"></span>
		</div> -->

		<table width="100%" id="tabledata" >
		</table>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$('.close').on('click', function() {
			$('.error_mask,.error_content').hide();
		});
	});
</script>
</html>