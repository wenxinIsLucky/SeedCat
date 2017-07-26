<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>籽匠猫-设计师案例列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/designer/js/show_designer_case.js"></script>
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
				<h1>设计师案例列表</h1>
				设计师：<span id="span-name">${dname }</span>
			</caption>
			
			<tr height="32px" align="center" bgcolor="#ccc">
				<td width="15%" class="td-title">案例标题</td>
				<td width="20%" class="td-title">描述</td>
				<td width="5%" class="td-title">客户称呼</td>
				<td width="10%" class="td-title">楼盘名称</td>
				<td width="16%" class="td-title">所在地址</td>
				<td width="16%" class="td-title">重点设计空间</td>
				<td width="8%" class="td-title">关注数量</td>
				<td width="10%" class="td-title">创建时间</td>
			</tr>
		</table>
		<table width="100%" id="tabledata" style="table-layout: fixed;">
			<c:forEach items="${dcs }" var="dc" varStatus="i">
					<tr height="40px" align="center">
						<td width="15%" class="td-title" viben="${dc.dcid }">${dc.dctitle }</td>
						<td width="20%" class="td-title">${dc.describe }</td>
						<td width="5%" class="td-title">${dc.name }</td>
						<td width="10%" class="td-title">${dc.floorname }</td>
						<td width="16%" class="td-title">${dc.addres }</td>
						<td width="16%" class="td-title">${dc.important }</td>
						<td width="8%" class="td-title">${dc.follow }</td>
						<td width="10%" class="td-title">${dc.createDate }</td>
					</tr>
			</c:forEach>
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
