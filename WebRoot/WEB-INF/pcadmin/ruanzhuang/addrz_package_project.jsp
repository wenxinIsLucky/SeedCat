<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加套餐项目</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/addrz_package_project.js"></script>
	<link rel="stylesheet" href="pcadmin/ruanzhuang/css/addrz_package_project.css" />
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
    	<h1>添加套餐项目</h1>
    	<div class="rz-package-info">
    	
    		<div class="column-div">
    			<span class="span-name">套餐主题：</span>
    			<input class="i" type="text" vaben="${rpid}" name="rpname" readonly="readonly" value="${rpname}"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐项目名称：</span>
    			<input class="i" type="text" name="rppname"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">项目理念：</span>
    			<textarea name="rppidea" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">项目封面：</span>
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
					<input class="rppimg" type="hidden" name="rppimg"/>
				</div>
			</div>
    		
    		<hr style="margin-top: 20px;">
    		
    		<div class="column-div">
    			<span class="span-name">项目所用家具详细图：</span>
    			<div class="contentDiv">
					<form id="form2" runat="server">
						<div>
							<a href="javascript:void(0);" class="file2">选择图片
								<input id="file_upload2" type="file" name="file" accept="image/*" capture="camera"/>
							</a>
							<span class="showFileName2"></span>
							<span class="fileerrorTip2"></span>
							<div class="image_container2">
								<img id="preview2" src="">
								<!-- <i class="yuan-i"></i> -->
							</div>
						</div>
					</form>
					<input class="rpiimg" type="hidden" name="project_info.rpiimg"/>
					<div class="youjian-div none">
				    	<span class="upd-span">填写材料</span>
				    	<span class="del-span">删除标记</span>
				    </div>
				    
				    <div class="youjian-div2 none">
				    	<div class="column-d">
				    		<span>标记：</span>
				    		<input class="bj-span" type="text" readonly="readonly"/>
				    	</div>
				    	<div class="column-d">
				    		<span>名称：</span>
				    		<input class="btbj bj-name" type="text" name="materialName"/>
				    		<error>不能为空</error>
				    	</div>
				    	<div class="column-d">
				    		<span>型号：</span>
				    		<input class="bj-model" type="text" name="model"/>
				    		<ms>可不填</ms>
				    	</div>
				    	<div class="column-d">
				    		<span>数量：</span>
				    		<input vali="number" class="btbj bj-count" type="text" name="materialCount"/>
				    		<error>不能为空</error>
				    	</div>
				    	<div class="column-d">
				    		<span>尺寸：</span>
				    		<input class="btbj bj-size" type="text" name="materialSize"/>
				    		<error>不能为空</error>
				    	</div>
				    	<div class="column-d">
				    		<span>材质：</span>
				    		<input class="bj-cz" type="text" name="material"/>
				    		<ms>可不填</ms>
				    	</div>
						<div id="dian-button-div">保存</div>				    	
				    </div>
				</div>
    		</div>
    		
    		<div class="column-div clear" >
    			<span class="span-name">用料说明：</span>
    			<span style="color:#fa791b;">在家具详细图中选中家具标记,然后右键点击标记操作写下用料详细</span>
    		</div>
    		
    	</div>
    	<div id="add-button-div">添加</div>
    </div>
</body>
</html>