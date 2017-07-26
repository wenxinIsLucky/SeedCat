<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>籽匠猫-设计师列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/designer/js/show_designer.js"></script>
	<!-- <link rel="stylesheet" href="pc/css/liwenxin2.css" /> -->
	<link rel="stylesheet" href="pcadmin/designer/css/show_designer.css" />

  </head>
  
  <body>
	<div class="error_mask error_opacity none"></div>
  	<div class="error_content none">
		<img class="fd_img" src="" />
  	</div>
	<div id="show_designer_div">
		<table width="100%" class="title_table">
			<caption>
				<h1>设计师列表</h1>
			</caption>
			<tr height="32px" align="center" bgcolor="#ccc">
				<td width="5%" class="td-title">姓名</td>
				<td width="8%" class="td-title">等级</td>
				<td width="8%" class="td-title">所在地</td>
				<td width="18%" class="td-title">擅长风格</td>
				<td width="20%" class="td-title">设计理念</td>
				<td width="5%" class="td-title">头像</td>
				<td width="8%" class="td-title">联系手机</td>
				<td width="9%" class="td-title">联系邮箱</td>
				<td width="5%" class="td-title">人气值</td>
				<td width="8%" class="td-title">发表时间</td>
				<td width="6%" class="td-title">操作</td>
			</tr>
		</table>
		<div class="youjian-div none">
		   	<span class="upd-span">编辑</span>
		   	<span class="del-span">删除</span>
		</div>
		
		<table width="100%" id="tabledata" style="table-layout: fixed;">
		
    	</table>
	</div>
</body>
</html>
