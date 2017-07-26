<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加项目详细</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/addrz_package.js"></script>
	<link rel="stylesheet" href="pcadmin/ruanzhuang/css/addrz_package.css" />
	<style>
#error_mask {
	background-color: #000;
	height: 100%;
	width: 100%;
	position: fixed;
	_position: absolute;
	top: 0;
	opacity: 0.1;
	filter: alpha(opacity = 10);
	z-index: 9999999;
}

.clear {
	clear: both;
}

.none {
	display: none;
}
.showmsg{
	width: 300px;
	height: 100px;
	position: fixed;
	top:0;
	left:0;
	right:0;
	bottom:0;
	margin:auto;
	z-index: 999999999;
	text-align: center;
	color:#000;
	font-size: 24px;
	font-weight: bold;
}
</style>
  </head>
  <body>
  <div id="error_mask" class="none"></div>
	<div class="showmsg none">正在上传...</div>
    <div id="rz-package-zong-div">
    	<h1>添加软装套餐</h1>
    	<div class="rz-package-info">
    	
    		<div class="column-div">
    			<span class="span-name">套餐主题：</span>
    			<input class="i" type="text" name="rpname"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐价格：</span>
    			<input class="i" vali="number" type="text" name="rpprice"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐定制最低价格/㎡：</span>
    			<input class="i" vali="number" type="text" name="minprice"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐主题理念：</span>
    			<textarea name="rpidea" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐封面：</span>
				<div class="contentDiv">
					<form id="form1" runat="server">
						<div>
							<a href="javascript:void(0);" class="file">选择图片
								<input id="file_upload" type="file" name="file" accept="image/*" capture="camera"/>
							</a>
							<span class="showFileName"></span>
							<span class="fileerrorTip"></span>
							<div class="image_container">
								<img id="preview">
							</div>
						</div>
					</form>
					<input type="hidden" name="rpimg"/>
				</div>
			</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐标签：</span>
    			<div id="tab-div">
    				<input class="tabinput">
    			</div>
    			<ms>最多添加5个标签，多个标签之间用","(英文逗号)分隔<b>(点击可删除标签)</b><s>*可不填</s></ms>
    		</div>
    		<datam class="msg-data">不能添加重复标签</datam>
    		
    		<div class="column-div">
    			<span class="span-name">套餐主题色：</span>
    			<input id="cp3text" class="i" name="cstext" value="这里是测试的文字" readonly="readonly"/>
    			<img src="pc/img/colorpicker.png" id="cp3" style="cursor:pointer">
    		</div>
    		
    	</div>
    	
    	<div id="add-button-div">添加</div>
    </div>
  </body>
</html>