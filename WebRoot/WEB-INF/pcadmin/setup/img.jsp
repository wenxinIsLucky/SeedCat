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
<link href="pcadmin/coltd/css/address.css" rel="stylesheet" />
<script src="pc/js/jquery-2.1.1.min.js"></script>
<script src="pcadmin/setup/js/images.js"></script>
<style type="text/css">
#imageszongdiv{
	width: 100%;
}
.clear{
	clear:both;
}
.imagestopdiv,.imagesbuttomdiv{
	width: 100%;
}
</style>
</head>

<body>
	<div id="imageszongdiv">
		<div id="imagestopdiv">
			<iframe src="admin-setup-uploadImages" id="imgframe" onload="iimgFrameHeight()" width="100%" height="300px"></iframe>
			<script type="text/javascript">
				function iimgFrameHeight() {
					var ifm = document.getElementById("imgframe");
					var subWeb = document.frames ? document.frames["imgframe"].document
							: ifm.contentDocument;
					if (ifm != null && subWeb != null) {
						ifm.height = subWeb.body.scrollHeight;
					}
				}
			</script>
		</div>
		<div class="clear"></div>
		<div id="imagesbuttomdiv">
			<table width="100%" class="title_table">
				<tr height="40px" align="center" bgcolor="#ccc">
					<td width="25%" class="td-title">图片</td>
					<!-- <td width="25%" class="td-title">url</td> -->
					<td width="25%" class="td-title">顺序</td>
					<td width="25%" class="td-title">操作</td>
				</tr>
			</table>
			<table width="100%" class="show_table">
				<tr height="100px" align="center" bgcolor="#fff">
					<td width="25%" class="td-title" data-name="name">
						<img src="/static_img/head/1.jpg"/>
					</td>
					<td width="25%" class="td-title" data-name="phone">
						<input value="135XXXXXXXX"/>
					</td>
					<td width="25%" class="td-title" data-name="address">
						<input id="amount" value="1" style="IME-MODE: disabled; WIDTH: 100px; HEIGHT: 36px" onkeyup="this.value=this.value.replace(/\D/g,'')"  onafterpaste="this.value=this.value.replace(/\D/g,'')" maxlength="3" size="14" name="amount" type="text" />
						<span>顺序越大越最先显示，最大999，最小0</span>
					</td>
					<td width="25%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="1">保存</a>
					</td>
				</tr>
				
				<tr height="100px" align="center" bgcolor="#fff">
					<td width="25%" class="td-title" data-name="name">
						<img src="pc/images/1.jpg"/>
					</td>
					<td width="25%" class="td-title" data-name="phone">
						<input value="135XXXXXXXX"/>
					</td>
					<td width="25%" class="td-title" data-name="address">
						<input id="amount" value="1" style="IME-MODE: disabled; WIDTH: 100px; HEIGHT: 36px" onkeyup="this.value=this.value.replace(/\D/g,'')"  onafterpaste="this.value=this.value.replace(/\D/g,'')" maxlength="3" size="14" name="amount" type="text" />
						<span>顺序越大越最先显示，最大999，最小0</span>
					</td>
					<td width="25%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="1">保存</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
