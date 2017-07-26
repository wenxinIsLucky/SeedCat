<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-编辑设计师案例</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pc/upload/css/bootstrap.min.css" /> --%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pc/upload/css/htmleaf-demo.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/pc/upload/css/ssi-uploader.css"/>
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script src="pc/js/jquery.min.js"></script>
	<script type="text/javascript" src="pcadmin/designer/js/upd_designer_case.js"></script>
	<link rel="stylesheet" href="pcadmin/designer/css/add_designer.css" />
  </head>
  <body>
  	<div class="error_mask error_opacity none"></div>
  	<div class="error_content none">
		<img class="fd_img" src="" />
  	</div>
    <div id="designer-zong-div">
    	<h1>编辑设计师案例</h1>
    	<div class="designer-info">
    	
    		<div class="column-div">
    			<span class="span-name">设计师姓名：</span>
    			<input class="i" type="hidden" name="did" value="${dc.did }" />
    			<input class="i" type="text" name="dname" value="${dname }" readonly="readonly"/>
    			<span class="span-name">案例标题：</span>
    			<input class="i" type="hidden" name="dcid" value="${dc.dcid }" />
    			<input class="i" type="text" name="dctitle" value="${dc.dctitle }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">简述：</span>
    			<input class="i" type="text" maxlength="20" name="describe" value="${dc.describe }"/>
    			<span class="span-name">型号：</span>
    			<input class="i" type="text" name="model" value="${dc.model }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">户型：</span>
    			<input class="i" type="text" name="family" value="${dc.family }"/>
    			<span class="span-name">客户称呼：</span>
    			<input class="i" type="text" name="name" value="${dc.name }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">楼盘名称：</span>
    			<input class="i" type="text" name="floorname" value="${dc.floorname }"/>
    			<span class="span-name">所在地址：</span>
    			<input class="i" type="text" name="addres" value="${dc.addres }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">重点设计空间：</span>
    			<input class="i" type="text" name="important" value="${dc.important }"/>
    			<span class="span-name">空间大小：</span>
    			<input class="i" type="text" vali="number" name="size" value="${dc.size }"/>
    		</div>
    		<div class="column-div">
    			<span class="span-name">喜爱风格：</span>
    			<input class="i" type="text" name="likestyle" value="${dc.likestyle }"/>
    			<span class="span-name">喜爱颜色：</span>
    			<input class="i" type="text" name="likecolor" value="${dc.likecolor }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">使用者年龄：</span>
    			<input class="i" type="text" vali="number" name="age" value="${dc.age }"/>
    			<span class="span-name">地面材料：</span>
    			<input class="i" type="text" name="ground" value="${dc.ground }"/>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">重点空间设计需求：</span>
    			<textarea name="demand" style="height: 100px;width: 1200px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;">${dc.demand }</textarea>
    		</div>
    		<div class="column-div">
    			<span class="span-name">设计感言：</span>
    			<textarea name="recollections" style="height: 100px;width: 1200px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;">${dc.recollections }</textarea>
    		</div>
    		
    		<div class="column-div">
    			<span class="span-name">装修后现场图：</span>
				<div class="contentDiv">
					<!-- <div class="col-md-12"> -->
						<h3>（支持jpg、gif、txt、png格式文件）最大支持2MB <span style="color: red;">提交时图片预览区没有图片或者未上传成功则预览区显红</span></h3>
						<input type="file" multiple id="ssi-upload"/>
						
						<c:if test="${not empty dc.imgs }">
						<c:set value="${fn:split(dc.imgs,',') }" var="imgs"/>
							<c:forEach items="${imgs }" var="img" varStatus="i">
								<img class="span-content-img " name="in${i.index }" style="width: 60px;height: 60px;" alt="${img }" src="/static_img/designer_case/img/${img }">
								<input class="input_img in${i.index }" type="hidden" name="img" value="${img }"/>
							</c:forEach>
						</c:if>
						<div class="youjian-div none">
			   				<span class="del-span">删除</span>
						</div>
						
				</div>
			</div>
			
			<script type="text/javascript" charset="utf-8">
				window.UEDITOR_HOME_URL = location.protocol + '//' + document.domain
						+ (location.port ? (":" + location.port) : "") + "/ueditor/";
			</script>
			<script type="text/javascript" charset="utf-8"
				src="ueditor/ueditor.config.js"></script>
			<script type="text/javascript" charset="utf-8"
				src="ueditor/ueditor.all.min.js">
			</script>
			<script type="text/javascript" charset="utf-8"
				src="ueditor/lang/zh-cn/zh-cn.js"></script>
			
			<div class="column-div">
				<span class="span-name">效果图文：</span>
				<span style="width:500px;color: red;float: right;" id = "alert"></span>
    			<script id="details" type="text/plain" style="width:1300px;height:500px;margin: 0px auto;">
					${dc.details}
				</script>
				
			</div>
			
			<div style="display: none;" id="ycdiv"></div>
    		
    		
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
    		</div> ${pageContext.request.contextPath}-->
    		
    	</div>
    	
    	<div id="add-button-div">保存</div>
    </div>
    <script type="text/javascript">
		//实例化编辑器
		//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
		var ue = UE.getEditor('details');
	</script>
    <script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/pc/upload/js/jquery-2.1.1.min.js"><\/script>')</script>
	<script src="${pageContext.request.contextPath}/pc/upload/js/ssi-uploader.js"></script>
	<script type="text/javascript">
		$('#ssi-upload').ssi_uploader({url:'uploadDesigner_case',maxFileSize:6,allowed:['jpg','gif','txt','png']});
		
	</script>
  </body>
</html>