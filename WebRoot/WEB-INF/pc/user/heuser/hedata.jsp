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
<title>籽匠猫-他的资料</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-他的资料">
<meta http-equiv="description" content="籽匠猫-他的资料">
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
			<dl class="Box">
				<dt>账户信息</dt>
				<dd class="member-info">
					<table>
						<tr class="Dn">
							<th>账号</th>
							<td>279277326</td>
						</tr>
						<tr class="Dn">
							<th>用户名</th>
							<td>杍匠丿猫</td>
						</tr>
						<tr>
							<th>用户ID</th>
							<td class="puid">杍匠丿猫</td>
						</tr>
						<tr>
							<th>昵称</th>
							<td class="pname" id="member_info_nickname">杍匠丿猫</td>
						</tr>
					</table>
				</dd>
			</dl>
			<dl class="Box">
				<dt>积分等级</dt>
				<dd class="member-info">
					<table>
						<tr>
							<th>猫币</th>
							<td class="pmaobi">0</td>
						</tr>
						<tr>
							<th>等级</th>
							<td class="plevl">Lv1.幼儿园O粉</td>
						</tr>
					</table>
				</dd>
			</dl>
			<dl class="Box">
				<dt>个人资料</dt>
				<dd class="member-info">
					<table>
						<tr>
							<th>性别</th>
							<td class="psex">保密</td>
						</tr>
						<tr>
							<th>生日</th>
							<td class="pday"></td>
						</tr>
						<tr>
							<th>城市</th>
							<td class="psheng">&nbsp;</td>
						</tr>
						<tr>
							<th>个性签名</th>
							<td class="psignature"></td>
						</tr>
					</table>
				</dd>
			</dl>
		</div>
	</div>
	<script type="text/javascript">
		$("#member_info_btn").click(function() {
			$("#member_info_edit").show();
		});
		$(".dert").click(function() {
			$("#member_info_edit").hide();
		});
	</script>
	<!-- BEGIN FOOTER -->
<script type="text/javascript">
$(function(){
	$('.puid').text(parent.$(".useruid").val());
	$('.pname').text(parent.$(".username").val());
	$('input[name="nickname"]').val(parent.$(".username").val());
	$('.pmaobi').text(parent.$(".maobi").val());
	$('.plevl').text(parent.$(".levl").val());
	$('.psex').text(parent.$(".sex").val()=='1'?'男':'女');
	$('.pday').text(parent.$(".day").val().substring(0,10));
	$('.psheng').text(parent.$(".sheng").val());
	$('.psignature').text(parent.$(".signature").val());
});
</script>
</body>
</html>
