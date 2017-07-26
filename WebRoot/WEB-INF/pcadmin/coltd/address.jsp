<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-公司地址</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="籽匠猫-公司地址">
	<meta http-equiv="description" content="籽匠猫-公司地址">
	<script src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/coltd/js/address.js"></script>
	<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
	<link href="pcadmin/coltd/css/address.css" rel="stylesheet" />
  </head>
  
  <body>
    <div id="addressdivzong">
    	<div id="addaddressdiv">
    		<form action="" id="form">
    			<table width="100%" class="title_table">
    				<caption>
    					<h1>添加地址</h1>
    				</caption>
					<tr align="center">
						<td width="15%" class="td-title" align="right">公司名称</td>
						<td width="85%" class="td-title"><input type="text" name="name"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">电话</td>
						<td width="85%" class="td-title"><input type="text" name="phone" maxlength="18"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">传真</td>
						<td width="85%" class="td-title"><input name="chuanzhen" maxlength="18"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">邮箱</td>
						<td width="85%" class="td-title"><input type="text" name="email" maxlength="50"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">邮编</td>
						<td width="85%" class="td-title"><input type="text" name="youbian" maxlength="6"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">地址</td>
						<td width="85%" class="td-title"><input type="text" name="address"/></td>
					</tr>
					<tr align="center">
						<td width="15%" colspan="2" class="td-title" align="center">
							<input type="button" value="保存" class="baocun">
						</td>
					</tr>
				</table>
    		</form>
    	</div>
    	<div di="showaddressdiv">
    		<table width="100%" class="title_table">
				<tr height="40px" align="center" bgcolor="#ccc">
					<td width="13%" class="td-title">公司名称</td>
					<td width="13%" class="td-title">电话</td>
					<td width="13%" class="td-title">传真</td>
					<td width="13%" class="td-title">邮箱</td>
					<td width="10%" class="td-title">邮编</td>
					<td width="25%" class="td-title">地址</td>
					<td width="13%" class="td-title">操作</td>
				</tr>
			</table>
			<table width="100%" class="show_table">
				<tr height="40px" align="center" bgcolor="#fff">
					<td width="13%" class="td-title" data-name="name">深圳籽匠猫总部</td>
					<td width="13%" class="td-title" data-name="phone">135XXXXXXXX</td>
					<td width="13%" class="td-title" data-name="chuanzhen">0800-XXXX-XXXX</td>
					<td width="13%" class="td-title" data-name="email">XXXXXXX@163.com</td>
					<td width="10%" class="td-title" data-name="youbian">000000</td>
					<td width="25%" class="td-title" data-name="address">深圳市深圳区深圳大道深圳工业区杍匠猫家具城</td>
					<td width="13%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="1">编辑</a>
						<a href="javascript:void(0);">默认显示</a>
						<a href="javascript:void(0);">删除</a>
					</td>
				</tr>
				
				<tr height="40px" align="center" bgcolor="#fff">
					<td width="13%" class="td-title" data-name="name">北京籽匠猫分公司</td>
					<td width="13%" class="td-title" data-name="phone">135XXXXXXXX</td>
					<td width="13%" class="td-title" data-name="chuanzhen">0800-XXXX-XXXX</td>
					<td width="13%" class="td-title" data-name="email">XXXXXXX@163.com</td>
					<td width="10%" class="td-title" data-name="youbian">000000</td>
					<td width="25%" class="td-title" data-name="address">深圳市深圳区深圳大道深圳工业区杍匠猫家具城</td>
					<td width="13%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="2">编辑</a>
						<a href="javascript:void(0);">默认显示</a>
						<a href="javascript:void(0);">删除</a>
					</td>
				</tr>
			</table>
    	</div>
    </div>
  </body>
</html>
