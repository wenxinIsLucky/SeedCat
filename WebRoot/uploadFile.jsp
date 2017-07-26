<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>上传素材</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<link rel="stylesheet" type="text/css" href="pc/upload/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="pc/upload/css/htmleaf-demo.css">
	<link rel="stylesheet" href="pc/upload/css/ssi-uploader.css"/>
  </head>
  
  <body>
   <div class="htmleaf-container">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3>（支持jpg、jpeg、png格式文件）最大支持2MB</h3>
					<input type="file" multiple id="ssi-upload"/>
				</div>
			</div>
		</div>
	</div>
	
	<!-- <script src="http://libs.useso.com/js/jquery/2.1.1/jquery.min.js" type="text/javascript"></script> -->
	<script>window.jQuery || document.write('<script src="pc/upload/js/jquery-2.1.1.min.js"><\/script>')</script>
	<script src="pc/upload/js/ssi-uploader.js"></script>
	<script type="text/javascript">
		$('#ssi-upload').ssi_uploader({url:'uploadImage',maxFileSize:2,allowed:['jpg','jpeg','png']});
	</script>
  </body>
</html>
