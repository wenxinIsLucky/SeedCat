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
<title>籽匠猫-软装定制</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-软装定制">
<meta http-equiv="description" content="籽匠猫-软装定制">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script src="pc/js/lrtk20160517.js"></script>
<script type="text/javascript" src="pc/ruanzhuang/js/rzCustom.js"></script>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="2" name="pageName"/>
	</jsp:include>

	<div class="ny_banner">
		<img src="pc/images/ny_banner1.png" alt="" />
	</div>

	<div class="title">
		<div class="w1200">
			<div class="ny-title">
				<div class="ny-title-left fl">
					<ul>
						<li class="ny-title-left1"><a href="javascript:void(0);"> <img
								src="pc/images/shouye.png" alt="">
						</a></li>
						<li class="ny-title-left2"><a href="javascript:void(0);">家居软装 </a></li>
						<li class="ny-title-left3"><img src="pc/images/jit.png" alt=""></li>
						<li class="ny-title-left4">定制说明</li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="ny-title-right fr">
					<ul>
						<li><a href="javascript:void(0);">定制流程 </a></li>
						<li><a href="javascript:void(0);" class="tit_hover"> 定制风格 </a></li>
						<li><a href="to-ruanzhuang-rzCustom_table"> 申请装修表 </a></li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
	</div>
	
	
	<div class="w1200">
		<div class="liucheng-title">
			<span>定制流程</span>
			<p>用专业为每一位业主把好关</p>
		</div>
		<div class="contentBox">
			<div class="proc">
				<div class="icon ico1"></div>
				<div class="turnto"></div>
				<div class="icon ico2"></div>
				<div class="turnto"></div>
				<div class="icon ico3"></div>
				<div class="turnto"></div>
				<div class="icon ico4"></div>
				<div class="turnto"></div>
				<div class="icon ico5"></div>
				<div class="turnto"></div>
				<div class="icon ico6"></div>
				<div class="turnto"></div>
				<div class="icon ico7"></div>
				<div class="turnto"></div>
				<div class="icon ico8"></div>
			</div>
			<div class="worlds">
				<span class="no_aee">免费报名</span><span>预约量尺</span><span>软装设计</span><span>方案研讨</span><span>提交订单</span><span>验收配送</span><span>安装摆样</span><span>售后服务</span>
			</div>
			<div class="cl"></div>
		</div>
	</div>


	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp"/>
	<!-- 尾部 -->
	<script type="text/javascript">
(function(){
    var time = null;
    var list = $("#navlist");
    var box = $("#navbox");
    var lista = list.find("li");

    for(var i=0,j=lista.length;i<j;i++){
        if(lista[i].className == "now"){
            var olda = i;
        }
    }

    var box_show = function(hei){
        box.stop().animate({
            height:hei,
            opacity:1
        },400);
    }

    var box_hide = function(){
        box.stop().animate({
            height:0,
            opacity:0
        },400);
    }

    lista.hover(function(){
        lista.removeClass("now");
        $(this).addClass("now");
        clearTimeout(time);
        var index = list.find("li").index($(this));
        box.find(".cont").hide().eq(index).show();
        var _height = box.find(".cont").eq(index).height();
        box_show(_height)
    },function(){
        time = setTimeout(function(){
            box.find(".cont").hide();
            box_hide();
        },50);
        lista.removeClass("now");
        lista.eq(olda).addClass("now");
    });

    box.find(".cont").hover(function(){
        var _index = box.find(".cont").index($(this));
        lista.removeClass("now");
        lista.eq(_index).addClass("now");
        clearTimeout(time);
        $(this).show();
        var _height = $(this).height();
        box_show(_height);
    },function(){
        time = setTimeout(function(){
            $(this).hide();
            box_hide();
        },50);
        lista.removeClass("now");
        lista.eq(olda).addClass("now");
    });

})();
</script>
</body>
</html>
