<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-新增设计师</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/ruanzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/designer/js/add_designer.js"></script>
	<link rel="stylesheet" href="pcadmin/designer/css/add_designer.css" />
  </head>
  <body>
    <div id="designer-zong-div">
    	<h1>新增设计师</h1>
    	<div class="designer-info">
    	
    		<div class="column-div">
    			<span class="span-name">设计师姓名：</span>
    			<input class="i" type="text" name="dname"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">设计师等级：</span>
    			<input class="i" type="text" name="level"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">所在地：</span>
    			<input class="i" type="text" name="address"/>
    		</div>
    		
    		<!-- <div class="column-div">
    			<span class="span-name">套餐定制最低价格/㎡：</span>
    			<input class="i" vali="number" type="text" name="minprice"/>
    		</div> -->
    		<div class="column-div">
    			<span class="span-name">擅长风格：</span>
    			<textarea name="style" style="height: 100px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">设计理念：</span>
    			<textarea name="idea" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">头像：</span>
				<div class="contentDiv">
					<form id="form1" runat="server">
						<div>
							<!-- <a href="javascript:void(0);" class="file" > --><img src="" id="preview" style="width: 100px;height:140px;" alt=""/>
								<input id="file_upload" type="file" name="file" accept="image/*" capture="camera"/>
							<!-- </a> -->
							<span class="showFileName"></span>
							<span class="fileerrorTip"></span>
							<!-- <div class="image_container">
								<img id="preview">
							</div> -->
						</div>
					</form>
					<input class="head" type="hidden" name="head"/>
				</div>
			</div>
			
			<div class="column-div">
    			<span class="span-name">联系手机：</span>
    			<input class="i" vali="number" type="text" name="phone"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">Email：</span>
    			<input class="i" type="text" name="email"/>
    		</div>
    		
    		<!-- <div class="column-div">
    			<span class="span-name">套餐标签：</span>
    			<div id="tab-div">
    				<input class="tabinput">
    			</div>
    			<ms>最多添加5个标签，多个标签之间用","(英文逗号)分隔<b>(点击可删除标签)</b><s>*可不填</s></ms>
    		</div> -->
    		<!-- <datam class="msg-data">不能添加重复标签</datam> -->
    		
    		<!-- <div class="column-div">
    			<span class="span-name">套餐主题色：</span>
    			<input id="cp3text" class="i" name="cstext" value="这里是测试的文字" readonly="readonly"/>
    			<img src="pc/img/colorpicker.png" id="cp3" style="cursor:pointer">
    		</div> -->
    		
    	</div>
    	
    	<div id="add-button-div">添加</div>
    </div>
  </body>
</html>