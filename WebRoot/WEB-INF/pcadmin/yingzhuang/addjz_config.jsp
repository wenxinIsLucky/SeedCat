<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加套餐配置</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/yingzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/yingzhuang/js/addjz_config.js"></script>
	<link rel="stylesheet" href="pcadmin/yingzhuang/css/addjz_config.css" />
  </head>
  <body>
    <div id="rz-package-zong-div">
    	<h1>添加套餐配置</h1>
    	<div class="rz-package-info">
    	
    		<div class="column-div">
    			<span class="span-name">套餐主题：</span>
    			<input class="i" type="text" vaben="${jpid}" name="jpname" readonly="readonly" value="${jpname}"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">套餐配置名称：</span>
    			<input class="i" type="text" name="jcname"/>
    		</div>
    		
    		<!-- <div class="column-div">
    			<span class="span-name">项目理念：</span>
    			<textarea name="rppidea" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div> -->
    		
    		<div class="column-div">
    			<span class="span-name">配置封面图：</span>
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
					<input class="jcimg" type="hidden" name="jcimg"/>
				</div>
			</div>
    		
    		<!-- <hr style="margin-top: 20px;">
    		
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
								<i class="yuan-i"></i>
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
    		</div> -->
    		
    	</div>
    	<div id="add-button-div">添加</div>
    </div>
</body>
</html>