<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>软装套餐</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/showrz_package.js"></script>
	<link rel="stylesheet" href="pcadmin/ruanzhuang/css/showrz_package.css" />
  </head>
  <body>
  	<div class="error_mask error_opacity none"></div>
  	<div class="error_content none">
		<img src="" class="fd_img"/>
  	</div>
    <div id="rz-package-zong-div">
    	<div class="rz-package-info">
    		<table width="100%">
    			<caption><h1>软装套餐列表</h1></caption>
    			<tr height="32px" align="center" bgcolor="#ccc">
    				<td width="14%" class="td-title">主题</td>
	    			<td width="8%" class="td-title">价格</td>
	    			<td width="6%" class="td-title">定制最低价格/㎡</td>
	    			<td width="9%" class="td-title">主题风格</td>
	    			<td width="18%" class="td-title">主题理念</td>
	    			<td width="10%" class="td-title">封面</td>
	    			<td width="10%" class="td-title">标签</td>
	    			<td width="6%" class="td-title">主题色</td>
	    			<td width="18%" class="td-title">软装项目</td>
    			</tr>
    		</table>
    		<div class="youjian-div none">
		    	<span class="upd-span">编辑</span>
		    	<span class="del-span">删除</span>
		    	<span class="jia" data-sj="1"></span>
		    </div>
    		<table width="100%" id="divdata">
    			
    		</table>
    		<!-- <div class="column-div-title">
    			<span class="span-title">主题</span>
    			<span class="span-title">价格</span>
    			<span class="span-title">定制最低价格/㎡</span>
    			<span class="span-title">主题理念</span>
    			<span class="span-title">封面</span>
    			<span class="span-title">标签</span>
    			<span class="span-title">主题色</span>
    			<span class="span-title">软装项目</span>
    		</div>
    		
    		<div id="divdata">
    		
    		</div> -->
    		
    	</div>
    </div>
  </body>
</html>