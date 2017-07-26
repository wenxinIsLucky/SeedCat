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
<title>籽匠猫-上传晒家</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-上传晒家">
<meta http-equiv="description" content="籽匠猫-上传晒家">
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
	<div class="showmsg none">正在上传...</div>
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

	<div class="publish">
		<div class="">
			<div class="publish_ti">上传晒家</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">晒家标题</div>
				<div class="publish_tit_right fl">
					<input type="text" name="title" />
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_cin">
				<script id="editor" type="text/plain" style="width:98%;height:500px;margin:0px auto;"></script>
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
			
			var isL = false;
			var iCount = setInterval(GetBack, 100);
            function GetBack() {
            	if(typeof($("#edui149_body").attr('style')) !="undefined"){
            		isL = true;
            	}
            	if(isL){
            		$('#edui130').height(1000);
            		parent.$('#iframe').height(1000);
	                $("#edui149_body").parent().parent().css('top','100px');
	              	//清除setInterval
	                clearInterval(iCount);
            	}else{
            		console.log(1);
            	}
            }

			eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}('$(\'.X\').A(\'W\',1(){6 d=Y.13(\'x\').z();6 e=$(\'j[m="8"]\').w();$(\'#n\').y(d);6 f="/B/F/N/O.P";$.R($(\'#n\').T(\'V\'),1(i,v){3(i===0){f=$(v).15(\'18\');5}});3($.u(e).h<=0){7("\u8bf7\u586b\u5199\u6807\u9898");$(\'j[m="8"]\').19();5 k}3($.u(d).h<=0){7("\u8bf7\u586b\u5199\u5185\u5bb9");5 k}$.C({D:"E",l:"G",H:{"8":e,"I":d,"J":f},K:L,M:1(a){$("#4,.2").Q();$(".2").g("\u6b63\u5728\u53d1\u8868\uff0c\u8bf7\u7a0d\u5019...")},S:1(a){3(a.o===U){7(a.p);q(1(){r.s=\'Z-10-11\'},12)}t 3(a.o===14){r.s=a.l}t{$(".2").g(a.p);q(1(){$("#4,.2").9()},16)}$("#4,.2").9()},17:1(a,b,c){$(".2").g("\u72b6\u6001\uff1a"+b+"\uff1b\u51fa\u9519\u63d0\u793a\uff1a"+c);$("#4,.2").9()}})});',
					62,72," function showmsg if error_mask return var alert title hide       text length  input false url name ycdiv status msg setTimeout location href else trim  val editor html getContent on static_img ajax type POST post addSunHomeData data content cover timeout 20000 beforeSend images default png show each success find 200 img click fabiao UE to user mysun 500 getEditor 404 attr 2000 error src focus".split(" "),0,{}));
		});
	</script>
</body>
</html>