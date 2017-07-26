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
    <title>编辑套餐配置</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<script type="text/javascript" src="pcadmin/yingzhuang/js/jquery.colorpicker.js"></script> 
	<script type="text/javascript" src="pcadmin/yingzhuang/js/updjz_config.js"></script>
	<link rel="stylesheet" href="pcadmin/yingzhuang/css/addjz_config.css" />
  </head>
  <body>
  		<c:if test="${empty jc}">
  			<script type="text/javascript">
  				location.href="to-500";
  			</script>
  		</c:if>
  		<c:if test="${!empty jc}">
  			<div id="rz-package-zong-div">
		    	<h1>编辑套餐配置</h1>
		    	<div class="rz-package-info">
		    	
		    		<div class="column-div">
		    			<span class="span-name">套餐主题：</span>
		    			<input class="i" type="text" vaben="${jc.jpid}" name="jpname" readonly="readonly" value="${jpname}"/>
		    		</div>
		    		
		    		<div class="column-div">
		    			<span class="span-name">套餐配置名称：</span>
		    			<input id="jcname" class="i" type="text" name="jcname" value="${jc.jcname}"/>
		    			<input id="jcid" class="i" type="hidden" name="jcid" value="${jc.jcid}"/>
		    			<%-- <input class="i" type="hidden" name="rpiid" value="${jc.project_info.rpiid}"/> --%>
		    		</div>
		    		
		    		<%-- <div class="column-div">
		    			<span class="span-name">项目理念：</span>
		    			<textarea name="rppidea" style="height: 200px;width: 400px;vertical-align: text-top;border: 1px solid #ccc;font-size: 16px;">${jc.rppidea}</textarea>
		    		</div> --%>
		    		
		    		<div class="column-div">
		    			<span class="span-name">配置封面图：</span>
						<div class="contentDiv">
							<form id="form1" runat="server">
								<div>
									<a href="javascript:void(0);" class="file">选择图片
										<input id="file_upload" type="file" name="file" accept="image/*" capture="camera"/>
									</a>
									<span class="showFileName">${jc.jcimg}</span>
									<span class="fileerrorTip"></span>
									<div class="image_container">
										<img id="preview" src="/static_img/yz_img/${jc.jcimg}">
									</div>
								</div>
							</form>
							<input class="jcimg" type="hidden" name="jcimg" value="${jc.jcimg}"/>
						</div>
					</div>
		    		
		    		<hr style="margin-top: 20px;">
		    		<div class="column-div clear" >
		    				<span class="span-name">说明：</span>
		    				<span style="color:#fa791b;">点击材料名进入下一步操作</span>
		    		</div>
		    		<div class="column-div">
		    			<span class="span-name">配置所用材料列表：</span>
		    		</div>
		    		<div class="column-div bsi">
		    		<span class="span-name">材料名称：</span>
		    		<c:forEach items="${ms}" var="m" varStatus="index">
		    				<input type="hidden" name ="jmid"  value="${m.jmid }"/>
		    				<a style="color:#000;text-decoration:none;" href="getAppointJzCorJzM?jpid=${jc.jpid }&jpname=${jpname }&jcname=${jc.jcname}&jmid=${m.jmid}">${m.jmname}</a>&nbsp;<span class="del-span" style="color:red;">X</span>
		    				<%-- <span class="content-span" style="width: 200px;display: inline-block;vertical-align: text-top;line-height:24px;">
		    					坐标：<lwx class="position">${info.position}</lwx><br>
		    					名称：<lwx class="materialName">${info.materialName}</lwx><br>
		    					型号：<lwx class="model">${info.model}</lwx><br>
		    					数量：<lwx class="materialCount">${info.materialCount}</lwx><br>
		    					尺寸：<lwx class="materialSize">${info.materialSize}</lwx><br>
		    					材质：<lwx class="material">${info.material}</lwx><br>
		    				</span> --%>
		    		</c:forEach>
		    		
		    		</div>
		    		<div id="dian-button-div" class="add-material">添加材料</div>
						
		    	</div>
		    	
		    	<div id="add-button-div">保存</div>
		    </div>
  		</c:if>
</body>
</html>