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
<title>籽匠猫-添加文章</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-添加文章">
<meta http-equiv="description" content="籽匠猫-添加文章">
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
			<div class="publish_ti">添加文章</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">文章标题</div>
				<div class="publish_tit_right fl">
					<input type="text" name="title" />
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">文章类型</div>
				<div class="publish_tit_right fl">
					<select style="margin-left: 15px;width: 120px;height: 32px;" class="selectType">
						<option value="0">资讯文章</option>
						<option value="1">籽匠潮流</option>
						<option value="2">家居风水</option>
					</select>
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

			eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}('$(\'.16\').y(\'15\',2(){5 d=13.X(\'T\').R();5 e=$(\'k[o="6"]\').q();$(\'#r\').Q(d);5 f="/P/D/B/A.z";$.x($(\'#r\').w(\'t\'),2(i,v){3(i===0){f=$(v).N(\'u\');g}});3($.p(e).h<=0){9("\u8bf7\u586b\u5199\u6807\u9898");$(\'k[o="6"]\').n();g m}3($.p(d).h<=0){9("\u8bf7\u586b\u5199\u5185\u5bb9");d.n();g m}$.C({l:"E",F:"G",H:{"6":e,"I":d,"l":J($(\'.K\').q()),"L":f},M:s,O:2(a){$("#4,.1").S();$(".1").8("\u6b63\u5728\u6dfb\u52a0\uff0c\u8bf7\u7a0d\u5019...")},U:2(a){3(a.V===W){9(a.j);Y(2(){Z.10()},11)}12{$(".1").8(a.j);$("#4,.1").7()}$("#4,.1").7()},14:2(a,b,c){$(".1").8("\u72b6\u6001\uff1a"+b+"\uff1b\u51fa\u9519\u63d0\u793a\uff1a"+c);$("#4,.1").7()}})});',
					62,69," showmsg function if error_mask var title hide text alert       return length  msg input type false focus name trim val ycdiv 20000 img src  find each on png default images ajax post POST url addHomeCultrue data content parseInt selectType cover timeout attr beforeSend static_img html getContent show editor success status 200 getEditor setTimeout location reload 1000 else UE error click fabiao".split(" "),0,{}));
		});
	</script>
</body>
</html>