<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-添加经典案例</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-添加经典案例">
<meta http-equiv="description" content="籽匠猫-添加经典案例">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/sq.css" />
<script src="pc/js/jquery.min.js"></script>
<script src="pc/js/lrtk20160517.js"></script>
<style>
#error_mask {
	background-color: #ccc;
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

.file {
	margin-top: 20px;
	cursor: pointer;
	width: 98px;
	height: 38px;
	position: relative;
	display: block;
	background: #d0eeff;
	border: 1px solid #99d3f5;
	border-radius: 1px;
	text-align: center;
	overflow: hidden;
	color: #1e88c7;
	text-decoration: none;
	text-indent: 0;
	line-height: 38px;
	cursor: pointer;
	width: 98px;
	height: 38px;
	position: relative;
	display: block;
	background: #d0eeff;
	border: 1px solid #99d3f5;
	border-radius: 1px;
	text-align: center;
	overflow: hidden;
	color: #1e88c7;
	text-decoration: none;
	text-indent: 0;
	line-height: 38px
}

.file input {
	width: 98px;
	height: 38px;
	position: absolute;
	font-size: 100px;
	right: 0;
	top: 0;
	opacity: 0;
	filter: alpha(opacity = 0);
	cursor: pointer
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
	color:#88DD4B;
	font-size: 16px;
	font-weight: bold;
}
</style>
</head><!-- none -->
<body id="topBody">
	<div id="error_mask" class="none"></div>
	<div class="showmsg none">正在添加...</div>
	<div class="clear"></div>
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

	<div class="publish" style="margin-top: 40px;">
		<div class="w1200" style="width: 880px;">
			<div class="publish_ti">添加经典案例</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">经典案例标题</div>
				<div class="publish_tit_right fl">
					<input type="text" name="title" />
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">经典案例类型</div>
				<div class="publish_tit_right fl">
					<select style="margin-left: 15px;width: 120px;height: 32px;" class="selectType">
						<option value="0">家装案例</option>
						<option value="1">红木案例</option>
					</select>
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit videodiv">
				<div class="publish_tit_left fl">价格&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
				<div class="publish_tit_right fl">
					<input type="text" name="price" />
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_cin">
				<script id="editor" type="text/plain"
					style="width:880px;height:500px;">
			
			</script>
			</div>


		</div>

		<div class="publish_c">
			<input type="button" style="margin: 0px auto;" name="" class="fabiao"
				value="发表">
		</div>
	</div>
	</div>
	
	<div style="display: none;" id="ycdiv"></div>

	<script type="text/javascript">
		//实例化编辑器
		//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
		var ue = UE.getEditor('editor');
	</script>
	<!-- 定制风格-->


	<script src="pc/js/Carousel.js"></script>

	<script type="text/javascript">
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();
			
			$('.fabiao').on('click', function() {
				var d = UE.getEditor('editor').getContent();
				var e = $('input[name="title"]').val();
				$('#ycdiv').html(d);
				var f = "/static_img/post/images/default.png";
				$.each($('#ycdiv').find('img'), function(i, v) {
					if (i === 0) {
						f = $(v).attr('src');
						return
					}
				});
				if ($.trim(e).length <= 0) {
					alert("请填写标题");
					$('input[name="title"]').focus();
					return false
				}
				if($.trim($('input[name="price"]').val()).length <= 0){
					alert("请填写价格");
					$('input[name="price"]').focus();
					return false
				}
				var sreTest = /^\+?[1-9][0-9]*$/;
				if(!sreTest.test($.trim($('input[name="price"]').val()))){
					alert("请填写正确格式价格");
					$('input[name="price"]').focus();
					return false
				}
				if ($.trim(d).length <= 0) {
					alert("请填写内容");
					UE.getEditor('editor').focus();
					return false
				}
				$.ajax({
					type: "POST",
					url: "addClassic_caseData",
					data: {
						"title": e,
						"content": d,
						"type": parseInt($('.selectType').val()),
						"price" : parseInt($('input[name="price"]').val()),
						"cover": f
					},
					timeout: 20000,
					beforeSend: function(a) {
						$("#error_mask,.showmsg").show();
						$(".showmsg").text("正在添加，请稍候...")
					},
					success: function(a) {
						if (a.status === 200) {
							alert(a.msg);
							setTimeout(function() {
								location.reload()
							}, 1000)
						} else {
							$(".showmsg").text(a.msg);
							setTimeout(function() {
								$("#error_mask,.showmsg").hide()
							}, 1000)
						}
						$("#error_mask,.showmsg").hide()
					},
					error: function(a, b, c) {
						$(".showmsg").text("状态：" + b + "；出错提示：" + c);
						$("#error_mask,.showmsg").hide()
					}
				})
			});
		});
	</script>
</body>
</html>