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
<title>籽匠猫-发表拍客</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-发表拍客">
<meta http-equiv="description" content="籽匠猫-发表拍客">
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
	<div class="showmsg none">正在发表...</div>
	<div class="clear"></div>
	<jsp:include page="../top.jsp">
		<jsp:param value="8" name="pageName" />
	</jsp:include>
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

	<div class="publish">
		<div class="w1200" style="width: 880px;">
			<div class="publish_ti">发表拍客</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">拍客标题</div>
				<div class="publish_tit_right fl">
					<input type="text" name="title" />
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

	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp" />
	<!-- 尾部 -->

	<script src="pc/js/Carousel.js"></script>

	<script type="text/javascript">
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();

           eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}('$(\'.16\').z(\'15\',3(){7 d=13.11(\'Z\').Y();7 e=$(\'o[p="j"]\').W();$(\'#t\').U(d);7 f="/S/Q/P/x.G";$.E($(\'#t\').C(\'A\'),3(i,v){4(i===0){f=$(v).O(\'y\');8}});4($.u(e).k<=0){h("\u8bf7\u586b\u5199\u6807\u9898");$(\'o[p="j"]\').B();8 r}4($.u(d).k<=0){h("\u8bf7\u586b\u5199\u5185\u5bb9");8 r}$.D({q:"F",g:"H",I:{"j":e,"J":d,"q":2,"K":f},L:M,N:3(a){$("#5,.1").R();$(".1").6("\u6b63\u5728\u53d1\u8868\uff0c\u8bf7\u7a0d\u5019...")},T:3(a){4(a.w===V){h(a.s);X(3(){n.m=a.g},10)}l 4(a.w===12){n.m=a.g}l{$(".1").6(a.s);$("#5,.1").9()}$("#5,.1").9()},14:3(a,b,c){$(".1").6("\u72b6\u6001\uff1a"+b+"\uff1b\u51fa\u9519\u63d0\u793a\uff1a"+c);$("#5,.1").9()}})});',
					62,69," showmsg  function if error_mask text var return hide       url alert  title length else href location input name type false msg ycdiv trim  status default src on img focus find ajax each POST png addCommunity data content cover timeout 20000 beforeSend attr images post show static_img success html 200 val setTimeout getContent editor 500 getEditor 404 UE error click fabiao".split(" "),0,{}));
		});
	</script>
</body>
</html>