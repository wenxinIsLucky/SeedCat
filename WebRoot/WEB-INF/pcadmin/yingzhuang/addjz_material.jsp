<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加材料</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/yingzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/yingzhuang/js/addjz_material.js"></script>
	<link rel="stylesheet" href="pcadmin/yingzhuang/css/addjz_package.css" />
  </head>
  <body>
    <div id="rz-package-zong-div">
    	<h1>添加配置材料</h1>
    	<div class="rz-package-info">
    		<div class="column-div">
    			<span class="span-name">所属配置名：</span>
    			<input class="i" type="text" vaben="${jcid}" name="jcname" readonly="readonly" value="${jcname}"/>
    			<input class="i" type="hidden" vaben="${jpid}" name="jpname" readonly="readonly" value="${jpname}"/>
    		</div>
    		<div class="column-div">
    			<span class="span-name">材料名：</span>
    			<input class="i" type="text" name="jmname"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">材料信息：</span>
    			<textarea class="info" name="materialinfo" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">材料说明：</span>
    			<textarea class="explain" name="materialexplain" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;"></textarea>
    		</div>
    		
    		<!-- <div class="column-div">
    			<span class="span-name">套餐标签：</span>
    			<div id="tab-div">
    				<input class="tabinput">
    			</div>
    			<ms>最多添加5个标签，多个标签之间用","(英文逗号)分隔<b>(点击可删除标签)</b><s>*可不填</s></ms>
    		</div>
    		<datam class="msg-data">不能添加重复标签</datam> -->
    		
    		
    		
    	</div>
    	
    	<div id="add-button-div">添加</div>
    </div>
  </body>
</html>